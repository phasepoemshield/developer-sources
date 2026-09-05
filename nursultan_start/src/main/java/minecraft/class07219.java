/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Lifecycle
 *  minecraft.class00731
 *  minecraft.class00751
 *  minecraft.class01894
 *  minecraft.class02819
 *  minecraft.class03529
 *  minecraft.class04241
 *  minecraft.class05946
 *  minecraft.class06069
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Lifecycle;
import java.util.Optional;
import minecraft.class00731;
import minecraft.class00751;
import minecraft.class01894;
import minecraft.class02819;
import minecraft.class03529;
import minecraft.class04241;
import minecraft.class05946;
import minecraft.class06069;
import org.jspecify.annotations.Nullable;

public class class07219<T>
extends class00731<T>
implements class04241<T> {
    private final class01894 i;
    private class03529<T> R;

    public class07219(String string, class05946<? extends class00751<T>> class059462, Lifecycle lifecycle, boolean bl) {
        super(class059462, lifecycle, bl);
        this.i = class01894.N((String)string);
    }

    public class01894 y(T t) {
        class01894 class018942 = super.y(t);
        return class018942 == null ? this.i : class018942;
    }

    public Optional<T> y(@Nullable class01894 class018942) {
        return Optional.ofNullable(super.N(class018942));
    }

    public class01894 y() {
        return this.i;
    }

    public class03529<T> N(class05946<T> class059462, T t, class02819 class028192) {
        class03529 class035292 = super.N(class059462, t, class028192);
        if (this.i.equals((Object)class059462.N())) {
            this.R = class035292;
        }
        return class035292;
    }

    public Optional<class03529<T>> N(class06069 class060692) {
        return super.N(class060692).or(() -> Optional.of(this.R));
    }

    public T N(int n) {
        Object object = super.N(n);
        return (T)(object == null ? this.R.N() : object);
    }

    public T N(@Nullable class01894 class018942) {
        Object object = super.N(class018942);
        return (T)(object == null ? this.R.N() : object);
    }

    public int N(@Nullable T t) {
        int n = super.N(t);
        return n == -1 ? super.N(this.R.N()) : n;
    }

    public Optional<class03529<T>> N() {
        return Optional.ofNullable(this.R);
    }
}

