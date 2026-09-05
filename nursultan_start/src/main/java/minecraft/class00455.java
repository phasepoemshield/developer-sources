/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class02362
 *  minecraft.class04206
 *  minecraft.class04247
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Optional;
import minecraft.class00428;
import minecraft.class00442;
import minecraft.class00751;
import minecraft.class02362;
import minecraft.class04206;
import minecraft.class04247;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;

public class class00455<T> {
    public static final int N = 0;
    final @Nullable class02362<? super class04247, T> y;
    private final int L;

    public int L() {
        return this.L;
    }

    public class00455(@Nullable class02362<? super class04247, T> class023622, int n) {
        this.y = class023622;
        this.L = n;
    }

    public class00455(@Nullable class02362<? super class04247, T> class023622) {
        this(class023622, 0);
    }

    public String toString() {
        return class07536.N((class00751)class04206.R, (Object)this);
    }

    public @Nullable class02362<? super class04247, T> y() {
        return this.y;
    }

    public class00428<T> y(T t) {
        return new class00428<T>(this, t);
    }

    public class00442<T> N() {
        return new class00442(this, Optional.empty());
    }

    public class00442<T> N(@Nullable T t) {
        return new class00442<T>(this, Optional.ofNullable(t));
    }
}

