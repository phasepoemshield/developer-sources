/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class01894
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 *  net.fabricmc.fabric.impl.client.keybinding.CategoryComparator
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import minecraft.class00392;
import minecraft.class01894;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.impl.client.keybinding.CategoryComparator;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Environment(value=EnvType.CLIENT)
public final class class06384
extends Record {
    private final class01894 id;
    static final List<class06384> N = new ArrayList<class06384>();
    public static final class06384 y = class06384.N("movement");
    public static final class06384 L = class06384.N("misc");
    public static final class06384 u = class06384.N("multiplayer");
    public static final class06384 i = class06384.N("gameplay");
    public static final class06384 R = class06384.N("inventory");
    public static final class06384 M = class06384.N("creative");
    public static final class06384 B = class06384.N("spectator");
    public static final class06384 Z = class06384.N("debug");

    public class06384(class01894 class018942) {
        this.id = class018942;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06384.class, "id", "id"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06384.class, "id", "id"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06384.class, "id", "id"}, this);
    }

    public class01894 y() {
        return this.id;
    }

    private static void N(class01894 class018942, CallbackInfoReturnable callbackInfoReturnable) {
        N.sort((Comparator<class06384>)CategoryComparator.INSTANCE);
    }

    private static class06384 N(String string) {
        return class06384.N(class01894.y((String)string));
    }

    public class00392 N() {
        return class00392.L((String)this.id.B("key.category"));
    }

    public static class06384 N(class01894 class018942) {
        class06384 class063842 = new class06384(class018942);
        if (N.contains((Object)class063842)) {
            throw new IllegalArgumentException(String.format(Locale.ROOT, "Category '%s' is already registered.", class018942));
        }
        N.add(class063842);
        class06384.N(class018942, null);
        return class063842;
    }
}

