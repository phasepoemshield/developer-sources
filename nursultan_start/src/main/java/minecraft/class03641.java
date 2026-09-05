/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DSL$TypeReference
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class00955
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;
import java.util.function.Function;
import java.util.function.IntFunction;
import minecraft.class00955;

public class class03641
extends class00955 {
    private final String L;
    private final IntFunction<String> u;

    public class03641(Schema schema, String string, DSL.TypeReference typeReference, String string2, String string3, IntFunction<String> intFunction) {
        super(schema, false, string, typeReference, string2);
        this.L = string3;
        this.u = intFunction;
    }

    private static <T> Dynamic<T> N(Dynamic<T> dynamic, String string, String string2, Function<Dynamic<T>, Dynamic<T>> function) {
        return dynamic.map(object3 -> {
            DynamicOps dynamicOps = dynamic.getOps();
            Function<Object, Object> function2 = object -> ((Dynamic)function.apply(new Dynamic(dynamicOps, object))).getValue();
            return dynamicOps.get(object3, string).map(object2 -> dynamicOps.set(object3, string2, function2.apply(object2))).result().orElse(object3);
        });
    }

    protected Typed<?> N(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), dynamic2 -> class03641.N(dynamic2, this.L, "variant", dynamic -> (Dynamic)DataFixUtils.orElse((Optional)dynamic.asNumber().map(number -> dynamic.createString(this.u.apply(number.intValue()))).result(), (Object)dynamic)));
    }
}

