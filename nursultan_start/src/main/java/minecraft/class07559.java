/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04782
 *  minecraft.class07049
 *  minecraft.class07086
 *  minecraft.class07430
 *  minecraft.class07438
 */
package minecraft;

import java.util.EnumSet;
import minecraft.class04782;
import minecraft.class07049;
import minecraft.class07086;
import minecraft.class07430;
import minecraft.class07438;
import minecraft.class07473;
import minecraft.class07520;
import minecraft.class07549;

class class07559
extends class07473 {
    private final class07549 N;
    private int y;
    private final boolean L;

    @Override
    public void L() {
        this.y = -10;
        this.N.f().W();
        class07438 class074382 = this.N.T();
        if (class074382 != null) {
            this.N.p().N((class07049)class074382, 90.0f, 90.0f);
        }
        this.N.field_64356 = true;
    }

    public class07559(class07549 class075492) {
        this.N = class075492;
        this.L = class075492 instanceof class07520;
        this.N_71(EnumSet.of(class07430.field_18405, class07430.field_18406));
    }

    @Override
    public boolean B() {
        return true;
    }

    @Override
    public void i() {
        class07438 class074382 = this.N.T();
        if (class074382 == null) {
            return;
        }
        this.N.f().W();
        this.N.p().N((class07049)class074382, 90.0f, 90.0f);
        if (!this.N.method_6057((class07049)class074382)) {
            this.N.y(null);
            return;
        }
        ++this.y;
        if (this.y == 0) {
            this.N.N(class074382.method_5628());
            if (!this.N.method_5701()) {
                this.N.method_73183().method_8421((class07049)this.N, (byte)21);
            }
        } else if (this.y >= this.N.B()) {
            float f = 1.0f;
            if (this.N.method_73183().y() == class07086.field_5807) {
                f += 2.0f;
            }
            if (this.L) {
                f += 2.0f;
            }
            class04782 class047822 = class07559.N((class07049)this.N);
            class074382.method_64397(class047822, this.N.method_48923().L((class07049)this.N, (class07049)this.N), f);
            this.N.method_6121(class047822, (class07049)class074382);
            this.N.y(null);
        }
        super.i();
    }

    @Override
    public void u() {
        this.N.N(0);
        this.N.y(null);
        this.N.L.Z();
    }

    @Override
    public boolean y() {
        return super.y() && (this.L || this.N.T() != null && this.N.method_5858((class07049)this.N.T()) > 9.0);
    }

    @Override
    public boolean N() {
        class07438 class074382 = this.N.T();
        return class074382 != null && class074382.method_5805();
    }
}

