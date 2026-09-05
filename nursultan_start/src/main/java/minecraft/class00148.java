/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03556
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class05946
 *  minecraft.class06581
 *  minecraft.class06584
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class00146;
import minecraft.class00147;
import minecraft.class00176;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03556;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class05946;
import minecraft.class06581;
import minecraft.class06584;

public final class class00148
extends Record
implements class00176 {
    private final class03556<class06581> item;
    private final int count;
    private final class00146 components;
    public static final class02362<class04247, class00148> L = class02362.N((class02362)class02389.y((class05946)class04227.F), class00148::N, (class02362)class02389.B, class00148::y, class00146.N, class00148::L, class00148::new);

    public class00146 L() {
        return this.components;
    }

    public class00148(class03556<class06581> class035562, int n, class00146 class001462) {
        this.item = class035562;
        this.count = n;
        this.components = class001462;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00148.class, "item;count;components", "item", "count", "components"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00148.class, "item;count;components", "item", "count", "components"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00148.class, "item;count;components", "item", "count", "components"}, this);
    }

    public int y() {
        return this.count;
    }

    @Override
    public boolean N(class06584 class065842, class00147 class001472) {
        if (this.count != class065842.c()) {
            return false;
        }
        if (!this.item.equals((Object)class065842.Z())) {
            return false;
        }
        return this.components.y(class065842.u(), class001472);
    }

    public class03556<class06581> N() {
        return this.item;
    }
}

