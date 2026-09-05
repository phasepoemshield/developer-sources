/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.serialization.Dynamic
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.serialization.Dynamic;
import minecraft.class06962;

public class class05223
extends DataFix {
    public class05223(Schema schema) {
        super(schema, false);
    }

    private <T> Dynamic<T> N(Dynamic<T> dynamic) {
        if (!dynamic.get("Name").asString().result().filter("minecraft:redstone_wire"::equals).isPresent()) {
            return dynamic;
        }
        return dynamic.update("Properties", dynamic2 -> {
            String string = dynamic2.get("east").asString("none");
            String string2 = dynamic2.get("west").asString("none");
            String string3 = dynamic2.get("north").asString("none");
            String string4 = dynamic2.get("south").asString("none");
            boolean bl = class05223.N(string) || class05223.N(string2);
            boolean bl2 = class05223.N(string3) || class05223.N(string4);
            String string5 = !class05223.N(string) && !bl2 ? "side" : string;
            String string6 = !class05223.N(string2) && !bl2 ? "side" : string2;
            String string7 = !class05223.N(string3) && !bl ? "side" : string3;
            String string8 = !class05223.N(string4) && !bl ? "side" : string4;
            return dynamic2.update("east", dynamic -> dynamic.createString(string5)).update("west", dynamic -> dynamic.createString(string6)).update("north", dynamic -> dynamic.createString(string7)).update("south", dynamic -> dynamic.createString(string8));
        });
    }

    private static boolean N(String string) {
        return !"none".equals(string);
    }

    protected TypeRewriteRule makeRule() {
        Schema schema = this.getInputSchema();
        return this.fixTypeEverywhereTyped("RedstoneConnectionsFix", schema.getType(class06962.d), typed -> typed.update(DSL.remainderFinder(), this::N));
    }
}

