/*
 * Decompiled with CFR 0.152.
 */
package dev.isxander.yacl3.api;

public interface StateManager$StateListener<T> {
    default public StateManager$StateListener<T> andThen(StateManager$StateListener<T> stateManager$StateListener) {
        return (object, object2) -> {
            this.onStateChange(object, object2);
            stateManager$StateListener.onStateChange(object, object2);
        };
    }

    public static <T> StateManager$StateListener<T> noop() {
        return (object, object2) -> {};
    }

    public void onStateChange(T var1, T var2);
}

