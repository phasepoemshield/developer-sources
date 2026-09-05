/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.function.Function;
import minecraft.class06962;

public class class03031
extends DataFix {
    public class03031(Schema schema) {
        super(schema, true);
    }

    private static <A> Typed<?> N(Typed<?> typed, String string, String string2, Type<A> type) {
        Type type2 = DSL.optional((Type)DSL.field((String)string, type));
        Type type3 = DSL.optional((Type)DSL.field((String)string2, type));
        return typed.update(type2.finder(), type3, Function.identity());
    }

    private static Typed<?> N(Typed<?> typed, String string, String string2) {
        return class03031.N(typed, string, string2, typed.getType().findFieldType(string)).update(DSL.remainderFinder(), dynamic -> dynamic.remove(string));
    }

    private static <T> Dynamic<T> N(Typed<?> typed, Dynamic<T> dynamic) {
        DynamicOps dynamicOps = dynamic.getOps();
        Dynamic dynamic2 = ((Dynamic)typed.get(DSL.remainderFinder())).convert(dynamicOps);
        return dynamicOps.getMap(dynamic.getValue()).flatMap(mapLike -> dynamicOps.mergeToMap(dynamic2.getValue(), mapLike)).result().map(object -> new Dynamic(dynamicOps, object)).orElse(dynamic);
    }

    private static <A> Typed<Pair<String, A>> N(Typed<A> typed) {
        return new Typed(DSL.named((String)"chunk", (Type)typed.getType()), typed.getOps(), (Object)Pair.of((Object)"chunk", (Object)typed.getValue()));
    }

    protected TypeRewriteRule makeRule() {
        Type var1 = this.getInputSchema().getType(class06962.u);
        OpticFinder var2 = var1.findField("Level");
        OpticFinder var3 = var2.type().findField("Structures");
        Type var4 = this.getOutputSchema().getType(class06962.u);
        Type var5 = var4.findFieldType("structures");
        return this.fixTypeEverywhereTyped("Chunk Renames; purge Level-tag", var1, var4, typed2 -> {
            Typed typed3 = typed2.getTyped(var2);
            Typed typed4 = class03031.N(typed3);
            typed4 = typed4.set(DSL.remainderFinder(), class03031.N(typed2, (Dynamic)typed3.get(DSL.remainderFinder())));
            Typed<?> var5 = class03031.N(typed4, "TileEntities", "block_entities");
            var5 = class03031.N(var5, "TileTicks", "block_ticks");
            var5 = class03031.N(var5, "Entities", "entities");
            var5 = class03031.N(var5, "Sections", "sections");
            var5 = var5.updateTyped(var3, var5, typed -> class03031.N(typed, "Starts", "starts"));
            var5 = class03031.N(var5, "Structures", "structures");
            return var5.update(DSL.remainderFinder(), dynamic -> dynamic.remove("Level"));
        });
    }
}

