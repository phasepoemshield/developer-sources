/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  it.unimi.dsi.fastutil.objects.Object2IntArrayMap
 *  it.unimi.dsi.fastutil.objects.Object2IntMap$Entry
 *  minecraft.class06962
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import it.unimi.dsi.fastutil.objects.Object2IntArrayMap;
import it.unimi.dsi.fastutil.objects.Object2IntMap;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.LongStream;
import minecraft.class04429;
import minecraft.class06962;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;

public class class04415
extends DataFix {
    private static final Logger N = LogUtils.getLogger();
    private static final Map<String, class04429> y = ImmutableMap.builder().put((Object)"mineshaft", (Object)class04429.N(Map.of(List.of("minecraft:badlands", "minecraft:eroded_badlands", "minecraft:wooded_badlands"), "minecraft:mineshaft_mesa"), "minecraft:mineshaft")).put((Object)"shipwreck", (Object)class04429.N(Map.of(List.of("minecraft:beach", "minecraft:snowy_beach"), "minecraft:shipwreck_beached"), "minecraft:shipwreck")).put((Object)"ocean_ruin", (Object)class04429.N(Map.of(List.of("minecraft:warm_ocean", "minecraft:lukewarm_ocean", "minecraft:deep_lukewarm_ocean"), "minecraft:ocean_ruin_warm"), "minecraft:ocean_ruin_cold")).put((Object)"village", (Object)class04429.N(Map.of(List.of("minecraft:desert"), "minecraft:village_desert", List.of("minecraft:savanna"), "minecraft:village_savanna", List.of("minecraft:snowy_plains"), "minecraft:village_snowy", List.of("minecraft:taiga"), "minecraft:village_taiga"), "minecraft:village_plains")).put((Object)"ruined_portal", (Object)class04429.N(Map.of(List.of("minecraft:desert"), "minecraft:ruined_portal_desert", List.of("minecraft:badlands", "minecraft:eroded_badlands", "minecraft:wooded_badlands", "minecraft:windswept_hills", "minecraft:windswept_forest", "minecraft:windswept_gravelly_hills", "minecraft:savanna_plateau", "minecraft:windswept_savanna", "minecraft:stony_shore", "minecraft:meadow", "minecraft:frozen_peaks", "minecraft:jagged_peaks", "minecraft:stony_peaks", "minecraft:snowy_slopes"), "minecraft:ruined_portal_mountain", List.of("minecraft:bamboo_jungle", "minecraft:jungle", "minecraft:sparse_jungle"), "minecraft:ruined_portal_jungle", List.of("minecraft:deep_frozen_ocean", "minecraft:deep_cold_ocean", "minecraft:deep_ocean", "minecraft:deep_lukewarm_ocean", "minecraft:frozen_ocean", "minecraft:ocean", "minecraft:cold_ocean", "minecraft:lukewarm_ocean", "minecraft:warm_ocean"), "minecraft:ruined_portal_ocean"), "minecraft:ruined_portal")).put((Object)"pillager_outpost", (Object)class04429.N("minecraft:pillager_outpost")).put((Object)"mansion", (Object)class04429.N("minecraft:mansion")).put((Object)"jungle_pyramid", (Object)class04429.N("minecraft:jungle_pyramid")).put((Object)"desert_pyramid", (Object)class04429.N("minecraft:desert_pyramid")).put((Object)"igloo", (Object)class04429.N("minecraft:igloo")).put((Object)"swamp_hut", (Object)class04429.N("minecraft:swamp_hut")).put((Object)"stronghold", (Object)class04429.N("minecraft:stronghold")).put((Object)"monument", (Object)class04429.N("minecraft:monument")).put((Object)"fortress", (Object)class04429.N("minecraft:fortress")).put((Object)"endcity", (Object)class04429.N("minecraft:end_city")).put((Object)"buried_treasure", (Object)class04429.N("minecraft:buried_treasure")).put((Object)"nether_fossil", (Object)class04429.N("minecraft:nether_fossil")).put((Object)"bastion_remnant", (Object)class04429.N("minecraft:bastion_remnant")).build();

    private @Nullable Dynamic<?> L(Dynamic<?> dynamic, Dynamic<?> dynamic2) {
        Optional<String> var6;
        String string = dynamic.asString("UNKNOWN").toLowerCase(Locale.ROOT);
        class04429 class044292 = y.get(string);
        if (class044292 == null) {
            return null;
        }
        String string2 = class044292.y();
        if (!class044292.N().isEmpty() && (var6 = this.N(dynamic2, class044292)).isPresent()) {
            string2 = var6.get();
        }
        return dynamic2.createString(string2);
    }

    public class04415(Schema schema) {
        super(schema, false);
    }

    private Dynamic<?> y(Dynamic<?> dynamic, Dynamic<?> dynamic2) {
        Map<Dynamic, Dynamic> map = dynamic.getMapValues().result().orElse(Map.of());
        HashMap hashMap = Maps.newHashMap();
        map.forEach((dynamic4, dynamic5) -> {
            if (dynamic5.asLongStream().count() == 0L) {
                return;
            }
            Dynamic<?> var5 = this.L((Dynamic<?>)dynamic4, dynamic2);
            if (var5 == null) {
                N.warn("Encountered unknown structure in datafixer: {}", (Object)dynamic4.asString("<missing key>"));
                return;
            }
            hashMap.compute(var5, (dynamic2, dynamic3) -> {
                if (dynamic3 == null) {
                    return dynamic5;
                }
                return dynamic5.createLongList(LongStream.concat(dynamic3.asLongStream(), dynamic5.asLongStream()));
            });
        });
        return dynamic2.createMap((Map)hashMap);
    }

    private Dynamic<?> N(Dynamic<?> dynamic, Dynamic<?> dynamic3) {
        Map<Dynamic, Dynamic> map = dynamic.getMapValues().result().orElse(Map.of());
        HashMap hashMap = Maps.newHashMap();
        map.forEach((dynamic2, dynamic4) -> {
            if (dynamic4.get("id").asString("INVALID").equals("INVALID")) {
                return;
            }
            Dynamic<?> var5 = this.L((Dynamic<?>)dynamic2, dynamic3);
            if (var5 == null) {
                N.warn("Encountered unknown structure in datafixer: {}", (Object)dynamic2.asString("<missing key>"));
                return;
            }
            hashMap.computeIfAbsent(var5, dynamic3 -> dynamic4.set("id", var5));
        });
        return dynamic3.createMap((Map)hashMap);
    }

    private Dynamic<?> N(Dynamic<?> dynamic) {
        return dynamic.update("structures", dynamic3 -> dynamic3.update("starts", dynamic2 -> this.N((Dynamic<?>)dynamic2, dynamic)).update("References", dynamic2 -> this.y((Dynamic<?>)dynamic2, dynamic)));
    }

    private Optional<String> N(Dynamic<?> dynamic, class04429 class044292) {
        Object2IntArrayMap object2IntArrayMap = new Object2IntArrayMap();
        dynamic.get("sections").asList(Function.identity()).forEach(dynamic2 -> dynamic2.get("biomes").get("palette").asList(Function.identity()).forEach(dynamic -> {
            String string = class044292.N().get(dynamic.asString(""));
            if (string != null) {
                object2IntArrayMap.mergeInt((Object)string, 1, Integer::sum);
            }
        }));
        return object2IntArrayMap.object2IntEntrySet().stream().max(Comparator.comparingInt(Object2IntMap.Entry::getIntValue)).map(Map.Entry::getKey);
    }

    protected TypeRewriteRule makeRule() {
        Type var1 = this.getInputSchema().getType(class06962.u);
        Type var2 = this.getInputSchema().getType(class06962.u);
        return this.writeFixAndRead("StucturesToConfiguredStructures", var1, var2, this::N);
    }
}

