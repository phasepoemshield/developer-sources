/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09456
 *  minecraft.class00392
 *  minecraft.class06541
 */
package minecraft;

import Nursultan.class09456;
import java.util.function.UnaryOperator;
import minecraft.class00392;
import minecraft.class06541;

public interface class01283 {
    public static final UnaryOperator<class00392> N = UnaryOperator.identity();
    public static final class01283 y = class01283.N(N, true);
    public static final class01283 L = class01283.N(class01283.N("pack.source.builtin"), true);
    public static final class01283 u = class01283.N(class01283.N("pack.source.feature"), false);
    public static final class01283 i = class01283.N(class01283.N("pack.source.world"), true);
    public static final class01283 R = class01283.N(class01283.N("pack.source.server"), true);

    private static /* synthetic */ class00392 N(class00392 class003922, class00392 class003923) {
        return class00392.N((String)"pack.nameAndSource", (Object[])new Object[]{class003923, class003922}).N(class06541.field_1080);
    }

    private static UnaryOperator<class00392> N(String string) {
        return arg_0 -> class01283.N((class00392)class00392.L((String)string), arg_0);
    }

    public static class01283 N(UnaryOperator<class00392> unaryOperator, boolean bl) {
        return new class09456(unaryOperator, bl);
    }

    public class00392 method_45282(class00392 var1);

    public boolean method_45279();
}

