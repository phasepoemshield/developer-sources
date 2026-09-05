/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 *  minecraft.class00622
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import minecraft.class00622;
import minecraft.class01350;
import minecraft.class06962;

public class class01345
extends class01350 {
    private Dynamic<?> L(Dynamic<?> dynamic2) {
        return dynamic2.update("SkullOwner", dynamic -> class01345.N(dynamic, "Id", "Id").orElse((Dynamic<?>)dynamic));
    }

    public class01345(Schema schema) {
        super(schema, class06962.l);
    }

    private Dynamic<?> y(Dynamic<?> dynamic) {
        return dynamic.update("AttributeModifiers", dynamic3 -> dynamic.createList(dynamic3.asStream().map(dynamic -> class01345.L(dynamic, "UUID", "UUID").orElse((Dynamic<?>)dynamic))));
    }

    public TypeRewriteRule makeRule() {
        OpticFinder opticFinder = DSL.fieldFinder((String)"id", (Type)DSL.named((String)class06962.K.typeName(), (Type)class00622.N()));
        return this.fixTypeEverywhereTyped("ItemStackUUIDFix", this.getInputSchema().getType(this.N), typed -> {
            OpticFinder opticFinder2 = typed.getType().findField("tag");
            return typed.updateTyped(opticFinder2, typed2 -> typed2.update(DSL.remainderFinder(), dynamic -> {
                dynamic = this.y((Dynamic<?>)dynamic);
                if (typed.getOptional(opticFinder).map(pair -> "minecraft:player_head".equals(pair.getSecond())).orElse(false).booleanValue()) {
                    dynamic = this.L((Dynamic<?>)dynamic);
                }
                return dynamic;
            }));
        });
    }
}

