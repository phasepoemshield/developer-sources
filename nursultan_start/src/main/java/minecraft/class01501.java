/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 *  minecraft.class00955
 *  minecraft.class06962
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Map;
import minecraft.class00955;
import minecraft.class06962;

public class class01501
extends class00955 {
    private Dynamic<?> L(Dynamic<?> dynamic) {
        return dynamic.updateMapValues(this::N);
    }

    public class01501(Schema schema, String string) {
        super(schema, false, "Memory expiry data fix (" + string + ")", class06962.o, string);
    }

    private Dynamic<?> u(Dynamic<?> dynamic) {
        return dynamic.createMap((Map)ImmutableMap.of((Object)dynamic.createString("value"), dynamic));
    }

    private Dynamic<?> y(Dynamic<?> dynamic) {
        return dynamic.update("memories", this::L);
    }

    public Dynamic<?> N(Dynamic<?> dynamic) {
        return dynamic.update("Brain", this::y);
    }

    private Pair<Dynamic<?>, Dynamic<?>> N(Pair<Dynamic<?>, Dynamic<?>> pair) {
        return pair.mapSecond(this::u);
    }

    protected Typed<?> N(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), this::N);
    }
}

