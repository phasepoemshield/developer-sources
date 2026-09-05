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
import com.mojang.datafixers.util.Pair;
import java.util.Optional;
import java.util.Set;
import java.util.function.Predicate;
import minecraft.class00622;
import minecraft.class03731;
import minecraft.class06962;
import minecraft.class07536;

public class class02166
extends DataFix {
    private static final Set<String> N = Set.of("filled_map.buried_treasure", "filled_map.explorer_jungle", "filled_map.explorer_swamp", "filled_map.mansion", "filled_map.monument", "filled_map.trial_chambers", "filled_map.village_desert", "filled_map.village_plains", "filled_map.village_savanna", "filled_map.village_snowy", "filled_map.village_taiga");

    public class02166(Schema schema) {
        super(schema, false);
    }

    private static <T> Typed<T> y(Typed<T> typed) {
        return class02166.N(typed, (String string) -> string.equals("block.minecraft.ominous_banner"));
    }

    private static <T> Typed<T> N(Typed<T> typed, Predicate<String> predicate) {
        return class07536.N(typed, (Type)typed.getType(), dynamic -> {
            if (dynamic.get("minecraft:custom_name").asString().result().flatMap(class03731::u).filter(predicate).isPresent()) {
                return dynamic.renameField("minecraft:custom_name", "minecraft:item_name");
            }
            return dynamic;
        });
    }

    private static <T> Typed<T> N(Typed<T> typed) {
        return class02166.N(typed, N::contains);
    }

    public final TypeRewriteRule makeRule() {
        Type var1 = this.getInputSchema().getType(class06962.l);
        OpticFinder var2 = DSL.fieldFinder((String)"id", (Type)DSL.named((String)class06962.K.typeName(), (Type)class00622.N()));
        OpticFinder var3 = var1.findField("components");
        return this.fixTypeEverywhereTyped("ItemStack custom_name to item_name component fix", var1, typed -> {
            Optional<Object> optional = typed.getOptional(var2).map(Pair::getSecond);
            if (optional.filter(string -> string.equals("minecraft:white_banner")).isPresent()) {
                return typed.updateTyped(var3, class02166::y);
            }
            if (optional.filter(string -> string.equals("minecraft:filled_map")).isPresent()) {
                return typed.updateTyped(var3, class02166::N);
            }
            return typed;
        });
    }
}

