/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DSL$TypeReference
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.Locale;
import java.util.Optional;
import java.util.function.Function;

public class class06630
extends DataFix {
    private final String N;
    private final DSL.TypeReference y;
    private final String L;
    private final String[] u;
    private final Function<Dynamic<?>, Dynamic<?>> i;

    public class06630(Schema schema, DSL.TypeReference typeReference, String string, Function<Dynamic<?>, Dynamic<?>> function, String ... stringArray) {
        super(schema, false);
        this.N = "Adding field `" + string + "` to type `" + typeReference.typeName().toLowerCase(Locale.ROOT) + "`";
        this.y = typeReference;
        this.L = string;
        this.u = stringArray;
        this.i = function;
    }

    private Dynamic<?> N(Dynamic<?> dynamic, int n) {
        if (n >= this.u.length) {
            return dynamic.set(this.L, this.i.apply(dynamic));
        }
        Optional optional = dynamic.get(this.u[n]).result();
        if (optional.isEmpty()) {
            return dynamic;
        }
        return this.N((Dynamic)optional.get(), n + 1);
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped(this.N, this.getInputSchema().getType(this.y), this.getOutputSchema().getType(this.y), typed -> typed.update(DSL.remainderFinder(), dynamic -> this.N((Dynamic<?>)dynamic, 0)));
    }
}

