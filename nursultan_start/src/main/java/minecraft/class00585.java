/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import minecraft.class00596;
import minecraft.class00601;
import minecraft.class00619;

public interface class00585<Argument>
extends class00619<Float, Argument> {
    public static final class00585<class00601> i = new class00596();
    public static final class00585<Float> R = Float::sum;
    public static final class00585<Float> M = (f, f2) -> Float.valueOf(f.floatValue() - f2.floatValue());
    public static final class00585<Float> B = (f, f2) -> Float.valueOf(f.floatValue() * f2.floatValue());
    public static final class00585<Float> Z = Math::min;
    public static final class00585<Float> z = Math::max;
}

