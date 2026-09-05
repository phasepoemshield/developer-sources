/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableMap
 *  com.google.common.collect.ImmutableSet
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFix
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.TypeRewriteRule
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.serialization.Dynamic
 *  minecraft.class05803
 *  minecraft.class06534
 *  minecraft.class06612
 *  minecraft.class06725
 *  minecraft.class06962
 *  minecraft.class07536
 *  org.apache.commons.lang3.StringUtils
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFix;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.TypeRewriteRule;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.serialization.Dynamic;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import minecraft.class05803;
import minecraft.class06534;
import minecraft.class06612;
import minecraft.class06725;
import minecraft.class06962;
import minecraft.class07536;
import org.apache.commons.lang3.StringUtils;
import org.jspecify.annotations.Nullable;

public class class06757
extends DataFix {
    private static final Set<String> N = Set.of("dummy", "trigger", "deathCount", "playerKillCount", "totalKillCount", "health", "food", "air", "armor", "xp", "level", "killedByTeam.aqua", "killedByTeam.black", "killedByTeam.blue", "killedByTeam.dark_aqua", "killedByTeam.dark_blue", "killedByTeam.dark_gray", "killedByTeam.dark_green", "killedByTeam.dark_purple", "killedByTeam.dark_red", "killedByTeam.gold", "killedByTeam.gray", "killedByTeam.green", "killedByTeam.light_purple", "killedByTeam.red", "killedByTeam.white", "killedByTeam.yellow", "teamkill.aqua", "teamkill.black", "teamkill.blue", "teamkill.dark_aqua", "teamkill.dark_blue", "teamkill.dark_gray", "teamkill.dark_green", "teamkill.dark_purple", "teamkill.dark_red", "teamkill.gold", "teamkill.gray", "teamkill.green", "teamkill.light_purple", "teamkill.red", "teamkill.white", "teamkill.yellow");
    private static final Set<String> y = ImmutableSet.builder().add((Object)"stat.craftItem.minecraft.spawn_egg").add((Object)"stat.useItem.minecraft.spawn_egg").add((Object)"stat.breakItem.minecraft.spawn_egg").add((Object)"stat.pickup.minecraft.spawn_egg").add((Object)"stat.drop.minecraft.spawn_egg").build();
    private static final Map<String, String> L = ImmutableMap.builder().put((Object)"stat.leaveGame", (Object)"minecraft:leave_game").put((Object)"stat.playOneMinute", (Object)"minecraft:play_one_minute").put((Object)"stat.timeSinceDeath", (Object)"minecraft:time_since_death").put((Object)"stat.sneakTime", (Object)"minecraft:sneak_time").put((Object)"stat.walkOneCm", (Object)"minecraft:walk_one_cm").put((Object)"stat.crouchOneCm", (Object)"minecraft:crouch_one_cm").put((Object)"stat.sprintOneCm", (Object)"minecraft:sprint_one_cm").put((Object)"stat.swimOneCm", (Object)"minecraft:swim_one_cm").put((Object)"stat.fallOneCm", (Object)"minecraft:fall_one_cm").put((Object)"stat.climbOneCm", (Object)"minecraft:climb_one_cm").put((Object)"stat.flyOneCm", (Object)"minecraft:fly_one_cm").put((Object)"stat.diveOneCm", (Object)"minecraft:dive_one_cm").put((Object)"stat.minecartOneCm", (Object)"minecraft:minecart_one_cm").put((Object)"stat.boatOneCm", (Object)"minecraft:boat_one_cm").put((Object)"stat.pigOneCm", (Object)"minecraft:pig_one_cm").put((Object)"stat.horseOneCm", (Object)"minecraft:horse_one_cm").put((Object)"stat.aviateOneCm", (Object)"minecraft:aviate_one_cm").put((Object)"stat.jump", (Object)"minecraft:jump").put((Object)"stat.drop", (Object)"minecraft:drop").put((Object)"stat.damageDealt", (Object)"minecraft:damage_dealt").put((Object)"stat.damageTaken", (Object)"minecraft:damage_taken").put((Object)"stat.deaths", (Object)"minecraft:deaths").put((Object)"stat.mobKills", (Object)"minecraft:mob_kills").put((Object)"stat.animalsBred", (Object)"minecraft:animals_bred").put((Object)"stat.playerKills", (Object)"minecraft:player_kills").put((Object)"stat.fishCaught", (Object)"minecraft:fish_caught").put((Object)"stat.talkedToVillager", (Object)"minecraft:talked_to_villager").put((Object)"stat.tradedWithVillager", (Object)"minecraft:traded_with_villager").put((Object)"stat.cakeSlicesEaten", (Object)"minecraft:eat_cake_slice").put((Object)"stat.cauldronFilled", (Object)"minecraft:fill_cauldron").put((Object)"stat.cauldronUsed", (Object)"minecraft:use_cauldron").put((Object)"stat.armorCleaned", (Object)"minecraft:clean_armor").put((Object)"stat.bannerCleaned", (Object)"minecraft:clean_banner").put((Object)"stat.brewingstandInteraction", (Object)"minecraft:interact_with_brewingstand").put((Object)"stat.beaconInteraction", (Object)"minecraft:interact_with_beacon").put((Object)"stat.dropperInspected", (Object)"minecraft:inspect_dropper").put((Object)"stat.hopperInspected", (Object)"minecraft:inspect_hopper").put((Object)"stat.dispenserInspected", (Object)"minecraft:inspect_dispenser").put((Object)"stat.noteblockPlayed", (Object)"minecraft:play_noteblock").put((Object)"stat.noteblockTuned", (Object)"minecraft:tune_noteblock").put((Object)"stat.flowerPotted", (Object)"minecraft:pot_flower").put((Object)"stat.trappedChestTriggered", (Object)"minecraft:trigger_trapped_chest").put((Object)"stat.enderchestOpened", (Object)"minecraft:open_enderchest").put((Object)"stat.itemEnchanted", (Object)"minecraft:enchant_item").put((Object)"stat.recordPlayed", (Object)"minecraft:play_record").put((Object)"stat.furnaceInteraction", (Object)"minecraft:interact_with_furnace").put((Object)"stat.craftingTableInteraction", (Object)"minecraft:interact_with_crafting_table").put((Object)"stat.chestOpened", (Object)"minecraft:open_chest").put((Object)"stat.sleepInBed", (Object)"minecraft:sleep_in_bed").put((Object)"stat.shulkerBoxOpened", (Object)"minecraft:open_shulker_box").build();
    private static final String u = "stat.mineBlock";
    private static final String i = "minecraft:mined";
    private static final Map<String, String> R = ImmutableMap.builder().put((Object)"stat.craftItem", (Object)"minecraft:crafted").put((Object)"stat.useItem", (Object)"minecraft:used").put((Object)"stat.breakItem", (Object)"minecraft:broken").put((Object)"stat.pickup", (Object)"minecraft:picked_up").put((Object)"stat.drop", (Object)"minecraft:dropped").build();
    private static final Map<String, String> M = ImmutableMap.builder().put((Object)"stat.entityKilledBy", (Object)"minecraft:killed_by").put((Object)"stat.killEntity", (Object)"minecraft:killed").build();
    private static final Map<String, String> B = ImmutableMap.builder().put((Object)"Bat", (Object)"minecraft:bat").put((Object)"Blaze", (Object)"minecraft:blaze").put((Object)"CaveSpider", (Object)"minecraft:cave_spider").put((Object)"Chicken", (Object)"minecraft:chicken").put((Object)"Cow", (Object)"minecraft:cow").put((Object)"Creeper", (Object)"minecraft:creeper").put((Object)"Donkey", (Object)"minecraft:donkey").put((Object)"ElderGuardian", (Object)"minecraft:elder_guardian").put((Object)"Enderman", (Object)"minecraft:enderman").put((Object)"Endermite", (Object)"minecraft:endermite").put((Object)"EvocationIllager", (Object)"minecraft:evocation_illager").put((Object)"Ghast", (Object)"minecraft:ghast").put((Object)"Guardian", (Object)"minecraft:guardian").put((Object)"Horse", (Object)"minecraft:horse").put((Object)"Husk", (Object)"minecraft:husk").put((Object)"Llama", (Object)"minecraft:llama").put((Object)"LavaSlime", (Object)"minecraft:magma_cube").put((Object)"MushroomCow", (Object)"minecraft:mooshroom").put((Object)"Mule", (Object)"minecraft:mule").put((Object)"Ozelot", (Object)"minecraft:ocelot").put((Object)"Parrot", (Object)"minecraft:parrot").put((Object)"Pig", (Object)"minecraft:pig").put((Object)"PolarBear", (Object)"minecraft:polar_bear").put((Object)"Rabbit", (Object)"minecraft:rabbit").put((Object)"Sheep", (Object)"minecraft:sheep").put((Object)"Shulker", (Object)"minecraft:shulker").put((Object)"Silverfish", (Object)"minecraft:silverfish").put((Object)"SkeletonHorse", (Object)"minecraft:skeleton_horse").put((Object)"Skeleton", (Object)"minecraft:skeleton").put((Object)"Slime", (Object)"minecraft:slime").put((Object)"Spider", (Object)"minecraft:spider").put((Object)"Squid", (Object)"minecraft:squid").put((Object)"Stray", (Object)"minecraft:stray").put((Object)"Vex", (Object)"minecraft:vex").put((Object)"Villager", (Object)"minecraft:villager").put((Object)"VindicationIllager", (Object)"minecraft:vindication_illager").put((Object)"Witch", (Object)"minecraft:witch").put((Object)"WitherSkeleton", (Object)"minecraft:wither_skeleton").put((Object)"Wolf", (Object)"minecraft:wolf").put((Object)"ZombieHorse", (Object)"minecraft:zombie_horse").put((Object)"PigZombie", (Object)"minecraft:zombie_pigman").put((Object)"ZombieVillager", (Object)"minecraft:zombie_villager").put((Object)"Zombie", (Object)"minecraft:zombie").build();
    private static final String Z = "minecraft:custom";

    private static String L(String string) {
        return class05803.N((String)string);
    }

    public class06757(Schema schema, boolean bl) {
        super(schema, bl);
    }

    private static @Nullable String y(String string) {
        return class06612.N((String)string, (int)0);
    }

    private TypeRewriteRule y() {
        Type var1 = this.getInputSchema().getType(class06962.c);
        Type var2 = this.getOutputSchema().getType(class06962.c);
        return this.fixTypeEverywhereTyped("ObjectiveStatFix", var1, var2, typed -> {
            Dynamic var3 = ((Dynamic)typed.get(DSL.remainderFinder())).update("CriteriaName", dynamic -> (Dynamic)DataFixUtils.orElse(dynamic.asString().result().map(string -> {
                if (N.contains(string)) {
                    return string;
                }
                class06725 class067252 = class06757.N(string);
                if (class067252 == null) {
                    return "dummy";
                }
                return class06534.y((String)class067252.N) + ":" + class06534.y((String)class067252.y);
            }).map(arg_0 -> ((Dynamic)dynamic).createString(arg_0)), (Object)dynamic));
            return class07536.N((Type)var2, (Dynamic)var3);
        });
    }

    private TypeRewriteRule N() {
        Type var1 = this.getInputSchema().getType(class06962.B);
        Type var2 = this.getOutputSchema().getType(class06962.B);
        return this.fixTypeEverywhereTyped("StatsCounterFix", var1, var2, typed -> {
            Dynamic var2 = (Dynamic)typed.get(DSL.remainderFinder());
            HashMap hashMap = Maps.newHashMap();
            Optional var4 = var2.getMapValues().result();
            if (var4.isPresent()) {
                for (Map.Entry entry : ((Map)var4.get()).entrySet()) {
                    class06725 class067252;
                    if (!((Dynamic)entry.getValue()).asNumber().result().isPresent() || (class067252 = class06757.N(((Dynamic)entry.getKey()).asString(""))) == null) continue;
                    Dynamic var9 = var2.createString(class067252.N());
                    Dynamic dynamic = hashMap.computeIfAbsent(var9, dynamic2 -> var2.emptyMap());
                    hashMap.put(var9, dynamic.set(class067252.y(), (Dynamic)entry.getValue()));
                }
            }
            return class07536.N((Type)var2, (Dynamic)var2.emptyMap().set("stats", var2.createMap((Map)hashMap)));
        });
    }

    private static @Nullable class06725 N(String string) {
        if (y.contains(string)) {
            return null;
        }
        String string2 = L.get(string);
        if (string2 != null) {
            return new class06725(Z, string2);
        }
        int n = StringUtils.ordinalIndexOf((CharSequence)string, (CharSequence)".", (int)2);
        if (n < 0) {
            return null;
        }
        String string3 = string.substring(0, n);
        if (u.equals(string3)) {
            String string4 = class06757.L(string.substring(n + 1).replace('.', ':'));
            return new class06725(i, string4);
        }
        String string5 = R.get(string3);
        if (string5 != null) {
            String string6 = string.substring(n + 1).replace('.', ':');
            String string7 = class06757.y(string6);
            String string8 = string7 == null ? string6 : string7;
            return new class06725(string5, string8);
        }
        String string9 = M.get(string3);
        if (string9 != null) {
            String string10 = string.substring(n + 1).replace('.', ':');
            String string11 = B.getOrDefault(string10, string10);
            return new class06725(string9, string11);
        }
        return null;
    }

    public TypeRewriteRule makeRule() {
        return TypeRewriteRule.seq((TypeRewriteRule)this.N(), (TypeRewriteRule)this.y());
    }
}

