/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00751
 *  minecraft.class00788
 *  minecraft.class00805
 *  minecraft.class00815
 *  minecraft.class00851
 *  minecraft.class00859
 *  minecraft.class00866
 *  minecraft.class00908
 *  minecraft.class01405
 *  minecraft.class01429
 *  minecraft.class01894
 *  minecraft.class02205
 *  minecraft.class03494
 *  minecraft.class03496
 *  minecraft.class04206
 *  minecraft.class04796
 *  minecraft.class05955
 *  minecraft.class05957
 *  minecraft.class06526
 *  minecraft.class07318
 *  minecraft.class07776
 *  minecraft.class07795
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00751;
import minecraft.class00788;
import minecraft.class00805;
import minecraft.class00815;
import minecraft.class00851;
import minecraft.class00859;
import minecraft.class00866;
import minecraft.class00908;
import minecraft.class01405;
import minecraft.class01429;
import minecraft.class01894;
import minecraft.class02205;
import minecraft.class03494;
import minecraft.class03496;
import minecraft.class04206;
import minecraft.class04796;
import minecraft.class05955;
import minecraft.class05957;
import minecraft.class06526;
import minecraft.class07318;
import minecraft.class07657;
import minecraft.class07700;
import minecraft.class07776;
import minecraft.class07795;

public class class07693 {
    public static final class05955 N = class07693.N("inverted", (MapCodec<? extends class05957>)class00815.N);
    public static final class05955 y = class07693.N("any_of", (MapCodec<? extends class05957>)class03494.i);
    public static final class05955 L = class07693.N("all_of", (MapCodec<? extends class05957>)class03496.i);
    public static final class05955 u = class07693.N("random_chance", class07657.N);
    public static final class05955 i = class07693.N("random_chance_with_enchanted_bonus", (MapCodec<? extends class05957>)class00908.N);
    public static final class05955 R = class07693.N("entity_properties", class07700.N);
    public static final class05955 M = class07693.N("killed_by_player", (MapCodec<? extends class05957>)class07776.N);
    public static final class05955 B = class07693.N("entity_scores", (MapCodec<? extends class05957>)class00805.N);
    public static final class05955 Z = class07693.N("block_state_property", (MapCodec<? extends class05957>)class00851.N);
    public static final class05955 z = class07693.N("match_tool", (MapCodec<? extends class05957>)class07795.N);
    public static final class05955 U = class07693.N("table_bonus", (MapCodec<? extends class05957>)class06526.N);
    public static final class05955 E = class07693.N("survives_explosion", (MapCodec<? extends class05957>)class00788.N);
    public static final class05955 W = class07693.N("damage_source_properties", (MapCodec<? extends class05957>)class07318.N);
    public static final class05955 m = class07693.N("location_check", (MapCodec<? extends class05957>)class00859.N);
    public static final class05955 P = class07693.N("weather_check", (MapCodec<? extends class05957>)class00866.N);
    public static final class05955 s = class07693.N("reference", (MapCodec<? extends class05957>)class01429.N);
    public static final class05955 T = class07693.N("time_check", (MapCodec<? extends class05957>)class01405.N);
    public static final class05955 b = class07693.N("value_check", (MapCodec<? extends class05957>)class04796.N);
    public static final class05955 j = class07693.N("enchantment_active_check", (MapCodec<? extends class05957>)class02205.N);

    private static class05955 N(String string, MapCodec<? extends class05957> mapCodec) {
        return (class05955)class00751.N((class00751)class04206.I, (class01894)class01894.y((String)string), (Object)new class05955(mapCodec));
    }
}

