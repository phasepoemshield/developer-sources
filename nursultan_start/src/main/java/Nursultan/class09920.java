/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09770
 *  Nursultan.class09781
 *  Nursultan.class10021
 */
package Nursultan;

import Nursultan.class09770;
import Nursultan.class09781;
import Nursultan.class09936;
import Nursultan.class09972;
import Nursultan.class10021;
import java.util.Objects;

public final class class09920 {
    private final class09972 N;

    class09920(class09781 class097812) {
        this.N = new class09972(Objects.requireNonNull(class097812, "context"));
    }

    public class09936 N(class10021 class100212, float f, float f2, class09770 class097702, boolean bl) {
        return this.N.N(class100212, f, f2, class097702, bl);
    }

    public static class09920 N(class09781 class097812) {
        class09781 class097813 = Objects.requireNonNull(class097812, "context");
        return (class09920)class097813.N(class09920.class).orElseGet(() -> {
            class09920 class099202 = new class09920(class097813);
            class097813.N(class09920.class, (Object)class099202);
            return class099202;
        });
    }

    public class09936 N(class10021 class100212, float f, float f2) {
        return this.N.N(class100212, f, f2);
    }
}

