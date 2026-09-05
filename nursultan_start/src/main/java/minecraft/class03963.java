/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class01482
 */
package minecraft;

import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Stream;
import minecraft.class01482;

public class class03963
extends class01482 {
    private final Function<String, String> N;

    public class03963(Schema schema, String string, Function<String, String> function) {
        super(schema, string);
        this.N = function;
    }

    protected <T> Stream<Dynamic<T>> N(Stream<Dynamic<T>> stream) {
        return stream.map(dynamic2 -> dynamic2.update("type", dynamic -> (Dynamic)DataFixUtils.orElse((Optional)dynamic.asString().map(this.N).map(arg_0 -> ((Dynamic)dynamic).createString(arg_0)).result(), (Object)dynamic)));
    }
}

