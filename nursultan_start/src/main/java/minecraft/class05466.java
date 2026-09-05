/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import minecraft.class06962;

public class class05466
extends DataFix {
    public class05466(Schema schema, boolean bl) {
        super(schema, bl);
    }

    private static Dynamic<?> N(Dynamic<?> dynamic) {
        if (dynamic.get("Name").asString().result().equals(Optional.of("minecraft:cauldron"))) {
            if (dynamic.get("Properties").orElseEmptyMap().get("level").asString("0").equals("0")) {
                return dynamic.remove("Properties");
            }
            return dynamic.set("Name", dynamic.createString("minecraft:water_cauldron"));
        }
        return dynamic;
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("cauldron_rename_fix", this.getInputSchema().getType(class06962.d), typed -> typed.update(DSL.remainderFinder(), class05466::N));
    }
}

