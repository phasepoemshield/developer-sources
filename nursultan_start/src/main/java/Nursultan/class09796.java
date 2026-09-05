/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09938
 *  Nursultan.class09991
 */
package Nursultan;

import Nursultan.class09777;
import Nursultan.class09778;
import Nursultan.class09784;
import Nursultan.class09798;
import Nursultan.class09801;
import Nursultan.class09806;
import Nursultan.class09807;
import Nursultan.class09808;
import Nursultan.class09813;
import Nursultan.class09814;
import Nursultan.class09938;
import Nursultan.class09991;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public abstract class class09796<T extends class09796<T>>
extends class09807<T> {
    private final List<class09798> N = new ArrayList<class09798>();

    public T L(Consumer<class09777> consumer) {
        class09777 class097772 = class09778.u();
        if (consumer != null) {
            consumer.accept(class097772);
        }
        return this.y(class097772);
    }

    public T L(String string) {
        return this.y(class09778.N(string));
    }

    class09796() {
    }

    protected final List<class09798> B() {
        return List.copyOf(this.N);
    }

    public T i(Consumer<class09813> consumer) {
        class09813 class098132 = class09778.R();
        if (consumer != null) {
            consumer.accept(class098132);
        }
        return this.y(class098132);
    }

    public T i(String string) {
        return this.y(class09778.L(string));
    }

    public T u(String string) {
        return this.y(class09778.y(string));
    }

    public T u(Consumer<class09814> consumer) {
        class09814 class098142 = class09778.i();
        if (consumer != null) {
            consumer.accept(class098142);
        }
        return this.y(class098142);
    }

    public T y(Consumer<class09801> consumer) {
        class09801 class098012 = class09778.L();
        if (consumer != null) {
            consumer.accept(class098012);
        }
        return this.y(class098012);
    }

    public T y(class09991 class099912) {
        return this.N_3(class099912, null);
    }

    public T y(class09798 class097982) {
        if (class097982 != null) {
            this.N.add(class097982);
        }
        return (T)((class09796)this.R());
    }

    public T y(class09806 class098062) {
        if (class098062 != null) {
            this.N.add(class098062.i());
        }
        return (T)((class09796)this.R());
    }

    public T N_2(class09938 class099382) {
        return this.y(class09778.N_1(class099382));
    }

    public T N(Collection<? extends class09798> collection) {
        if (collection != null) {
            for (class09798 class097982 : collection) {
                this.y(class097982);
            }
        }
        return (T)((class09796)this.R());
    }

    public T N(class09806 class098062) {
        return this.y(class098062);
    }

    public T N(class09798 class097982) {
        return this.y(class097982);
    }

    private void N(Object object) {
        if (object instanceof class09798) {
            class09798 class097982 = (class09798)object;
            this.N.add(class097982);
            return;
        }
        if (object instanceof class09806) {
            class09806 class098062 = (class09806)object;
            this.N.add(class098062.i());
        }
    }

    public T N_3(class09991 class099912, Consumer<class09784> consumer) {
        return this.y(class09778.N(class099912, consumer));
    }

    public T N(Consumer<class09784> consumer) {
        return this.y(class09778.N(consumer));
    }

    public class09798 N(Object ... objectArray) {
        if (objectArray != null) {
            for (Object object : objectArray) {
                this.N(object);
            }
        }
        return this.i();
    }

    public <I> T N(List<I> list, class09808<I> class098082) {
        if (list == null || class098082 == null) {
            return (T)((class09796)this.R());
        }
        for (int i = 0; i < list.size(); ++i) {
            this.y(class098082.N(list.get(i), i));
        }
        return (T)((class09796)this.R());
    }

    public T N(String string, class09991 class099912) {
        return this.y(class09778.N(string, class099912));
    }

    public T N(boolean bl, Supplier<class09798> supplier) {
        if (bl && supplier != null) {
            this.y(supplier.get());
        }
        return (T)((class09796)this.R());
    }
}

