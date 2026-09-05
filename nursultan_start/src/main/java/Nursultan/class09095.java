/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11175
 *  Nursultan.class11181
 *  Nursultan.class11199
 */
package Nursultan;

import Nursultan.class09064;
import Nursultan.class11175;
import Nursultan.class11181;
import Nursultan.class11199;
import java.util.function.BooleanSupplier;
import java.util.function.IntSupplier;

public class class09095 {
    public Object N_0;
    public Object N_1;
    public Object y_0;
    public Object y_1;
    public Object y_2;
    public Object y_3;
    public Object y_4;
    public boolean y_init;
    public Object L_0;
    public Object L_1;
    public Object L_2;
    public Object L_3;
    public boolean L_init;

    public class09095 L(boolean bl) {
        this.L_1 = bl;
        return this;
    }

    public class09095 L(class11175 class111752) {
        this.y_0 = class111752;
        return this;
    }

    public class09095() {
        this.i();
    }

    public String toString() {
        return "FbConfig.Builder(widthSupplier=" + String.valueOf((IntSupplier)this.N_0) + ", heightSupplier=" + String.valueOf((IntSupplier)this.N_1) + ", pixelFormat=" + String.valueOf((class11181)this.L_0) + ", useDepth=" + (Boolean)this.L_1 + ", minFilter=" + String.valueOf((class11199)this.L_2) + ", magFilter=" + String.valueOf((class11199)this.L_3) + ", wrapS=" + String.valueOf((class11175)this.y_0) + ", wrapT=" + String.valueOf((class11175)this.y_1) + ", mipmapped=" + (Boolean)this.y_2 + ", label=" + (String)this.y_3 + ", textureDeleteBlocked=" + String.valueOf((BooleanSupplier)this.y_4) + ")";
    }

    private void i() {
        if (!this.L_init) {
            this.L_init = true;
            this.L_1 = false;
        }
        if (!this.y_init) {
            this.y_init = true;
            this.y_2 = false;
        }
    }

    public class09095 y(class11199 class111992) {
        this.L_3 = class111992;
        return this;
    }

    public class09095 y(class11181 class111812) {
        this.L_0 = class111812;
        return this;
    }

    public class09095 y(boolean bl) {
        return this.L(bl);
    }

    public class09095 y(IntSupplier intSupplier) {
        this.N_1 = intSupplier;
        return this;
    }

    public class09095 y(class11175 class111752) {
        return this.N(class111752, class111752);
    }

    public class09095 N(class11175 class111752) {
        this.y_1 = class111752;
        return this;
    }

    public class09095 N(class11199 class111992) {
        this.L_2 = class111992;
        return this;
    }

    public class09095 N(String string) {
        this.y_3 = string;
        return this;
    }

    public class09095 N(boolean bl) {
        this.y_2 = bl;
        return this;
    }

    public class09095 N(IntSupplier intSupplier) {
        this.N_0 = intSupplier;
        return this;
    }

    public class09064 N() {
        return new class09064((IntSupplier)this.N_0, (IntSupplier)this.N_1, (class11181)this.L_0, (Boolean)this.L_1, (class11199)this.L_2, (class11199)this.L_3, (class11175)this.y_0, (class11175)this.y_1, (Boolean)this.y_2, (String)this.y_3, (BooleanSupplier)this.y_4);
    }

    public class09095 N(BooleanSupplier booleanSupplier) {
        this.y_4 = booleanSupplier;
        return this;
    }

    public class09095 N(class11199 class111992, class11199 class111993) {
        return this.N(class111992).y(class111993);
    }

    public class09095 N(class11175 class111752, class11175 class111753) {
        return this.L(class111752).N(class111753);
    }

    public class09095 N(class11181 class111812) {
        this.L_0 = class111812;
        return this;
    }
}

