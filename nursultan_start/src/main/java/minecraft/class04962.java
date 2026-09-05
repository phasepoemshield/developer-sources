/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 *  com.mojang.serialization.OptionalDynamic
 *  minecraft.class06962
 */
package minecraft;

import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.Typed;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import com.mojang.serialization.OptionalDynamic;
import java.util.Arrays;
import java.util.function.Function;
import minecraft.class06962;

public class class04962
extends DataFix {
    private Dynamic<?> L(Dynamic<?> dynamic) {
        String string = "owner";
        OptionalDynamic optionalDynamic = dynamic.get("owner");
        long l = optionalDynamic.get("M").asLong(0L);
        long l2 = optionalDynamic.get("L").asLong(0L);
        return this.N(dynamic, l, l2).remove("owner");
    }

    public class04962(Schema schema) {
        super(schema, false);
    }

    private Dynamic<?> y(Dynamic<?> dynamic) {
        OptionalDynamic optionalDynamic = dynamic.get("Owner");
        long l = optionalDynamic.get("OwnerUUIDMost").asLong(0L);
        long l2 = optionalDynamic.get("OwnerUUIDLeast").asLong(0L);
        return this.N(dynamic, l, l2).remove("Owner");
    }

    private Dynamic<?> N(Dynamic<?> dynamic, long l, long l2) {
        String string = "OwnerUUID";
        if (l != 0L && l2 != 0L) {
            return dynamic.set("OwnerUUID", dynamic.createIntList(Arrays.stream(class04962.N(l, l2))));
        }
        return dynamic;
    }

    private static int[] N(long l, long l2) {
        return new int[]{(int)(l >> 32), (int)l, (int)(l2 >> 32), (int)l2};
    }

    private Typed<?> N(Typed<?> typed2, String string, Function<Dynamic<?>, Dynamic<?>> function) {
        Type type = this.getInputSchema().getChoiceType(class06962.o, string);
        Type type2 = this.getOutputSchema().getChoiceType(class06962.o, string);
        return typed2.updateTyped(DSL.namedChoice((String)string, (Type)type), type2, typed -> typed.update(DSL.remainderFinder(), function));
    }

    private Dynamic<?> N(Dynamic<?> dynamic) {
        long l = dynamic.get("OwnerUUIDMost").asLong(0L);
        long l2 = dynamic.get("OwnerUUIDLeast").asLong(0L);
        return this.N(dynamic, l, l2).remove("OwnerUUIDMost").remove("OwnerUUIDLeast");
    }

    private Typed<?> N(Typed<?> typed) {
        typed = this.N(typed, "minecraft:egg", this::L);
        typed = this.N(typed, "minecraft:ender_pearl", this::L);
        typed = this.N(typed, "minecraft:experience_bottle", this::L);
        typed = this.N(typed, "minecraft:snowball", this::L);
        typed = this.N(typed, "minecraft:potion", this::L);
        typed = this.N(typed, "minecraft:llama_spit", this::y);
        typed = this.N(typed, "minecraft:arrow", this::N);
        typed = this.N(typed, "minecraft:spectral_arrow", this::N);
        typed = this.N(typed, "minecraft:trident", this::N);
        return typed;
    }

    protected TypeRewriteRule makeRule() {
        Schema schema = this.getInputSchema();
        return this.fixTypeEverywhereTyped("EntityProjectileOwner", schema.getType(class06962.o), this::N);
    }
}

