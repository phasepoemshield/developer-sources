/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class02269
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import minecraft.class02269;
import minecraft.class06962;

public class class04165
extends DataFix {
    public class04165(Schema schema) {
        super(schema, false);
    }

    private static <T> Dynamic<T> N(Dynamic<T> dynamic) {
        return dynamic.update("ExitPortalLocation", class02269::N);
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("LegacyDragonFightFix", this.getInputSchema().getType(class06962.N), typed -> typed.update(DSL.remainderFinder(), dynamic -> {
            if (dynamic.get("DragonFight").result().isPresent()) {
                return dynamic;
            }
            Dynamic dynamic2 = dynamic.get("DimensionData").get("1").get("DragonFight").orElseEmptyMap();
            return dynamic.set("DragonFight", class04165.N(dynamic2));
        }));
    }
}

