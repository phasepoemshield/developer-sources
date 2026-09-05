/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  com.mojang.serialization.DataResult
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class04206
 */
package minecraft;

import com.mojang.serialization.Codec;
import com.mojang.serialization.DataResult;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01894;
import minecraft.class02477;
import minecraft.class04206;

final class class02473
extends Record {
    private final class02477<?> type;
    private final boolean removed;
    public static final Codec<class02473> N = Codec.STRING.flatXmap(string -> {
        class01894 class018942;
        class02477 var3;
        boolean bl = string.startsWith("!");
        if (bl) {
            string = string.substring("!".length());
        }
        if ((var3 = (class02477)class04206.NW.N(class018942 = class01894.L((String)string))) == null) {
            return DataResult.error(() -> "No component with type: '" + String.valueOf(class018942) + "'");
        }
        if (var3.u()) {
            return DataResult.error(() -> "'" + String.valueOf(class018942) + "' is not a persistent component");
        }
        return DataResult.success((Object)((Object)new class02473(var3, bl)));
    }, class024732 -> {
        class02477<?> var1 = class024732.y();
        class01894 class018942 = class04206.NW.y(var1);
        if (class018942 == null) {
            return DataResult.error(() -> "Unregistered component: " + String.valueOf(var1));
        }
        return DataResult.success((Object)(class024732.L() ? "!" + String.valueOf(class018942) : class018942.toString()));
    });

    public boolean L() {
        return this.removed;
    }

    class02473(class02477<?> class024772, boolean bl) {
        this.type = class024772;
        this.removed = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02473.class, "type;removed", "type", "removed"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02473.class, "type;removed", "type", "removed"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02473.class, "type;removed", "type", "removed"}, this);
    }

    public class02477<?> y() {
        return this.type;
    }

    public Codec<?> N() {
        return this.removed ? Codec.EMPTY.codec() : this.type.L();
    }
}

