/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Streams
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class01733
 *  minecraft.class06962
 */
package minecraft;

import com.google.common.collect.Streams;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.stream.Stream;
import minecraft.class01733;
import minecraft.class06962;

public class class02899
extends class01733 {
    private final String N;
    private final boolean y;

    public class02899(Schema schema, String string, String string2, boolean bl) {
        super(schema, true, "Horse armor fix for " + string, class06962.o, string);
        this.N = string2;
        this.y = bl;
    }

    protected <T> Dynamic<T> N(Dynamic<T> dynamic) {
        Optional optional = dynamic.get(this.N).result();
        if (optional.isPresent()) {
            Dynamic dynamic3 = (Dynamic)optional.get();
            Dynamic dynamic4 = dynamic.remove(this.N);
            if (this.y) {
                dynamic4 = dynamic4.update("ArmorItems", dynamic2 -> dynamic2.createList(Streams.mapWithIndex((Stream)dynamic2.asStream(), (dynamic, l) -> l == 2L ? dynamic.emptyMap() : dynamic)));
                dynamic4 = dynamic4.update("ArmorDropChances", dynamic2 -> dynamic2.createList(Streams.mapWithIndex((Stream)dynamic2.asStream(), (dynamic, l) -> l == 2L ? dynamic.createFloat(0.085f) : dynamic)));
            }
            dynamic4 = dynamic4.set("body_armor_item", dynamic3);
            dynamic4 = dynamic4.set("body_armor_drop_chance", dynamic.createFloat(2.0f));
            return dynamic4;
        }
        return dynamic;
    }
}

