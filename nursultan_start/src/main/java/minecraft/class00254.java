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
 *  minecraft.class00622
 *  minecraft.class02269
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
import com.mojang.serialization.Dynamic;
import java.util.Optional;
import minecraft.class00622;
import minecraft.class02269;
import minecraft.class06962;

public class class00254
extends DataFix {
    private static boolean L(String string) {
        return class00254.N(string) || class00254.y(string);
    }

    public class00254(Schema schema) {
        super(schema, true);
    }

    private static String i(String string) {
        return switch (string) {
            default -> "minecraft:oak_chest_boat";
            case "spruce" -> "minecraft:spruce_chest_boat";
            case "birch" -> "minecraft:birch_chest_boat";
            case "jungle" -> "minecraft:jungle_chest_boat";
            case "acacia" -> "minecraft:acacia_chest_boat";
            case "cherry" -> "minecraft:cherry_chest_boat";
            case "dark_oak" -> "minecraft:dark_oak_chest_boat";
            case "mangrove" -> "minecraft:mangrove_chest_boat";
            case "bamboo" -> "minecraft:bamboo_chest_raft";
        };
    }

    private static String u(String string) {
        return switch (string) {
            default -> "minecraft:oak_boat";
            case "spruce" -> "minecraft:spruce_boat";
            case "birch" -> "minecraft:birch_boat";
            case "jungle" -> "minecraft:jungle_boat";
            case "acacia" -> "minecraft:acacia_boat";
            case "cherry" -> "minecraft:cherry_boat";
            case "dark_oak" -> "minecraft:dark_oak_boat";
            case "mangrove" -> "minecraft:mangrove_boat";
            case "bamboo" -> "minecraft:bamboo_raft";
        };
    }

    private static boolean y(String string) {
        return string.equals("minecraft:chest_boat");
    }

    private static boolean N(String string) {
        return string.equals("minecraft:boat");
    }

    public TypeRewriteRule makeRule() {
        OpticFinder var1 = DSL.fieldFinder((String)"id", (Type)class00622.N());
        Type var2 = this.getInputSchema().getType(class06962.o);
        Type var3 = this.getOutputSchema().getType(class06962.o);
        return this.fixTypeEverywhereTyped("BoatSplitFix", var2, var3, typed -> {
            Optional optional = typed.getOptional(var1);
            if (optional.isPresent() && class00254.L((String)optional.get())) {
                Optional var5 = ((Dynamic)typed.getOrCreate(DSL.remainderFinder())).get("Type").asString().result();
                String string = class00254.y((String)optional.get()) ? var5.map(class00254::i).orElse("minecraft:oak_chest_boat") : var5.map(class00254::u).orElse("minecraft:oak_boat");
                return class02269.N((Type)var3, (Typed)typed).update(DSL.remainderFinder(), dynamic -> dynamic.remove("Type")).set(var1, (Object)string);
            }
            return class02269.N((Type)var3, (Typed)typed);
        });
    }
}

