/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.time.Duration;
import java.time.Instant;
import java.util.Optional;
import minecraft.class02097;
import minecraft.class02117;
import minecraft.class02129;

public class class02110 {
    private static final int N = -1;
    private Optional<Instant> y = Optional.empty();
    private long L;
    private long u;

    public void N(class02097 class020972) {
        this.y.ifPresent(instant -> class020972.send(class02129.R, class021042 -> {
            class021042.N(class02117.s, this.N((Instant)instant));
            class021042.N(class02117.T, (int)this.L);
        }));
    }

    private int N(Instant instant) {
        return (int)Duration.between(instant, Instant.now()).toSeconds();
    }

    public void N(long l) {
        if (this.u != -1L) {
            this.L += Math.max(0L, l - this.u);
        }
        this.u = l;
    }

    public void N() {
        this.u = -1L;
        if (this.y.isEmpty()) {
            this.y = Optional.of(Instant.now());
        }
    }
}

