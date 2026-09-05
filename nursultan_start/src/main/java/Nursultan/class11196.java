/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09322
 *  Nursultan.class12036
 */
package Nursultan;

import Nursultan.class09322;
import Nursultan.class11204;
import Nursultan.class12036;

public class class11196 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public Object N_4;
    public boolean N_init;

    private void L() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_1 = false;
            this.N_3 = false;
            this.N_4 = 0;
        }
    }

    public class11196() {
        this.L();
    }

    public String toString() {
        return "Pipeline.PipelineBuilder(shader=" + String.valueOf((class09322)this.N_0) + ", state$value=" + String.valueOf((class12036)this.N_2) + ", drawMode$value=" + (Integer)this.N_4 + ")";
    }

    public class11196 N(class09322 class093222) {
        this.N_0 = class093222;
        return this;
    }

    public class11196 N(int n) {
        this.N_4 = n;
        this.N_3 = true;
        return this;
    }

    public class11204 N() {
        class12036 class120362 = (class12036)this.N_2;
        if (!((Boolean)this.N_1).booleanValue()) {
            class120362 = class11204.z();
        }
        int n = (Integer)this.N_4;
        if (!((Boolean)this.N_3).booleanValue()) {
            n = class11204.U();
        }
        return new class11204((class09322)this.N_0, class120362, n);
    }

    public class11196 N(class12036 class120362) {
        this.N_2 = class120362;
        this.N_1 = true;
        return this;
    }
}

