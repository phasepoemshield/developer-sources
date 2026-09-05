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
 *  minecraft.class00622
 *  minecraft.class03731
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
import com.mojang.datafixers.types.templates.TaggedChoice;
import com.mojang.datafixers.util.Pair;
import minecraft.class00622;
import minecraft.class03731;
import minecraft.class06962;

public class class02606
extends DataFix {
    public class02606(Schema schema) {
        super(schema, false);
    }

    private Typed<?> N(Typed<?> typed, OpticFinder<?> opticFinder, OpticFinder<?> opticFinder2, OpticFinder<Pair<String, String>> opticFinder3) {
        return typed.updateTyped(opticFinder, typed2 -> {
            if (typed2.getOptionalTyped(opticFinder2).flatMap(typed -> typed.getOptional(opticFinder3)).map(Pair::getSecond).flatMap(class03731::u).filter(string -> string.equals("block.minecraft.ominous_banner")).isPresent()) {
                return typed2.updateTyped(opticFinder2, typed -> typed.set(opticFinder3, (Object)Pair.of((Object)class06962.O.typeName(), (Object)class03731.y((String)"block.minecraft.ominous_banner")))).update(DSL.remainderFinder(), dynamic -> dynamic.set("minecraft:rarity", dynamic.createString("uncommon")));
            }
            return typed2;
        });
    }

    public TypeRewriteRule makeRule() {
        Type var1 = this.getInputSchema().getType(class06962.G);
        Type var2 = this.getInputSchema().getType(class06962.l);
        TaggedChoice.TaggedChoiceType taggedChoiceType = this.getInputSchema().findChoiceType(class06962.G);
        OpticFinder var4 = DSL.fieldFinder((String)"id", (Type)DSL.named((String)class06962.K.typeName(), (Type)class00622.N()));
        OpticFinder var5 = var1.findField("components");
        OpticFinder var6 = var2.findField("components");
        OpticFinder var7 = var5.type().findField("minecraft:item_name");
        OpticFinder opticFinder = DSL.typeFinder((Type)this.getInputSchema().getType(class06962.O));
        return TypeRewriteRule.seq((TypeRewriteRule)this.fixTypeEverywhereTyped("Ominous Banner block entity common rarity to uncommon rarity fix", var1, typed -> ((Pair)typed.get(taggedChoiceType.finder())).getFirst().equals("minecraft:banner") ? this.N((Typed<?>)typed, (OpticFinder<?>)var5, (OpticFinder<?>)var7, (OpticFinder<Pair<String, String>>)opticFinder) : typed), (TypeRewriteRule)this.fixTypeEverywhereTyped("Ominous Banner item stack common rarity to uncommon rarity fix", var2, typed -> ((String)typed.getOptional(var4).map(Pair::getSecond).orElse("")).equals("minecraft:white_banner") ? this.N((Typed<?>)typed, (OpticFinder<?>)var6, (OpticFinder<?>)var7, (OpticFinder<Pair<String, String>>)opticFinder) : typed));
    }
}

