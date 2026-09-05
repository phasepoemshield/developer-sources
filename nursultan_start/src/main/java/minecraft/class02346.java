/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import minecraft.class02350;

public interface class02346<S> {
    public void N(int var1, class02350<S> var2, Object var3);

    default public void N(int n, Object object) {
        this.N(n, class02350.N(), object);
    }

    public void N(int var1);
}

