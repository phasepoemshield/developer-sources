/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10539
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class03278
 *  minecraft.class04206
 *  minecraft.class05636
 *  minecraft.class05641
 *  minecraft.class05654
 *  minecraft.class06156
 *  minecraft.class06521
 */
package minecraft;

import Nursultan.class10539;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class03278;
import minecraft.class04206;
import minecraft.class05636;
import minecraft.class05641;
import minecraft.class05654;
import minecraft.class05857;
import minecraft.class05869;
import minecraft.class06156;
import minecraft.class06521;

public interface class05838<T extends class06521<?>> {
    public static final class05838<class05857> N = class05838.N("crafting");
    public static final class05838<class05654> y = class05838.N("smelting");
    public static final class05838<class05641> L = class05838.N("blasting");
    public static final class05838<class05636> u = class05838.N("smoking");
    public static final class05838<class05869> i = class05838.N("campfire_cooking");
    public static final class05838<class06156> R = class05838.N("stonecutting");
    public static final class05838<class03278> M = class05838.N("smithing");

    public static <T extends class06521<?>> class05838<T> N(String string) {
        return (class05838)class00751.N((class00751)class04206.b, (class01894)class01894.y((String)string), (Object)new class10539(string));
    }
}

