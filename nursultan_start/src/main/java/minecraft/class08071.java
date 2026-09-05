/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.IntImmutableList
 */
package minecraft;

import it.unimi.dsi.fastutil.ints.IntImmutableList;
import java.util.List;
import java.util.Optional;
import java.util.stream.IntStream;
import minecraft.class08092;

public final class class08071
extends class08092<Integer> {
    private final IntImmutableList N;
    private final int y;
    private final int L;

    private class08071(String string, int n, int n2) {
        super(string, Integer.class);
        if (n < 0) {
            throw new IllegalArgumentException("Min value of " + string + " must be 0 or greater");
        }
        if (n2 <= n) {
            throw new IllegalArgumentException("Max value of " + string + " must be greater than min (" + n + ")");
        }
        this.y = n;
        this.L = n2;
        this.N = IntImmutableList.toList((IntStream)IntStream.range(n, n2 + 1));
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof class08071) {
            class08071 class080712 = (class08071)object;
            if (super.equals(object)) {
                return this.N.equals(class080712.N);
            }
        }
        return false;
    }

    public int y(Integer n) {
        if (n <= this.L) {
            return n - this.y;
        }
        return -1;
    }

    @Override
    public Optional<Integer> y(String string) {
        try {
            int n = Integer.parseInt(string);
            return n >= this.y && n <= this.L ? Optional.of(n) : Optional.empty();
        }
        catch (NumberFormatException numberFormatException) {
            return Optional.empty();
        }
    }

    @Override
    public int y() {
        return 31 * super.y() + this.N.hashCode();
    }

    @Override
    public List<Integer> N() {
        return this.N;
    }

    public static class08071 N(String string, int n, int n2) {
        return new class08071(string, n, n2);
    }

    public String N(Integer n) {
        return n.toString();
    }
}

