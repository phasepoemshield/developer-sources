/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09087
 */
package Nursultan;

import Nursultan.class09087;
import Nursultan.class11213;

public class class11201 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public boolean N_init;

    private void L() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_1 = 0;
            this.N_2 = 0;
        }
    }

    public class11201() {
        this.L();
    }

    public String toString() {
        return "Mesh.MeshBuilder(format=" + String.valueOf((class09087)this.N_0) + ", initialVertexBytes=" + (Integer)this.N_1 + ", initialIndices=" + (Integer)this.N_2 + ")";
    }

    public class11201 y(int n) {
        this.N_2 = n;
        return this;
    }

    public class11201 N(class09087 class090872) {
        this.N_0 = class090872;
        return this;
    }

    public class11213 N() {
        return new class11213((class09087)this.N_0, (Integer)this.N_1, (Integer)this.N_2);
    }

    public class11201 N(int n) {
        this.N_1 = n;
        return this;
    }
}

