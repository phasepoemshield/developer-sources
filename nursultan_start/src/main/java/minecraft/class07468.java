/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03556
 *  minecraft.class04206
 *  minecraft.class04227
 *  minecraft.class04247
 *  minecraft.class05946
 *  minecraft.class06541
 *  minecraft.class07445
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03556;
import minecraft.class04206;
import minecraft.class04227;
import minecraft.class04247;
import minecraft.class05946;
import minecraft.class06541;
import minecraft.class07445;

public class class07468 {
    public static final Codec<class03556<class07468>> N = class04206.v.b();
    public static final class02362<class04247, class03556<class07468>> y = class02389.y((class05946)class04227.L);
    private final double L;
    private boolean u;
    private final String i;
    private class07445 R = class07445.field_51885;

    public String L() {
        return this.i;
    }

    protected class07468(String string, double d) {
        this.L = d;
        this.i = string;
    }

    public class06541 y(boolean bl) {
        return this.R.N(bl);
    }

    public boolean y() {
        return this.u;
    }

    public double N() {
        return this.L;
    }

    public class07468 N(class07445 class074452) {
        this.R = class074452;
        return this;
    }

    public double N(double d) {
        return d;
    }

    public class07468 N(boolean bl) {
        this.u = bl;
        return this;
    }
}

