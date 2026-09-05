/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09904
 *  Nursultan.class09938
 *  Nursultan.class09991
 *  Nursultan.class09992
 *  Nursultan.class10049
 */
package Nursultan;

import Nursultan.class09793;
import Nursultan.class09798;
import Nursultan.class09806;
import Nursultan.class09816;
import Nursultan.class09836;
import Nursultan.class09867;
import Nursultan.class09876;
import Nursultan.class09904;
import Nursultan.class09938;
import Nursultan.class09991;
import Nursultan.class09992;
import Nursultan.class10049;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.UnaryOperator;

public abstract class class09807<T extends class09807<T>>
implements class09806 {
    private String N = null;
    private String y = null;
    private class09991 L = class09991.N;
    private final List<class09816> u = new ArrayList<class09816>();
    private final List<class09992> i = new ArrayList<class09992>();
    private class09793<class09904> R;

    protected final List<class09992> L() {
        return List.copyOf(this.i);
    }

    class09807() {
    }

    @Override
    public abstract class09798 i();

    protected final class09991 u() {
        return this.L;
    }

    protected final List<class09816> y() {
        return List.copyOf(this.u);
    }

    T y(String string) {
        this.y = string;
        return this.R();
    }

    public T N_1(class09836 class098362) {
        return this.N(class09867.CLICK, class098362);
    }

    protected final String N() {
        return this.N;
    }

    public T N(class09867 class098672, class09836 class098362, class09876 class098762) {
        if (class098672 == null || class098362 == null) {
            return this.R();
        }
        this.u.add(new class09816(class098672, class098362, class098762));
        return this.R();
    }

    protected final class09798 N(class10049 class100492, List<class09798> list, String string, String string2, String string3, class09938 class099382) {
        return new class09798(this.N, this.y, class100492, list, this.y(), this.L(), this.L, string, string2, string3, class099382, this.R);
    }

    private static boolean N(List<class09992> list, class09992 class099922) {
        Iterator<class09992> iterator = list.iterator();
        while (iterator.hasNext()) {
            if (iterator.next() != class099922) continue;
            return true;
        }
        return false;
    }

    public T N(class09991 class099912, class09991 ... class09991Array) {
        if (class09991Array == null || class09991Array.length == 0) {
            return this.N(class099912);
        }
        class09991[] class09991Array2 = new class09991[class09991Array.length + 1];
        class09991Array2[0] = class099912;
        System.arraycopy(class09991Array, 0, class09991Array2, 1, class09991Array.length);
        return this.N(class09991.N((class09991[])class09991Array2));
    }

    public T N(class09991 class099912) {
        this.L = class099912 == null ? class09991.N : class099912;
        return this.R();
    }

    public T N(class09793<class09904> class097932) {
        this.R = class097932;
        return this.R();
    }

    public T N(String string) {
        this.N = string;
        return this.R();
    }

    public T N(class09867 class098672, class09836 class098362) {
        return this.N(class098672, class098362, class09876.N);
    }

    public T N(class09992 ... class09992Array) {
        if (class09992Array == null || class09992Array.length == 0) {
            return this.R();
        }
        for (class09992 class099922 : class09992Array) {
            this.N(class099922);
        }
        return this.R();
    }

    public T N(class09992 class099922) {
        if (class099922 != null && !class09807.N(this.i, class099922)) {
            this.i.add(class099922);
        }
        return this.R();
    }

    public T N_2(UnaryOperator<class09991> unaryOperator) {
        if (unaryOperator != null) {
            class09991 class099912 = (class09991)unaryOperator.apply(this.L);
            this.N(class099912);
        }
        return this.R();
    }

    protected abstract T R();
}

