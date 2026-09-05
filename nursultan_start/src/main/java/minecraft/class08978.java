/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01114
 *  minecraft.class07209
 *  minecraft.class07438
 */
package minecraft;

import minecraft.class01114;
import minecraft.class07209;
import minecraft.class07438;

public interface class08978 {
    default public class07438 aB_() {
        if (this instanceof class07438) {
            return (class07438)this;
        }
        throw new IllegalStateException("A container user must be a LivingEntity");
    }

    public double method_72381();

    public boolean method_72380(class01114 var1, class07209 var2);
}

