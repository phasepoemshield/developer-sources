/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.escape.Escaper
 *  com.google.common.escape.Escapers
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class02479
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.escape.Escaper;
import com.google.common.escape.Escapers;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import minecraft.class02479;
import org.jspecify.annotations.Nullable;

public class class00255
extends class02479 {
    public static final Escaper N = Escapers.builder().addEscape('\"', "\\\"").addEscape('\\', "\\\\").build();

    public class00255(Schema schema) {
        super(schema, "LockComponentPredicateFix", "minecraft:lock");
    }

    public static <T> @Nullable Dynamic<T> y(Dynamic<T> dynamic) {
        Optional var1 = dynamic.asString().result();
        if (var1.isEmpty()) {
            return null;
        }
        if (((String)var1.get()).isEmpty()) {
            return null;
        }
        Dynamic dynamic2 = dynamic.createString("\"" + N.escape((String)var1.get()) + "\"");
        Dynamic dynamic3 = dynamic.emptyMap().set("minecraft:custom_name", dynamic2);
        return dynamic.emptyMap().set("components", dynamic3);
    }

    protected <T> @Nullable Dynamic<T> N(Dynamic<T> dynamic) {
        return class00255.y(dynamic);
    }
}

