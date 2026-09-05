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
 *  minecraft.class00622
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
import java.util.Objects;
import java.util.function.Function;
import minecraft.class00622;
import minecraft.class06962;

public class class06717
extends DataFix {
    public class06717(Schema schema) {
        super(schema, false);
    }

    private Typed<?> N(OpticFinder<Pair<String, String>> opticFinder, Typed<?> typed) {
        return typed.update(opticFinder, pair -> pair.mapSecond(string -> Objects.equals(string, "minecraft:carved_pumpkin") ? "minecraft:pumpkin" : string));
    }

    protected TypeRewriteRule makeRule() {
        Type type = this.getInputSchema().getType(class06962.Y);
        OpticFinder opticFinder = type.findField("buy");
        OpticFinder opticFinder2 = type.findField("buyB");
        OpticFinder opticFinder3 = type.findField("sell");
        OpticFinder opticFinder4 = DSL.fieldFinder((String)"id", (Type)DSL.named((String)class06962.K.typeName(), (Type)class00622.N()));
        Function<Typed, Typed> function = typed -> this.N((OpticFinder<Pair<String, String>>)opticFinder4, (Typed<?>)typed);
        return this.fixTypeEverywhereTyped("Villager trade fix", type, typed -> typed.updateTyped(opticFinder, function).updateTyped(opticFinder2, function).updateTyped(opticFinder3, function));
    }
}

