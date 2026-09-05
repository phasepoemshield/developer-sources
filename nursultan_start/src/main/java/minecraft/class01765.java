/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01762;
import org.jspecify.annotations.Nullable;

public interface class01765 {
    public boolean L();

    default public void M() {
        this.N(0);
    }

    public void i();

    public void u();

    default public int y(int n) {
        int n2 = this.N() + n;
        this.N(n2);
        return n2;
    }

    public @Nullable class00392 y();

    public void N(@Nullable class01762 var1);

    public void N(@Nullable class00392 var1);

    public int N();

    public void N(int var1);

    default public int R() {
        return this.y(1);
    }
}

