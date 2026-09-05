/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class00955
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import minecraft.class00955;
import minecraft.class01350;
import minecraft.class06962;

public class class01358
extends class00955 {
    public class01358(Schema schema, String string) {
        super(schema, false, "Gossip for for " + string, class06962.o, string);
    }

    protected Typed<?> N(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), dynamic2 -> dynamic2.update("Gossips", dynamic -> (Dynamic)DataFixUtils.orElse(dynamic.asStreamOpt().result().map(stream -> stream.map(dynamic -> class01350.L(dynamic, "Target", "Target").orElse((Dynamic<?>)dynamic))).map(arg_0 -> ((Dynamic)dynamic).createList(arg_0)), (Object)dynamic)));
    }
}

