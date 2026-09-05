/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  minecraft.class00622
 *  minecraft.class00955
 *  minecraft.class06962
 *  org.apache.commons.lang3.mutable.MutableBoolean
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import minecraft.class00622;
import minecraft.class00955;
import minecraft.class06962;
import org.apache.commons.lang3.mutable.MutableBoolean;

public class class02280
extends class00955 {
    private static final String L = "minecraft:wolf";
    private static final String u = "minecraft:generic.max_health";

    public class02280(Schema schema) {
        super(schema, false, "FixWolfHealth", class06962.o, L);
    }

    protected Typed<?> N(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), dynamic2 -> {
            MutableBoolean mutableBoolean = new MutableBoolean(false);
            dynamic2 = dynamic2.update("Attributes", dynamic -> dynamic.createList(dynamic.asStream().map(dynamic2 -> {
                if (u.equals(class00622.N((String)dynamic2.get("Name").asString("")))) {
                    return dynamic2.update("Base", dynamic -> {
                        if (dynamic.asDouble(0.0) == 20.0) {
                            mutableBoolean.setTrue();
                            return dynamic.createDouble(40.0);
                        }
                        return dynamic;
                    });
                }
                return dynamic2;
            })));
            if (mutableBoolean.isTrue()) {
                dynamic2 = dynamic2.update("Health", dynamic -> dynamic.createFloat(dynamic.asFloat(0.0f) * 2.0f));
            }
            return dynamic2;
        });
    }
}

