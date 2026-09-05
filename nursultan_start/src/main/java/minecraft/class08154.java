/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class02479
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import minecraft.class02479;
import org.jspecify.annotations.Nullable;

public class class08154
extends class02479 {
    public class08154(Schema schema) {
        super(schema, "TridentAnimationFix", "minecraft:consumable");
    }

    protected <T> @Nullable Dynamic<T> N(Dynamic<T> dynamic2) {
        return dynamic2.update("animation", dynamic -> {
            String string = dynamic.asString().result().orElse("");
            if ("spear".equals(string)) {
                return dynamic.createString("trident");
            }
            return dynamic;
        });
    }
}

