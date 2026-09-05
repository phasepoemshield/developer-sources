/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class02484
 *  minecraft.class02708
 *  minecraft.class03571
 *  minecraft.class03662
 *  minecraft.class06563
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
import minecraft.class02708;
import minecraft.class03571;
import minecraft.class03662;
import minecraft.class06563;
import minecraft.class06584;
import org.joml.Vector3fc;
import org.jspecify.annotations.Nullable;

public class class00375
implements class00368<class02708> {
    private final class03571 N;
    private final class06563 y;

    public class00375(class06563 class065632, class03571 class035712) {
        this.N = class035712;
        this.y = class065632;
    }

    @Override
    public void N(Consumer<Vector3fc> consumer) {
        this.N.N(consumer);
    }

    @Override
    public void N(@Nullable class02708 class027082, class03662 class036622, class01421 class014212, class01237 class012372, int n, int n2, boolean bl, int n3) {
        this.N.N(class014212, class012372, n, n2, this.y, Objects.requireNonNullElse(class027082, class02708.L), n3);
    }

    @Override
    public @Nullable class02708 y(class06584 class065842) {
        return (class02708)class065842.method_58694(class02484.Nv);
    }
}

