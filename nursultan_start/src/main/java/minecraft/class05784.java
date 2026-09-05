/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class00955
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import minecraft.class00955;
import minecraft.class06962;

public class class05784
extends class00955 {
    public class05784(Schema schema, boolean bl) {
        super(schema, bl, "EntityItemFrameDirectionFix", class06962.o, "minecraft:item_frame");
    }

    private static byte N(byte by) {
        switch (by) {
            default: {
                return 2;
            }
            case 0: {
                return 3;
            }
            case 1: {
                return 4;
            }
            case 3: 
        }
        return 5;
    }

    protected Typed<?> N(Typed<?> typed) {
        return typed.update(DSL.remainderFinder(), this::N);
    }

    public Dynamic<?> N(Dynamic<?> dynamic) {
        return dynamic.set("Facing", dynamic.createByte(class05784.N(dynamic.get("Facing").asByte((byte)0))));
    }
}

