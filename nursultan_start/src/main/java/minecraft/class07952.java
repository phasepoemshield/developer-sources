/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00734
 *  minecraft.class01317
 *  minecraft.class01328
 *  minecraft.class04770
 *  minecraft.class04782
 *  minecraft.class07049
 *  minecraft.class07079
 *  minecraft.class07430
 *  minecraft.class07438
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class00734;
import minecraft.class01317;
import minecraft.class01328;
import minecraft.class04770;
import minecraft.class04782;
import minecraft.class07049;
import minecraft.class07079;
import minecraft.class07430;
import minecraft.class07438;
import minecraft.class07953;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

public class class07952<T extends class07438>
extends class07953 {
    private static final int Z = 10;
    protected final Class<T> N;
    protected final int y;
    protected @Nullable class07438 L;
    protected class01328 u;

    @Override
    public void L() {
        this.i.y(this.L);
        super.L();
    }

    protected void M() {
        class04782 class047822 = class07952.N((class07049)this.i);
        this.L = this.N == class08036.class || this.N == class04770.class ? class047822.N(this.U(), (class07438)this.i, this.i.method_23317(), this.i.method_23320(), this.i.method_23321()) : class047822.N(this.i.method_73183().N(this.N, this.N(this.Z()), class074382 -> true), this.U(), (class07438)this.i, this.i.method_23317(), this.i.method_23320(), this.i.method_23321());
    }

    public class07952(class07079 class070792, Class<T> clazz, boolean bl) {
        this(class070792, clazz, 10, bl, false, null);
    }

    public class07952(class07079 class070792, Class<T> clazz, int n, boolean bl, boolean bl2, @Nullable class01317 class013172) {
        super(class070792, bl, bl2);
        this.N = clazz;
        this.y = class07952.y((int)n);
        this.N_71(EnumSet.of(class07430.field_18408));
        this.u = class01328.N().N(this.Z()).N(class013172);
    }

    public class07952(class07079 class070792, Class<T> clazz, boolean bl, boolean bl2) {
        this(class070792, clazz, 10, bl, bl2, null);
    }

    public class07952(class07079 class070792, Class<T> clazz, boolean bl, class01317 class013172) {
        this(class070792, clazz, 10, bl, false, class013172);
    }

    private class01328 U() {
        return this.u.N(this.Z());
    }

    protected class00734 N(double d) {
        return this.i.method_5829().L(d, d, d);
    }

    public boolean N() {
        if (this.y > 0 && this.i.method_59922().y(this.y) != 0) {
            return false;
        }
        this.M();
        return this.L != null;
    }

    public void N(@Nullable class07438 class074382) {
        this.L = class074382;
    }
}

