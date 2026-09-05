/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00494
 *  minecraft.class00500
 *  minecraft.class00515
 *  minecraft.class00891
 *  minecraft.class01020
 *  minecraft.class04206
 *  minecraft.class06092
 *  minecraft.class07185
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07290
 */
package minecraft;

import java.util.Arrays;
import java.util.Locale;
import minecraft.class00494;
import minecraft.class00500;
import minecraft.class00515;
import minecraft.class00891;
import minecraft.class01020;
import minecraft.class04206;
import minecraft.class06092;
import minecraft.class07185;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07290;

public final class class01369 {
    private static final class07211[] u = class07211.values();
    private static final int i = class01020.values().length;
    public final class00494 N;
    public final boolean y;
    private final boolean[] R;
    public final boolean L;

    class01369(class00500 class005002) {
        class00891 class008912 = class005002.i();
        this.N = class008912.y_4(class005002, (class07290)class00515.field_12294, class07209.field_10980, class06092.N());
        if (!this.N.method_1110() && class005002.l()) {
            throw new IllegalStateException(String.format(Locale.ROOT, "%s has a collision shape and an offset type, but is not marked as dynamicShape in its properties.", class04206.i.y((Object)class008912)));
        }
        this.y = Arrays.stream(class07185.values()).anyMatch(class071852 -> this.N.method_1091(class071852) < 0.0 || this.N.method_1105(class071852) > 1.0);
        this.R = new boolean[u.length * i];
        for (class07211 class072112 : u) {
            for (class01020 class010202 : class01020.values()) {
                this.R[class01369.y((class07211)class072112, (class01020)class010202)] = class010202.N(class005002, (class07290)class00515.field_12294, class07209.field_10980, class072112);
            }
        }
        this.L = class00891.N((class00494)class005002.M((class07290)class00515.field_12294, class07209.field_10980));
    }

    private static int y(class07211 class072112, class01020 class010202) {
        return class072112.ordinal() * i + class010202.ordinal();
    }

    public boolean N(class07211 class072112, class01020 class010202) {
        return this.R[class01369.y(class072112, class010202)];
    }
}

