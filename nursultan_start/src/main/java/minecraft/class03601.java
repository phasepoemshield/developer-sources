/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import minecraft.class06962;

public class class03601
extends DataFix {
    private final String N;
    private final Set<String> y;

    public class03601(Schema schema, String string, Set<String> set) {
        super(schema, false);
        this.N = string;
        this.y = set;
    }

    private <T> Dynamic<T> N(Dynamic<T> dynamic) {
        List list = dynamic.get("removed_features").asStream().collect(Collectors.toCollection(ArrayList::new));
        Dynamic dynamic3 = dynamic.update("enabled_features", dynamic2 -> (Dynamic)DataFixUtils.orElse(dynamic2.asStreamOpt().result().map(stream -> stream.filter(dynamic2 -> {
            Optional optional = dynamic2.asString().result();
            if (optional.isEmpty()) {
                return true;
            }
            boolean bl = this.y.contains(optional.get());
            if (bl) {
                list.add(dynamic.createString((String)optional.get()));
            }
            return !bl;
        })).map(arg_0 -> ((Dynamic)dynamic).createList(arg_0)), (Object)dynamic2));
        if (!list.isEmpty()) {
            dynamic3 = dynamic3.set("removed_features", dynamic.createList(list.stream()));
        }
        return dynamic3;
    }

    protected TypeRewriteRule makeRule() {
        return this.fixTypeEverywhereTyped(this.N, this.getInputSchema().getType(class06962.y), typed -> typed.update(DSL.remainderFinder(), this::N));
    }
}

