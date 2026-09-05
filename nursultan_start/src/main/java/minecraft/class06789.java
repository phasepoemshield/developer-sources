/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09232
 *  Nursultan.class09648
 *  Nursultan.class09649
 *  Nursultan.class09650
 *  Nursultan.class09655
 *  Nursultan.class10231
 *  Nursultan.class10240
 *  Nursultan.class10392
 *  Nursultan.class10393
 *  com.google.common.collect.Maps
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.BoolArgumentType
 *  com.mojang.brigadier.arguments.DoubleArgumentType
 *  com.mojang.brigadier.arguments.FloatArgumentType
 *  com.mojang.brigadier.arguments.IntegerArgumentType
 *  com.mojang.brigadier.arguments.LongArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  minecraft.class00035
 *  minecraft.class00202
 *  minecraft.class00751
 *  minecraft.class00871
 *  minecraft.class00877
 *  minecraft.class00878
 *  minecraft.class00879
 *  minecraft.class00881
 *  minecraft.class00887
 *  minecraft.class00894
 *  minecraft.class00897
 *  minecraft.class00905
 *  minecraft.class01021
 *  minecraft.class01786
 *  minecraft.class02198
 *  minecraft.class02494
 *  minecraft.class03583
 *  minecraft.class03784
 *  minecraft.class03789
 *  minecraft.class03935
 *  minecraft.class03966
 *  minecraft.class04131
 *  minecraft.class04403
 *  minecraft.class04434
 *  minecraft.class04608
 *  minecraft.class05193
 *  minecraft.class07198
 *  minecraft.class07201
 *  minecraft.class07216
 *  minecraft.class07224
 *  minecraft.class07659
 *  minecraft.class07667
 *  minecraft.class07678
 *  minecraft.class07680
 *  minecraft.class07683
 *  minecraft.class07687
 *  minecraft.class07690
 *  minecraft.class07696
 *  minecraft.class07698
 *  minecraft.class07758
 *  minecraft.class07759
 *  minecraft.class07761
 *  minecraft.class07764
 *  minecraft.class07766
 *  minecraft.class07767
 *  minecraft.class07772
 *  minecraft.class07778
 *  minecraft.class07780
 *  minecraft.class07785
 *  minecraft.class07786
 *  minecraft.class07787
 *  minecraft.class07788
 *  minecraft.class07791
 *  minecraft.class07794
 *  minecraft.class07798
 *  net.fabricmc.fabric.mixin.command.ArgumentTypeInfosAccessor
 */
package minecraft;

import Nursultan.class09232;
import Nursultan.class09648;
import Nursultan.class09649;
import Nursultan.class09650;
import Nursultan.class09655;
import Nursultan.class10231;
import Nursultan.class10240;
import Nursultan.class10392;
import Nursultan.class10393;
import com.google.common.collect.Maps;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.DoubleArgumentType;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.IntegerArgumentType;
import com.mojang.brigadier.arguments.LongArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import java.util.Locale;
import java.util.Map;
import minecraft.class00035;
import minecraft.class00202;
import minecraft.class00751;
import minecraft.class00871;
import minecraft.class00877;
import minecraft.class00878;
import minecraft.class00879;
import minecraft.class00881;
import minecraft.class00887;
import minecraft.class00894;
import minecraft.class00897;
import minecraft.class00905;
import minecraft.class01021;
import minecraft.class01786;
import minecraft.class02198;
import minecraft.class02494;
import minecraft.class03583;
import minecraft.class03784;
import minecraft.class03789;
import minecraft.class03935;
import minecraft.class03966;
import minecraft.class04131;
import minecraft.class04403;
import minecraft.class04434;
import minecraft.class04608;
import minecraft.class05193;
import minecraft.class06763;
import minecraft.class06770;
import minecraft.class06776;
import minecraft.class06793;
import minecraft.class06799;
import minecraft.class06808;
import minecraft.class07198;
import minecraft.class07201;
import minecraft.class07216;
import minecraft.class07224;
import minecraft.class07659;
import minecraft.class07667;
import minecraft.class07678;
import minecraft.class07680;
import minecraft.class07683;
import minecraft.class07687;
import minecraft.class07690;
import minecraft.class07696;
import minecraft.class07698;
import minecraft.class07758;
import minecraft.class07759;
import minecraft.class07761;
import minecraft.class07764;
import minecraft.class07766;
import minecraft.class07767;
import minecraft.class07772;
import minecraft.class07778;
import minecraft.class07780;
import minecraft.class07785;
import minecraft.class07786;
import minecraft.class07787;
import minecraft.class07788;
import minecraft.class07791;
import minecraft.class07794;
import minecraft.class07798;
import net.fabricmc.fabric.mixin.command.ArgumentTypeInfosAccessor;

