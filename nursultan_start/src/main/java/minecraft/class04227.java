/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00201
 *  minecraft.class00225
 *  minecraft.class00273
 *  minecraft.class00305
 *  minecraft.class00319
 *  minecraft.class00404
 *  minecraft.class00412
 *  minecraft.class00455
 *  minecraft.class00549
 *  minecraft.class00607
 *  minecraft.class00629
 *  minecraft.class00693
 *  minecraft.class00751
 *  minecraft.class00765
 *  minecraft.class00780
 *  minecraft.class00891
 *  minecraft.class01182
 *  minecraft.class01194
 *  minecraft.class01255
 *  minecraft.class01448
 *  minecraft.class01473
 *  minecraft.class01624
 *  minecraft.class01757
 *  minecraft.class01894
 *  minecraft.class02139
 *  minecraft.class02158
 *  minecraft.class02195
 *  minecraft.class02206
 *  minecraft.class02246
 *  minecraft.class02477
 *  minecraft.class02487
 *  minecraft.class02505
 *  minecraft.class02530
 *  minecraft.class02536
 *  minecraft.class02546
 *  minecraft.class02548
 *  minecraft.class02560
 *  minecraft.class03028
 *  minecraft.class03129
 *  minecraft.class03238
 *  minecraft.class03246
 *  minecraft.class03252
 *  minecraft.class03368
 *  minecraft.class03549
 *  minecraft.class03573
 *  minecraft.class03619
 *  minecraft.class03622
 *  minecraft.class03648
 *  minecraft.class03689
 *  minecraft.class03862
 *  minecraft.class03877
 *  minecraft.class04017
 *  minecraft.class04054
 *  minecraft.class04068
 *  minecraft.class04086
 *  minecraft.class04367
 *  minecraft.class04382
 *  minecraft.class04412
 *  minecraft.class04449
 *  minecraft.class04513
 *  minecraft.class04651
 *  minecraft.class04748
 *  minecraft.class04837
 *  minecraft.class04878
 *  minecraft.class04891
 *  minecraft.class04922
 *  minecraft.class05052
 *  minecraft.class05056
 *  minecraft.class05074
 *  minecraft.class05235
 *  minecraft.class05240
 *  minecraft.class05267
 *  minecraft.class05281
 *  minecraft.class05301
 *  minecraft.class05312
 *  minecraft.class05340
 *  minecraft.class05359
 *  minecraft.class05369
 *  minecraft.class05378
 *  minecraft.class05483
 *  minecraft.class05523
 *  minecraft.class05660
 *  minecraft.class05672
 *  minecraft.class05838
 *  minecraft.class05851
 *  minecraft.class05930
 *  minecraft.class05943
 *  minecraft.class05946
 *  minecraft.class05950
 *  minecraft.class05955
 *  minecraft.class05957
 *  minecraft.class05959
 *  minecraft.class06061
 *  minecraft.class06341
 *  minecraft.class06353
 *  minecraft.class06391
 *  minecraft.class06514
 *  minecraft.class06521
 *  minecraft.class06525
 *  minecraft.class06581
 *  minecraft.class06583
 *  minecraft.class06750
 *  minecraft.class06799
 *  minecraft.class06834
 *  minecraft.class06839
 *  minecraft.class06911
 *  minecraft.class07078
 *  minecraft.class07084
 *  minecraft.class07103
 *  minecraft.class07151
 *  minecraft.class07299
 *  minecraft.class07304
 *  minecraft.class07376
 *  minecraft.class07468
 *  minecraft.class07587
 *  minecraft.class07589
 *  minecraft.class07829
 *  minecraft.class07940
 *  minecraft.class07945
 *  minecraft.class08088
 *  minecraft.class08122
 *  minecraft.class08159
 *  minecraft.class08164
 *  minecraft.class08217
 *  minecraft.class08403
 *  minecraft.class08423
 *  minecraft.class08519
 *  minecraft.class08568
 *  minecraft.class08642
 *  minecraft.class08752
 *  minecraft.class09015
 *  minecraft.class09034
 *  minecraft.class09037
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import java.util.function.Consumer;
import minecraft.class00201;
import minecraft.class00225;
import minecraft.class00273;
import minecraft.class00305;
import minecraft.class00319;
import minecraft.class00404;
import minecraft.class00412;
import minecraft.class00455;
import minecraft.class00549;
import minecraft.class00607;
import minecraft.class00629;
import minecraft.class00693;
import minecraft.class00751;
import minecraft.class00765;
import minecraft.class00780;
import minecraft.class00891;
import minecraft.class01182;
import minecraft.class01194;
import minecraft.class01255;
import minecraft.class01448;
import minecraft.class01473;
import minecraft.class01624;
import minecraft.class01757;
import minecraft.class01894;
import minecraft.class02139;
import minecraft.class02158;
import minecraft.class02195;
import minecraft.class02206;
import minecraft.class02246;
import minecraft.class02477;
import minecraft.class02487;
import minecraft.class02505;
import minecraft.class02530;
import minecraft.class02536;
import minecraft.class02546;
import minecraft.class02548;
import minecraft.class02560;
import minecraft.class03028;
import minecraft.class03129;
import minecraft.class03238;
import minecraft.class03246;
import minecraft.class03252;
import minecraft.class03368;
import minecraft.class03549;
import minecraft.class03573;
import minecraft.class03619;
import minecraft.class03622;
import minecraft.class03648;
import minecraft.class03689;
import minecraft.class03862;
import minecraft.class03877;
import minecraft.class04017;
import minecraft.class04054;
import minecraft.class04068;
import minecraft.class04086;
import minecraft.class04323;
import minecraft.class04336;
import minecraft.class04367;
import minecraft.class04382;
import minecraft.class04412;
import minecraft.class04449;
import minecraft.class04513;
import minecraft.class04651;
import minecraft.class04748;
import minecraft.class04837;
import minecraft.class04878;
import minecraft.class04891;
import minecraft.class04922;
import minecraft.class05052;
import minecraft.class05056;
import minecraft.class05074;
import minecraft.class05235;
import minecraft.class05240;
import minecraft.class05267;
import minecraft.class05281;
import minecraft.class05301;
import minecraft.class05312;
import minecraft.class05340;
import minecraft.class05359;
import minecraft.class05369;
import minecraft.class05378;
import minecraft.class05483;
import minecraft.class05523;
import minecraft.class05660;
import minecraft.class05672;
import minecraft.class05838;
import minecraft.class05851;
import minecraft.class05930;
import minecraft.class05943;
import minecraft.class05946;
import minecraft.class05950;
import minecraft.class05955;
import minecraft.class05957;
import minecraft.class05959;
import minecraft.class06061;
import minecraft.class06341;
import minecraft.class06353;
import minecraft.class06391;
import minecraft.class06514;
import minecraft.class06521;
import minecraft.class06525;
import minecraft.class06581;
import minecraft.class06583;
import minecraft.class06750;
import minecraft.class06799;
import minecraft.class06834;
import minecraft.class06839;
import minecraft.class06911;
import minecraft.class07078;
import minecraft.class07084;
import minecraft.class07103;
import minecraft.class07151;
import minecraft.class07299;
import minecraft.class07304;
import minecraft.class07376;
import minecraft.class07468;
import minecraft.class07587;
import minecraft.class07589;
import minecraft.class07829;
import minecraft.class07940;
import minecraft.class07945;
import minecraft.class08088;
import minecraft.class08122;
import minecraft.class08159;
import minecraft.class08164;
import minecraft.class08217;
import minecraft.class08403;
import minecraft.class08423;
import minecraft.class08519;
import minecraft.class08568;
import minecraft.class08642;
import minecraft.class08752;
import minecraft.class09015;
import minecraft.class09034;
import minecraft.class09037;

