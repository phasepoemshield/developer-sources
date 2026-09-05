/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00751
 *  minecraft.class02548
 *  minecraft.class02550
 *  minecraft.class02557
 *  minecraft.class02560
 *  minecraft.class02695
 *  minecraft.class02944
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class04891
 *  minecraft.class06244
 *  minecraft.class06589
 *  minecraft.class06925
 *  minecraft.class06929
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.List;
import java.util.function.UnaryOperator;
import minecraft.class00751;
import minecraft.class02472;
import minecraft.class02477;
import minecraft.class02536;
import minecraft.class02541;
import minecraft.class02548;
import minecraft.class02550;
import minecraft.class02557;
import minecraft.class02560;
import minecraft.class02695;
import minecraft.class02944;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class04891;
import minecraft.class06244;
import minecraft.class06589;
import minecraft.class06925;
import minecraft.class06929;

public interface class02523 {
    public static final Codec<class02477<?>> N = Codec.lazyInitialized(() -> class04206.Nb.T());
    public static final Codec<class02695> y = class02695.N(N);
    public static final class02477<List<class02944<class02536>>> L = class02523.N("damage_protection", class024722 -> class024722.N(class02944.N(class02536.y, (class06929)class06925.G).listOf()));
    public static final class02477<List<class02944<class02557>>> u = class02523.N("damage_immunity", class024722 -> class024722.N(class02944.N((Codec)class02557.y, (class06929)class06925.G).listOf()));
    public static final class02477<List<class02944<class02536>>> i = class02523.N("damage", class024722 -> class024722.N(class02944.N(class02536.y, (class06929)class06925.G).listOf()));
    public static final class02477<List<class02944<class02536>>> R = class02523.N("smash_damage_per_fallen_block", class024722 -> class024722.N(class02944.N(class02536.y, (class06929)class06925.G).listOf()));
    public static final class02477<List<class02944<class02536>>> M = class02523.N("knockback", class024722 -> class024722.N(class02944.N(class02536.y, (class06929)class06925.G).listOf()));
    public static final class02477<List<class02944<class02536>>> B = class02523.N("armor_effectiveness", class024722 -> class024722.N(class02944.N(class02536.y, (class06929)class06925.G).listOf()));
    public static final class02477<List<class02550<class02560>>> Z = class02523.N("post_attack", class024722 -> class024722.N(class02550.N((Codec)class02560.y, (class06929)class06925.G).listOf()));
    public static final class02477<List<class02944<class02560>>> z = class02523.N("post_piercing_attack", class024722 -> class024722.N(class02944.N((Codec)class02560.y, (class06929)class06925.G).listOf()));
    public static final class02477<List<class02944<class02560>>> U = class02523.N("hit_block", class024722 -> class024722.N(class02944.N((Codec)class02560.y, (class06929)class06925.k).listOf()));
    public static final class02477<List<class02944<class02536>>> E = class02523.N("item_damage", class024722 -> class024722.N(class02944.N(class02536.y, (class06929)class06925.l).listOf()));
    public static final class02477<List<class02541>> W = class02523.N("attributes", class024722 -> class024722.N(class02541.N.codec().listOf()));
    public static final class02477<List<class02550<class02536>>> m = class02523.N("equipment_drops", class024722 -> class024722.N(class02550.y(class02536.y, (class06929)class06925.G).listOf()));
    public static final class02477<List<class02944<class02548>>> P = class02523.N("location_changed", class024722 -> class024722.N(class02944.N((Codec)class02548.L, (class06929)class06925.d).listOf()));
    public static final class02477<List<class02944<class02560>>> s = class02523.N("tick", class024722 -> class024722.N(class02944.N((Codec)class02560.y, (class06929)class06925.w).listOf()));
    public static final class02477<List<class02944<class02536>>> T = class02523.N("ammo_use", class024722 -> class024722.N(class02944.N(class02536.y, (class06929)class06925.l).listOf()));
    public static final class02477<List<class02944<class02536>>> b = class02523.N("projectile_piercing", class024722 -> class024722.N(class02944.N(class02536.y, (class06929)class06925.l).listOf()));
    public static final class02477<List<class02944<class02560>>> j = class02523.N("projectile_spawned", class024722 -> class024722.N(class02944.N((Codec)class02560.y, (class06929)class06925.w).listOf()));
    public static final class02477<List<class02944<class02536>>> v = class02523.N("projectile_spread", class024722 -> class024722.N(class02944.N(class02536.y, (class06929)class06925.w).listOf()));
    public static final class02477<List<class02944<class02536>>> n = class02523.N("projectile_count", class024722 -> class024722.N(class02944.N(class02536.y, (class06929)class06925.w).listOf()));
    public static final class02477<List<class02944<class02536>>> t = class02523.N("trident_return_acceleration", class024722 -> class024722.N(class02944.N(class02536.y, (class06929)class06925.w).listOf()));
    public static final class02477<List<class02944<class02536>>> G = class02523.N("fishing_time_reduction", class024722 -> class024722.N(class02944.N(class02536.y, (class06929)class06925.w).listOf()));
    public static final class02477<List<class02944<class02536>>> l = class02523.N("fishing_luck_bonus", class024722 -> class024722.N(class02944.N(class02536.y, (class06929)class06925.w).listOf()));
    public static final class02477<List<class02944<class02536>>> d = class02523.N("block_experience", class024722 -> class024722.N(class02944.N(class02536.y, (class06929)class06925.l).listOf()));
    public static final class02477<List<class02944<class02536>>> w = class02523.N("mob_experience", class024722 -> class024722.N(class02944.N(class02536.y, (class06929)class06925.w).listOf()));
    public static final class02477<List<class02944<class02536>>> k = class02523.N("repair_with_xp", class024722 -> class024722.N(class02944.N(class02536.y, (class06929)class06925.l).listOf()));
    public static final class02477<class02536> Y = class02523.N("crossbow_charge_time", class024722 -> class024722.N(class02536.y));
    public static final class02477<List<class06589>> Q = class02523.N("crossbow_charging_sounds", class024722 -> class024722.N(class06589.N.listOf()));
    public static final class02477<List<class03556<class04891>>> O = class02523.N("trident_sound", class024722 -> class024722.N(class04891.y.listOf()));
    public static final class02477<class06244> g = class02523.N("prevent_equipment_drop", class024722 -> class024722.N(class06244.field_51563));
    public static final class02477<class06244> I = class02523.N("prevent_armor_change", class024722 -> class024722.N(class06244.field_51563));
    public static final class02477<class02536> J = class02523.N("trident_spin_attack_strength", class024722 -> class024722.N(class02536.y));

