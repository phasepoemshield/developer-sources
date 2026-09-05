/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class12018
 */
package Nursultan;

import Nursultan.class11494;
import Nursultan.class11536;
import Nursultan.class12018;
import java.util.function.Supplier;

public class class11525
extends class11536<class11494> {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public boolean N_init;

    public Supplier<String> L() {
        this.v();
        return (Supplier)this.N_2;
    }

    public class11494 M() {
        this.v();
        return (class11494)this.N_0;
    }

    public class11525(class12018 class120182, class11494 class114942, class11494 class114943, float f) {
        super(class120182, class11525.N(class114942, class114943));
        this.v();
        this.N_2 = () -> "";
        class114942.y();
        this.N_0 = class114942;
        this.N_1 = Float.valueOf(f);
    }

    private void v() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_1 = Float.valueOf(0.0f);
        }
    }

    @Override
    public void N(class11494 class114942) {
        this.v();
        super.N(class11525.N((class11494)this.N_0, class114942));
    }

    public class11525 N(Supplier<String> supplier) {
        this.v();
        this.N_2 = supplier == null ? () -> "" : supplier;
        return this;
    }

    private static class11494 N(class11494 class114942, class11494 class114943) {
        float f = Math.clamp((float)class114943.N(), (float)class114942.N(), (float)class114942.L());
        float f2 = Math.clamp((float)class114943.L(), (float)class114942.N(), (float)class114942.L());
        class11494 class114944 = new class11494(f, f2);
        class114944.N(class114942);
        return class114944;
    }

    public float R() {
        this.v();
        return ((Float)this.N_1).floatValue();
    }
}

