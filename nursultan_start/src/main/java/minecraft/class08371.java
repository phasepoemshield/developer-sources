/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class00622
 *  minecraft.class00955
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.function.DoubleUnaryOperator;
import minecraft.class00622;
import minecraft.class00955;
import minecraft.class06962;

public class class08371
extends class00955 {
    private final String L;
    private final DoubleUnaryOperator u;

    public class08371(Schema schema, String string, String string2, String string3, DoubleUnaryOperator doubleUnaryOperator) {
        super(schema, false, string, class06962.o, string2);
        this.L = string3;
        this.u = doubleUnaryOperator;
    }

    protected Typed<?> N(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), this::N);
    }

    private Dynamic<?> N(Dynamic<?> dynamic) {
        return dynamic.update("attributes", dynamic3 -> dynamic.createList(dynamic3.asStream().map(dynamic -> {
            if (!class00622.N((String)dynamic.get("id").asString("")).equals(this.L)) {
                return dynamic;
            }
            double d = dynamic.get("base").asDouble(0.0);
            return dynamic.set("base", dynamic.createDouble(this.u.applyAsDouble(d)));
        })));
    }
}

