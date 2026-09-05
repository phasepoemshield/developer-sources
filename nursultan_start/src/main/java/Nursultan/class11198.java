/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09322
 *  Nursultan.class09337
 */
package Nursultan;

import Nursultan.class09322;
import Nursultan.class09337;
import Nursultan.class11167;
import Nursultan.class11169;
import Nursultan.class11193;
import Nursultan.class11208;
import java.util.ArrayList;
import java.util.List;

public class class11198 {
    public Object N_0;
    public Object N_1;

    private void L() {
    }

    class11198(class11193 class111932) {
        this.L();
        this.N_1 = new ArrayList();
        this.N_0 = class111932;
    }

    public class09322 y() {
        class11167 class111672 = new class11167((List)this.N_1);
        return new class09322((String)((class11193)this.N_0).y_0, (String)((class11193)this.N_0).y_1, (class09337)class111672, "template:" + Integer.toHexString(System.identityHashCode(class111672)));
    }

    public class11198 N() {
        ((List)this.N_1).add(class11208.N(null));
        return this;
    }

    public class11198 N(Object object) {
        ((List)this.N_1).add(class11208.N(object));
        return this;
    }

    public class11198 N(class11169 class111692) {
        ((List)this.N_1).add(class11208.N(class111692));
        return this;
    }

    class11198 N(List<class11208> list) {
        ((List)this.N_1).addAll(list);
        return this;
    }

    public class11198 N(String string, class11169 class111692) {
        ((List)this.N_1).add(class11208.N(string, class111692));
        return this;
    }

    public class11198 N(String string, Object object) {
        ((List)this.N_1).add(class11208.N(string, object));
        return this;
    }

    public class11198 N(String string) {
        ((List)this.N_1).add(class11208.N(string, null));
        return this;
    }
}

