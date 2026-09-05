/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07049
 *  minecraft.class07430
 *  minecraft.class07438
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class07049;
import minecraft.class07430;
import minecraft.class07438;
import minecraft.class07473;
import minecraft.class07525;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

class class07527
extends class07473 {
    private final class07525 N;
    private @Nullable class07438 y;

    @Override
    public void L() {
        this.N.f().W();
    }

    public class07527(class07525 class075252) {
        this.N = class075252;
        this.N_71(EnumSet.of(class07430.field_18407, class07430.field_18405));
    }

    @Override
    public void i() {
        this.N.p().N(this.y.method_23317(), this.y.method_23320(), this.y.method_23321());
    }

    @Override
    public boolean N() {
        this.y = this.N.T();
        class07438 class074382 = this.y;
        if (!(class074382 instanceof class08036)) {
            return false;
        }
        class08036 class080362 = (class08036)class074382;
        double d = this.y.method_5858((class07049)this.N);
        if (d > 256.0) {
            return false;
        }
        return this.N.N(class080362);
    }
}

