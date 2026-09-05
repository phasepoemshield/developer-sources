/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class02794
 *  minecraft.class06666
 */
package minecraft;

import java.util.Optional;
import java.util.function.Consumer;
import minecraft.class00381;
import minecraft.class02794;
import minecraft.class04159;
import minecraft.class04188;
import minecraft.class06666;

public class class04174
implements class04188 {
    public static final class04159 N = new class04159("server_resource_pack");
    private final class02794 y;

    public class04174(class02794 class027942) {
        this.y = class027942;
    }

    @Override
    public class04159 method_52375() {
        return N;
    }

    @Override
    public void method_52376(Consumer<class00381<?>> consumer) {
        consumer.accept((class00381<?>)new class06666(this.y.N(), this.y.y(), this.y.L(), this.y.u(), Optional.ofNullable(this.y.i())));
    }
}

