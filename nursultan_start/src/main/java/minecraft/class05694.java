/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 *  minecraft.class03952
 *  minecraft.class07536
 */
package minecraft;

import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import minecraft.class03952;
import minecraft.class07536;

public class class05694
extends class03952 {
    public class05694(Schema schema) {
        super(schema, "OminousBannerRenameFix", string -> string.equals("minecraft:white_banner"));
    }

    protected Typed<?> N(Typed<?> typed) {
        return class07536.N(typed, (Type)typed.getType(), this::N);
    }

    private <T> Dynamic<T> N(Dynamic<T> dynamic) {
        return dynamic.update("display", dynamic2 -> dynamic2.update("Name", dynamic -> {
            Optional var1 = dynamic.asString().result();
            if (var1.isPresent()) {
                return dynamic.createString(((String)var1.get()).replace("\"translate\":\"block.minecraft.illager_banner\"", "\"translate\":\"block.minecraft.ominous_banner\""));
            }
            return dynamic;
        }));
    }
}

