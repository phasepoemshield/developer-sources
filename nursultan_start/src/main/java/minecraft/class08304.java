/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import minecraft.class06962;

public class class08304
extends DataFix {
    private <T> Dynamic<T> L(Dynamic<T> dynamic) {
        return (Dynamic)DataFixUtils.orElse(dynamic.asNumber().result().map(number -> switch (number.intValue()) {
            case -1 -> dynamic.createString("minecraft:the_nether");
            case 1 -> dynamic.createString("minecraft:the_end");
            default -> dynamic.createString("minecraft:overworld");
        }), dynamic);
    }

    public class08304(Schema schema) {
        super(schema, false);
    }

    private <T> Dynamic<T> y(Dynamic<T> dynamic) {
        return dynamic.update("Dimension", this::L);
    }

    private <T> Dynamic<T> N(Dynamic<T> dynamic) {
        return dynamic.update("dimension", this::L);
    }

    public TypeRewriteRule makeRule() {
        TypeRewriteRule typeRewriteRule = this.fixTypeEverywhereTyped("PlayerLegacyDimensionFix", this.getInputSchema().getType(class06962.L), typed -> typed.update(DSL.remainderFinder(), this::y));
        Type type = this.getInputSchema().getType(class06962.U);
        OpticFinder opticFinder = type.findField("data");
        TypeRewriteRule typeRewriteRule2 = this.fixTypeEverywhereTyped("MapLegacyDimensionFix", type, typed2 -> typed2.updateTyped(opticFinder, typed -> typed.update(DSL.remainderFinder(), this::N)));
        return TypeRewriteRule.seq((TypeRewriteRule)typeRewriteRule, (TypeRewriteRule)typeRewriteRule2);
    }
}

