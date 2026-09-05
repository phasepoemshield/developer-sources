/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00667
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.time.Instant;
import minecraft.class00667;
import org.jspecify.annotations.Nullable;

public class class06562 {
    private @Nullable Instant N;

    public void L() {
        this.N = null;
    }

    public class06562() {
    }

    public class06562(Instant instant) {
        this.N = instant;
    }

    public String toString() {
        return "CriterionProgress{obtained=" + String.valueOf(this.N == null ? "false" : this.N) + "}";
    }

    public @Nullable Instant u() {
        return this.N;
    }

    public static class06562 y(class00667 class006672) {
        class06562 class065622 = new class06562();
        class065622.N = (Instant)class006672.L(class00667::j);
        return class065622;
    }

    public void y() {
        this.N = Instant.now();
    }

    public void N(class00667 class006672) {
        class006672.N((Object)this.N, class00667::N);
    }

    public boolean N() {
        return this.N != null;
    }
}

