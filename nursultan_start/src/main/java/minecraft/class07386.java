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
 *  com.mojang.serialization.Dynamic
 *  minecraft.class00622
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
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import java.util.Objects;
import java.util.Optional;
import minecraft.class00622;
import minecraft.class06962;

public class class07386
extends DataFix {
    public static final String[] N = new String[]{"minecraft:white_shulker_box", "minecraft:orange_shulker_box", "minecraft:magenta_shulker_box", "minecraft:light_blue_shulker_box", "minecraft:yellow_shulker_box", "minecraft:lime_shulker_box", "minecraft:pink_shulker_box", "minecraft:gray_shulker_box", "minecraft:silver_shulker_box", "minecraft:cyan_shulker_box", "minecraft:purple_shulker_box", "minecraft:blue_shulker_box", "minecraft:brown_shulker_box", "minecraft:green_shulker_box", "minecraft:red_shulker_box", "minecraft:black_shulker_box"};

    public class07386(Schema schema, boolean bl) {
        super(schema, bl);
    }

    public TypeRewriteRule makeRule() {
        Type var1 = this.getInputSchema().getType(class06962.l);
        OpticFinder var2 = DSL.fieldFinder((String)"id", (Type)DSL.named((String)class06962.K.typeName(), (Type)class00622.N()));
        OpticFinder var3 = var1.findField("tag");
        OpticFinder var4 = var3.type().findField("BlockEntityTag");
        return this.fixTypeEverywhereTyped("ItemShulkerBoxColorFix", var1, typed -> {
            Typed typed2;
            Optional optional;
            Optional optional2;
            Optional optional3 = typed.getOptional(var2);
            if (optional3.isPresent() && Objects.equals(((Pair)optional3.get()).getSecond(), "minecraft:shulker_box") && (optional2 = typed.getOptionalTyped(var3)).isPresent() && (optional = (typed2 = (Typed)optional2.get()).getOptionalTyped(var4)).isPresent()) {
                Typed typed3 = (Typed)optional.get();
                Dynamic var9 = (Dynamic)typed3.get(DSL.remainderFinder());
                int n = var9.get("Color").asInt(0);
                var9.remove("Color");
                return typed.set(var3, typed2.set(var4, typed3.set(DSL.remainderFinder(), (Object)var9))).set(var2, (Object)Pair.of((Object)class06962.K.typeName(), (Object)N[n % 16]));
            }
            return typed;
        });
    }
}

