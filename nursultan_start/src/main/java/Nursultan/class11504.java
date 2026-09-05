/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class12018
 */
package Nursultan;

import Nursultan.class11536;
import Nursultan.class12018;
import java.util.function.Supplier;

public class class11504
extends class11536<Float> {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public boolean N_init;

    public Supplier<String> L() {
        this.b();
        return (Supplier)this.N_3;
    }

    public float M() {
        this.b();
        return ((Float)this.N_0).floatValue();
    }

    public float T() {
        this.b();
        return ((Float)this.N_2).floatValue();
    }

    public class11504(class12018 class120182, float f, float f2, float f3, float f4) {
        super(class120182, Float.valueOf(f));
        this.b();
        this.N_3 = () -> "";
        this.N_0 = Float.valueOf(f2);
        this.N_1 = Float.valueOf(f3);
        this.N_2 = Float.valueOf(f4);
    }

    private void b() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = Float.valueOf(0.0f);
            this.N_1 = Float.valueOf(0.0f);
            this.N_2 = Float.valueOf(0.0f);
        }
    }

    @Override
    public void N(Float f) {
        this.b();
        if (f.floatValue() < ((Float)this.N_0).floatValue() || f.floatValue() > ((Float)this.N_1).floatValue()) {
            throw new IllegalArgumentException(String.format("Value %f is out of range [%f, %f]", f, Float.valueOf(((Float)this.N_0).floatValue()), Float.valueOf(((Float)this.N_1).floatValue())));
        }
        super.N(f);
    }

    public class11504 N(Supplier<String> supplier) {
        this.b();
        this.N_3 = supplier == null ? () -> "" : supplier;
        return this;
    }

    public float R() {
        this.b();
        return ((Float)this.N_1).floatValue();
    }
}

