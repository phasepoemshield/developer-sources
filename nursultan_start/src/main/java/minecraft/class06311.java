/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.function.Consumer;
import minecraft.class06297;
import minecraft.class06323;
import org.jspecify.annotations.Nullable;

public class class06311 {
    @Nullable class06297 N;
    private boolean L;
    final /* synthetic */ class06323 y;

    public class06311(class06323 class063232, class06297 class062972) {
        this.y = class063232;
        this.N = class062972;
    }

    public void y() {
        this.L = true;
        this.y.N.N(this.N);
        this.N = null;
    }

    public boolean N() {
        return this.L;
    }

    public void N(Consumer<class06297> consumer) {
        this.y.y.execute(() -> {
            if (this.N != null) {
                consumer.accept(this.N);
            }
        });
    }
}

