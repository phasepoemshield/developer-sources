/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class05033
 *  minecraft.class05887
 *  minecraft.class05908
 *  minecraft.class05919
 *  minecraft.class07491
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.function.UnaryOperator;
import minecraft.class05033;
import minecraft.class05887;
import minecraft.class05908;
import minecraft.class05919;
import minecraft.class06850;
import minecraft.class07491;
import org.jspecify.annotations.Nullable;

public interface class06841<R> {
    public static final Codec<class06841<Object>> N = class06841.N(class068502 -> class068502.N((class05033[])class05919.values()).N((class05033[])class05887.values()));

    public static <R> Codec<class06841<R>> N(UnaryOperator<class06850<R>> unaryOperator) {
        return ((class06850)unaryOperator.apply(new class06850())).N();
    }

    public @Nullable R N(class05908 var1);

    public static <U> class06841<U> N(class06841<? extends U> class068412) {
        return class068412;
    }

    public class07491<?> N();
}

