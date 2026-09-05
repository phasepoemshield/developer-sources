/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00430
 *  minecraft.class00440
 *  minecraft.class00443
 *  minecraft.class00451
 *  minecraft.class00459
 *  minecraft.class00462
 *  minecraft.class00463
 *  minecraft.class00468
 *  minecraft.class00470
 *  minecraft.class02796
 *  minecraft.class05623
 *  minecraft.class06605
 *  minecraft.class07932
 */
package minecraft;

import java.util.concurrent.CompletableFuture;
import java.util.function.Supplier;
import minecraft.class00430;
import minecraft.class00440;
import minecraft.class00443;
import minecraft.class00451;
import minecraft.class00459;
import minecraft.class00462;
import minecraft.class00463;
import minecraft.class00468;
import minecraft.class00470;
import minecraft.class02796;
import minecraft.class05623;
import minecraft.class06605;
import minecraft.class07380;
import minecraft.class07381;
import minecraft.class07388;
import minecraft.class07396;
import minecraft.class07398;
import minecraft.class07409;
import minecraft.class07426;
import minecraft.class07932;

public class class07393 {
    private final class06605 N;
    private final class07409 y;
    private final class07388 L;
    private final class07396 u;
    private final class07380 i;
    private final class07426 R;
    private final class07381 M;
    private final class07398 B;
    private final class00440 Z;

    public class07396 L() {
        return this.u;
    }

    public class07398 M() {
        return this.B;
    }

    public class07393(class06605 class066052, class07409 class074092, class07388 class073882, class07396 class073962, class07380 class073802, class07426 class074262, class07381 class073812, class07398 class073982, class00440 class004402) {
        this.N = class066052;
        this.y = class074092;
        this.L = class073882;
        this.u = class073962;
        this.i = class073802;
        this.R = class074262;
        this.M = class073812;
        this.B = class073982;
        this.Z = class004402;
    }

    public class06605 B() {
        return this.N;
    }

    public class07426 i() {
        return this.R;
    }

    public class07380 u() {
        return this.i;
    }

    public class07388 y() {
        return this.L;
    }

    public CompletableFuture<Void> N(Runnable runnable) {
        return this.Z.N(runnable);
    }

    public <V> CompletableFuture<V> N(Supplier<V> supplier) {
        return this.Z.N(supplier);
    }

    public static class07393 N(class05623 class056232) {
        class07932 class079322 = new class07932();
        class00430 class004302 = new class00430(class056232, class079322);
        class00462 class004622 = new class00462((class02796)class056232, class079322);
        class00459 class004592 = new class00459(class056232, class079322);
        class00443 class004432 = new class00443(class056232, class079322);
        class00451 class004512 = new class00451((class02796)class056232, class079322);
        class00470 class004702 = new class00470(class056232, class079322);
        class00463 class004632 = new class00463(class056232, class079322);
        class00468 class004682 = new class00468(class056232);
        return new class07393(class056232.Nt(), (class07409)class004302, (class07388)class004622, (class07396)class004592, (class07380)class004432, (class07426)class004512, (class07381)class004702, (class07398)class004632, (class00440)class004682);
    }

    public class07409 N() {
        return this.y;
    }

    public class07381 R() {
        return this.M;
    }
}

