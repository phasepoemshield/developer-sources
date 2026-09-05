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
 *  minecraft.class06612
 *  minecraft.class06962
 *  minecraft.class07939
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
import minecraft.class06612;
import minecraft.class06962;
import minecraft.class07939;

public class class05833
extends class00955 {
    public class05833(Schema schema, boolean bl) {
        super(schema, bl, "BlockEntityJukeboxFix", class06962.G, "minecraft:jukebox");
    }

    protected Typed<?> N(Typed<?> typed) {
        Type var3 = this.getInputSchema().getChoiceType(class06962.G, "minecraft:jukebox").findFieldType("RecordItem");
        OpticFinder opticFinder = DSL.fieldFinder((String)"RecordItem", (Type)var3);
        Dynamic var5 = (Dynamic)typed.get(DSL.remainderFinder());
        int n = var5.get("Record").asInt(0);
        if (n > 0) {
            var5.remove("Record");
            String string = class06612.N((String)class07939.N((int)n), (int)0);
            if (string != null) {
                Dynamic var8 = var5.emptyMap();
                Dynamic dynamic = var8.set("id", var8.createString(string));
                dynamic = dynamic.set("Count", dynamic.createByte((byte)1));
                return typed.set(opticFinder, (Typed)((Pair)var3.readTyped(dynamic).result().orElseThrow(() -> new IllegalStateException("Could not create record item stack."))).getFirst()).set(DSL.remainderFinder(), (Object)var5);
            }
        }
        return typed;
    }
}

