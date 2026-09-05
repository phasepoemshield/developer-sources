/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.MapCodec
 *  minecraft.class00751
 *  minecraft.class04206
 *  minecraft.class04861
 *  minecraft.class04869
 *  minecraft.class04872
 *  minecraft.class04881
 *  minecraft.class05057
 */
package minecraft;

import com.mojang.serialization.MapCodec;
import minecraft.class00751;
import minecraft.class04206;
import minecraft.class04861;
import minecraft.class04869;
import minecraft.class04872;
import minecraft.class04881;
import minecraft.class05057;
import minecraft.class05248;

public interface class05267<P extends class05248> {
    public static final class05267<class04872> N = class05267.N("single_pool_element", class04872.N);
    public static final class05267<class04881> y = class05267.N("list_pool_element", class04881.N);
    public static final class05267<class04861> L = class05267.N("feature_pool_element", class04861.N);
    public static final class05267<class04869> u = class05267.N("empty_pool_element", class04869.N);
    public static final class05267<class05057> i = class05267.N("legacy_single_pool_element", class05057.R);

    public static <P extends class05248> class05267<P> N(String string, MapCodec<P> mapCodec) {
        return (class05267)class00751.N((class00751)class04206.NM, (String)string, () -> mapCodec);
    }

    public MapCodec<P> codec();
}

