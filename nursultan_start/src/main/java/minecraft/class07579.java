/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05908
 *  minecraft.class06841
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class05908;
import minecraft.class06841;
import minecraft.class07491;
import org.jspecify.annotations.Nullable;

public interface class07579<T, R>
extends class06841<R> {
    public @Nullable R N(T var1);

    public class07491<? extends T> N();

    default public @Nullable R N(class05908 class059082) {
        Object object = class059082.L(this.N());
        return object != null ? (R)this.N(object) : null;
    }
}

