/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class00622
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import minecraft.class00622;
import minecraft.class06962;

public abstract class class08347
extends DataFix {
    private final String N;

    public class08347(Schema schema, String string) {
        super(schema, false);
        this.N = string;
    }

    protected abstract <T> Dynamic<T> N(String var1, Dynamic<T> var2);

    protected abstract boolean N(String var1);

    private Dynamic<?> N(Dynamic<?> dynamic2) {
        Optional<String> optional = dynamic2.get("Name").asString().result().map(class00622::N);
        if (optional.isPresent() && this.N(optional.get())) {
            return dynamic2.update("Properties", dynamic -> this.N((String)optional.get(), (Dynamic)dynamic));
        }
        return dynamic2;
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped(this.N, this.getInputSchema().getType(class06962.d), typed -> typed.update(DSL.remainderFinder(), this::N));
    }
}

