/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00751
 *  minecraft.class04206
 *  minecraft.class05318
 *  minecraft.class05329
 *  minecraft.class05333
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00751;
import minecraft.class04206;
import minecraft.class05295;
import minecraft.class05318;
import minecraft.class05329;
import minecraft.class05333;

public interface class05301<P extends class05318> {
    public static final class05301<class05329> N = class05301.N("always_true", class05329.N);
    public static final class05301<class05295> y = class05301.N("linear_pos", class05295.N);
    public static final class05301<class05333> L = class05301.N("axis_aligned_linear_pos", class05333.N);

    public static <P extends class05318> class05301<P> N(String string, MapCodec<P> mapCodec) {
        return (class05301)class00751.N((class00751)class04206.s, (String)string, () -> mapCodec);
    }

    public MapCodec<P> codec();
}

