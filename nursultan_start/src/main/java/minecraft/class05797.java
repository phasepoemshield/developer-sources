/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 *  minecraft.class00955
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.OpticFinder;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import minecraft.class00955;
import minecraft.class05803;
import minecraft.class06962;

public class class05797
extends class00955 {
    public class05797(Schema schema, boolean bl) {
        super(schema, bl, "BlockEntityBlockStateFix", class06962.G, "minecraft:piston");
    }

    protected Typed<?> N(Typed<?> typed) {
        Type var2 = this.getOutputSchema().getChoiceType(class06962.G, "minecraft:piston");
        Type var3 = var2.findFieldType("blockState");
        OpticFinder opticFinder = DSL.fieldFinder((String)"blockState", (Type)var3);
        Dynamic var5 = (Dynamic)typed.get(DSL.remainderFinder());
        int n = var5.get("blockId").asInt(0);
        Dynamic dynamic = var5.remove("blockId");
        int n2 = dynamic.get("blockData").asInt(0) & 0xF;
        dynamic = dynamic.remove("blockData");
        Dynamic<?> var8 = class05803.y(n << 4 | n2);
        return ((Typed)var2.pointTyped(typed.getOps()).orElseThrow(() -> new IllegalStateException("Could not create new piston block entity."))).set(DSL.remainderFinder(), (Object)dynamic).set(opticFinder, (Typed)((Pair)var3.readTyped(var8).result().orElseThrow(() -> new IllegalStateException("Could not parse newly created block state tag."))).getFirst());
    }
}

