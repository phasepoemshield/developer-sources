/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.DataFixUtils
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.Hook$HookFunction
 *  com.mojang.datafixers.types.templates.TypeTemplate
 *  com.mojang.datafixers.util.Pair
 *  com.mojang.logging.LogUtils
 *  com.mojang.serialization.Dynamic
 *  minecraft.class00622
 *  minecraft.class06962
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.DataFixUtils;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.Hook;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.Dynamic;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import minecraft.class00622;
import minecraft.class06690;
import minecraft.class06962;
import org.slf4j.Logger;

public class class06689
extends Schema {
    private static final Logger u = LogUtils.getLogger();
    static final Map<String, String> N = (Map)DataFixUtils.make((Object)Maps.newHashMap(), hashMap -> {
        hashMap.put("minecraft:furnace", "Furnace");
        hashMap.put("minecraft:lit_furnace", "Furnace");
        hashMap.put("minecraft:chest", "Chest");
        hashMap.put("minecraft:trapped_chest", "Chest");
        hashMap.put("minecraft:ender_chest", "EnderChest");
        hashMap.put("minecraft:jukebox", "RecordPlayer");
        hashMap.put("minecraft:dispenser", "Trap");
        hashMap.put("minecraft:dropper", "Dropper");
        hashMap.put("minecraft:sign", "Sign");
        hashMap.put("minecraft:mob_spawner", "MobSpawner");
        hashMap.put("minecraft:noteblock", "Music");
        hashMap.put("minecraft:brewing_stand", "Cauldron");
        hashMap.put("minecraft:enhanting_table", "EnchantTable");
        hashMap.put("minecraft:command_block", "CommandBlock");
        hashMap.put("minecraft:beacon", "Beacon");
        hashMap.put("minecraft:skull", "Skull");
        hashMap.put("minecraft:daylight_detector", "DLDetector");
        hashMap.put("minecraft:hopper", "Hopper");
        hashMap.put("minecraft:banner", "Banner");
        hashMap.put("minecraft:flower_pot", "FlowerPot");
        hashMap.put("minecraft:repeating_command_block", "CommandBlock");
        hashMap.put("minecraft:chain_command_block", "CommandBlock");
        hashMap.put("minecraft:standing_sign", "Sign");
        hashMap.put("minecraft:wall_sign", "Sign");
        hashMap.put("minecraft:piston_head", "Piston");
        hashMap.put("minecraft:daylight_detector_inverted", "DLDetector");
        hashMap.put("minecraft:unpowered_comparator", "Comparator");
        hashMap.put("minecraft:powered_comparator", "Comparator");
        hashMap.put("minecraft:wall_banner", "Banner");
        hashMap.put("minecraft:standing_banner", "Banner");
        hashMap.put("minecraft:structure_block", "Structure");
        hashMap.put("minecraft:end_portal", "Airportal");
        hashMap.put("minecraft:end_gateway", "EndGateway");
        hashMap.put("minecraft:shield", "Banner");
    });
    public static final Map<String, String> y = Map.of("minecraft:armor_stand", "ArmorStand", "minecraft:painting", "Painting");
    protected static final Hook.HookFunction L = new class06690();

    protected static void L(Schema schema, Map<String, Supplier<TypeTemplate>> map, String string) {
        schema.register(map, string, () -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)class06962.l.in(schema))));
    }

    public class06689(int n, Schema schema) {
        super(n, schema);
    }

    protected static void y(Schema schema, Map<String, Supplier<TypeTemplate>> map, String string) {
        schema.register(map, string, () -> DSL.optionalFields((String)"DisplayTile", (TypeTemplate)class06962.q.in(schema)));
    }

    public static TypeTemplate y(Schema schema) {
        return DSL.optionalFields((Pair[])new Pair[]{Pair.of((Object)"EntityTag", (Object)class06962.J.in(schema)), Pair.of((Object)"BlockEntityTag", (Object)class06962.G.in(schema)), Pair.of((Object)"CanDestroy", (Object)DSL.list((TypeTemplate)class06962.q.in(schema))), Pair.of((Object)"CanPlaceOn", (Object)DSL.list((TypeTemplate)class06962.q.in(schema))), Pair.of((Object)"Items", (Object)DSL.list((TypeTemplate)class06962.l.in(schema))), Pair.of((Object)"ChargedProjectiles", (Object)DSL.list((TypeTemplate)class06962.l.in(schema))), Pair.of((Object)"pages", (Object)DSL.list((TypeTemplate)class06962.O.in(schema))), Pair.of((Object)"filtered_pages", (Object)DSL.compoundList((TypeTemplate)class06962.O.in(schema))), Pair.of((Object)"display", (Object)DSL.optionalFields((String)"Name", (TypeTemplate)class06962.O.in(schema), (String)"Lore", (TypeTemplate)DSL.list((TypeTemplate)class06962.O.in(schema))))});
    }

    protected static <T> T N(Dynamic<T> dynamic, Map<String, String> map, Map<String, String> map2) {
        return (T)dynamic.update("tag", dynamic3 -> dynamic3.update("BlockEntityTag", dynamic2 -> {
            String string = dynamic.get("id").asString().result().map(class00622::N).orElse("minecraft:air");
            if (!"minecraft:air".equals(string)) {
                String string2 = (String)map.get(string);
                if (string2 == null) {
                    u.warn("Unable to resolve BlockEntity for ItemStack: {}", (Object)string);
                } else {
                    return dynamic2.set("id", dynamic.createString(string2));
                }
            }
            return dynamic2;
        }).update("EntityTag", dynamic2 -> {
            if (dynamic2.get("id").result().isPresent()) {
                return dynamic2;
            }
            String string = class00622.N((String)dynamic.get("id").asString(""));
            String string2 = (String)map2.get(string);
            if (string2 != null) {
                return dynamic2.set("id", dynamic.createString(string2));
            }
            return dynamic2;
        })).getValue();
    }

    protected static void N(Schema schema, Map<String, Supplier<TypeTemplate>> map, String string) {
        schema.register(map, string, () -> DSL.optionalFields((String)"inTile", (TypeTemplate)class06962.q.in(schema)));
    }

    public static TypeTemplate N(Schema schema) {
        return DSL.optionalFields((Pair[])new Pair[]{Pair.of((Object)"Text1", (Object)class06962.O.in(schema)), Pair.of((Object)"Text2", (Object)class06962.O.in(schema)), Pair.of((Object)"Text3", (Object)class06962.O.in(schema)), Pair.of((Object)"Text4", (Object)class06962.O.in(schema)), Pair.of((Object)"FilteredText1", (Object)class06962.O.in(schema)), Pair.of((Object)"FilteredText2", (Object)class06962.O.in(schema)), Pair.of((Object)"FilteredText3", (Object)class06962.O.in(schema)), Pair.of((Object)"FilteredText4", (Object)class06962.O.in(schema))});
    }

    public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema schema) {
        HashMap hashMap = Maps.newHashMap();
        class06689.L(schema, hashMap, "Furnace");
        class06689.L(schema, hashMap, "Chest");
        schema.registerSimple((Map)hashMap, "EnderChest");
        schema.register((Map)hashMap, "RecordPlayer", string -> DSL.optionalFields((String)"RecordItem", (TypeTemplate)class06962.l.in(schema)));
        class06689.L(schema, hashMap, "Trap");
        class06689.L(schema, hashMap, "Dropper");
        schema.register((Map)hashMap, "Sign", () -> class06689.N(schema));
        schema.register((Map)hashMap, "MobSpawner", string -> class06962.e.in(schema));
        schema.registerSimple((Map)hashMap, "Music");
        schema.registerSimple((Map)hashMap, "Piston");
        class06689.L(schema, hashMap, "Cauldron");
        schema.registerSimple((Map)hashMap, "EnchantTable");
        schema.registerSimple((Map)hashMap, "Airportal");
        schema.register((Map)hashMap, "Control", () -> DSL.optionalFields((String)"LastOutput", (TypeTemplate)class06962.O.in(schema)));
        schema.registerSimple((Map)hashMap, "Beacon");
        schema.register((Map)hashMap, "Skull", () -> DSL.optionalFields((String)"custom_name", (TypeTemplate)class06962.O.in(schema)));
        schema.registerSimple((Map)hashMap, "DLDetector");
        class06689.L(schema, hashMap, "Hopper");
        schema.registerSimple((Map)hashMap, "Comparator");
        schema.register((Map)hashMap, "FlowerPot", string -> DSL.optionalFields((String)"Item", (TypeTemplate)DSL.or((TypeTemplate)DSL.constType((Type)DSL.intType()), (TypeTemplate)class06962.K.in(schema))));
        schema.register((Map)hashMap, "Banner", () -> DSL.optionalFields((String)"CustomName", (TypeTemplate)class06962.O.in(schema)));
        schema.registerSimple((Map)hashMap, "Structure");
        schema.registerSimple((Map)hashMap, "EndGateway");
        return hashMap;
    }

    public void registerTypes(Schema schema, Map<String, Supplier<TypeTemplate>> map, Map<String, Supplier<TypeTemplate>> map2) {
        schema.registerType(false, class06962.N, () -> DSL.optionalFields((String)"CustomBossEvents", (TypeTemplate)DSL.compoundList((TypeTemplate)DSL.optionalFields((String)"Name", (TypeTemplate)class06962.O.in(schema))), (TypeTemplate)class06962.y.in(schema)));
        schema.registerType(false, class06962.y, DSL::remainder);
        schema.registerType(false, class06962.L, () -> DSL.optionalFields((String)"Inventory", (TypeTemplate)DSL.list((TypeTemplate)class06962.l.in(schema)), (String)"EnderItems", (TypeTemplate)DSL.list((TypeTemplate)class06962.l.in(schema))));
        schema.registerType(false, class06962.u, () -> DSL.fields((String)"Level", (TypeTemplate)DSL.optionalFields((String)"Entities", (TypeTemplate)DSL.list((TypeTemplate)class06962.J.in(schema)), (String)"TileEntities", (TypeTemplate)DSL.list((TypeTemplate)DSL.or((TypeTemplate)class06962.G.in(schema), (TypeTemplate)DSL.remainder())), (String)"TileTicks", (TypeTemplate)DSL.list((TypeTemplate)DSL.fields((String)"i", (TypeTemplate)class06962.q.in(schema))))));
        schema.registerType(true, class06962.G, () -> DSL.optionalFields((String)"components", (TypeTemplate)class06962.k.in(schema), (TypeTemplate)DSL.taggedChoiceLazy((String)"id", (Type)DSL.string(), (Map)map2)));
        schema.registerType(true, class06962.J, () -> DSL.optionalFields((String)"Riding", (TypeTemplate)class06962.J.in(schema), (TypeTemplate)class06962.o.in(schema)));
        schema.registerType(false, class06962.I, () -> DSL.constType((Type)class00622.N()));
        schema.registerType(true, class06962.o, () -> DSL.and((TypeTemplate)class06962.g.in(schema), (TypeTemplate)DSL.optionalFields((String)"CustomName", (TypeTemplate)DSL.constType((Type)DSL.string()), (TypeTemplate)DSL.taggedChoiceLazy((String)"id", (Type)DSL.string(), (Map)map))));
        schema.registerType(true, class06962.l, () -> DSL.hook((TypeTemplate)DSL.optionalFields((String)"id", (TypeTemplate)DSL.or((TypeTemplate)DSL.constType((Type)DSL.intType()), (TypeTemplate)class06962.K.in(schema)), (String)"tag", (TypeTemplate)class06689.y(schema)), (Hook.HookFunction)L, (Hook.HookFunction)Hook.HookFunction.IDENTITY));
        schema.registerType(false, class06962.R, DSL::remainder);
        schema.registerType(false, class06962.q, () -> DSL.or((TypeTemplate)DSL.constType((Type)DSL.intType()), (TypeTemplate)DSL.constType((Type)class00622.N())));
        schema.registerType(false, class06962.K, () -> DSL.constType((Type)class00622.N()));
        schema.registerType(false, class06962.B, DSL::remainder);
        schema.registerType(false, class06962.Z, DSL::remainder);
        schema.registerType(false, class06962.z, DSL::remainder);
        schema.registerType(false, class06962.U, () -> DSL.optionalFields((String)"data", (TypeTemplate)DSL.optionalFields((String)"banners", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"Name", (TypeTemplate)class06962.O.in(schema))))));
        schema.registerType(false, class06962.E, DSL::remainder);
        schema.registerType(false, class06962.W, DSL::remainder);
        schema.registerType(false, class06962.m, DSL::remainder);
        schema.registerType(false, class06962.P, () -> DSL.optionalFields((String)"data", (TypeTemplate)DSL.optionalFields((String)"Objectives", (TypeTemplate)DSL.list((TypeTemplate)class06962.c.in(schema)), (String)"Teams", (TypeTemplate)DSL.list((TypeTemplate)class06962.X.in(schema)), (String)"PlayerScores", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"display", (TypeTemplate)class06962.O.in(schema))))));
        schema.registerType(false, class06962.s, DSL::remainder);
        schema.registerType(false, class06962.T, () -> DSL.optionalFields((String)"data", (TypeTemplate)DSL.optionalFields((String)"Features", (TypeTemplate)DSL.compoundList((TypeTemplate)class06962.H.in(schema)))));
        schema.registerType(false, class06962.b, DSL::remainder);
        schema.registerType(false, class06962.t, DSL::remainder);
        schema.registerType(false, class06962.H, DSL::remainder);
        schema.registerType(false, class06962.c, DSL::remainder);
        schema.registerType(false, class06962.X, () -> DSL.optionalFields((String)"MemberNamePrefix", (TypeTemplate)class06962.O.in(schema), (String)"MemberNameSuffix", (TypeTemplate)class06962.O.in(schema), (String)"DisplayName", (TypeTemplate)class06962.O.in(schema)));
        schema.registerType(true, class06962.e, DSL::remainder);
        schema.registerType(false, class06962.v, DSL::remainder);
        schema.registerType(false, class06962.A, DSL::remainder);
        schema.registerType(false, class06962.n, () -> DSL.optionalFields((String)"Entities", (TypeTemplate)DSL.list((TypeTemplate)class06962.J.in(schema))));
        schema.registerType(true, class06962.k, DSL::remainder);
        schema.registerType(true, class06962.Y, () -> DSL.optionalFields((String)"buy", (TypeTemplate)class06962.l.in(schema), (String)"buyB", (TypeTemplate)class06962.l.in(schema), (String)"sell", (TypeTemplate)class06962.l.in(schema)));
        schema.registerType(true, class06962.Q, () -> DSL.constType((Type)DSL.string()));
        schema.registerType(true, class06962.O, () -> DSL.constType((Type)DSL.string()));
        schema.registerType(false, class06962.M, () -> DSL.optionalFields((String)"entities", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"nbt", (TypeTemplate)class06962.J.in(schema))), (String)"blocks", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"nbt", (TypeTemplate)class06962.G.in(schema))), (String)"palette", (TypeTemplate)DSL.list((TypeTemplate)class06962.d.in(schema))));
        schema.registerType(false, class06962.d, DSL::remainder);
        schema.registerType(false, class06962.w, DSL::remainder);
        schema.registerType(true, class06962.g, () -> DSL.optional((TypeTemplate)DSL.field((String)"Equipment", (TypeTemplate)DSL.list((TypeTemplate)class06962.l.in(schema)))));
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema schema) {
        HashMap hashMap = Maps.newHashMap();
        schema.register((Map)hashMap, "Item", string -> DSL.optionalFields((String)"Item", (TypeTemplate)class06962.l.in(schema)));
        schema.registerSimple((Map)hashMap, "XPOrb");
        class06689.N(schema, (Map<String, Supplier<TypeTemplate>>)hashMap, "ThrownEgg");
        schema.registerSimple((Map)hashMap, "LeashKnot");
        schema.registerSimple((Map)hashMap, "Painting");
        schema.register((Map)hashMap, "Arrow", string -> DSL.optionalFields((String)"inTile", (TypeTemplate)class06962.q.in(schema)));
        schema.register((Map)hashMap, "TippedArrow", string -> DSL.optionalFields((String)"inTile", (TypeTemplate)class06962.q.in(schema)));
        schema.register((Map)hashMap, "SpectralArrow", string -> DSL.optionalFields((String)"inTile", (TypeTemplate)class06962.q.in(schema)));
        class06689.N(schema, (Map<String, Supplier<TypeTemplate>>)hashMap, "Snowball");
        class06689.N(schema, (Map<String, Supplier<TypeTemplate>>)hashMap, "Fireball");
        class06689.N(schema, (Map<String, Supplier<TypeTemplate>>)hashMap, "SmallFireball");
        class06689.N(schema, (Map<String, Supplier<TypeTemplate>>)hashMap, "ThrownEnderpearl");
        schema.registerSimple((Map)hashMap, "EyeOfEnderSignal");
        schema.register((Map)hashMap, "ThrownPotion", string -> DSL.optionalFields((String)"inTile", (TypeTemplate)class06962.q.in(schema), (String)"Potion", (TypeTemplate)class06962.l.in(schema)));
        class06689.N(schema, (Map<String, Supplier<TypeTemplate>>)hashMap, "ThrownExpBottle");
        schema.register((Map)hashMap, "ItemFrame", string -> DSL.optionalFields((String)"Item", (TypeTemplate)class06962.l.in(schema)));
        class06689.N(schema, (Map<String, Supplier<TypeTemplate>>)hashMap, "WitherSkull");
        schema.registerSimple((Map)hashMap, "PrimedTnt");
        schema.register((Map)hashMap, "FallingSand", string -> DSL.optionalFields((String)"Block", (TypeTemplate)class06962.q.in(schema), (String)"TileEntityData", (TypeTemplate)class06962.G.in(schema)));
        schema.register((Map)hashMap, "FireworksRocketEntity", string -> DSL.optionalFields((String)"FireworksItem", (TypeTemplate)class06962.l.in(schema)));
        schema.registerSimple((Map)hashMap, "Boat");
        schema.register((Map)hashMap, "Minecart", () -> DSL.optionalFields((String)"DisplayTile", (TypeTemplate)class06962.q.in(schema), (String)"Items", (TypeTemplate)DSL.list((TypeTemplate)class06962.l.in(schema))));
        class06689.y(schema, (Map<String, Supplier<TypeTemplate>>)hashMap, "MinecartRideable");
        schema.register((Map)hashMap, "MinecartChest", string -> DSL.optionalFields((String)"DisplayTile", (TypeTemplate)class06962.q.in(schema), (String)"Items", (TypeTemplate)DSL.list((TypeTemplate)class06962.l.in(schema))));
        class06689.y(schema, (Map<String, Supplier<TypeTemplate>>)hashMap, "MinecartFurnace");
        class06689.y(schema, (Map<String, Supplier<TypeTemplate>>)hashMap, "MinecartTNT");
        schema.register((Map)hashMap, "MinecartSpawner", () -> DSL.optionalFields((String)"DisplayTile", (TypeTemplate)class06962.q.in(schema), (TypeTemplate)class06962.e.in(schema)));
        schema.register((Map)hashMap, "MinecartHopper", string -> DSL.optionalFields((String)"DisplayTile", (TypeTemplate)class06962.q.in(schema), (String)"Items", (TypeTemplate)DSL.list((TypeTemplate)class06962.l.in(schema))));
        schema.register((Map)hashMap, "MinecartCommandBlock", () -> DSL.optionalFields((String)"DisplayTile", (TypeTemplate)class06962.q.in(schema), (String)"LastOutput", (TypeTemplate)class06962.O.in(schema)));
        schema.registerSimple((Map)hashMap, "ArmorStand");
        schema.registerSimple((Map)hashMap, "Creeper");
        schema.registerSimple((Map)hashMap, "Skeleton");
        schema.registerSimple((Map)hashMap, "Spider");
        schema.registerSimple((Map)hashMap, "Giant");
        schema.registerSimple((Map)hashMap, "Zombie");
        schema.registerSimple((Map)hashMap, "Slime");
        schema.registerSimple((Map)hashMap, "Ghast");
        schema.registerSimple((Map)hashMap, "PigZombie");
        schema.register((Map)hashMap, "Enderman", string -> DSL.optionalFields((String)"carried", (TypeTemplate)class06962.q.in(schema)));
        schema.registerSimple((Map)hashMap, "CaveSpider");
        schema.registerSimple((Map)hashMap, "Silverfish");
        schema.registerSimple((Map)hashMap, "Blaze");
        schema.registerSimple((Map)hashMap, "LavaSlime");
        schema.registerSimple((Map)hashMap, "EnderDragon");
        schema.registerSimple((Map)hashMap, "WitherBoss");
        schema.registerSimple((Map)hashMap, "Bat");
        schema.registerSimple((Map)hashMap, "Witch");
        schema.registerSimple((Map)hashMap, "Endermite");
        schema.registerSimple((Map)hashMap, "Guardian");
        schema.registerSimple((Map)hashMap, "Pig");
        schema.registerSimple((Map)hashMap, "Sheep");
        schema.registerSimple((Map)hashMap, "Cow");
        schema.registerSimple((Map)hashMap, "Chicken");
        schema.registerSimple((Map)hashMap, "Squid");
        schema.registerSimple((Map)hashMap, "Wolf");
        schema.registerSimple((Map)hashMap, "MushroomCow");
        schema.registerSimple((Map)hashMap, "SnowMan");
        schema.registerSimple((Map)hashMap, "Ozelot");
        schema.registerSimple((Map)hashMap, "VillagerGolem");
        schema.register((Map)hashMap, "EntityHorse", string -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)class06962.l.in(schema)), (String)"ArmorItem", (TypeTemplate)class06962.l.in(schema), (String)"SaddleItem", (TypeTemplate)class06962.l.in(schema)));
        schema.registerSimple((Map)hashMap, "Rabbit");
        schema.register((Map)hashMap, "Villager", string -> DSL.optionalFields((String)"Inventory", (TypeTemplate)DSL.list((TypeTemplate)class06962.l.in(schema)), (String)"Offers", (TypeTemplate)DSL.optionalFields((String)"Recipes", (TypeTemplate)DSL.list((TypeTemplate)class06962.Y.in(schema)))));
        schema.registerSimple((Map)hashMap, "EnderCrystal");
        schema.register((Map)hashMap, "AreaEffectCloud", string -> DSL.optionalFields((String)"Particle", (TypeTemplate)class06962.Q.in(schema)));
        schema.registerSimple((Map)hashMap, "ShulkerBullet");
        schema.registerSimple((Map)hashMap, "DragonFireball");
        schema.registerSimple((Map)hashMap, "Shulker");
        return hashMap;
    }
}

