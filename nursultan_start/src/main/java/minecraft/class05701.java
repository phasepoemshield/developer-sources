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
 *  com.mojang.datafixers.types.templates.List$ListType
 *  com.mojang.serialization.Dynamic
 *  minecraft.class04995
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
import com.mojang.datafixers.types.templates.List;
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import minecraft.class04995;
import minecraft.class06962;

public class class05701
extends DataFix {
    private static final int N = 2;
    private static final int[] y = new int[]{0, 10, 50, 100, 150};

    public class05701(Schema schema, boolean bl) {
        super(schema, bl);
    }

    private static Typed<?> y(Typed<?> typed, int n) {
        int n2 = class05701.N(n);
        return typed.update(DSL.remainderFinder(), dynamic -> dynamic.set("Xp", dynamic.createInt(n2)));
    }

    public static int N(int n) {
        return y[class04995.N((int)(n - 1), (int)0, (int)(y.length - 1))];
    }

    private static Typed<?> N(Typed<?> typed, int n) {
        return typed.update(DSL.remainderFinder(), dynamic2 -> dynamic2.update("VillagerData", dynamic -> dynamic.set("level", dynamic.createInt(n))));
    }

    public TypeRewriteRule makeRule() {
        Type type = this.getInputSchema().getChoiceType(class06962.o, "minecraft:villager");
        OpticFinder opticFinder = DSL.namedChoice((String)"minecraft:villager", (Type)type);
        OpticFinder opticFinder2 = type.findField("Offers");
        OpticFinder opticFinder3 = opticFinder2.type().findField("Recipes");
        OpticFinder opticFinder4 = ((List.ListType)opticFinder3.type()).getElement().finder();
        return this.fixTypeEverywhereTyped("Villager level and xp rebuild", this.getInputSchema().getType(class06962.o), typed -> typed.updateTyped(opticFinder, type, typed2 -> {
            Optional optional;
            int n;
            Dynamic dynamic = (Dynamic)typed2.get(DSL.remainderFinder());
            int n2 = dynamic.get("VillagerData").get("level").asInt(0);
            Typed<?> typed3 = typed2;
            if ((n2 == 0 || n2 == 1) && (n2 = class04995.N((int)((n = typed2.getOptionalTyped(opticFinder2).flatMap(typed -> typed.getOptionalTyped(opticFinder3)).map(typed -> typed.getAllTyped(opticFinder4).size()).orElse(0).intValue()) / 2), (int)1, (int)5)) > 1) {
                typed3 = class05701.N(typed3, n2);
            }
            if ((optional = dynamic.get("Xp").asNumber().result()).isEmpty()) {
                typed3 = class05701.y(typed3, n2);
            }
            return typed3;
        }));
    }
}

