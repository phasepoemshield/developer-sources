/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00306
 *  minecraft.class00317
 *  minecraft.class00751
 *  minecraft.class01436
 *  minecraft.class01440
 *  minecraft.class01459
 *  minecraft.class01464
 *  minecraft.class01474
 *  minecraft.class03614
 *  minecraft.class04206
 *  minecraft.class05892
 *  minecraft.class08492
 *  minecraft.class08631
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00306;
import minecraft.class00317;
import minecraft.class00751;
import minecraft.class01436;
import minecraft.class01440;
import minecraft.class01459;
import minecraft.class01464;
import minecraft.class01474;
import minecraft.class03614;
import minecraft.class04206;
import minecraft.class05892;
import minecraft.class08492;
import minecraft.class08631;

public class class05930<P extends class01474> {
    public static final class05930<class05892> N = class05930.N("trunk_vine", class05892.N);
    public static final class05930<class01464> y = class05930.N("leave_vine", class01464.N);
    public static final class05930<class00306> L = class05930.N("pale_moss", class00306.N);
    public static final class05930<class00317> u = class05930.N("creaking_heart", class00317.N);
    public static final class05930<class01436> i = class05930.N("cocoa", class01436.N);
    public static final class05930<class01459> R = class05930.N("beehive", class01459.N);
    public static final class05930<class01440> M = class05930.N("alter_ground", class01440.N);
    public static final class05930<class03614> B = class05930.N("attached_to_leaves", class03614.N);
    public static final class05930<class08631> Z = class05930.N("place_on_ground", class08631.N);
    public static final class05930<class08492> z = class05930.N("attached_to_logs", class08492.N);
    private final MapCodec<P> U;

    public class05930(MapCodec<P> mapCodec) {
        this.U = mapCodec;
    }

    private static <P extends class01474> class05930<P> N(String string, MapCodec<P> mapCodec) {
        return (class05930)class00751.N((class00751)class04206.D, (String)string, new class05930<P>(mapCodec));
    }

    public MapCodec<P> N() {
        return this.U;
    }
}

