/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.function.Function;
import minecraft.class06962;

public class class02667
extends DataFix {
    public class02667(Schema schema) {
        super(schema, false);
    }

    private static Dynamic<?> N(Dynamic<?> dynamic) {
        if (dynamic.get("pickup").result().isPresent()) {
            return dynamic;
        }
        boolean bl = dynamic.get("player").asBoolean(true);
        return dynamic.set("pickup", dynamic.createByte((byte)(bl ? 1 : 0))).remove("player");
    }

    private Typed<?> N(Typed<?> typed2, String string, Function<Dynamic<?>, Dynamic<?>> function) {
        Type type = this.getInputSchema().getChoiceType(class06962.o, string);
        Type type2 = this.getOutputSchema().getChoiceType(class06962.o, string);
        return typed2.updateTyped(DSL.namedChoice((String)string, (Type)type), type2, typed -> typed.update(DSL.remainderFinder(), function));
    }

    private Typed<?> N(Typed<?> typed) {
        typed = this.N(typed, "minecraft:arrow", class02667::N);
        typed = this.N(typed, "minecraft:spectral_arrow", class02667::N);
        typed = this.N(typed, "minecraft:trident", class02667::N);
        return typed;
    }

    protected TypeRewriteRule makeRule() {
        Schema schema = this.getInputSchema();
        return this.fixTypeEverywhereTyped("AbstractArrowPickupFix", schema.getType(class06962.o), this::N);
    }
}

