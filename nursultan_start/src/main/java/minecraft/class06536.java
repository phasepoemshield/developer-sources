/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 *  com.mojang.datafixers.DSL
 *  com.mojang.datafixers.schemas.Schema
 *  com.mojang.datafixers.types.Type
 *  com.mojang.datafixers.types.templates.Hook$HookFunction
 *  com.mojang.datafixers.types.templates.TypeTemplate
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class00622
 *  minecraft.class06689
 *  minecraft.class06693
 *  minecraft.class06962
 *  minecraft.class08380
 */
package minecraft;

import com.google.common.collect.Maps;
import com.mojang.datafixers.DSL;
import com.mojang.datafixers.schemas.Schema;
import com.mojang.datafixers.types.Type;
import com.mojang.datafixers.types.templates.Hook;
import com.mojang.datafixers.types.templates.TypeTemplate;
import com.mojang.datafixers.util.Pair;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import minecraft.class00622;
import minecraft.class06534;
import minecraft.class06689;
import minecraft.class06693;
import minecraft.class06962;
import minecraft.class08380;

public class class06536
extends class00622 {
    public class06536(int n, Schema schema) {
        super(n, schema);
    }

    protected static void y(Schema schema, Map<String, Supplier<TypeTemplate>> map, String string) {
        schema.register(map, string, () -> class08380.N((Schema)schema));
    }

    protected static void N(Schema schema, Map<String, Supplier<TypeTemplate>> map, String string) {
        schema.registerSimple(map, string);
    }

    public Map<String, Supplier<TypeTemplate>> registerBlockEntities(Schema schema) {
        HashMap hashMap = Maps.newHashMap();
        class06536.y(schema, hashMap, "minecraft:furnace");
        class06536.y(schema, hashMap, "minecraft:chest");
        class06536.y(schema, hashMap, "minecraft:trapped_chest");
        schema.registerSimple((Map)hashMap, "minecraft:ender_chest");
        schema.register((Map)hashMap, "minecraft:jukebox", string -> DSL.optionalFields((String)"RecordItem", (TypeTemplate)class06962.l.in(schema)));
        class06536.y(schema, hashMap, "minecraft:dispenser");
        class06536.y(schema, hashMap, "minecraft:dropper");
        schema.register((Map)hashMap, "minecraft:sign", () -> class06689.N((Schema)schema));
        schema.register((Map)hashMap, "minecraft:mob_spawner", string -> class06962.e.in(schema));
        schema.register((Map)hashMap, "minecraft:piston", string -> DSL.optionalFields((String)"blockState", (TypeTemplate)class06962.d.in(schema)));
        class06536.y(schema, hashMap, "minecraft:brewing_stand");
        schema.register((Map)hashMap, "minecraft:enchanting_table", () -> class08380.y((Schema)schema));
        schema.registerSimple((Map)hashMap, "minecraft:end_portal");
        schema.register((Map)hashMap, "minecraft:beacon", () -> class08380.y((Schema)schema));
        schema.register((Map)hashMap, "minecraft:skull", () -> DSL.optionalFields((String)"custom_name", (TypeTemplate)class06962.O.in(schema)));
        schema.registerSimple((Map)hashMap, "minecraft:daylight_detector");
        class06536.y(schema, hashMap, "minecraft:hopper");
        schema.registerSimple((Map)hashMap, "minecraft:comparator");
        schema.register((Map)hashMap, "minecraft:banner", () -> class08380.y((Schema)schema));
        schema.registerSimple((Map)hashMap, "minecraft:structure_block");
        schema.registerSimple((Map)hashMap, "minecraft:end_gateway");
        schema.register((Map)hashMap, "minecraft:command_block", () -> DSL.optionalFields((String)"LastOutput", (TypeTemplate)class06962.O.in(schema)));
        class06536.y(schema, hashMap, "minecraft:shulker_box");
        schema.registerSimple((Map)hashMap, "minecraft:bed");
        return hashMap;
    }

    public void registerTypes(Schema schema, Map<String, Supplier<TypeTemplate>> map, Map<String, Supplier<TypeTemplate>> map2) {
        schema.registerType(false, class06962.N, () -> DSL.optionalFields((String)"CustomBossEvents", (TypeTemplate)DSL.compoundList((TypeTemplate)DSL.optionalFields((String)"Name", (TypeTemplate)class06962.O.in(schema))), (TypeTemplate)class06962.y.in(schema)));
        schema.registerType(false, class06962.y, DSL::remainder);
        schema.registerType(false, class06962.a, () -> DSL.constType((Type)class06536.N()));
        schema.registerType(false, class06962.L, () -> DSL.optionalFields((Pair[])new Pair[]{Pair.of((Object)"RootVehicle", (Object)DSL.optionalFields((String)"Entity", (TypeTemplate)class06962.J.in(schema))), Pair.of((Object)"ender_pearls", (Object)DSL.list((TypeTemplate)class06962.J.in(schema))), Pair.of((Object)"Inventory", (Object)DSL.list((TypeTemplate)class06962.l.in(schema))), Pair.of((Object)"EnderItems", (Object)DSL.list((TypeTemplate)class06962.l.in(schema))), Pair.of((Object)"ShoulderEntityLeft", (Object)class06962.J.in(schema)), Pair.of((Object)"ShoulderEntityRight", (Object)class06962.J.in(schema)), Pair.of((Object)"recipeBook", (Object)DSL.optionalFields((String)"recipes", (TypeTemplate)DSL.list((TypeTemplate)class06962.a.in(schema)), (String)"toBeDisplayed", (TypeTemplate)DSL.list((TypeTemplate)class06962.a.in(schema))))}));
        schema.registerType(false, class06962.u, () -> DSL.fields((String)"Level", (TypeTemplate)DSL.optionalFields((String)"Entities", (TypeTemplate)DSL.list((TypeTemplate)class06962.J.in(schema)), (String)"TileEntities", (TypeTemplate)DSL.list((TypeTemplate)DSL.or((TypeTemplate)class06962.G.in(schema), (TypeTemplate)DSL.remainder())), (String)"TileTicks", (TypeTemplate)DSL.list((TypeTemplate)DSL.fields((String)"i", (TypeTemplate)class06962.q.in(schema))), (String)"Sections", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"Palette", (TypeTemplate)DSL.list((TypeTemplate)class06962.d.in(schema)))))));
        schema.registerType(true, class06962.G, () -> DSL.optionalFields((String)"components", (TypeTemplate)class06962.k.in(schema), (TypeTemplate)DSL.taggedChoiceLazy((String)"id", (Type)class06536.N(), (Map)map2)));
        schema.registerType(true, class06962.J, () -> DSL.optionalFields((String)"Passengers", (TypeTemplate)DSL.list((TypeTemplate)class06962.J.in(schema)), (TypeTemplate)class06962.o.in(schema)));
        schema.registerType(true, class06962.o, () -> DSL.and((TypeTemplate)class06962.g.in(schema), (TypeTemplate)DSL.optionalFields((String)"CustomName", (TypeTemplate)class06962.O.in(schema), (TypeTemplate)DSL.taggedChoiceLazy((String)"id", (Type)class06536.N(), (Map)map))));
        schema.registerType(true, class06962.l, () -> DSL.hook((TypeTemplate)DSL.optionalFields((String)"id", (TypeTemplate)class06962.K.in(schema), (String)"tag", (TypeTemplate)class06689.y((Schema)schema)), (Hook.HookFunction)class06693.L, (Hook.HookFunction)Hook.HookFunction.IDENTITY));
        schema.registerType(false, class06962.i, () -> DSL.compoundList((TypeTemplate)DSL.list((TypeTemplate)class06962.l.in(schema))));
        schema.registerType(false, class06962.R, DSL::remainder);
        schema.registerType(false, class06962.M, () -> DSL.optionalFields((String)"entities", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"nbt", (TypeTemplate)class06962.J.in(schema))), (String)"blocks", (TypeTemplate)DSL.list((TypeTemplate)DSL.optionalFields((String)"nbt", (TypeTemplate)class06962.G.in(schema))), (String)"palette", (TypeTemplate)DSL.list((TypeTemplate)class06962.d.in(schema))));
        schema.registerType(false, class06962.q, () -> DSL.constType((Type)class06536.N()));
        schema.registerType(false, class06962.K, () -> DSL.constType((Type)class06536.N()));
        schema.registerType(false, class06962.d, DSL::remainder);
        schema.registerType(false, class06962.w, DSL::remainder);
        Supplier<TypeTemplate> supplier = () -> DSL.compoundList((TypeTemplate)class06962.K.in(schema), (TypeTemplate)DSL.constType((Type)DSL.intType()));
        schema.registerType(false, class06962.B, () -> DSL.optionalFields((String)"stats", (TypeTemplate)DSL.optionalFields((Pair[])new Pair[]{Pair.of((Object)"minecraft:mined", (Object)DSL.compoundList((TypeTemplate)class06962.q.in(schema), (TypeTemplate)DSL.constType((Type)DSL.intType()))), Pair.of((Object)"minecraft:crafted", (Object)((TypeTemplate)supplier.get())), Pair.of((Object)"minecraft:used", (Object)((TypeTemplate)supplier.get())), Pair.of((Object)"minecraft:broken", (Object)((TypeTemplate)supplier.get())), Pair.of((Object)"minecraft:picked_up", (Object)((TypeTemplate)supplier.get())), Pair.of((Object)"minecraft:dropped", (Object)((TypeTemplate)supplier.get())), Pair.of((Object)"minecraft:killed", (Object)DSL.compoundList((TypeTemplate)class06962.I.in(schema), (TypeTemplate)DSL.constType((Type)DSL.intType()))), Pair.of((Object)"minecraft:killed_by", (Object)DSL.compoundList((TypeTemplate)class06962.I.in(schema), (TypeTemplate)DSL.constType((Type)DSL.intType()))), Pair.of((Object)"minecraft:custom", (Object)DSL.compoundList((TypeTemplate)DSL.constType((Type)class06536.N()), (TypeTemplate)DSL.constType((Type)DSL.intType())))})));
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
        Map<String, Supplier<TypeTemplate>> map3 = class06534.N(schema);
        schema.registerType(false, class06962.c, () -> DSL.hook((TypeTemplate)DSL.optionalFields((String)"CriteriaType", (TypeTemplate)DSL.taggedChoiceLazy((String)"type", (Type)DSL.string(), (Map)map3), (String)"DisplayName", (TypeTemplate)class06962.O.in(schema)), (Hook.HookFunction)class06534.L, (Hook.HookFunction)class06534.u));
        schema.registerType(false, class06962.X, () -> DSL.optionalFields((String)"MemberNamePrefix", (TypeTemplate)class06962.O.in(schema), (String)"MemberNameSuffix", (TypeTemplate)class06962.O.in(schema), (String)"DisplayName", (TypeTemplate)class06962.O.in(schema)));
        schema.registerType(true, class06962.e, () -> DSL.optionalFields((String)"SpawnPotentials", (TypeTemplate)DSL.list((TypeTemplate)DSL.fields((String)"Entity", (TypeTemplate)class06962.J.in(schema))), (String)"SpawnData", (TypeTemplate)class06962.J.in(schema)));
        schema.registerType(false, class06962.j, () -> DSL.optionalFields((String)"minecraft:adventure/adventuring_time", (TypeTemplate)DSL.optionalFields((String)"criteria", (TypeTemplate)DSL.compoundList((TypeTemplate)class06962.p.in(schema), (TypeTemplate)DSL.constType((Type)DSL.string()))), (String)"minecraft:adventure/kill_a_mob", (TypeTemplate)DSL.optionalFields((String)"criteria", (TypeTemplate)DSL.compoundList((TypeTemplate)class06962.I.in(schema), (TypeTemplate)DSL.constType((Type)DSL.string()))), (String)"minecraft:adventure/kill_all_mobs", (TypeTemplate)DSL.optionalFields((String)"criteria", (TypeTemplate)DSL.compoundList((TypeTemplate)class06962.I.in(schema), (TypeTemplate)DSL.constType((Type)DSL.string()))), (String)"minecraft:husbandry/bred_all_animals", (TypeTemplate)DSL.optionalFields((String)"criteria", (TypeTemplate)DSL.compoundList((TypeTemplate)class06962.I.in(schema), (TypeTemplate)DSL.constType((Type)DSL.string())))));
        schema.registerType(false, class06962.p, () -> DSL.constType((Type)class06536.N()));
        schema.registerType(false, class06962.I, () -> DSL.constType((Type)class06536.N()));
        schema.registerType(false, class06962.v, DSL::remainder);
        schema.registerType(false, class06962.A, DSL::remainder);
        schema.registerType(false, class06962.n, () -> DSL.optionalFields((String)"Entities", (TypeTemplate)DSL.list((TypeTemplate)class06962.J.in(schema))));
        schema.registerType(true, class06962.k, DSL::remainder);
        schema.registerType(true, class06962.Y, () -> DSL.optionalFields((String)"buy", (TypeTemplate)class06962.l.in(schema), (String)"buyB", (TypeTemplate)class06962.l.in(schema), (String)"sell", (TypeTemplate)class06962.l.in(schema)));
        schema.registerType(true, class06962.Q, () -> DSL.constType((Type)DSL.string()));
        schema.registerType(true, class06962.O, () -> DSL.constType((Type)DSL.string()));
        schema.registerType(true, class06962.g, () -> DSL.and((TypeTemplate)DSL.optional((TypeTemplate)DSL.field((String)"ArmorItems", (TypeTemplate)DSL.list((TypeTemplate)class06962.l.in(schema)))), (TypeTemplate[])new TypeTemplate[]{DSL.optional((TypeTemplate)DSL.field((String)"HandItems", (TypeTemplate)DSL.list((TypeTemplate)class06962.l.in(schema)))), DSL.optional((TypeTemplate)DSL.field((String)"body_armor_item", (TypeTemplate)class06962.l.in(schema))), DSL.optional((TypeTemplate)DSL.field((String)"saddle", (TypeTemplate)class06962.l.in(schema)))}));
    }

    public Map<String, Supplier<TypeTemplate>> registerEntities(Schema schema) {
        HashMap hashMap = Maps.newHashMap();
        schema.register((Map)hashMap, "minecraft:area_effect_cloud", string -> DSL.optionalFields((String)"Particle", (TypeTemplate)class06962.Q.in(schema)));
        class06536.N(schema, hashMap, "minecraft:armor_stand");
        schema.register((Map)hashMap, "minecraft:arrow", string -> DSL.optionalFields((String)"inBlockState", (TypeTemplate)class06962.d.in(schema)));
        class06536.N(schema, hashMap, "minecraft:bat");
        class06536.N(schema, hashMap, "minecraft:blaze");
        schema.registerSimple((Map)hashMap, "minecraft:boat");
        class06536.N(schema, hashMap, "minecraft:cave_spider");
        schema.register((Map)hashMap, "minecraft:chest_minecart", string -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)class06962.d.in(schema), (String)"Items", (TypeTemplate)DSL.list((TypeTemplate)class06962.l.in(schema))));
        class06536.N(schema, hashMap, "minecraft:chicken");
        schema.register((Map)hashMap, "minecraft:commandblock_minecart", string -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)class06962.d.in(schema), (String)"LastOutput", (TypeTemplate)class06962.O.in(schema)));
        class06536.N(schema, hashMap, "minecraft:cow");
        class06536.N(schema, hashMap, "minecraft:creeper");
        schema.register((Map)hashMap, "minecraft:donkey", string -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)class06962.l.in(schema)), (String)"SaddleItem", (TypeTemplate)class06962.l.in(schema)));
        schema.registerSimple((Map)hashMap, "minecraft:dragon_fireball");
        schema.registerSimple((Map)hashMap, "minecraft:egg");
        class06536.N(schema, hashMap, "minecraft:elder_guardian");
        schema.registerSimple((Map)hashMap, "minecraft:ender_crystal");
        class06536.N(schema, hashMap, "minecraft:ender_dragon");
        schema.register((Map)hashMap, "minecraft:enderman", string -> DSL.optionalFields((String)"carriedBlockState", (TypeTemplate)class06962.d.in(schema)));
        class06536.N(schema, hashMap, "minecraft:endermite");
        schema.registerSimple((Map)hashMap, "minecraft:ender_pearl");
        schema.registerSimple((Map)hashMap, "minecraft:evocation_fangs");
        class06536.N(schema, hashMap, "minecraft:evocation_illager");
        schema.registerSimple((Map)hashMap, "minecraft:eye_of_ender_signal");
        schema.register((Map)hashMap, "minecraft:falling_block", string -> DSL.optionalFields((String)"BlockState", (TypeTemplate)class06962.d.in(schema), (String)"TileEntityData", (TypeTemplate)class06962.G.in(schema)));
        schema.registerSimple((Map)hashMap, "minecraft:fireball");
        schema.register((Map)hashMap, "minecraft:fireworks_rocket", string -> DSL.optionalFields((String)"FireworksItem", (TypeTemplate)class06962.l.in(schema)));
        schema.register((Map)hashMap, "minecraft:furnace_minecart", string -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)class06962.d.in(schema)));
        class06536.N(schema, hashMap, "minecraft:ghast");
        class06536.N(schema, hashMap, "minecraft:giant");
        class06536.N(schema, hashMap, "minecraft:guardian");
        schema.register((Map)hashMap, "minecraft:hopper_minecart", string -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)class06962.d.in(schema), (String)"Items", (TypeTemplate)DSL.list((TypeTemplate)class06962.l.in(schema))));
        schema.register((Map)hashMap, "minecraft:horse", string -> DSL.optionalFields((String)"ArmorItem", (TypeTemplate)class06962.l.in(schema), (String)"SaddleItem", (TypeTemplate)class06962.l.in(schema)));
        class06536.N(schema, hashMap, "minecraft:husk");
        class06536.N(schema, hashMap, "minecraft:illusion_illager");
        schema.register((Map)hashMap, "minecraft:item", string -> DSL.optionalFields((String)"Item", (TypeTemplate)class06962.l.in(schema)));
        schema.register((Map)hashMap, "minecraft:item_frame", string -> DSL.optionalFields((String)"Item", (TypeTemplate)class06962.l.in(schema)));
        schema.registerSimple((Map)hashMap, "minecraft:leash_knot");
        schema.register((Map)hashMap, "minecraft:llama", string -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)class06962.l.in(schema)), (String)"SaddleItem", (TypeTemplate)class06962.l.in(schema), (String)"DecorItem", (TypeTemplate)class06962.l.in(schema)));
        schema.registerSimple((Map)hashMap, "minecraft:llama_spit");
        class06536.N(schema, hashMap, "minecraft:magma_cube");
        schema.register((Map)hashMap, "minecraft:minecart", string -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)class06962.d.in(schema)));
        class06536.N(schema, hashMap, "minecraft:mooshroom");
        schema.register((Map)hashMap, "minecraft:mule", string -> DSL.optionalFields((String)"Items", (TypeTemplate)DSL.list((TypeTemplate)class06962.l.in(schema)), (String)"SaddleItem", (TypeTemplate)class06962.l.in(schema)));
        class06536.N(schema, hashMap, "minecraft:ocelot");
        schema.registerSimple((Map)hashMap, "minecraft:painting");
        class06536.N(schema, hashMap, "minecraft:parrot");
        class06536.N(schema, hashMap, "minecraft:pig");
        class06536.N(schema, hashMap, "minecraft:polar_bear");
        schema.register((Map)hashMap, "minecraft:potion", string -> DSL.optionalFields((String)"Potion", (TypeTemplate)class06962.l.in(schema)));
        class06536.N(schema, hashMap, "minecraft:rabbit");
        class06536.N(schema, hashMap, "minecraft:sheep");
        class06536.N(schema, hashMap, "minecraft:shulker");
        schema.registerSimple((Map)hashMap, "minecraft:shulker_bullet");
        class06536.N(schema, hashMap, "minecraft:silverfish");
        class06536.N(schema, hashMap, "minecraft:skeleton");
        schema.register((Map)hashMap, "minecraft:skeleton_horse", string -> DSL.optionalFields((String)"SaddleItem", (TypeTemplate)class06962.l.in(schema)));
        class06536.N(schema, hashMap, "minecraft:slime");
        schema.registerSimple((Map)hashMap, "minecraft:small_fireball");
        schema.registerSimple((Map)hashMap, "minecraft:snowball");
        class06536.N(schema, hashMap, "minecraft:snowman");
        schema.register((Map)hashMap, "minecraft:spawner_minecart", string -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)class06962.d.in(schema), (TypeTemplate)class06962.e.in(schema)));
        schema.register((Map)hashMap, "minecraft:spectral_arrow", string -> DSL.optionalFields((String)"inBlockState", (TypeTemplate)class06962.d.in(schema)));
        class06536.N(schema, hashMap, "minecraft:spider");
        class06536.N(schema, hashMap, "minecraft:squid");
        class06536.N(schema, hashMap, "minecraft:stray");
        schema.registerSimple((Map)hashMap, "minecraft:tnt");
        schema.register((Map)hashMap, "minecraft:tnt_minecart", string -> DSL.optionalFields((String)"DisplayState", (TypeTemplate)class06962.d.in(schema)));
        class06536.N(schema, hashMap, "minecraft:vex");
        schema.register((Map)hashMap, "minecraft:villager", string -> DSL.optionalFields((String)"Inventory", (TypeTemplate)DSL.list((TypeTemplate)class06962.l.in(schema)), (String)"Offers", (TypeTemplate)DSL.optionalFields((String)"Recipes", (TypeTemplate)DSL.list((TypeTemplate)class06962.Y.in(schema)))));
        class06536.N(schema, hashMap, "minecraft:villager_golem");
        class06536.N(schema, hashMap, "minecraft:vindication_illager");
        class06536.N(schema, hashMap, "minecraft:witch");
        class06536.N(schema, hashMap, "minecraft:wither");
        class06536.N(schema, hashMap, "minecraft:wither_skeleton");
        schema.registerSimple((Map)hashMap, "minecraft:wither_skull");
        class06536.N(schema, hashMap, "minecraft:wolf");
        schema.registerSimple((Map)hashMap, "minecraft:xp_bottle");
        schema.registerSimple((Map)hashMap, "minecraft:xp_orb");
        class06536.N(schema, hashMap, "minecraft:zombie");
        schema.register((Map)hashMap, "minecraft:zombie_horse", string -> DSL.optionalFields((String)"SaddleItem", (TypeTemplate)class06962.l.in(schema)));
        class06536.N(schema, hashMap, "minecraft:zombie_pigman");
        schema.register((Map)hashMap, "minecraft:zombie_villager", string -> DSL.optionalFields((String)"Offers", (TypeTemplate)DSL.optionalFields((String)"Recipes", (TypeTemplate)DSL.list((TypeTemplate)class06962.Y.in(schema)))));
        return hashMap;
    }
}

