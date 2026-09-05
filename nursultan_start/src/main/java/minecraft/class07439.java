/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00030
 *  minecraft.class00709
 *  minecraft.class00751
 *  minecraft.class01095
 *  minecraft.class01281
 *  minecraft.class01894
 *  minecraft.class02167
 *  minecraft.class02321
 *  minecraft.class02326
 *  minecraft.class02343
 *  minecraft.class02349
 *  minecraft.class02355
 *  minecraft.class02359
 *  minecraft.class02635
 *  minecraft.class02683
 *  minecraft.class02702
 *  minecraft.class02907
 *  minecraft.class02925
 *  minecraft.class02930
 *  minecraft.class02937
 *  minecraft.class03364
 *  minecraft.class03556
 *  minecraft.class04030
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04466
 *  minecraft.class04646
 *  minecraft.class04668
 *  minecraft.class04677
 *  minecraft.class04812
 *  minecraft.class04815
 *  minecraft.class05268
 *  minecraft.class05501
 *  minecraft.class05908
 *  minecraft.class05946
 *  minecraft.class05959
 *  minecraft.class06584
 *  minecraft.class06706
 *  minecraft.class06810
 *  minecraft.class07160
 *  minecraft.class07621
 *  minecraft.class07624
 *  minecraft.class07882
 *  minecraft.class07986
 *  minecraft.class08017
 *  minecraft.class08122
 *  minecraft.class08252
 *  minecraft.class08611
 *  minecraft.class08828
 *  minecraft.class08853
 *  minecraft.class09004
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiFunction;
import minecraft.class00030;
import minecraft.class00709;
import minecraft.class00751;
import minecraft.class01095;
import minecraft.class01281;
import minecraft.class01894;
import minecraft.class02167;
import minecraft.class02321;
import minecraft.class02326;
import minecraft.class02343;
import minecraft.class02349;
import minecraft.class02355;
import minecraft.class02359;
import minecraft.class02635;
import minecraft.class02683;
import minecraft.class02702;
import minecraft.class02907;
import minecraft.class02925;
import minecraft.class02930;
import minecraft.class02937;
import minecraft.class03364;
import minecraft.class03556;
import minecraft.class04030;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04466;
import minecraft.class04646;
import minecraft.class04668;
import minecraft.class04677;
import minecraft.class04812;
import minecraft.class04815;
import minecraft.class05268;
import minecraft.class05501;
import minecraft.class05908;
import minecraft.class05946;
import minecraft.class05959;
import minecraft.class06584;
import minecraft.class06706;
import minecraft.class06810;
import minecraft.class07160;
import minecraft.class07437;
import minecraft.class07621;
import minecraft.class07624;
import minecraft.class07882;
import minecraft.class07986;
import minecraft.class08017;
import minecraft.class08122;
import minecraft.class08252;
import minecraft.class08611;
import minecraft.class08828;
import minecraft.class08853;
import minecraft.class09004;

