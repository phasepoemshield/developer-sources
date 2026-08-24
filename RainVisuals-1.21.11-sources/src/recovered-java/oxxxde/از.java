/*
 * Decompiled with CFR 0.152.
 */
package oxxxde;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;
import kotakbaz.rain.client.render.main.scissor.A;

public class \u0627\u0632 {
    public A current;
    private final Deque<A> stack = new ArrayDeque<A>();

    /*
     * WARNING - void declaration
     */
    public void push(A rect) {
        void var2_2;
        A scissorRect = rect;
        if (this.current != null) {
            scissorRect = Objects.requireNonNullElse(rect.intersection(this.current), new A(0.0f, 0.0f, 0.0f, 0.0f));
        }
        this.stack.addLast(scissorRect);
        this.current = var2_2;
    }

    public void pop() {
        if (this.stack.isEmpty()) {
            throw new IllegalStateException("Scissor stack underflow");
        }
        this.stack.removeLast();
        this.current = this.stack.peekLast();
    }
}

