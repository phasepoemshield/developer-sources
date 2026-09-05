/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import java.util.Map;
import minecraft.class06962;

public class class06151
extends DataFix {
    public class06151(Schema schema) {
        super(schema, false);
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("Map id fix", this.getInputSchema().getType(class06962.E), typed -> typed.update(DSL.remainderFinder(), dynamic -> dynamic.createMap(Map.of(dynamic.createString("data"), dynamic))));
    }
}

