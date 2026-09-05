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
import java.util.Map;
import java.util.Optional;
import java.util.function.Predicate;
import minecraft.class02479;
import org.jspecify.annotations.Nullable;

public class class08822
extends class02479 {
    private static final Optional<String> N = Optional.of("\"\"");

    private static <T> boolean L(Dynamic<T> dynamic) {
        return class08822.N(dynamic, "components", dynamic2 -> class08822.N(dynamic2, "minecraft:custom_name", dynamic -> dynamic.asString().result().equals(N)));
    }

    public class08822(Schema schema) {
        super(schema, "InvalidLockComponentPredicateFix", "minecraft:lock");
    }

    public static <T> @Nullable Dynamic<T> y(Dynamic<T> dynamic) {
        return class08822.L(dynamic) ? null : dynamic;
    }

    protected <T> @Nullable Dynamic<T> N(Dynamic<T> dynamic) {
        return class08822.y(dynamic);
    }

    private static <T> boolean N(Dynamic<T> dynamic, String string, Predicate<Dynamic<T>> predicate) {
        Optional optional = dynamic.getMapValues().result();
        if (optional.isEmpty() || ((Map)optional.get()).size() != 1) {
            return false;
        }
        return dynamic.get(string).result().filter(predicate).isPresent();
    }
}

