/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class05946
 *  minecraft.class06675
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Objects;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class04922;
import minecraft.class04938;
import minecraft.class05946;
import minecraft.class06675;
import org.jspecify.annotations.Nullable;

public class class04907<T>
extends class06675 {
    public static final class02362<class04247, class04907<?>> P = class02389.N((class05946)class04227.Nd).y(class04907::i, class04922::N);
    private final class04938 s;
    private final T T;
    private final class04922<T> b;

    protected class04907(class04922<T> class049222, T t, class04938 class049382) {
        super(class04907.N(class049222, t));
        this.b = class049222;
        this.s = class049382;
        this.T = t;
    }

    public boolean equals(Object object) {
        return this == object || object instanceof class04907 && Objects.equals(this.y(), ((class04907)((Object)object)).y());
    }

    public String toString() {
        return "Stat{name=" + this.y() + ", formatter=" + String.valueOf(this.s) + "}";
    }

    public int hashCode() {
        return this.y().hashCode();
    }

    public class04922<T> i() {
        return this.b;
    }

    public String N(int n) {
        return this.s.format(n);
    }

    private static String N(@Nullable class01894 class018942) {
        return class018942.toString().replace(':', '.');
    }

    public static <T> String N(class04922<T> class049222, T t) {
        return class04907.N(class04206.G.y(class049222)) + ":" + class04907.N(class049222.y().y(t));
    }

    public T R() {
        return this.T;
    }
}

