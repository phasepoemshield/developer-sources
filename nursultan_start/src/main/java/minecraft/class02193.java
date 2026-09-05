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
 *  com.mojang.datafixers.types.templates.TaggedChoice$TaggedChoiceType
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 *  minecraft.class03731
 *  minecraft.class06962
 *  minecraft.class07536
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.TaggedChoice;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Map;
import java.util.Optional;
import minecraft.class03731;
import minecraft.class06962;
import minecraft.class07536;

public class class02193
extends DataFix {
    public class02193(Schema schema) {
        super(schema, false);
    }

    private Typed<?> N(Typed<?> typed2, OpticFinder<Pair<String, String>> opticFinder, OpticFinder<?> opticFinder2) {
        Optional optional = typed2.getOptionalTyped(opticFinder2).flatMap(typed -> typed.getOptional(opticFinder).map(Pair::getSecond));
        if (optional.flatMap(class03731::u).filter(string -> string.equals("block.minecraft.ominous_banner")).isPresent()) {
            return class07536.N(typed2, (Type)typed2.getType(), dynamic -> {
                Dynamic dynamic2 = dynamic.createMap(Map.of(dynamic.createString("minecraft:item_name"), dynamic.createString((String)optional.get()), dynamic.createString("minecraft:hide_additional_tooltip"), dynamic.emptyMap()));
                return dynamic.set("components", dynamic2).remove("CustomName");
            });
        }
        return typed2;
    }

    public TypeRewriteRule makeRule() {
        Type var1 = this.getInputSchema().getType(class06962.G);
        TaggedChoice.TaggedChoiceType taggedChoiceType = this.getInputSchema().findChoiceType(class06962.G);
        OpticFinder var3 = var1.findField("CustomName");
        OpticFinder opticFinder = DSL.typeFinder((Type)this.getInputSchema().getType(class06962.O));
        return this.fixTypeEverywhereTyped("Banner entity custom_name to item_name component fix", var1, typed -> ((Pair)typed.get(taggedChoiceType.finder())).getFirst().equals("minecraft:banner") ? this.N((Typed<?>)typed, (OpticFinder<Pair<String, String>>)opticFinder, (OpticFinder<?>)var3) : typed);
    }
}

