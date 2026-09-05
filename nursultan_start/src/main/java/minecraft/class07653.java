/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00717
 *  minecraft.class04909
 *  minecraft.class04995
 *  minecraft.class06584
 *  minecraft.class07049
 *  minecraft.class07085
 *  minecraft.class07473
 */
package minecraft;

import java.util.List;
import minecraft.class00717;
import minecraft.class04909;
import minecraft.class04995;
import minecraft.class06584;
import minecraft.class07049;
import minecraft.class07085;
import minecraft.class07473;
import minecraft.class07618;

class class07653
extends class07473 {
    private int y;
    final /* synthetic */ class07618 N;

    public void L() {
        List var1 = this.N.method_73183().N(class00717.class, this.N.method_5829().L(8.0, 8.0, 8.0), class07618.L);
        if (!var1.isEmpty()) {
            this.N.f().N((class07049)var1.get(0), (double)1.2f);
            this.N.method_5783(class04909.ZY, 1.0f, 1.0f);
        }
        this.y = 0;
    }

    class07653(class07618 class076182) {
        this.N = class076182;
    }

    public void i() {
        List var1 = this.N.method_73183().N(class00717.class, this.N.method_5829().L(8.0, 8.0, 8.0), class07618.L);
        class06584 class065842 = this.N.method_6118(class07085.field_6173);
        if (!class065842.R()) {
            this.N(class065842);
            this.N.method_5673(class07085.field_6173, class06584.E);
        } else if (!var1.isEmpty()) {
            this.N.f().N((class07049)var1.get(0), (double)1.2f);
        }
    }

    public void u() {
        class06584 class065842 = this.N.method_6118(class07085.field_6173);
        if (!class065842.R()) {
            this.N(class065842);
            this.N.method_5673(class07085.field_6173, class06584.E);
            this.y = this.N.field_6012 + class07618.N(this.N).y(100);
        }
    }

    public boolean N() {
        if (this.y > this.N.field_6012) {
            return false;
        }
        return !this.N.method_73183().N(class00717.class, this.N.method_5829().L(8.0, 8.0, 8.0), class07618.L).isEmpty() || !this.N.method_6118(class07085.field_6173).R();
    }

    private void N(class06584 class065842) {
        if (class065842.R()) {
            return;
        }
        double d = this.N.method_23320() - (double)0.3f;
        class00717 class007172 = new class00717(this.N.method_73183(), this.N.method_23317(), d, this.N.method_23321(), class065842);
        class007172.N(40);
        class007172.N((class07049)this.N);
        float f = 0.3f;
        float f2 = class07618.y(this.N).z() * ((float)Math.PI * 2);
        float f3 = 0.02f * class07618.L(this.N).z();
        class007172.method_18800((double)(0.3f * -class04995.m((double)(this.N.method_36454() * ((float)Math.PI / 180))) * class04995.P((double)(this.N.method_36455() * ((float)Math.PI / 180))) + class04995.P((double)f2) * f3), (double)(0.3f * class04995.m((double)(this.N.method_36455() * ((float)Math.PI / 180))) * 1.5f), (double)(0.3f * class04995.P((double)(this.N.method_36454() * ((float)Math.PI / 180))) * class04995.P((double)(this.N.method_36455() * ((float)Math.PI / 180))) + class04995.m((double)f2) * f3));
        this.N.method_73183().method_8649((class07049)class007172);
    }
}

