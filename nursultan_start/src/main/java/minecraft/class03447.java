/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class06244
 */
package minecraft;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import minecraft.class00392;
import minecraft.class06244;

public class class03447<T> {
    private final T y;
    private final BiConsumer<Consumer<String>, T> L;
    public static final class03447<?> N = new class03447<class06244>(class06244.field_17274, (consumer, class062442) -> {});

    private class03447(T t, BiConsumer<Consumer<String>, T> biConsumer) {
        this.y = t;
        this.L = biConsumer;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof class03447) {
            class03447 class034472 = (class03447)object;
            return class034472.L == this.L && class034472.y.equals(this.y);
        }
        return false;
    }

    public int hashCode() {
        int n = this.y.hashCode();
        n = 31 * n + this.L.hashCode();
        return n;
    }

    public static class03447<?> N(class00392 class003923) {
        return new class03447<class00392>(class003923, (consumer, class003922) -> consumer.accept(class003922.getString()));
    }

    public static class03447<?> N(List<class00392> list) {
        return new class03447<List>(list, (consumer, list2) -> list.stream().map(class00392::getString).forEach((Consumer<String>)consumer));
    }

    public static class03447<?> N(String string) {
        return new class03447<String>(string, Consumer::accept);
    }

    public void N(Consumer<String> consumer) {
        this.L.accept(consumer, (Consumer<String>)this.y);
    }
}

