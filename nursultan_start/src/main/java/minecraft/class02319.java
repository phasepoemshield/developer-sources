/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02315;
import minecraft.class02324;
import minecraft.class02325;
import minecraft.class02328;
import minecraft.class02332;
import minecraft.class02341;
import org.jspecify.annotations.Nullable;

public final class class02319<S, T>
extends Record
implements class02324<S, T> {
    private final class02341<S, T> action;
    private final class02315<S> child;

    public class02319(class02341<S, T> class023412, class02315<S> class023152) {
        this.action = class023412;
        this.child = class023152;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02319.class, "action;child", "action", "child"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02319.class, "action;child", "action", "child"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02319.class, "action;child", "action", "child"}, this);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public @Nullable T y(class02325<S> class023252) {
        class02332 class023322 = class023252.N();
        class023322.N();
        try {
            if (this.child.N(class023252, class023322, class02328.N)) {
                T t = this.action.run(class023252);
                return t;
            }
            T t = null;
            return t;
        }
        finally {
            class023322.y();
        }
    }

    public class02315<S> y() {
        return this.child;
    }

    public class02341<S, T> N() {
        return this.action;
    }
}

