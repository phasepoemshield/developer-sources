/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DSL$TypeReference
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.OpticFinder
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.Typed
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.serialization.Dynamic
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 *  minecraft.class00622
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
import com.mojang.datafixers.util.Pair;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Stream;
import minecraft.class00622;
import minecraft.class06962;
import minecraft.class07536;

public class class01633
extends DataFix {
    private static final Int2ObjectMap<String> N = (Int2ObjectMap)class07536.N((Object)new Int2ObjectOpenHashMap(), (T int2ObjectOpenHashMap) -> {
        int2ObjectOpenHashMap.put(1, (Object)"minecraft:speed");
        int2ObjectOpenHashMap.put(2, (Object)"minecraft:slowness");
        int2ObjectOpenHashMap.put(3, (Object)"minecraft:haste");
        int2ObjectOpenHashMap.put(4, (Object)"minecraft:mining_fatigue");
        int2ObjectOpenHashMap.put(5, (Object)"minecraft:strength");
        int2ObjectOpenHashMap.put(6, (Object)"minecraft:instant_health");
        int2ObjectOpenHashMap.put(7, (Object)"minecraft:instant_damage");
        int2ObjectOpenHashMap.put(8, (Object)"minecraft:jump_boost");
        int2ObjectOpenHashMap.put(9, (Object)"minecraft:nausea");
        int2ObjectOpenHashMap.put(10, (Object)"minecraft:regeneration");
        int2ObjectOpenHashMap.put(11, (Object)"minecraft:resistance");
        int2ObjectOpenHashMap.put(12, (Object)"minecraft:fire_resistance");
        int2ObjectOpenHashMap.put(13, (Object)"minecraft:water_breathing");
        int2ObjectOpenHashMap.put(14, (Object)"minecraft:invisibility");
        int2ObjectOpenHashMap.put(15, (Object)"minecraft:blindness");
        int2ObjectOpenHashMap.put(16, (Object)"minecraft:night_vision");
        int2ObjectOpenHashMap.put(17, (Object)"minecraft:hunger");
        int2ObjectOpenHashMap.put(18, (Object)"minecraft:weakness");
        int2ObjectOpenHashMap.put(19, (Object)"minecraft:poison");
        int2ObjectOpenHashMap.put(20, (Object)"minecraft:wither");
        int2ObjectOpenHashMap.put(21, (Object)"minecraft:health_boost");
        int2ObjectOpenHashMap.put(22, (Object)"minecraft:absorption");
        int2ObjectOpenHashMap.put(23, (Object)"minecraft:saturation");
        int2ObjectOpenHashMap.put(24, (Object)"minecraft:glowing");
        int2ObjectOpenHashMap.put(25, (Object)"minecraft:levitation");
        int2ObjectOpenHashMap.put(26, (Object)"minecraft:luck");
        int2ObjectOpenHashMap.put(27, (Object)"minecraft:unluck");
        int2ObjectOpenHashMap.put(28, (Object)"minecraft:slow_falling");
        int2ObjectOpenHashMap.put(29, (Object)"minecraft:conduit_power");
        int2ObjectOpenHashMap.put(30, (Object)"minecraft:dolphins_grace");
        int2ObjectOpenHashMap.put(31, (Object)"minecraft:bad_omen");
        int2ObjectOpenHashMap.put(32, (Object)"minecraft:hero_of_the_village");
        int2ObjectOpenHashMap.put(33, (Object)"minecraft:darkness");
    });
    private static final Set<String> y = Set.of("minecraft:potion", "minecraft:splash_potion", "minecraft:lingering_potion", "minecraft:tipped_arrow");

    private static <T> Dynamic<T> L(Dynamic<T> dynamic) {
        Dynamic dynamic2 = dynamic.emptyMap();
        Dynamic<T> dynamic3 = class01633.N(dynamic, dynamic2);
        if (!dynamic3.equals((Object)dynamic2)) {
            dynamic = dynamic.set("stew_effects", dynamic.createList(Stream.of(dynamic3)));
        }
        return dynamic.remove("EffectId").remove("EffectDuration");
    }

    private TypeRewriteRule L() {
        Type var1 = this.getInputSchema().getType(class06962.L);
        return this.fixTypeEverywhereTyped("PlayerMobEffectIdFix", var1, typed -> typed.update(DSL.remainderFinder(), class01633::R));
    }

    private static <T> Dynamic<T> M(Dynamic<T> dynamic) {
        Optional<Dynamic> optional = dynamic.get("Effects").asStreamOpt().result().map(stream -> dynamic.createList(stream.map(class01633::y)));
        return dynamic.replaceField("Effects", "effects", optional);
    }

    public class01633(Schema schema) {
        super(schema, false);
    }

    private static <T> Dynamic<T> i(Dynamic<T> dynamic) {
        return class01633.y(dynamic, "Effects", "effects");
    }

    private static <T> Dynamic<T> u(Dynamic<T> dynamic) {
        return class01633.y(dynamic, "CustomPotionEffects", "custom_potion_effects");
    }

    private TypeRewriteRule u() {
        OpticFinder var1 = DSL.fieldFinder((String)"id", (Type)DSL.named((String)class06962.K.typeName(), (Type)class00622.N()));
        Type var2 = this.getInputSchema().getType(class06962.l);
        OpticFinder var3 = var2.findField("tag");
        return this.fixTypeEverywhereTyped("ItemStackMobEffectIdFix", var2, typed2 -> {
            Optional optional = typed2.getOptional(var1);
            if (optional.isPresent()) {
                String string = (String)((Pair)optional.get()).getSecond();
                if (string.equals("minecraft:suspicious_stew")) {
                    return typed2.updateTyped(var3, typed -> typed.update(DSL.remainderFinder(), class01633::M));
                }
                if (y.contains(string)) {
                    return typed2.updateTyped(var3, typed -> typed.update(DSL.remainderFinder(), dynamic -> class01633.y(dynamic, "CustomPotionEffects", "custom_potion_effects")));
                }
            }
            return typed2;
        });
    }

    private static <T> Dynamic<T> y(Dynamic<T> dynamic, String string, String string2) {
        Optional<Dynamic> optional = dynamic.get(string).asStreamOpt().result().map(stream -> dynamic.createList(stream.map(class01633::N)));
        return dynamic.replaceField(string, string2, optional);
    }

    private static <T> Dynamic<T> y(Dynamic<T> dynamic) {
        return class01633.N(dynamic, dynamic);
    }

    private TypeRewriteRule y() {
        Type var1 = this.getInputSchema().getType(class06962.o);
        return this.fixTypeEverywhereTyped("EntityMobEffectIdFix", var1, typed -> {
            Typed<?> var1 = this.N((Typed<?>)typed, class06962.o, "minecraft:mooshroom", class01633::L);
            var1 = this.N(var1, class06962.o, "minecraft:arrow", class01633::u);
            var1 = this.N(var1, class06962.o, "minecraft:area_effect_cloud", class01633::i);
            typed = var1.update(DSL.remainderFinder(), class01633::R);
            return typed;
        });
    }

    private TypeRewriteRule N() {
        Type var1 = this.getInputSchema().getType(class06962.G);
        return this.fixTypeEverywhereTyped("BlockEntityMobEffectIdFix", var1, typed -> {
            Typed<?> var1 = this.N((Typed<?>)typed, class06962.G, "minecraft:beacon", dynamic -> {
                dynamic = class01633.N(dynamic, "Primary", "primary_effect");
                return class01633.N(dynamic, "Secondary", "secondary_effect");
            });
            return var1;
        });
    }

    private Typed<?> N(Typed<?> typed2, DSL.TypeReference typeReference, String string, Function<Dynamic<?>, Dynamic<?>> function) {
        Type var5 = this.getInputSchema().getChoiceType(typeReference, string);
        Type var6 = this.getOutputSchema().getChoiceType(typeReference, string);
        return typed2.updateTyped(DSL.namedChoice((String)string, (Type)var5), var6, typed -> typed.update(DSL.remainderFinder(), function));
    }

    private static <T> Dynamic<T> N(Dynamic<T> dynamic, Dynamic<T> dynamic2) {
        dynamic2 = class01633.N(dynamic, "EffectId", dynamic2, "id");
        Optional optional = dynamic.get("EffectDuration").result();
        return dynamic2.replaceField("EffectDuration", "duration", optional);
    }

    private static <T> Dynamic<T> N(Dynamic<T> dynamic, String string, Dynamic<T> dynamic2, String string2) {
        Optional<Dynamic<T>> optional = class01633.N(dynamic, string);
        return dynamic2.replaceField(string, string2, optional);
    }

    private static <T> Dynamic<T> N(Dynamic<T> dynamic, String string, String string2) {
        return class01633.N(dynamic, string, dynamic, string2);
    }

    private static <T> Optional<Dynamic<T>> N(Dynamic<T> dynamic, String string) {
        return dynamic.get(string).asNumber().result().map(number -> (String)N.get(number.intValue())).map(arg_0 -> dynamic.createString(arg_0));
    }

    private static <T> Dynamic<T> N(Dynamic<T> dynamic) {
        dynamic = class01633.N(dynamic, "Id", "id");
        dynamic = dynamic.renameField("Ambient", "ambient");
        dynamic = dynamic.renameField("Amplifier", "amplifier");
        dynamic = dynamic.renameField("Duration", "duration");
        dynamic = dynamic.renameField("ShowParticles", "show_particles");
        dynamic = dynamic.renameField("ShowIcon", "show_icon");
        Optional<Dynamic> optional = dynamic.get("HiddenEffect").result().map(class01633::N);
        return dynamic.replaceField("HiddenEffect", "hidden_effect", optional);
    }

    private static Dynamic<?> R(Dynamic<?> dynamic) {
        return class01633.y(dynamic, "ActiveEffects", "active_effects");
    }

    protected TypeRewriteRule makeRule() {
        return TypeRewriteRule.seq((TypeRewriteRule)this.N(), (TypeRewriteRule[])new TypeRewriteRule[]{this.y(), this.L(), this.u()});
    }
}

