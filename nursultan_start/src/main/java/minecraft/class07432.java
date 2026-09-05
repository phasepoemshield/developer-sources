/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00250
 *  minecraft.class06889
 *  minecraft.class07049
 *  minecraft.class07209
 *  minecraft.class07211
 *  minecraft.class07473
 *  minecraft.class07475
 *  minecraft.class08036
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.Iterator;
import minecraft.class00250;
import minecraft.class06889;
import minecraft.class07049;
import minecraft.class07209;
import minecraft.class07211;
import minecraft.class07438;
import minecraft.class07451;
import minecraft.class07456;
import minecraft.class07473;
import minecraft.class07475;
import minecraft.class08036;
import org.jspecify.annotations.Nullable;

public class class07432
extends class07473 {
    private int N;
    private final class07475 y;
    private @Nullable class08036 L;
    private class07456 u;

    public void L() {
        Iterator var2 = this.y.method_73183().N(class00250.class, this.y.method_5829().M(5.0)).iterator();
        while (var2.hasNext()) {
            class08036 class080362;
            class07438 class074382 = ((class00250)var2.next()).method_5642();
            if (!(class074382 instanceof class08036)) continue;
            this.L = class080362 = (class08036)class074382;
            break;
        }
        this.N = 0;
        this.u = class07456.field_6401;
    }

    public class07432(class07475 class074752) {
        this.y = class074752;
    }

    public void i() {
        float f = this.u == class07456.field_6400 ? 0.01f : 0.015f;
        this.y.method_5724(f, new class06889((double)this.y.fields_7212a028292fd3c078969e3ee4c71d9e8_0.floatValue(), (double)this.y.fields_7212a028292fd3c078969e3ee4c71d9e8_1.floatValue(), (double)this.y.fields_7212a028292fd3c078969e3ee4c71d9e8_2.floatValue()));
        this.y.method_5784(class07451.field_6308, this.y.method_18798());
        if (--this.N > 0) {
            return;
        }
        this.N = this.N(10);
        if (this.u == class07456.field_6401) {
            class07209 class072092 = this.L.method_24515().method_10093(this.L.method_5735().b());
            class072092 = class072092.method_10069(0, -1, 0);
            this.y.f().N((double)class072092.method_10263(), (double)class072092.method_10264(), (double)class072092.method_10260(), 1.0);
            if (this.y.method_5739((class07049)this.L) < 4.0f) {
                this.N = 0;
                this.u = class07456.field_6400;
            }
        } else if (this.u == class07456.field_6400) {
            class07211 class072112 = this.L.method_5755();
            class07209 class072093 = this.L.method_24515().method_10079(class072112, 10);
            this.y.f().N((double)class072093.method_10263(), (double)(class072093.method_10264() - 1), (double)class072093.method_10260(), 1.0);
            if (this.y.method_5739((class07049)this.L) > 12.0f) {
                this.N = 0;
                this.u = class07456.field_6401;
            }
        }
    }

    public void u() {
        this.L = null;
    }

    public boolean y() {
        return this.L != null && this.L.method_5765() && this.L.method_76798();
    }

    public boolean N() {
        if (this.L != null && this.L.method_76798()) {
            return true;
        }
        Iterator var2 = this.y.method_73183().N(class00250.class, this.y.method_5829().M(5.0)).iterator();
        while (var2.hasNext()) {
            class07438 class074382 = ((class00250)var2.next()).method_5642();
            if (!(class074382 instanceof class08036) || !((class08036)class074382).method_76798()) continue;
            return true;
        }
        return false;
    }

    public boolean O_() {
        return true;
    }
}

