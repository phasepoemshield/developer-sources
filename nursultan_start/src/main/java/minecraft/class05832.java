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
 *  com.mojang.serialization.DynamicOps
 *  minecraft.class00622
 *  minecraft.class02269
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
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.DynamicOps;
import java.util.Optional;
import java.util.Set;
import minecraft.class00622;
import minecraft.class02269;
import minecraft.class03731;
import minecraft.class06962;
import minecraft.class07536;

public class class05832
extends DataFix {
    private static final Set<String> N = Set.of("minecraft:beacon", "minecraft:banner", "minecraft:brewing_stand", "minecraft:chest", "minecraft:trapped_chest", "minecraft:dispenser", "minecraft:dropper", "minecraft:enchanting_table", "minecraft:furnace", "minecraft:hopper", "minecraft:shulker_box");

    public class05832(Schema schema) {
        super(schema, true);
    }

    public static <T> Dynamic<T> N(Dynamic<T> dynamic) {
        String string = dynamic.get("CustomName").asString("");
        if (string.isEmpty()) {
            return dynamic.remove("CustomName");
        }
        return dynamic.set("CustomName", class03731.N((DynamicOps)dynamic.getOps(), (String)string));
    }

    public TypeRewriteRule makeRule() {
        OpticFinder var1 = DSL.fieldFinder((String)"id", (Type)class00622.N());
        Type var2 = this.getInputSchema().getType(class06962.G);
        Type var3 = this.getOutputSchema().getType(class06962.G);
        Type var4 = class02269.N((Type)var2, (Type)var2, (Type)var3);
        return this.fixTypeEverywhereTyped("BlockEntityCustomNameToComponentFix", var2, var3, typed -> {
            Optional optional = typed.getOptional(var1);
            if (optional.isPresent() && !N.contains(optional.get())) {
                return class02269.N((Type)var3, (Typed)typed);
            }
            return class07536.N((Typed)class02269.N((Type)var4, (Typed)typed), (Type)var3, class05832::N);
        });
    }
}

