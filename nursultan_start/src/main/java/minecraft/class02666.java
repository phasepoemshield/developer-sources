/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02477
 *  minecraft.class02480
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class02477;
import minecraft.class02480;
import org.jspecify.annotations.Nullable;

public interface class02666 {
    public <T> @Nullable T method_58694(class02477<? extends T> var1);

    default public <T> @Nullable class02480<T> u(class02477<T> class024772) {
        T t = this.method_58694(class024772);
        return t != null ? new class02480(class024772, t) : null;
    }

    default public <T> T a_(class02477<? extends T> class024772, T t) {
        T t2 = this.method_58694(class024772);
        return t2 != null ? t2 : t;
    }
}

