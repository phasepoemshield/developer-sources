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
 *  com.mojang.serialization.Dynamic
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
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import java.util.Set;
import minecraft.class00622;
import minecraft.class06962;

public class class03239
extends DataFix {
    private static final Set<String> N = Set.of("minecraft:potion", "minecraft:splash_potion", "minecraft:lingering_potion", "minecraft:tipped_arrow");

    private Dynamic<?> L(Dynamic<?> dynamic) {
        dynamic = dynamic.update("Effects", this::y);
        dynamic = dynamic.update("ActiveEffects", this::y);
        dynamic = dynamic.update("CustomPotionEffects", this::y);
        return dynamic;
    }

    public class03239(Schema schema) {
        super(schema, false);
    }

    private Dynamic<?> y(Dynamic<?> dynamic) {
        return dynamic.createList(dynamic.asStream().map(this::N));
    }

    private Dynamic<?> N(Dynamic<?> dynamic) {
        return dynamic.update("FactorCalculationData", dynamic2 -> {
            int n = dynamic2.get("effect_changed_timestamp").asInt(-1);
            dynamic2 = dynamic2.remove("effect_changed_timestamp");
            int n2 = dynamic.get("Duration").asInt(-1);
            int n3 = n - n2;
            return dynamic2.set("ticks_active", dynamic2.createInt(n3));
        });
    }

    protected TypeRewriteRule makeRule() {
        Schema schema = this.getInputSchema();
        Type var2 = this.getInputSchema().getType(class06962.l);
        OpticFinder var3 = DSL.fieldFinder((String)"id", (Type)DSL.named((String)class06962.K.typeName(), (Type)class00622.N()));
        OpticFinder var4 = var2.findField("tag");
        return TypeRewriteRule.seq((TypeRewriteRule)this.fixTypeEverywhereTyped("EffectDurationEntity", schema.getType(class06962.o), typed -> typed.update(DSL.remainderFinder(), this::L)), (TypeRewriteRule[])new TypeRewriteRule[]{this.fixTypeEverywhereTyped("EffectDurationPlayer", schema.getType(class06962.L), typed -> typed.update(DSL.remainderFinder(), this::L)), this.fixTypeEverywhereTyped("EffectDurationItem", var2, typed -> {
            Optional optional;
            if (typed.getOptional(var3).filter(pair -> N.contains(pair.getSecond())).isPresent() && (optional = typed.getOptionalTyped(var4)).isPresent()) {
                Dynamic var5 = (Dynamic)((Typed)optional.get()).get(DSL.remainderFinder());
                Typed var6 = ((Typed)optional.get()).set(DSL.remainderFinder(), (Object)var5.update("CustomPotionEffects", this::y));
                return typed.set(var4, var6);
            }
            return typed;
        })});
    }
}

