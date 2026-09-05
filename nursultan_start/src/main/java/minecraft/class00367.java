/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class02484
 *  minecraft.class03490
 *  minecraft.class03574
 *  minecraft.class03662
 *  minecraft.class06584
 *  org.joml.Vector3fc
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Objects;
import java.util.function.Consumer;
import minecraft.class00368;
import minecraft.class01237;
import minecraft.class01421;
import minecraft.class02484;
import minecraft.class03490;
import minecraft.class03574;
import minecraft.class03662;
import minecraft.class06584;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class class00367
implements class00368<class03490> {
    private final class03574 N;

    public class00367(class03574 class035742) {
        this.N = class035742;
    }

    @Override
    public void N(Consumer<Vector3fc> consumer) {
        this.N.N(consumer);
    }

    @Override
    public void N(@Nullable class03490 class034902, class03662 class036622, class01421 class014212, class01237 class012372, int n, int n2, boolean bl, int n3) {
        this.N.N(class014212, class012372, n, n2, Objects.requireNonNullElse(class034902, class03490.N), n3);
    }

    @Override
    public @Nullable class03490 y(class06584 class065842) {
        return (class03490)class065842.method_58694(class02484.Nt);
    }
}

