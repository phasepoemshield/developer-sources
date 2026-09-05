/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 *  minecraft.class06962
 *  minecraft.class07536
 *  minecraft.class08147
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import minecraft.class06962;
import minecraft.class07536;
import minecraft.class08147;

public class class05815
extends class08147 {
    public class05815(Schema schema) {
        super("EntityMinecartIdentifiersFix", schema, true);
    }

    protected Pair<String, Typed<?>> N(String string, Typed<?> typed) {
        if (!string.equals("Minecart")) {
            return Pair.of((Object)string, typed);
        }
        String string2 = switch (((Dynamic)typed.getOrCreate(DSL.remainderFinder())).get("Type").asInt(0)) {
            default -> "MinecartRideable";
            case 1 -> "MinecartChest";
            case 2 -> "MinecartFurnace";
        };
        Type var5 = (Type)this.getOutputSchema().findChoiceType(class06962.o).types().get(string2);
        return Pair.of((Object)string2, (Object)class07536.N(typed, (Type)var5, dynamic -> dynamic.remove("Type")));
    }
}

