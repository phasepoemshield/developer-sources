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
 *  minecraft.class00622
 *  minecraft.class02269
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
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Set;
import minecraft.class00622;
import minecraft.class02269;
import minecraft.class06962;
import minecraft.class07536;

public class class08634
extends DataFix {
    private static final Set<String> N = Set.of("minecraft:horse", "minecraft:skeleton_horse", "minecraft:zombie_horse", "minecraft:donkey", "minecraft:mule", "minecraft:camel", "minecraft:llama", "minecraft:trader_llama");
    private static final Set<String> y = Set.of("minecraft:pig", "minecraft:strider");
    private static final String L = "Saddle";
    private static final String u = "saddle";

    private static Dynamic<?> L(Dynamic<?> dynamic) {
        Dynamic dynamic2 = dynamic.get("drop_chances").orElseEmptyMap().set(u, dynamic.createFloat(2.0f));
        return dynamic.set("drop_chances", dynamic2);
    }

    public class08634(Schema schema) {
        super(schema, true);
    }

    private static Dynamic<?> y(Dynamic<?> dynamic) {
        boolean bl = dynamic.get(L).asBoolean(false);
        dynamic = dynamic.remove(L);
        if (!bl) {
            return dynamic;
        }
        Dynamic dynamic2 = dynamic.emptyMap().set("id", dynamic.createString("minecraft:saddle")).set("count", dynamic.createInt(1));
        return class08634.L(dynamic.set(u, dynamic2));
    }

    private static Dynamic<?> N(Dynamic<?> dynamic) {
        if (dynamic.get("SaddleItem").result().isEmpty()) {
            return dynamic;
        }
        return class08634.L(dynamic.renameField("SaddleItem", u));
    }

    protected TypeRewriteRule makeRule() {
        OpticFinder opticFinder = DSL.typeFinder((Type)this.getInputSchema().findChoiceType(class06962.o));
        Type var3 = this.getInputSchema().getType(class06962.o);
        Type var4 = this.getOutputSchema().getType(class06962.o);
        Type var5 = class02269.N((Type)var3, (Type)var3, (Type)var4);
        return this.fixTypeEverywhereTyped("SaddleEquipmentSlotFix", var3, var4, typed -> {
            String string = typed.getOptional(opticFinder).map(Pair::getFirst).map(class00622::N).orElse("");
            Typed typed2 = class02269.N((Type)var5, (Typed)typed);
            if (N.contains(string)) {
                return class07536.N((Typed)typed2, (Type)var4, class08634::N);
            }
            if (y.contains(string)) {
                return class07536.N((Typed)typed2, (Type)var4, class08634::y);
            }
            return class02269.N((Type)var4, (Typed)typed);
        });
    }
}

