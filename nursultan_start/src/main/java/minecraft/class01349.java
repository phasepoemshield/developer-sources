/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import minecraft.class01350;
import minecraft.class01367;
import minecraft.class06962;

public class class01349
extends class01350 {
    public class01349(Schema schema) {
        super(schema, class06962.L);
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("PlayerUUIDFix", this.getInputSchema().getType(this.N), typed2 -> {
            OpticFinder opticFinder = typed2.getType().findField("RootVehicle");
            return typed2.updateTyped(opticFinder, opticFinder.type(), typed -> typed.update(DSL.remainderFinder(), dynamic -> class01349.L(dynamic, "Attach", "Attach").orElse((Dynamic<?>)dynamic))).update(DSL.remainderFinder(), dynamic -> class01367.L(class01367.y(dynamic)));
        });
    }
}

