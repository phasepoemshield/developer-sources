/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DSL$TypeReference
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Optional;

public class class03306
extends DataFix {
    private final String N;
    private final boolean y;
    private final String L;
    private final DSL.TypeReference u;

    public class03306(Schema schema, DSL.TypeReference typeReference, String string, boolean bl) {
        super(schema, true);
        this.y = bl;
        this.L = string;
        this.N = "AddFlagIfNotPresentFix_" + this.L + "=" + this.y + " for " + schema.getVersionKey();
        this.u = typeReference;
    }

    protected TypeRewriteRule makeRule() {
        Type type = this.getInputSchema().getType(this.u);
        return this.fixTypeEverywhereTyped(this.N, type, typed -> typed.update(DSL.remainderFinder(), dynamic -> dynamic.set(this.L, (Dynamic)DataFixUtils.orElseGet((Optional)dynamic.get(this.L).result(), () -> dynamic.createBoolean(this.y)))));
    }
}

