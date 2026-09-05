/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 *  minecraft.class00622
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import minecraft.class00622;
import minecraft.class06962;

public class class04996
extends DataFix {
    public class04996(Schema schema, boolean bl) {
        super(schema, bl);
    }

    public TypeRewriteRule makeRule() {
        OpticFinder opticFinder = DSL.fieldFinder((String)"id", (Type)DSL.named((String)class06962.K.typeName(), (Type)class00622.N()));
        return this.fixTypeEverywhereTyped("BedItemColorFix", this.getInputSchema().getType(class06962.l), typed -> {
            Dynamic dynamic;
            Optional optional = typed.getOptional(opticFinder);
            if (optional.isPresent() && Objects.equals(((Pair)optional.get()).getSecond(), "minecraft:bed") && (dynamic = (Dynamic)typed.get(DSL.remainderFinder())).get("Damage").asInt(0) == 0) {
                return typed.set(DSL.remainderFinder(), (Object)dynamic.set("Damage", dynamic.createShort((short)14)));
            }
            return typed;
        });
    }
}

