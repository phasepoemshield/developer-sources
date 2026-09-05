/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09322
 */
package Nursultan;

import Nursultan.class09322;
import Nursultan.class11169;
import Nursultan.class11193;
import Nursultan.class11208;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class class11172 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;

    public class11172 L() {
        ((List)this.N_1).add(class11208.N(null));
        return this;
    }

    public class11172 L(String string) {
        ((List)this.N_1).add(class11208.N(string, null));
        return this;
    }

    private void M() {
    }

    class11172(String string) {
        this.M();
        this.N_1 = new ArrayList();
        this.N_2 = "default.vert";
        this.N_0 = string;
    }

    private String B(String string) {
        String string2 = string.replace('\\', '/');
        return string2.startsWith((String)this.N_0) ? string2 : (String)this.N_0 + string2;
    }

    public class11172 y(String string) {
        this.N_2 = Objects.requireNonNull(string, "file");
        return this;
    }

    public class09322 y() {
        return this.N().N().N((List)this.N_1).y();
    }

    public class11172 N(String string, String string2) {
        return this.y(string).N(string2);
    }

    public class11172 N(Object object) {
        ((List)this.N_1).add(class11208.N(object));
        return this;
    }

    public class11172 N(class11169 class111692) {
        ((List)this.N_1).add(class11208.N(class111692));
        return this;
    }

    public class11193 N() {
        if ((String)this.N_3 == null || ((String)this.N_3).isBlank()) {
            throw new IllegalStateException("Fragment shader file was not set");
        }
        return new class11193(this.B((String)this.N_2), this.B((String)this.N_3));
    }

    public class11172 N(String string, Object object) {
        ((List)this.N_1).add(class11208.N(string, object));
        return this;
    }

    public class11172 N(String string, class11169 class111692) {
        ((List)this.N_1).add(class11208.N(string, class111692));
        return this;
    }

    public class11172 N(String string) {
        this.N_3 = Objects.requireNonNull(string, "file");
        return this;
    }
}

