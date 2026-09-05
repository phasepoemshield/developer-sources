/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05908
 *  minecraft.class06841
 *  minecraft.class07491
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class05908;
import minecraft.class06841;
import minecraft.class07491;
import org.jspecify.annotations.Nullable;

public interface class07611<T>
extends class06841<T> {
    public class07491<? extends T> N();

    default public @Nullable T N(class05908 class059082) {
        return (T)class059082.L(this.N());
    }
}

