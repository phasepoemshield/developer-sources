/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  minecraft.class03140
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import minecraft.class03140;
import minecraft.class06962;

public class class03293
extends DataFix {
    public class03293(Schema schema) {
        super(schema, false);
    }

    protected TypeRewriteRule makeRule() {
        Type type = this.getInputSchema().getType(class06962.A);
        OpticFinder opticFinder = type.findField("dimensions");
        return this.fixTypeEverywhereTyped("WorldGenSettingsDisallowOldCustomWorldsFix_" + this.getOutputSchema().getVersionKey(), type, typed2 -> typed2.updateTyped(opticFinder, typed -> {
            typed.write().map(dynamic -> dynamic.getMapValues().map(map -> {
                map.forEach((dynamic, dynamic2) -> {
                    if (dynamic2.get("type").asString().result().isEmpty()) {
                        throw new class03140("Unable load old custom worlds.");
                    }
                });
                return map;
            }));
            return typed;
        }));
    }
}

