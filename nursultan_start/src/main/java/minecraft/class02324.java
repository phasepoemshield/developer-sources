/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class02315;
import minecraft.class02318;
import minecraft.class02319;
import minecraft.class02325;
import minecraft.class02341;
import org.jspecify.annotations.Nullable;

public interface class02324<S, T> {
    public @Nullable T y(class02325<S> var1);

    public static <S, T> class02324<S, T> N(class02315<S> class023152, class02341<S, T> class023412) {
        return new class02319<S, T>(class023412, class023152);
    }

    public static <S, T> class02324<S, T> N(class02315<S> class023152, class02318<S, T> class023182) {
        return new class02319<S, T>(class023182, class023152);
    }
}

