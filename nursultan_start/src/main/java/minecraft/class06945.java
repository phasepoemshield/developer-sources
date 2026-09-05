/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01929
 *  minecraft.class03767
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01929;
import minecraft.class03767;

public final class class06945
extends Record {
    final class03767 enabledFeatures;
    private final boolean hasPermissions;
    private final class01929 holders;

    public class01929 L() {
        return this.holders;
    }

    public class06945(class03767 class037672, boolean bl, class01929 class019292) {
        this.enabledFeatures = class037672;
        this.hasPermissions = bl;
        this.holders = class019292;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class06945.class, "enabledFeatures;hasPermissions;holders", "enabledFeatures", "hasPermissions", "holders"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class06945.class, "enabledFeatures;hasPermissions;holders", "enabledFeatures", "hasPermissions", "holders"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class06945.class, "enabledFeatures;hasPermissions;holders", "enabledFeatures", "hasPermissions", "holders"}, this);
    }

    public boolean y() {
        return this.hasPermissions;
    }

    public class03767 N() {
        return this.enabledFeatures;
    }

    public boolean N(class03767 class037672, boolean bl, class01929 class019292) {
        return !this.enabledFeatures.equals((Object)class037672) || this.hasPermissions != bl || this.holders != class019292;
    }
}

