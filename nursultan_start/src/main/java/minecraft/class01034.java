/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class03322
 *  minecraft.class04336
 *  minecraft.class05474
 *  minecraft.class05974
 *  minecraft.class06057
 *  minecraft.class07209
 *  minecraft.class07321
 *  minecraft.class07361
 *  minecraft.class07830
 *  minecraft.class08088
 */
package minecraft;

import java.util.Optional;
import minecraft.class00500;
import minecraft.class03322;
import minecraft.class04336;
import minecraft.class05474;
import minecraft.class05974;
import minecraft.class06057;
import minecraft.class07209;
import minecraft.class07321;
import minecraft.class07361;
import minecraft.class07830;
import minecraft.class08088;

public class class01034
extends class06057 {
    private final class05974 N;
    private final class08088 y;
    private final Optional<class04336> L;

    public Optional<class04336> L() {
        return this.L;
    }

    public class01034(class05974 class059742, class08088 class080882, Optional<class04336> optional) {
        super(class080882, (class05474)class059742);
        this.N = class059742;
        this.y = class080882;
        this.L = optional;
    }

    public class08088 u() {
        return this.y;
    }

    public class05974 y() {
        return this.N;
    }

    public int N() {
        return this.N.method_31607();
    }

    public int N(class07830 class078302, int n, int n2) {
        return this.N.method_8624(class078302, n, n2);
    }

    public class00500 N(class07209 class072092) {
        return this.N.method_8320(class072092);
    }

    public class03322 N(class07321 class073212) {
        return ((class07361)this.N.method_8392(class073212.B, class073212.Z)).g();
    }
}

