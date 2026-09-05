/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class04370
 *  minecraft.class04911
 *  minecraft.class05096
 *  minecraft.class05630
 *  minecraft.class05914
 */
package minecraft;

import java.util.Arrays;
import minecraft.class00392;
import minecraft.class04370;
import minecraft.class04911;
import minecraft.class05096;
import minecraft.class05630;
import minecraft.class05914;

public class class04698
extends class05914 {
    private static final class00392 N = class00392.L((String)"options.sounds.title");

    public class04698(class05096 class050962, class05630 class056302) {
        super(class050962, class056302, N);
    }

    private class04370<?>[] N() {
        return (class04370[])Arrays.stream(class04911.values()).filter(class049112 -> class049112 != class04911.field_15250).map(arg_0 -> ((class05630)this.field_21336).L(arg_0)).toArray(class04370[]::new);
    }

    protected void method_60325() {
        this.field_51824.N(this.field_21336.L(class04911.field_15250));
        this.field_51824.N(this.N());
        this.field_51824.N(this.field_21336.Ne());
        this.field_51824.N(new class04370[]{this.field_21336.NU(), this.field_21336.NE()});
        this.field_51824.N(new class04370[]{this.field_21336.Nc(), this.field_21336.NX()});
    }
}

