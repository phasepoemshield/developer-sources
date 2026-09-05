/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 *  minecraft.class02269
 *  minecraft.class06962
 *  minecraft.class07536
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Map;
import java.util.function.Function;
import minecraft.class02269;
import minecraft.class03111;
import minecraft.class06962;
import minecraft.class07536;

public class class03113
extends DataFix {
    private static final String N = "minecraft:empty";

    private static <T> Typed<T> L(Typed<?> typed, Type<T> type) {
        return new Typed(type, typed.getOps(), typed.getValue());
    }

    public class03113(Schema schema) {
        super(schema, true);
    }

    private static <T> Typed<T> y(Typed<?> typed, Type<T> type) {
        return class07536.N(typed, type, dynamic -> dynamic.set("item", class03113.N(dynamic, "minecraft:spectral_arrow")));
    }

    private static <T> Function<Typed<?>, Typed<?>> N(String string, class03111<?> class031112, Type<?> type, Type<T> type2) {
        OpticFinder opticFinder = DSL.namedChoice((String)string, type);
        class03111<?> class031113 = class031112;
        return typed2 -> typed2.updateTyped(opticFinder, type2, typed -> class031113.fix((Typed<?>)typed, type2));
    }

    private Function<Typed<?>, Typed<?>> N(String string, class03111<?> class031112) {
        Type type = this.getInputSchema().getChoiceType(class06962.o, string);
        Type type2 = this.getOutputSchema().getChoiceType(class06962.o, string);
        return class03113.N(string, class031112, type, type2);
    }

    private static String N(Dynamic<?> dynamic) {
        return dynamic.get("Potion").asString(N).equals(N) ? "minecraft:arrow" : "minecraft:tipped_arrow";
    }

    private static <T> Typed<T> N(Typed<?> typed, Type<T> type) {
        return class07536.N(typed, type, dynamic -> dynamic.set("item", class03113.N(dynamic, class03113.N(dynamic))));
    }

    private static Dynamic<?> N(Dynamic<?> dynamic, String string) {
        return dynamic.createMap((Map)ImmutableMap.of((Object)dynamic.createString("id"), (Object)dynamic.createString(string), (Object)dynamic.createString("Count"), (Object)dynamic.createInt(1)));
    }

    protected TypeRewriteRule makeRule() {
        Type type = this.getInputSchema().getType(class06962.o);
        Type type2 = this.getOutputSchema().getType(class06962.o);
        return this.fixTypeEverywhereTyped("Fix AbstractArrow item type", type, type2, class02269.N((Function[])new Function[]{this.N("minecraft:trident", class03113::L), this.N("minecraft:arrow", class03113::N), this.N("minecraft:spectral_arrow", class03113::y)}));
    }
}

