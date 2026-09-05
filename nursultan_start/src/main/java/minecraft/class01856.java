/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Streams
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class03569
 *  minecraft.class03731
 *  minecraft.class06962
 *  minecraft.class07536
 */
package minecraft;

import com.google.common.collect.Streams;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;
import minecraft.class03569;
import minecraft.class03731;
import minecraft.class06962;
import minecraft.class07536;

public class class01856
extends DataFix {
    private final String N;

    public class01856(Schema schema, String string) {
        super(schema, false);
        this.N = string;
    }

    private static <T> Dynamic<T> y(Dynamic<T> dynamic) {
        Optional optional = dynamic.get("filtered_messages").asStreamOpt().result();
        if (optional.isEmpty()) {
            return dynamic;
        }
        Dynamic dynamic3 = class03731.N((DynamicOps)dynamic.getOps());
        List list = dynamic.get("messages").asStreamOpt().result().orElse(Stream.of(new Dynamic[0])).toList();
        List list2 = Streams.mapWithIndex((Stream)((Stream)optional.get()), (dynamic2, l) -> {
            Dynamic dynamic3 = l < (long)list.size() ? (Dynamic)list.get((int)l) : dynamic3;
            return dynamic2.equals((Object)dynamic3) ? dynamic3 : dynamic2;
        }).toList();
        if (list2.equals(list)) {
            return dynamic.remove("filtered_messages");
        }
        return dynamic.set("filtered_messages", dynamic.createList(list2.stream()));
    }

    private <T> Dynamic<T> N(Dynamic<T> dynamic) {
        dynamic = dynamic.update("front_text", class01856::y);
        dynamic = dynamic.update("back_text", class01856::y);
        for (String string : class03569.N) {
            dynamic = dynamic.remove(string);
        }
        return dynamic;
    }

    public TypeRewriteRule makeRule() {
        Type var1 = this.getInputSchema().getType(class06962.G);
        Type var2 = this.getInputSchema().getChoiceType(class06962.G, this.N);
        OpticFinder opticFinder = DSL.namedChoice((String)this.N, (Type)var2);
        return this.fixTypeEverywhereTyped("DropInvalidSignDataFix for " + this.N, var1, typed2 -> typed2.updateTyped(opticFinder, var2, typed -> {
            if (((Dynamic)typed.get(DSL.remainderFinder())).get("_filtered_correct").asBoolean(false)) {
                return typed.update(DSL.remainderFinder(), dynamic -> dynamic.remove("_filtered_correct"));
            }
            return class07536.N((Typed)typed, (Type)var2, this::N);
        }));
    }
}

