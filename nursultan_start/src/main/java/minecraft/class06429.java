/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00537
 *  minecraft.class00540
 *  minecraft.class01683
 *  minecraft.class07001
 *  minecraft.class07209
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.function.Consumer;
import minecraft.class00381;
import minecraft.class00537;
import minecraft.class00540;
import minecraft.class01683;
import minecraft.class07001;
import minecraft.class07209;
import org.jspecify.annotations.Nullable;

public class class06429 {
    private final class01683 N;
    private int y = -1;
    private @Nullable Consumer<class07001> L;

    public class06429(class01683 class016832) {
        this.N = class016832;
    }

    public void N(class07209 class072092, Consumer<class07001> consumer) {
        int n = this.N(consumer);
        this.N.N((class00381)new class00537(n, class072092));
    }

    public void N(int n, Consumer<class07001> consumer) {
        int n2 = this.N(consumer);
        this.N.N((class00381)new class00540(n2, n));
    }

    private int N(Consumer<class07001> consumer) {
        this.L = consumer;
        return ++this.y;
    }

    public boolean N(int n, @Nullable class07001 class070012) {
        if (this.y == n && this.L != null) {
            this.L.accept(class070012);
            this.L = null;
            return true;
        }
        return false;
    }
}

