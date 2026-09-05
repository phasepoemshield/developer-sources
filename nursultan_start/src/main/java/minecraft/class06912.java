/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00751
 *  minecraft.class00762
 *  minecraft.class00766
 *  minecraft.class00769
 *  minecraft.class00775
 *  minecraft.class00776
 *  minecraft.class00781
 *  minecraft.class00790
 *  minecraft.class00796
 *  minecraft.class00797
 *  minecraft.class00812
 *  minecraft.class00813
 *  minecraft.class00822
 *  minecraft.class00823
 *  minecraft.class00827
 *  minecraft.class00832
 *  minecraft.class00835
 *  minecraft.class00839
 *  minecraft.class00842
 *  minecraft.class00846
 *  minecraft.class00847
 *  minecraft.class00852
 *  minecraft.class00856
 *  minecraft.class01265
 *  minecraft.class02181
 *  minecraft.class03471
 *  minecraft.class04206
 *  minecraft.class04258
 *  minecraft.class04280
 *  minecraft.class04554
 *  minecraft.class04561
 *  minecraft.class04566
 *  minecraft.class04954
 *  minecraft.class05189
 *  minecraft.class05890
 *  minecraft.class05895
 *  minecraft.class05922
 *  minecraft.class05962
 *  minecraft.class06583
 *  minecraft.class07574
 *  minecraft.class07658
 *  minecraft.class07661
 *  minecraft.class07674
 *  minecraft.class07694
 *  minecraft.class07702
 *  minecraft.class07705
 *  minecraft.class07706
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00751;
import minecraft.class00762;
import minecraft.class00766;
import minecraft.class00769;
import minecraft.class00775;
import minecraft.class00776;
import minecraft.class00781;
import minecraft.class00790;
import minecraft.class00796;
import minecraft.class00797;
import minecraft.class00812;
import minecraft.class00813;
import minecraft.class00822;
import minecraft.class00823;
import minecraft.class00827;
import minecraft.class00832;
import minecraft.class00835;
import minecraft.class00839;
import minecraft.class00842;
import minecraft.class00846;
import minecraft.class00847;
import minecraft.class00852;
import minecraft.class00856;
import minecraft.class01265;
import minecraft.class02181;
import minecraft.class03471;
import minecraft.class04206;
import minecraft.class04258;
import minecraft.class04280;
import minecraft.class04554;
import minecraft.class04561;
import minecraft.class04566;
import minecraft.class04954;
import minecraft.class05189;
import minecraft.class05890;
import minecraft.class05895;
import minecraft.class05922;
import minecraft.class05962;
import minecraft.class06583;
import minecraft.class07574;
import minecraft.class07658;
import minecraft.class07661;
import minecraft.class07674;
import minecraft.class07694;
import minecraft.class07702;
import minecraft.class07705;
import minecraft.class07706;

public class class06912 {
    public static final Codec<class06583<?>> N = class04206.NU.T();
    public static final class00852 y = class06912.N("impossible", new class00852());
    public static final class00832 L = class06912.N("player_killed_entity", new class00832());
    public static final class00832 u = class06912.N("entity_killed_player", new class00832());
    public static final class00822 i = class06912.N("enter_block", new class00822());
    public static final class00835 R = class06912.N("inventory_changed", new class00835());
    public static final class00812 M = class06912.N("recipe_unlocked", new class00812());
    public static final class00827 B = class06912.N("player_hurt_entity", new class00827());
    public static final class00842 Z = class06912.N("entity_hurt_player", new class00842());
    public static final class00762 z = class06912.N("enchanted_item", new class00762());
    public static final class00813 U = class06912.N("filled_bucket", new class00813());
    public static final class00775 E = class06912.N("brewed_potion", new class00775());
    public static final class00769 W = class06912.N("construct_beacon", new class00769());
    public static final class07661 m = class06912.N("used_ender_eye", new class07661());
    public static final class07702 P = class06912.N("summoned_entity", new class07702());
    public static final class00796 s = class06912.N("bred_animals", new class00796());
    public static final class07658 T = class06912.N("location", new class07658());
    public static final class07658 b = class06912.N("slept_in_bed", new class07658());
    public static final class00781 j = class06912.N("cured_zombie_villager", new class00781());
    public static final class07706 v = class06912.N("villager_trade", new class07706());
    public static final class00847 n = class06912.N("item_durability_changed", new class00847());
    public static final class00823 t = class06912.N("levitation", new class00823());
    public static final class00790 G = class06912.N("changed_dimension", new class00790());
    public static final class07658 l = class06912.N("tick", new class07658());
    public static final class07674 d = class06912.N("tame_animal", new class07674());
    public static final class05890 w = class06912.N("placed_block", new class05890());
    public static final class00766 k = class06912.N("consume_item", new class00766());
    public static final class00776 Y = class06912.N("effects_changed", new class00776());
    public static final class07694 Q = class06912.N("used_totem", new class07694());
    public static final class00839 O = class06912.N("nether_travel", new class00839());
    public static final class00846 g = class06912.N("fishing_rod_hooked", new class00846());
    public static final class00797 I = class06912.N("channeled_lightning", new class00797());
    public static final class07705 J = class06912.N("shot_crossbow", new class07705());
    public static final class07574 o = class06912.N("spear_mobs", new class07574());
    public static final class00856 q = class06912.N("killed_by_arrow", new class00856());
    public static final class07658 K = class06912.N("hero_of_the_village", new class07658());
    public static final class07658 V = class06912.N("voluntary_exile", new class07658());
    public static final class05922 e = class06912.N("slide_down_block", new class05922());
    public static final class05895 H = class06912.N("bee_nest_destroyed", new class05895());
    public static final class04954 c = class06912.N("target_hit", new class04954());
    public static final class05890 X = class06912.N("item_used_on_block", new class05890());
    public static final class04258 a = class06912.N("default_block_use", new class04258());
    public static final class04280 p = class06912.N("any_block_use", new class04280());
    public static final class05962 F = class06912.N("player_generates_container_loot", new class05962());
    public static final class05189 A = class06912.N("thrown_item_picked_up_by_entity", new class05189());
    public static final class05189 f = class06912.N("thrown_item_picked_up_by_player", new class05189());
    public static final class01265 C = class06912.N("player_interacted_with_entity", new class01265());
    public static final class01265 S = class06912.N("player_sheared_equipment", new class01265());
    public static final class04566 x = class06912.N("started_riding", new class04566());
    public static final class04554 D = class06912.N("lightning_strike", new class04554());
    public static final class04561 h = class06912.N("using_item", new class04561());
    public static final class00839 r = class06912.N("fall_from_height", new class00839());
    public static final class00839 NN = class06912.N("ride_entity_in_lava", new class00839());
    public static final class00832 Ny = class06912.N("kill_mob_near_sculk_catalyst", new class00832());
    public static final class05890 NL = class06912.N("allay_drop_item_on_block", new class05890());
    public static final class07658 Nu = class06912.N("avoid_vibration", new class07658());
    public static final class03471 Ni = class06912.N("recipe_crafted", new class03471());
    public static final class03471 NR = class06912.N("crafter_recipe_crafted", new class03471());
    public static final class02181 NM = class06912.N("fall_after_explosion", new class02181());

    public static <T extends class06583<?>> T N(String string, T t) {
        return (T)((class06583)class00751.N((class00751)class04206.NU, (String)string, t));
    }

    public static class06583<?> N(class00751<class06583<?>> class007512) {
        return y;
    }
}