    private static /* synthetic */ class02472 T(class02472 class024722) {
        return class024722.N(class02944.N(class02536.y, (class06929)class06925.l).listOf());
    }

    private static /* synthetic */ class02472 Q(class02472 class024722) {
        return class024722.N(class02944.N(class02536.y, (class06929)class06925.G).listOf());
    }

    private static /* synthetic */ class02472 b(class02472 class024722) {
        return class024722.N(class02944.N((Codec)class02560.y, (class06929)class06925.w).listOf());
    }

    private static /* synthetic */ class02472 s(class02472 class024722) {
        return class024722.N(class02944.N(class02536.y, (class06929)class06925.l).listOf());
    }

    private static /* synthetic */ class02472 k(class02472 class024722) {
        return class024722.N(class02944.N(class02536.y, (class06929)class06925.G).listOf());
    }

    private static /* synthetic */ class02472 g(class02472 class024722) {
        return class024722.N(class02944.N(class02536.y, (class06929)class06925.G).listOf());
    }

    private static /* synthetic */ class02472 U(class02472 class024722) {
        return class024722.N(class02944.N(class02536.y, (class06929)class06925.w).listOf());
    }

    private static /* synthetic */ class02472 z(class02472 class024722) {
        return class024722.N(class02944.N(class02536.y, (class06929)class06925.w).listOf());
    }

    private static /* synthetic */ class02472 y(class02472 class024722) {
        return class024722.N(class06244.field_51563);
    }

    private static /* synthetic */ class02472 E(class02472 class024722) {
        return class024722.N(class02944.N(class02536.y, (class06929)class06925.w).listOf());
    }

    private static <T> class02477<T> N(String string, UnaryOperator<class02472<T>> unaryOperator) {
        return (class02477)class00751.N((class00751)class04206.Nb, (String)string, ((class02472)unaryOperator.apply(class02477.N())).y());
    }

    public static class02477<?> N(class00751<class02477<?>> class007512) {
        return L;
    }

    private static /* synthetic */ class02472 W(class02472 class024722) {
        return class024722.N(class02944.N(class02536.y, (class06929)class06925.w).listOf());
    }

    private static /* synthetic */ class02472 R(class02472 class024722) {
        return class024722.N(class02536.y);
    }

    private static /* synthetic */ class02472 Y(class02472 class024722) {
        return class024722.N(class02944.N(class02536.y, (class06929)class06925.G).listOf());
    }
}

