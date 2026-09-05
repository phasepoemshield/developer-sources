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
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import minecraft.class06962;

public class class00934
extends DataFix {
    private static boolean L(Dynamic<?> dynamic) {
        return dynamic.get("id").asString("").equals("Iglu");
    }

    public class00934(Schema schema, boolean bl) {
        super(schema, bl);
    }

    private static <T> Dynamic<T> y(Dynamic<T> dynamic) {
        return dynamic.asStreamOpt().map(stream -> stream.filter(dynamic -> !class00934.L(dynamic))).map(arg_0 -> dynamic.createList(arg_0)).result().orElse(dynamic);
    }

    private static <T> Dynamic<T> N(Dynamic<T> dynamic) {
        if (dynamic.get("Children").asStreamOpt().map(stream -> stream.allMatch(class00934::L)).result().orElse(false).booleanValue()) {
            return dynamic.set("id", dynamic.createString("Igloo")).remove("Children");
        }
        return dynamic.update("Children", class00934::y);
    }

    protected TypeRewriteRule makeRule() {
        Type var1 = this.getInputSchema().getType(class06962.H);
        return this.fixTypeEverywhereTyped("IglooMetadataRemovalFix", var1, typed -> typed.update(DSL.remainderFinder(), class00934::N));
    }
}

