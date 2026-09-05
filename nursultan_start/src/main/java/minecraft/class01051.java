/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03255
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;
import minecraft.class03255;
import org.jspecify.annotations.Nullable;

public class class01051 {
    private final Deque<class03255> N = new ArrayDeque<class03255>();

    class01051() {
    }

    public @Nullable class03255 y() {
        return this.N.peekLast();
    }

    public boolean N(int n, int n2) {
        if (this.N.isEmpty()) {
            return true;
        }
        return this.N.peek().N(n, n2);
    }

    public @Nullable class03255 N() {
        if (this.N.isEmpty()) {
            throw new IllegalStateException("Scissor stack underflow");
        }
        this.N.removeLast();
        return this.N.peekLast();
    }

    public class03255 N(class03255 class032552) {
        class03255 class032553 = this.N.peekLast();
        if (class032553 != null) {
            class03255 class032554 = Objects.requireNonNullElse(class032552.y(class032553), class03255.N());
            this.N.addLast(class032554);
            return class032554;
        }
        this.N.addLast(class032552);
        return class032552;
    }
}

