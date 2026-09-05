/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.time.Duration;
import minecraft.class02097;
import minecraft.class02117;
import minecraft.class02129;
import org.jspecify.annotations.Nullable;

public class class02103 {
    private final boolean N;
    private final @Nullable Duration y;

    public class02103(boolean bl, @Nullable Duration duration) {
        this.y = duration;
        this.N = bl;
    }

    public void N(class02097 class020972) {
        if (this.y != null) {
            class020972.send(class02129.i, class021042 -> {
                class021042.N(class02117.l, (int)this.y.toMillis());
                class021042.N(class02117.d, this.N);
            });
        }
    }
}

