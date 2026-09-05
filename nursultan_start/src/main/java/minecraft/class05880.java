/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10543
 *  minecraft.class07209
 *  minecraft.class07299
 */
package minecraft;

import Nursultan.class10543;
import java.util.Optional;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import minecraft.class05844;
import minecraft.class07209;
import minecraft.class07299;

public interface class05880 {
    public static final class05880 N = new class05844();

    default public void N_53(BiConsumer<class07299, class07209> biConsumer) {
        this.N((class072992, class072092) -> {
            biConsumer.accept((class07299)class072992, (class07209)class072092);
            return Optional.empty();
        });
    }

    public static class05880 N(class07299 class072992, class07209 class072092) {
        return new class10543(class072992, class072092);
    }

    default public <T> T N(BiFunction<class07299, class07209, T> biFunction, T t) {
        return this.N(biFunction).orElse(t);
    }

    public <T> Optional<T> N(BiFunction<class07299, class07209, T> var1);
}

