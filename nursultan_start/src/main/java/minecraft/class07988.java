/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07049
 *  minecraft.class07430
 *  minecraft.class07438
 *  minecraft.class07473
 *  minecraft.class07550
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class07049;
import minecraft.class07430;
import minecraft.class07438;
import minecraft.class07473;
import minecraft.class07550;
import org.jspecify.annotations.Nullable;

public class class07988
extends class07473 {
    private final class07550 N;
    private @Nullable class07438 y;

    public void L() {
        this.N.f().W();
        this.y = this.N.T();
    }

    public class07988(class07550 class075502) {
        this.N = class075502;
        this.N_71(EnumSet.of(class07430.field_18405));
    }

    public boolean B() {
        return true;
    }

    public void i() {
        if (this.y == null) {
            this.N.N(-1);
            return;
        }
        if (this.N.method_5858((class07049)this.y) > 49.0) {
            this.N.N(-1);
            return;
        }
        if (!this.N.C().N((class07049)this.y)) {
            this.N.N(-1);
            return;
        }
        this.N.N(1);
    }

    public void u() {
        this.y = null;
    }

    public boolean N() {
        class07438 class074382 = this.N.T();
        return this.N.E() > 0 || class074382 != null && this.N.method_5858((class07049)class074382) < 9.0;
    }
}

