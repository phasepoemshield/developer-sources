/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01827
 *  minecraft.class04370
 *  minecraft.class05096
 *  minecraft.class05362
 *  minecraft.class05630
 *  minecraft.class05709
 *  minecraft.class05914
 *  minecraft.class06478
 */
package minecraft;

import minecraft.class00392;
import minecraft.class01827;
import minecraft.class04370;
import minecraft.class05096;
import minecraft.class05362;
import minecraft.class05630;
import minecraft.class05709;
import minecraft.class05914;
import minecraft.class06478;

public class class01395
extends class05914 {
    private static final class00392 N = class00392.L((String)"controls.title");

    public class01395(class05096 class050962, class05630 class056302) {
        super(class050962, class056302, N);
    }

    private static class04370<?>[] N(class05630 class056302) {
        return new class04370[]{class056302.NT(), class056302.Nb(), class056302.Nj(), class056302.Nv(), class056302.f(), class056302.Nn(), class056302.S()};
    }

    protected void method_60325() {
        this.field_51824.N((class06478)class05362.method_46430((class00392)class00392.L((String)"options.mouse_settings"), class053622 -> this.field_22787.N((class05096)new class05709((class05096)this, this.field_21336))).N(), (class06478)class05362.method_46430((class00392)class00392.L((String)"controls.keybinds"), class053622 -> this.field_22787.N((class05096)new class01827((class05096)this, this.field_21336))).N());
        this.field_51824.N(class01395.N(this.field_21336));
    }
}

