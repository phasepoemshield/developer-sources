/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  minecraft.class03766
 *  minecraft.class03767
 */
package minecraft;

import java.util.LinkedHashMap;
import java.util.Map;
import minecraft.class01894;
import minecraft.class02957;
import minecraft.class02981;
import minecraft.class03766;
import minecraft.class03767;

public class class02989 {
    private final class03766 N;
    private int y;
    private final Map<class01894, class02957> L = new LinkedHashMap<class01894, class02957>();

    public class02989(String string) {
        this.N = new class03766(string);
    }

    public class02981 N() {
        class03767 class037672 = class03767.N((class03766)this.N, this.L.values());
        return new class02981(this.N, class037672, Map.copyOf(this.L));
    }

    public class02957 N(class01894 class018942) {
        class02957 class029572;
        if (this.y >= 64) {
            throw new IllegalStateException("Too many feature flags");
        }
        if (this.L.put(class018942, class029572 = new class02957(this.N, this.y++)) != null) {
            throw new IllegalStateException("Duplicate feature flag " + String.valueOf(class018942));
        }
        return class029572;
    }

    public class02957 N(String string) {
        return this.N(class01894.y((String)string));
    }
}

