/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import java.util.Objects;

public class class11494 {
    public Object N_0;
    public Object N_1;
    public boolean N_init;

    public float L() {
        return ((Float)this.N_1).floatValue();
    }

    public class11494(float f, float f2) {
        this.Z();
        this.N_0 = Float.valueOf(f);
        this.N_1 = Float.valueOf(f2);
        this.y();
    }

    public boolean equals(Object object) {
        if (!(object instanceof class11494)) {
            return false;
        }
        class11494 class114942 = (class11494)object;
        return Float.compare(((Float)this.N_0).floatValue(), ((Float)class114942.N_0).floatValue()) == 0 && Float.compare(((Float)this.N_1).floatValue(), ((Float)class114942.N_1).floatValue()) == 0;
    }

    public int hashCode() {
        return Objects.hash(Float.valueOf(((Float)this.N_0).floatValue()), Float.valueOf(((Float)this.N_1).floatValue()));
    }

    private void Z() {
        if (!this.N_init) {
            this.N_init = true;
            this.N_0 = Float.valueOf(0.0f);
            this.N_1 = Float.valueOf(0.0f);
        }
    }

    public class11494 y(float f) {
        this.N_1 = Float.valueOf(f);
        return this;
    }

    public void y() {
        if (((Float)this.N_0).floatValue() > ((Float)this.N_1).floatValue()) {
            throw new IllegalArgumentException(String.format("Invalid range: min (%f) cannot be greater than max (%f)", Float.valueOf(((Float)this.N_0).floatValue()), Float.valueOf(((Float)this.N_1).floatValue())));
        }
    }

    public void N(class11494 class114942) {
        this.y();
        if (((Float)this.N_0).floatValue() < ((Float)class114942.N_0).floatValue() || ((Float)this.N_1).floatValue() > ((Float)class114942.N_1).floatValue()) {
            throw new IllegalArgumentException(String.format("The range [%f, %f] is outside the valid range [%f, %f]", Float.valueOf(((Float)this.N_0).floatValue()), Float.valueOf(((Float)this.N_1).floatValue()), Float.valueOf(((Float)class114942.N_0).floatValue()), Float.valueOf(((Float)class114942.N_1).floatValue())));
        }
    }

    public float N() {
        return ((Float)this.N_0).floatValue();
    }

    public class11494 N(float f) {
        this.N_0 = Float.valueOf(f);
        return this;
    }
}