public class class06789
implements ArgumentTypeInfosAccessor {
    public static final Map<Class<?>, class06799<?, ?>> N = Maps.newHashMap();

    public static <A extends ArgumentType<?>> class06763<A> y(A a) {
        return class06789.N(a).N(a);
    }

    private static <T extends ArgumentType<?>> Class<T> y(Class<? super T> clazz) {
        return clazz;
    }

    public static /* synthetic */ Map N() {
        return N;
    }

    public static <A extends ArgumentType<?>> class06799<A, ?> N(A a) {
        class06799<?, ?> class067992 = N.get(a.getClass());
        if (class067992 == null) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "Unrecognized argument type %s (%s)", a, a.getClass()));
        }
        return class067992;
    }

    public static boolean N(Class<?> clazz) {
        return N.containsKey(clazz);
    }

    public static class06799<?, ?> N(class00751<class06799<?, ?>> class007512) {
        class06789.N(class007512, "brigadier:bool", BoolArgumentType.class, class06776.N_14(BoolArgumentType::bool));
        class06789.N(class007512, "brigadier:float", FloatArgumentType.class, new class07198());
        class06789.N(class007512, "brigadier:double", DoubleArgumentType.class, new class07224());
        class06789.N(class007512, "brigadier:integer", IntegerArgumentType.class, new class07201());
        class06789.N(class007512, "brigadier:long", LongArgumentType.class, new class04608());
        class06789.N(class007512, "brigadier:string", StringArgumentType.class, new class07216());
        class06789.N(class007512, "entity", class07680.class, new class07683());
        class06789.N(class007512, "game_profile", class07659.class, class06776.N_14(class07659::N));
        class06789.N(class007512, "block_pos", class00894.class, class06776.N_14(class00894::N));
        class06789.N(class007512, "column_pos", class00905.class, class06776.N_14(class00905::N));
        class06789.N(class007512, "vec3", class00881.class, class06776.N_14(class00881::N));
        class06789.N(class007512, "vec2", class00887.class, class06776.N_14(class00887::N));
        class06789.N(class007512, "block_state", class00877.class, class06776.N_62(class00877::N));
        class06789.N(class007512, "block_predicate", class00878.class, class06776.N_62(class00878::N));
        class06789.N(class007512, "item_stack", class06770.class, class06776.N_62(class06770::N));
        class06789.N(class007512, "item_predicate", class06793.class, class06776.N_62(class06793::N));
        class06789.N(class007512, "color", class07696.class, class06776.N_14(class07696::N));
        class06789.N(class007512, "hex_color", class00035.class, class06776.N_14(class00035::N));
        class06789.N(class007512, "component", class07698.class, class06776.N_62(class07698::N));
        class06789.N(class007512, "style", class01786.class, class06776.N_62(class01786::N));
        class06789.N(class007512, "message", class07690.class, class06776.N_14(class07690::N));
        class06789.N(class007512, "nbt_compound_tag", class07667.class, class06776.N_14(class07667::N));
        class06789.N(class007512, "nbt_tag", class07791.class, class06776.N_14(class07791::N));
        class06789.N(class007512, "nbt_path", class07759.class, class06776.N_14(class07759::N));
        class06789.N(class007512, "objective", class07794.class, class06776.N_14(class07794::N));
        class06789.N(class007512, "objective_criteria", class07764.class, class06776.N_14(class07764::N));
        class06789.N(class007512, "operation", class07785.class, class06776.N_14(class07785::N));
        class06789.N(class007512, "particle", class07772.class, class06776.N_62(class07772::N));
        class06789.N(class007512, "angle", class01021.class, class06776.N_14(class01021::N));
        class06789.N(class007512, "rotation", class00897.class, class06776.N_14(class00897::N));
        class06789.N(class007512, "scoreboard_slot", class07758.class, class06776.N_14(class07758::N));
        class06789.N(class007512, "score_holder", class07786.class, new class07780());
        class06789.N(class007512, "swizzle", class00879.class, class06776.N_14(class00879::N));
        class06789.N(class007512, "team", class07761.class, class06776.N_14(class07761::N));
        class06789.N(class007512, "item_slot", class07787.class, class06776.N_14(class07787::N));
        class06789.N(class007512, "item_slots", class02494.class, class06776.N_14(class02494::N));
        class06789.N(class007512, "resource_location", class07778.class, class06776.N_14(class07778::N));
        class06789.N(class007512, "function", class06808.class, class06776.N_14(class06808::N));
        class06789.N(class007512, "entity_anchor", class07687.class, class06776.N_14(class07687::N));
        class06789.N(class007512, "int_range", class07767.class, class06776.N_14(class07788::N));
        class06789.N(class007512, "float_range", class07766.class, class06776.N_14(class07788::y));
        class06789.N(class007512, "dimension", class07678.class, class06776.N_14(class07678::N));
        class06789.N(class007512, "gamemode", class04131.class, class06776.N_14(class04131::N));
        class06789.N(class007512, "time", class07798.class, new class00871());
        class06789.N(class007512, "resource_or_tag", class06789.y(class03789.class), new class10240());
        class06789.N(class007512, "resource_or_tag_key", class06789.y(class04434.class), new class10392());
        class06789.N(class007512, "resource", class06789.y(class03784.class), new class10231());
        class06789.N(class007512, "resource_key", class06789.y(class04403.class), new class10393());
        class06789.N(class007512, "resource_selector", class06789.y(class00202.class), new class09232());
        class06789.N(class007512, "template_mirror", class03966.class, class06776.N_14(class03966::N));
        class06789.N(class007512, "template_rotation", class03935.class, class06776.N_14(class03935::N));
        class06789.N(class007512, "heightmap", class03583.class, class06776.N_14(class03583::N));
        class06789.N(class007512, "loot_table", class09649.class, class06776.N_62(class02198::N));
        class06789.N(class007512, "loot_predicate", class09648.class, class06776.N_62(class02198::L));
        class06789.N(class007512, "loot_modifier", class09655.class, class06776.N_62(class02198::y));
        class06789.N(class007512, "dialog", class09650.class, class06776.N_62(class02198::u));
        return class06789.N(class007512, "uuid", class05193.class, class06776.N_14(class05193::N));
    }

    private static <A extends ArgumentType<?>, T extends class06763<A>> class06799<A, T> N(class00751<class06799<?, ?>> class007512, String string, Class<? extends A> clazz, class06799<A, T> class067992) {
        N.put(clazz, class067992);
        return (class06799)class00751.N(class007512, (String)string, class067992);
    }
}

