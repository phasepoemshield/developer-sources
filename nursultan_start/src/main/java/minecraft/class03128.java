/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01711
 *  minecraft.class01742
 *  minecraft.class01744
 *  minecraft.class01752
 */
package minecraft;

import java.util.function.Consumer;
import minecraft.class01711;
import minecraft.class01742;
import minecraft.class01744;
import minecraft.class01752;
import minecraft.class03099;
import minecraft.class03102;

public class class03128<T extends class01711<T>>
implements class01742<T> {
    private final Consumer<class01744<T>> N;
    private final class03102 y;

    public class03128(Consumer<class01744<T>> consumer, class03102 class031022) {
        this.N = consumer;
        this.y = class031022;
    }

    public void execute(class01752<T> class017522, class03099 class030992) {
        int n = class030992.L() + 1;
        class03099 class030993 = new class03099(n, this.y, class017522.y(n));
        this.N.accept(class01744.N(class017522, (class03099)class030993));
    }
}

