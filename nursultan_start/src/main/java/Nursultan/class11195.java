/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import Nursultan.class11174;
import Nursultan.class11204;
import Nursultan.class11213;

public class class11195 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public boolean N_init;

    private void L() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_2 = 0;
        }
    }

    public class11195() {
        this.L();
    }

    public String toString() {
        return "RenderType.RenderTypeBuilder(pipeline=" + String.valueOf((class11204)this.N_0) + ", mesh=" + String.valueOf((class11213)this.N_1) + ", verticesPerInstance=" + (Integer)this.N_2 + ")";
    }

    public class11195 N(class11204 class112042) {
        this.N_0 = class112042;
        return this;
    }

    public class11195 N(int n) {
        this.N_2 = n;
        return this;
    }

    public class11174 N() {
        return new class11174((class11204)this.N_0, (class11213)this.N_1, (Integer)this.N_2);
    }

    public class11195 N(class11213 class112132) {
        this.N_1 = class112132;
        return this;
    }
}

