/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10882
 *  com.mojang.serialization.Codec
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02362
 *  minecraft.class04247
 *  minecraft.class06584
 */
package minecraft;

import Nursultan.class10882;
import com.mojang.serialization.Codec;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02362;
import minecraft.class04247;
import minecraft.class06584;

public final class class08197
extends Record {
    private final class06584 convertInto;
    public static final Codec<class08197> N = class06584.y.xmap(class08197::new, class08197::N);
    public static final class02362<class04247, class08197> y = class02362.N((class02362)class06584.z, class08197::N, class08197::new);

    public class08197(class06584 class065842) {
        this.convertInto = class065842;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || ((Object)((Object)this)).getClass() != object.getClass()) {
            return false;
        }
        class08197 class081972 = (class08197)((Object)object);
        return class06584.N((class06584)this.convertInto, (class06584)class081972.convertInto);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08197.class, "convertInto", "convertInto"}, this);
    }

    public int hashCode() {
        return class06584.y((class06584)this.convertInto);
    }

    public class06584 N() {
        return this.convertInto;
    }

    public class06584 N(class06584 class065842, int n, boolean bl, class10882 class108822) {
        if (bl) {
            return class065842;
        }
        if (class065842.c() >= n) {
            return class065842;
        }
        class06584 class065843 = this.convertInto.t();
        if (class065842.R()) {
            return class065843;
        }
        class108822.apply(class065843);
        return class065842;
    }
}

