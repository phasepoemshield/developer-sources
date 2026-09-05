/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class09783;
import Nursultan.class09785;
import Nursultan.class09788;
import Nursultan.class09798;
import Nursultan.class09804;
import Nursultan.class09805;
import Nursultan.class09809;
import Nursultan.class09819;
import Nursultan.class09874;
import Nursultan.class09879;
import java.util.Objects;
import java.util.function.Supplier;

final class class09845
implements class09809 {
    private final class09879 N;
    private final class09874 y;

    class09845(class09879 class098792, class09874 class098742) {
        this.N = Objects.requireNonNull(class098792, "stateStore");
        this.y = Objects.requireNonNull(class098742, "path");
    }

    @Override
    public <T extends class09819> T u(String string, Supplier<T> supplier) {
        return this.y(string, supplier, class09783.WHILE_MOUNTED);
    }

    @Override
    public <T> class09785<T> y(String string, T t) {
        return this.y(string, () -> t);
    }

    @Override
    public <T> class09785<T> y(String string, Supplier<T> supplier) {
        return this.N.N(string, supplier);
    }

    @Override
    public <T extends class09819> T y(String string, Supplier<T> supplier, class09783 class097832) {
        return this.N.y(this.y, string, supplier, class097832);
    }

    @Override
    public <T> class09785<T> N(String string, T t) {
        return this.N(string, t, class09783.WHILE_MOUNTED);
    }

    public <C> class09798 N(String string, class09788<C> class097882, C c) {
        return this.N.N(this.y, string, class097882, c);
    }

    @Override
    public void N(String string) {
        this.N.N(this.y, string);
    }

    @Override
    public <T> class09798 N(class09804<T> class098042, T t, Supplier<class09798> supplier) {
        return this.N.N(class098042, t, supplier);
    }

    @Override
    public <T> class09785<T> N(String string, Supplier<T> supplier, class09783 class097832) {
        return this.N.N(this.y, string, supplier, class097832);
    }

    @Override
    public <T> T N(class09804<T> class098042) {
        return this.N.N(class098042);
    }

    @Override
    public <T> class09785<T> N(String string, Supplier<T> supplier) {
        return this.N(string, (T)supplier, class09783.WHILE_MOUNTED);
    }

    @Override
    public <T> T N(String string, Supplier<T> supplier, class09805<T> class098052) {
        return this.N.N(this.y, string, supplier, class098052);
    }

    @Override
    public <T> class09785<T> N(String string, T t, class09783 class097832) {
        return this.N(string, (T)((Supplier<Object>)() -> t), class097832);
    }
}

