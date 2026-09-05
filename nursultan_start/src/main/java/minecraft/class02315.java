/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02171
 *  minecraft.class02200
 *  minecraft.class08501
 */
package minecraft;

import java.util.List;
import minecraft.class02171;
import minecraft.class02200;
import minecraft.class02310;
import minecraft.class02312;
import minecraft.class02313;
import minecraft.class02325;
import minecraft.class02327;
import minecraft.class02328;
import minecraft.class02332;
import minecraft.class02340;
import minecraft.class02342;
import minecraft.class02352;
import minecraft.class02353;
import minecraft.class02358;
import minecraft.class08501;

public interface class02315<S> {
    public static <S> class02315<S> L() {
        return new class02310();
    }

    public static <S> class02315<S> L(class02315<S> class023152) {
        return new class02327<S>(class023152, false);
    }

    public static <S> class02315<S> u() {
        return new class02340();
    }

    public static <S> class02315<S> y(class02315<S> class023152) {
        return new class02327<S>(class023152, true);
    }

    public static <S, T> class02315<S> y(class08501<S, T> class085012, class02353<List<T>> class023532, class02315<S> class023152, int n) {
        return new class02313<S, T>(class085012, class023532, class023152, n, false);
    }

    public static <S, T> class02315<S> y(class08501<S, T> class085012, class02353<List<T>> class023532, class02315<S> class023152) {
        return class02315.y(class085012, class023532, class023152, 0);
    }

    @SafeVarargs
    public static <S> class02315<S> y(class02315<S> ... class02315Array) {
        return new class02342<S>(class02315Array);
    }

    public static <S, T> class02315<S> N(class08501<S, T> class085012, class02353<List<T>> class023532, class02315<S> class023152, int n) {
        return new class02313<S, T>(class085012, class023532, class023152, n, true);
    }

    public static <S> class02315<S> N(Object object) {
        return new class02312(object);
    }

    public static <S> class02315<S> N(class02315<S> class023152) {
        return new class02171(class023152);
    }

    @SafeVarargs
    public static <S> class02315<S> N(class02315<S> ... class02315Array) {
        return new class02200((class02315[])class02315Array);
    }

    public static <S, T> class02315<S> N(class02353<T> class023532, T t) {
        return new class02352(class023532, t);
    }

    public boolean N(class02325<S> var1, class02332 var2, class02328 var3);

    public static <S, T> class02315<S> N(class08501<S, T> class085012, class02353<List<T>> class023532) {
        return class02315.N(class085012, class023532, 0);
    }

    public static <S, T> class02315<S> N(class08501<S, T> class085012, class02353<List<T>> class023532, int n) {
        return new class02358<S, T>(class085012, class023532, n);
    }

    public static <S, T> class02315<S> N(class08501<S, T> class085012, class02353<List<T>> class023532, class02315<S> class023152) {
        return class02315.N(class085012, class023532, class023152, 0);
    }
}

