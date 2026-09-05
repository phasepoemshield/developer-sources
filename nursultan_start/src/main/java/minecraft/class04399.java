/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
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
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import minecraft.class06962;

public class class04399
extends DataFix {
    public class04399(Schema schema) {
        super(schema, true);
    }

    protected TypeRewriteRule makeRule() {
        Type var1 = this.getInputSchema().getType(class06962.u);
        OpticFinder var2 = var1.findField("sections");
        return this.fixTypeEverywhereTyped("ChunkDeleteIgnoredLightDataFix", var1, typed2 -> {
            if (!((Dynamic)typed2.get(DSL.remainderFinder())).get("isLightOn").asBoolean(false)) {
                return typed2.updateTyped(var2, typed -> typed.update(DSL.remainderFinder(), dynamic -> dynamic.remove("BlockLight").remove("SkyLight")));
            }
            return typed2;
        });
    }
}

