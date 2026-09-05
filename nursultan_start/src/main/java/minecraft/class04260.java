/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 *  minecraft.class00622
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.Map;
import java.util.function.Function;
import minecraft.class00622;
import minecraft.class06962;

public class class04260
extends DataFix {
    final String N;
    final Map<String, String> y;

    public class04260(Schema schema, String string, Map<String, String> map) {
        super(schema, false);
        this.N = string;
        this.y = map;
    }

    private Dynamic<?> N(Dynamic<?> dynamic) {
        dynamic = this.N(dynamic, "Enchantments");
        dynamic = this.N(dynamic, "StoredEnchantments");
        return dynamic;
    }

    private Dynamic<?> N(Dynamic<?> dynamic2, String string) {
        return dynamic2.update(string, dynamic -> (Dynamic)dynamic.asStreamOpt().map(stream -> stream.map(dynamic -> dynamic.update("id", dynamic2 -> (Dynamic)dynamic2.asString().map(string -> dynamic.createString(this.y.getOrDefault(class00622.N((String)string), (String)string))).mapOrElse(Function.identity(), error -> dynamic2)))).map(arg_0 -> ((Dynamic)dynamic).createList(arg_0)).mapOrElse(Function.identity(), error -> dynamic));
    }

    protected TypeRewriteRule makeRule() {
        Type type = this.getInputSchema().getType(class06962.l);
        OpticFinder opticFinder = type.findField("tag");
        return this.fixTypeEverywhereTyped(this.N, type, typed2 -> typed2.updateTyped(opticFinder, typed -> typed.update(DSL.remainderFinder(), this::N)));
    }
}

