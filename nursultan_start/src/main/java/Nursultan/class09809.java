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
import Nursultan.class09819;
import java.util.Objects;
import java.util.function.Supplier;

public interface class09809 {
    default public <T> T L(String string, Supplier<T> supplier) {
        return (T)this.N(string, supplier, (T object, T object2) -> !Objects.equals(object, object2));
    }

    default public <T extends class09819> T u(String string, Supplier<T> supplier) {
        return this.y(string, supplier, class09783.WHILE_MOUNTED);
    }

    public <T> class09785<T> y(String var1, T var2);

    public <T> class09785<T> y(String var1, Supplier<T> var2);

    default public <T extends class09819> T y(String string, Supplier<T> supplier, class09783 class097832) {
        throw new UnsupportedOperationException("Ticker state is not supported by this UiScope");
    }

    public <T> T N(String var1, Supplier<T> var2, class09805<T> var3);

    public void N(String var1);

    public <P> class09798 N(String var1, class09788<P> var2, P var3);

    public <T> class09785<T> N(String var1, T var2);

    public <T> class09785<T> N(String var1, T var2, class09783 var3);

    public <T> class09785<T> N(String var1, Supplier<T> var2);

    public <T> class09785<T> N(String var1, Supplier<T> var2, class09783 var3);

    public <T> T N(class09804<T> var1);

    public <T> class09798 N(class09804<T> var1, T var2, Supplier<class09798> var3);
}

