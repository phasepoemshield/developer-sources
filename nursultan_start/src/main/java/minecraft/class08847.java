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
import minecraft.class08822;

public class class08847
extends DataFix {
    public class08847(Schema schema) {
        super(schema, false);
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped("BlockEntityLockToComponentFix", this.getInputSchema().getType(class06962.G), typed -> typed.update(DSL.remainderFinder(), dynamic -> {
            Optional optional = dynamic.get("lock").result();
            if (optional.isEmpty()) {
                return dynamic;
            }
            Dynamic dynamic2 = class08822.y((Dynamic)optional.get());
            if (dynamic2 != null) {
                return dynamic.set("lock", dynamic2);
            }
            return dynamic.remove("lock");
        }));
    }
}