public class class04227 {
    public static final class01894 N = class01894.y((String)"root");
    public static final class05946<class00751<class05359>> y = class04227.N("activity");
    public static final class05946<class00751<class07468>> L = class04227.N("attribute");
    public static final class05946<class00751<MapCodec<? extends class00765>>> u = class04227.N("worldgen/biome_source");
    public static final class05946<class00751<class00404<?>>> i = class04227.N("block_entity_type");
    public static final class05946<class00751<class04054<?>>> R = class04227.N("block_predicate_type");
    public static final class05946<class00751<class01473<?>>> M = class04227.N("worldgen/block_state_provider_type");
    public static final class05946<class00751<MapCodec<? extends class00891>>> B = class04227.N("block_type");
    public static final class05946<class00751<class00891>> Z = class04227.N("block");
    public static final class05946<class00751<class02158<?>>> z = class04227.N("worldgen/carver");
    public static final class05946<class00751<MapCodec<? extends class08088>>> U = class04227.N("worldgen/chunk_generator");
    public static final class05946<class00751<class00549>> E = class04227.N("chunk_status");
    public static final class05946<class00751<class06799<?, ?>>> W = class04227.N("command_argument_type");
    public static final class05946<class00751<class08217<?>>> m = class04227.N("consume_effect_type");
    public static final class05946<class00751<class06911>> P = class04227.N("creative_mode_tab");
    public static final class05946<class00751<class01894>> s = class04227.N("custom_stat");
    public static final class05946<class00751<class02487<?>>> T = class04227.N("data_component_predicate_type");
    public static final class05946<class00751<class02477<?>>> b = class04227.N("data_component_type");
    public static final class05946<class00751<class06839<?>>> j = class04227.N("game_rule");
    public static final class05946<class00751<class00455<?>>> v = class04227.N("debug_subscription");
    public static final class05946<class00751<class02246>> n = class04227.N("decorated_pot_pattern");
    public static final class05946<class00751<MapCodec<? extends class03877>>> t = class04227.N("worldgen/density_function_type");
    public static final class05946<class00751<MapCodec<? extends class09034>>> G = class04227.N("dialog_body_type");
    public static final class05946<class00751<MapCodec<? extends class09037>>> l = class04227.N("dialog_type");
    public static final class05946<class00751<class02477<?>>> d = class04227.N("enchantment_effect_component_type");
    public static final class05946<class00751<MapCodec<? extends class02560>>> w = class04227.N("enchantment_entity_effect_type");
    public static final class05946<class00751<MapCodec<? extends class02546>>> k = class04227.N("enchantment_level_based_value_type");
    public static final class05946<class00751<MapCodec<? extends class02548>>> Y = class04227.N("enchantment_location_based_effect_type");
    public static final class05946<class00751<MapCodec<? extends class02530>>> Q = class04227.N("enchantment_provider_type");
    public static final class05946<class00751<MapCodec<? extends class02536>>> O = class04227.N("enchantment_value_effect_type");
    public static final class05946<class00751<MapCodec<? extends class03622>>> g = class04227.N("entity_sub_predicate_type");
    public static final class05946<class00751<class07078<?>>> I = class04227.N("entity_type");
    public static final class05946<class00751<class00607<?>>> J = class04227.N("environment_attribute");
    public static final class05946<class00751<class06750<?>>> o = class04227.N("attribute_type");
    public static final class05946<class00751<class05052<?>>> q = class04227.N("worldgen/feature_size_type");
    public static final class05946<class00751<class06391<?>>> K = class04227.N("worldgen/feature");
    public static final class05946<class00751<class06061<?>>> V = class04227.N("float_provider_type");
    public static final class05946<class00751<class04651>> e = class04227.N("fluid");
    public static final class05946<class00751<class01448<?>>> H = class04227.N("worldgen/foliage_placer_type");
    public static final class05946<class00751<class01194>> c = class04227.N("game_event");
    public static final class05946<class00751<class03862<?>>> X = class04227.N("height_provider_type");
    public static final class05946<class00751<MapCodec<? extends class09015>>> a = class04227.N("input_control_type");
    public static final class05946<class00751<class02139<?>>> p = class04227.N("int_provider_type");
    public static final class05946<class00751<class06581>> F = class04227.N("item");
    public static final class05946<class00751<MapCodec<? extends class06834>>> A = class04227.N("slot_source_type");
    public static final class05946<class00751<class05955>> f = class04227.N("loot_condition_type");
    public static final class05946<class00751<class05959<?>>> C = class04227.N("loot_function_type");
    public static final class05946<class00751<class04837>> S = class04227.N("loot_nbt_provider_type");
    public static final class05946<class00751<class06341>> x = class04227.N("loot_number_provider_type");
    public static final class05946<class00751<class05950>> D = class04227.N("loot_pool_entry_type");
    public static final class05946<class00751<class06353>> h = class04227.N("loot_score_provider_type");
    public static final class05946<class00751<class02195>> r = class04227.N("map_decoration_type");
    public static final class05946<class00751<MapCodec<? extends class04017>>> NN = class04227.N("worldgen/material_condition");
    public static final class05946<class00751<MapCodec<? extends class03028>>> Ny = class04227.N("worldgen/material_rule");
    public static final class05946<class00751<class05378<?>>> NL = class04227.N("memory_module_type");
    public static final class05946<class00751<class05851<?>>> Nu = class04227.N("menu");
    public static final class05946<class00751<class07084>> Ni = class04227.N("mob_effect");
    public static final class05946<class00751<class01757<?>>> NR = class04227.N("number_format_type");
    public static final class05946<class00751<class07103<?>>> NM = class04227.N("particle_type");
    public static final class05946<class00751<class04323<?>>> NB = class04227.N("worldgen/placement_modifier_type");
    public static final class05946<class00751<class05369>> NZ = class04227.N("point_of_interest_type");
    public static final class05946<class00751<MapCodec<? extends class03129>>> Nz = class04227.N("worldgen/pool_alias_binding");
    public static final class05946<class00751<class01182<?>>> NU = class04227.N("position_source_type");
    public static final class05946<class00751<class05301<?>>> NE = class04227.N("pos_rule_test");
    public static final class05946<class00751<class06525>> NW = class04227.N("potion");
    public static final class05946<class00751<class00305>> Nm = class04227.N("recipe_book_category");
    public static final class05946<class00751<class00273<?>>> NP = class04227.N("recipe_display");
    public static final class05946<class00751<class06514<?>>> Ns = class04227.N("recipe_serializer");
    public static final class05946<class00751<class05838<?>>> NT = class04227.N("recipe_type");
    public static final class05946<class00751<class03619<?>>> Nb = class04227.N("worldgen/root_placer_type");
    public static final class05946<class00751<class03368<?>>> Nj = class04227.N("rule_block_entity_modifier");
    public static final class05946<class00751<class05240<?>>> Nv = class04227.N("rule_test");
    public static final class05946<class00751<class05340<?>>> Nn = class04227.N("sensor_type");
    public static final class05946<class00751<class00319<?>>> Nt = class04227.N("slot_display");
    public static final class05946<class00751<class04891>> NG = class04227.N("sound_event");
    public static final class05946<class00751<MapCodec<? extends class08568>>> Nl = class04227.N("spawn_condition_type");
    public static final class05946<class00751<class04922<?>>> Nd = class04227.N("stat_type");
    public static final class05946<class00751<class04878>> Nw = class04227.N("worldgen/structure_piece");
    public static final class05946<class00751<class03549<?>>> Nk = class04227.N("worldgen/structure_placement");
    public static final class05946<class00751<class05267<?>>> NY = class04227.N("worldgen/structure_pool_element");
    public static final class05946<class00751<class05235<?>>> NQ = class04227.N("worldgen/structure_processor");
    public static final class05946<class00751<class04367<?>>> NO = class04227.N("worldgen/structure_type");
    public static final class05946<class00751<MapCodec<? extends class08752>>> Ng = class04227.N("dialog_action_type");
    public static final class05946<class00751<MapCodec<? extends class00225>>> NI = class04227.N("test_environment_definition_type");
    public static final class05946<class00751<Consumer<class05523>>> NJ = class04227.N("test_function");
    public static final class05946<class00751<MapCodec<? extends class00201>>> No = class04227.N("test_instance_type");
    public static final class05946<class00751<class01624>> Nq = class04227.N("ticket_type");
    public static final class05946<class00751<class05930<?>>> NK = class04227.N("worldgen/tree_decorator_type");
    public static final class05946<class00751<class05312<?>>> NV = class04227.N("worldgen/trunk_placer_type");
    public static final class05946<class00751<class05672>> Ne = class04227.N("villager_profession");
    public static final class05946<class00751<class05660>> NH = class04227.N("villager_type");
    public static final class05946<class00751<class07945<?, ?>>> Nc = class04227.N("incoming_rpc_methods");
    public static final class05946<class00751<class07940<?, ?>>> NX = class04227.N("outgoing_rpc_methods");
    public static final class05946<class00751<MapCodec<? extends class08159>>> Na = class04227.N("permission_type");
    public static final class05946<class00751<MapCodec<? extends class08164>>> Np = class04227.N("permission_check_type");
    public static final class05946<class00751<class00412>> NF = class04227.N("banner_pattern");
    public static final class05946<class00751<class00780>> NA = class04227.N("worldgen/biome");
    public static final class05946<class00751<class03648>> Nf = class04227.N("cat_variant");
    public static final class05946<class00751<class00629>> NC = class04227.N("chat_type");
    public static final class05946<class00751<class08423>> NS = class04227.N("chicken_variant");
    public static final class05946<class00751<class07589>> Nx = class04227.N("zombie_nautilus_variant");
    public static final class05946<class00751<class07829<?>>> ND = class04227.N("worldgen/configured_carver");
    public static final class05946<class00751<class03238<?, ?>>> Nh = class04227.N("worldgen/configured_feature");
    public static final class05946<class00751<class08403>> Nr = class04227.N("cow_variant");
    public static final class05946<class00751<class03689>> yN = class04227.N("damage_type");
    public static final class05946<class00751<class03877>> yy = class04227.N("worldgen/density_function");
    public static final class05946<class00751<class09037>> yL = class04227.N("dialog");
    public static final class05946<class00751<class07376>> yu = class04227.N("dimension_type");
    public static final class05946<class00751<class02530>> yi = class04227.N("enchantment_provider");
    public static final class05946<class00751<class07304>> yR = class04227.N("enchantment");
    public static final class05946<class00751<class04086>> yM = class04227.N("worldgen/flat_level_generator_preset");
    public static final class05946<class00751<class04068>> yB = class04227.N("frog_variant");
    public static final class05946<class00751<class04449>> yZ = class04227.N("instrument");
    public static final class05946<class00751<class02206>> yz = class04227.N("jukebox_song");
    public static final class05946<class00751<class03573>> yU = class04227.N("worldgen/multi_noise_biome_source_parameter_list");
    public static final class05946<class00751<class05943>> yE = class04227.N("worldgen/noise_settings");
    public static final class05946<class00751<class05056>> yW = class04227.N("worldgen/noise");
    public static final class05946<class00751<class00693>> ym = class04227.N("painting_variant");
    public static final class05946<class00751<class08642>> yP = class04227.N("pig_variant");
    public static final class05946<class00751<class04336>> ys = class04227.N("worldgen/placed_feature");
    public static final class05946<class00751<class05483>> yT = class04227.N("worldgen/processor_list");
    public static final class05946<class00751<class04412>> yb = class04227.N("worldgen/structure_set");
    public static final class05946<class00751<class04748>> yj = class04227.N("worldgen/structure");
    public static final class05946<class00751<class05281>> yv = class04227.N("worldgen/template_pool");
    public static final class05946<class00751<class00225>> yn = class04227.N("test_environment");
    public static final class05946<class00751<class00201>> yt = class04227.N("test_instance");
    public static final class05946<class00751<class07587>> yG = class04227.N("timeline");
    public static final class05946<class00751<class04513>> yl = class04227.N("trial_spawner");
    public static final class05946<class00751<class06583<?>>> yd = class04227.N("trigger_type");
    public static final class05946<class00751<class03252>> yw = class04227.N("trim_material");
    public static final class05946<class00751<class03246>> yk = class04227.N("trim_pattern");
    public static final class05946<class00751<class02505>> yY = class04227.N("wolf_variant");
    public static final class05946<class00751<class08519>> yQ = class04227.N("wolf_sound_variant");
    public static final class05946<class00751<class04382>> yO = class04227.N("worldgen/world_preset");
    public static final class05946<class00751<class07299>> yg = class04227.N("dimension");
    public static final class05946<class00751<class01255>> yI = class04227.N("dimension");
    public static final class05946<class00751<class05074>> yJ = class04227.N("loot_table");
    public static final class05946<class00751<class08122>> yo = class04227.N("item_modifier");
    public static final class05946<class00751<class05957>> yq = class04227.N("predicate");
    public static final class05946<class00751<class07151>> yK = class04227.N("advancement");
    public static final class05946<class00751<class06521<?>>> yV = class04227.N("recipe");

    public static String L(class05946<? extends class00751<?>> class059462) {
        return class04227.N(class059462.N().N(), class059462);
    }

    public static String u(class05946<? extends class00751<?>> class059462) {
        return class04227.y("tags/" + class059462.N().N(), class059462);
    }

    private static String y(String string, class05946 class059462) {
        class01894 class018942 = class059462.N();
        if (!class018942.y().equals("minecraft")) {
            return "tags/" + class018942.y() + "/" + class018942.N();
        }
        return string;
    }

    public static class05946<class01255> y(class05946<class07299> class059462) {
        return class05946.N(yI, (class01894)class059462.N());
    }

    public static class05946<class07299> N(class05946<class01255> class059462) {
        return class05946.N(yg, (class01894)class059462.N());
    }

    private static String N(String string, class05946 class059462) {
        class01894 class018942 = class059462.N();
        if (!class018942.y().equals("minecraft")) {
            return class018942.y() + "/" + class018942.N();
        }
        return string;
    }

    private static <T> class05946<class00751<T>> N(String string) {
        return class05946.N((class01894)class01894.y((String)string));
    }
}

