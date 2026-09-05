/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03926
 *  minecraft.class03962
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.function.BooleanSupplier;
import minecraft.class03072;
import minecraft.class03926;
import minecraft.class03962;
import org.jspecify.annotations.Nullable;

public class class03061
implements class03072 {
    private final class03962 u;
    private final BooleanSupplier i;
    private @Nullable class03926 R;
    private boolean M = true;

    public class03061(class03962 class039622, BooleanSupplier booleanSupplier) {
        this.u = class039622;
        this.i = booleanSupplier;
    }

    private boolean y(class03926 class039262) {
        if (this.i.getAsBoolean()) {
            N.error("Received message with expired profile public key from {} with session {}", (Object)class039262.M(), (Object)class039262.U().u());
            return false;
        }
        if (!class039262.N(this.u)) {
            N.error("Received message with invalid signature (is the session wrong, or signature cache out of sync?): {}", (Object)class03926.N((class03926)class039262));
            return false;
        }
        return this.N(class039262);
    }

    private boolean N(class03926 class039262) {
        if (class039262.equals((Object)this.R)) {
            return true;
        }
        if (this.R != null && !class039262.U().N(this.R.U())) {
            N.error("Received out-of-order chat message from {}: expected index > {} for session {}, but was {} for session {}", new Object[]{class039262.M(), this.R.U().y(), this.R.U().u(), class039262.U().y(), class039262.U().u()});
            return false;
        }
        return true;
    }

    @Override
    public @Nullable class03926 method_45048(class03926 class039262) {
        boolean bl = this.M = this.M && this.y(class039262);
        if (!this.M) {
            return null;
        }
        this.R = class039262;
        return class039262;
    }
}