public class class07439 {
    public static final BiFunction<class06584, class05908, class06584> N = (class065842, class059082) -> class065842;
    public static final Codec<class08122> y = class04206.g.T().dispatch("function", class08122::N, class05959::N);
    public static final Codec<class08122> L = Codec.lazyInitialized(() -> Codec.withAlternative(y, (Codec)class04812.y));
    public static final Codec<class03556<class08122>> u = class01281.N((class05946)class04227.yo, L);
    public static final class05959<class07621> i = class07439.N("set_count", class07621.N);
    public static final class05959<class02925> R = class07439.N("set_item", class02925.N);
    public static final class05959<class08611> M = class07439.N("enchant_with_levels", class08611.N);
    public static final class05959<class08853> B = class07439.N("enchant_randomly", class08853.N);
    public static final class05959<class04815> Z = class07439.N("set_enchantments", class04815.N);
    public static final class05959<class07160> z = class07439.N("set_custom_data", class07160.N);
    public static final class05959<class02702> U = class07439.N("set_components", class02702.N);
    public static final class05959<class08017> E = class07439.N("furnace_smelt", class08017.N);
    public static final class05959<class06706> W = class07439.N("enchanted_count_increase", class06706.y);
    public static final class05959<class07882> m = class07439.N("set_damage", class07882.N);
    public static final class05959<class07986> P = class07439.N("set_attributes", class07986.N);
    public static final class05959<class04646> s = class07439.N("set_name", class04646.N);
    public static final class05959<class00030> T = class07439.N("exploration_map", class00030.R);
    public static final class05959<class00709> b = class07439.N("set_stew_effect", class00709.N);
    public static final class05959<class08252> j = class07439.N("copy_name", class08252.N);
    public static final class05959<class07437> v = class07439.N("set_contents", class07437.N);
    public static final class05959<class02930> n = class07439.N("modify_contents", class02930.N);
    public static final class05959<class02907> t = class07439.N("filtered", class02907.N);
    public static final class05959<class09004> G = class07439.N("limit_count", class09004.N);
    public static final class05959<class02349> l = class07439.N("apply_bonus", class02349.N);
    public static final class05959<class07624> d = class07439.N("set_loot_table", class07624.N);
    public static final class05959<class08828> w = class07439.N("explosion_decay", class08828.N);
    public static final class05959<class04668> k = class07439.N("set_lore", class04668.N);
    public static final class05959<class04677> Y = class07439.N("fill_player_head", class04677.N);
    public static final class05959<class05268> Q = class07439.N("copy_custom_data", class05268.N);
    public static final class05959<class05501> O = class07439.N("copy_state", class05501.N);
    public static final class05959<class01095> g = class07439.N("set_banner_pattern", class01095.N);
    public static final class05959<class04030> I = class07439.N("set_potion", class04030.N);
    public static final class05959<class04466> J = class07439.N("set_instrument", class04466.N);
    public static final class05959<class03364> o = class07439.N("reference", class03364.N);
    public static final class05959<class04812> q = class07439.N("sequence", class04812.N);
    public static final class05959<class02683> K = class07439.N("copy_components", class02683.N);
    public static final class05959<class02355> V = class07439.N("set_fireworks", class02355.N);
    public static final class05959<class02321> e = class07439.N("set_firework_explosion", class02321.N);
    public static final class05959<class02359> H = class07439.N("set_book_cover", class02359.N);
    public static final class05959<class02326> c = class07439.N("set_written_book_pages", class02326.N);
    public static final class05959<class02343> X = class07439.N("set_writable_book_pages", class02343.N);
    public static final class05959<class02167> a = class07439.N("toggle_tooltips", class02167.N);
    public static final class05959<class02635> p = class07439.N("set_ominous_bottle_amplifier", class02635.N);
    public static final class05959<class02937> F = class07439.N("set_custom_model_data", class02937.N);
    public static final class05959<class06810> A = class07439.N("discard", class06810.N);

    private static /* synthetic */ class06584 N(BiFunction biFunction, BiFunction biFunction2, class06584 class065842, class05908 class059082) {
        return (class06584)biFunction.apply((class06584)biFunction2.apply(class065842, class059082), class059082);
    }

    private static <T extends class08122> class05959<T> N(String string, MapCodec<T> mapCodec) {
        return (class05959)class00751.N((class00751)class04206.g, (class01894)class01894.y((String)string), (Object)new class05959(mapCodec));
    }

    public static BiFunction<class06584, class05908, class06584> N(List<? extends BiFunction<class06584, class05908, class06584>> list) {
        List<? extends BiFunction<class06584, class05908, class06584>> list2 = List.copyOf(list);
        return switch (list2.size()) {
            case 0 -> N;
            case 1 -> list2.get(0);
            case 2 -> {
                BiFunction<class06584, class05908, class06584> var2_2 = list2.get(0);
                yield (arg_0, arg_1) -> class07439.N(list2.get(1), var2_2, arg_0, arg_1);
            }
            default -> (class065842, class059082) -> {
                Iterator iterator = list2.iterator();
                while (iterator.hasNext()) {
                    class065842 = (class06584)((BiFunction)iterator.next()).apply(class065842, class059082);
                }
                return class065842;
            };
        };
    }
}

