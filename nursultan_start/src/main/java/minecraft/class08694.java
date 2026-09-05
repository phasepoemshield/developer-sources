/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04643
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.function.Supplier;
import minecraft.class04643;
import org.jspecify.annotations.Nullable;

public class class08694
implements AutoCloseable {
    public static final class08694 N = new class08694(null);
    private final @Nullable class04643 y;

    class08694(@Nullable class04643 class046432) {
        this.y = class046432;
    }

    @Override
    public void close() {
        if (this.y != null) {
            this.y.L();
        }
    }

    public class08694 N(long l) {
        if (this.y != null) {
            this.y.N(l);
        }
        return this;
    }

    public class08694 N(int n) {
        if (this.y != null) {
            this.y.N(n);
        }
        return this;
    }

    public class08694 N(String string) {
        if (this.y != null) {
            this.y.L(string);
        }
        return this;
    }

    public class08694 N(Supplier<String> supplier) {
        if (this.y != null) {
            this.y.L(supplier.get());
        }
        return this;
    }
}

