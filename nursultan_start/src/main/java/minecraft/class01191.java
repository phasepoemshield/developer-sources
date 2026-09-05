/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00500
 *  minecraft.class04887
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07218
 */
package minecraft;

import java.util.Optional;
import java.util.OptionalInt;
import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class01160;
import minecraft.class01168;
import minecraft.class01179;
import minecraft.class04887;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07218;

public abstract class class01191 {
    public static class01191 L(int n) {
        return new class01160(n, true);
    }

    public abstract OptionalInt L();

    public abstract OptionalInt u();

    public static class01191 u(int n) {
        return new class01160(n - 1, true);
    }

    public abstract OptionalInt y();

    public static class01168 y(int n, int n2) {
        return new class01168(n, n2);
    }

    public class01191 y(OptionalInt optionalInt) {
        return class01191.N(this.L(), optionalInt);
    }

    public static class01191 y(int n) {
        return new class01160(n + 1, false);
    }

    private static OptionalInt N(class04887 class048872, int n, Predicate<class00500> predicate, Predicate<class00500> predicate2, class07218 class072182, int n2, class07211 class072112) {
        class072182.method_10099(n2);
        for (int i = 1; i < n && class048872.method_16358((class07209)class072182, predicate); ++i) {
            class072182.N(class072112);
        }
        return class048872.method_16358((class07209)class072182, predicate2) ? OptionalInt.of(class072182.method_10264()) : OptionalInt.empty();
    }

    public class01191 N(OptionalInt optionalInt) {
        return class01191.N(optionalInt, this.y());
    }

    public static Optional<class01191> N(class04887 class048872, class07209 class072092, int n, Predicate<class00500> predicate, Predicate<class00500> predicate2) {
        class07218 class072182 = class072092.method_25503();
        if (!class048872.method_16358(class072092, predicate)) {
            return Optional.empty();
        }
        int n2 = class072092.method_10264();
        OptionalInt optionalInt = class01191.N(class048872, n, predicate, predicate2, class072182, n2, class07211.field_11036);
        return Optional.of(class01191.N(class01191.N(class048872, n, predicate, predicate2, class072182, n2, class07211.field_11033), optionalInt));
    }

    public static class01168 N(int n, int n2) {
        return new class01168(n - 1, n2 + 1);
    }

    public static class01191 N(int n) {
        return new class01160(n, false);
    }

    public static class01191 N() {
        return class01179.N;
    }

    public static class01191 N(OptionalInt optionalInt, OptionalInt optionalInt2) {
        if (optionalInt.isPresent() && optionalInt2.isPresent()) {
            return class01191.y(optionalInt.getAsInt(), optionalInt2.getAsInt());
        }
        if (optionalInt.isPresent()) {
            return class01191.L(optionalInt.getAsInt());
        }
        if (optionalInt2.isPresent()) {
            return class01191.N(optionalInt2.getAsInt());
        }
        return class01191.N();
    }
}

