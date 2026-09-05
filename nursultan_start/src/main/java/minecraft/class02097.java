/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.util.function.Consumer;
import minecraft.class02104;
import minecraft.class02129;

@FunctionalInterface
public interface class02097 {
    public static final class02097 N = (class021292, consumer) -> {};

    default public class02097 N(Consumer<class02104> consumer) {
        return (class021292, consumer2) -> this.send(class021292, class021042 -> {
            consumer2.accept(class021042);
            consumer.accept((class02104)class021042);
        });
    }

    public void send(class02129 var1, Consumer<class02104> var2);
}

