/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02477
 *  minecraft.class02480
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.stream.Stream;
import minecraft.class02477;
import minecraft.class02480;
import minecraft.class02666;
import minecraft.class02695;
import org.jspecify.annotations.Nullable;

public interface class02700
extends class02666 {
    default public boolean L(class02477<?> class024772) {
        return this.y().N(class024772);
    }

    @Override
    default public <T> @Nullable T method_58694(class02477<? extends T> class024772) {
        return this.y().method_58694(class024772);
    }

    public class02695 y();

    default public <T> Stream<T> N(Class<? extends T> clazz) {
        return this.y().L().map(class02480::y).filter(object -> clazz.isAssignableFrom(object.getClass())).map(object -> object);
    }

    @Override
    default public <T> T a_(class02477<? extends T> class024772, T t) {
        return this.y().a_(class024772, t);
    }
}

