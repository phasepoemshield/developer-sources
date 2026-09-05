/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00667
 *  minecraft.class01894
 *  minecraft.class02362
 *  minecraft.class02897
 *  minecraft.class04248
 *  minecraft.class04911
 *  minecraft.class07280
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00381;
import minecraft.class00667;
import minecraft.class01894;
import minecraft.class02362;
import minecraft.class02897;
import minecraft.class04248;
import minecraft.class04911;
import minecraft.class07280;
import org.jspecify.annotations.Nullable;

public class class08090
implements class00381<class07280> {
    public static final class02362<class00667, class08090> N = class00381.N(class08090::N, class08090::new);
    private static final int y = 1;
    private static final int L = 2;
    private final @Nullable class01894 u;
    private final @Nullable class04911 i;

    public class08090(@Nullable class01894 class018942, @Nullable class04911 class049112) {
        this.u = class018942;
        this.i = class049112;
    }

    private class08090(class00667 class006672) {
        byte by = class006672.readByte();
        this.i = (by & 1) > 0 ? (class04911)class006672.y(class04911.class) : null;
        this.u = (by & 2) > 0 ? class006672.T() : null;
    }

    public @Nullable class04911 y() {
        return this.i;
    }

    public void method_65081(class07280 class072802) {
        class072802.N(this);
    }

    public @Nullable class01894 N() {
        return this.u;
    }

    private void N(class00667 class006672) {
        if (this.i != null) {
            if (this.u != null) {
                class006672.writeByte(3);
                class006672.N((Enum)this.i);
                class006672.N(this.u);
            } else {
                class006672.writeByte(1);
                class006672.N((Enum)this.i);
            }
        } else if (this.u != null) {
            class006672.writeByte(2);
            class006672.N(this.u);
        } else {
            class006672.writeByte(0);
        }
    }

    public class02897<class08090> method_65080() {
        return class04248.yu;
    }
}

