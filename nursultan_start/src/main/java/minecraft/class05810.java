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
 *  minecraft.class00622
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
import java.util.Optional;
import minecraft.class00622;
import minecraft.class00955;
import minecraft.class06962;

public class class05810
extends class00955 {
    public class05810(Schema schema, boolean bl) {
        super(schema, bl, "EntityHorseSaddleFix", class06962.o, "EntityHorse");
    }

    protected Typed<?> N(Typed<?> typed) {
        OpticFinder var2 = DSL.fieldFinder((String)"id", (Type)DSL.named((String)class06962.K.typeName(), (Type)class00622.N()));
        Type var3 = this.getInputSchema().getTypeRaw(class06962.l);
        OpticFinder opticFinder = DSL.fieldFinder((String)"SaddleItem", (Type)var3);
        Optional optional = typed.getOptionalTyped(opticFinder);
        Dynamic var6 = (Dynamic)typed.get(DSL.remainderFinder());
        if (optional.isEmpty() && var6.get("Saddle").asBoolean(false)) {
            Typed typed2 = (Typed)var3.pointTyped(typed.getOps()).orElseThrow(IllegalStateException::new);
            typed2 = typed2.set(var2, (Object)Pair.of((Object)class06962.K.typeName(), (Object)"minecraft:saddle"));
            Dynamic var8 = var6.emptyMap();
            Dynamic dynamic = var8.set("Count", var8.createByte((byte)1));
            dynamic = dynamic.set("Damage", dynamic.createShort((short)0));
            typed2 = typed2.set(DSL.remainderFinder(), (Object)dynamic);
            var6.remove("Saddle");
            return typed.set(opticFinder, typed2).set(DSL.remainderFinder(), (Object)var6);
        }
        return typed;
    }
}

