/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01383
 *  minecraft.class04410
 *  minecraft.class05363
 *  minecraft.class05848
 *  minecraft.class06166
 *  minecraft.class07074
 *  minecraft.class07080
 *  minecraft.class07878
 */
package minecraft;

import minecraft.class00962;
import minecraft.class00965;
import minecraft.class00972;
import minecraft.class01383;
import minecraft.class04410;
import minecraft.class05363;
import minecraft.class05848;
import minecraft.class06166;
import minecraft.class07074;
import minecraft.class07080;
import minecraft.class07878;

public class class00954
extends class00962<class05848> {
    private final class06166 u;
    final class00965 L = new class00965();

    public class00954(class04410 class044102, class06166 class061662) {
        super(class044102);
        this.u = class061662;
    }

    @Override
    public class00972 N(class01383 class013832, class05363 class053632, float f) {
        for (class05848 class058482 : this.y) {
            if (!class013832.method_74404(class058482.field_3874, class058482.field_3854, class058482.field_3871)) continue;
            try {
                class058482.method_3074(this.L, class053632, f);
            }
            catch (Throwable throwable) {
                class07080 class070802 = class07080.N((Throwable)throwable, (String)"Rendering Particle");
                class07074 class070742 = class070802.N("Particle being rendered");
                class070742.N("Particle", () -> ((class05848)class058482).toString());
                class070742.N("Particle Type", () -> ((class06166)this.u).toString());
                throw new class07878(class070802);
            }
        }
        return this.L;
    }
}

