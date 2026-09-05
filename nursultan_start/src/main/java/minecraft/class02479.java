/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 *  minecraft.class06962
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import minecraft.class06962;
import org.jspecify.annotations.Nullable;

public abstract class class02479
extends DataFix {
    private final String N;
    private final String y;
    private final String L;

    public class02479(Schema schema, String string, String string2) {
        this(schema, string, string2, string2);
    }

    public class02479(Schema schema, String string, String string2, String string3) {
        super(schema, false);
        this.N = string;
        this.y = string2;
        this.L = string3;
    }

    protected abstract <T> @Nullable Dynamic<T> N(Dynamic<T> var1);

    public final TypeRewriteRule makeRule() {
        Type type = this.getInputSchema().getType(class06962.k);
        return this.fixTypeEverywhereTyped(this.N, type, typed -> typed.update(DSL.remainderFinder(), dynamic -> {
            Optional optional = dynamic.get(this.y).result();
            if (optional.isEmpty()) {
                return dynamic;
            }
            Dynamic dynamic2 = this.N((Dynamic)optional.get());
            return dynamic.remove(this.y).setFieldIfPresent(this.L, Optional.ofNullable(dynamic2));
        }));
    }
}

