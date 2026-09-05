/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00392
 *  minecraft.class02121
 *  minecraft.class02126
 */
package minecraft;

import com.mojang.serialization.Codec;
import java.util.function.IntFunction;
import minecraft.class00392;
import minecraft.class02121;
import minecraft.class02126;

public final class class01315
extends Enum<class01315> {
    public static final /* enum */ class01315 field_18197 = new class01315(0, "options.particles.all");
    public static final /* enum */ class01315 field_18198 = new class01315(1, "options.particles.decreased");
    public static final /* enum */ class01315 field_18199 = new class01315(2, "options.particles.minimal");
    private static final IntFunction<class01315> field_18200;
    public static final Codec<class01315> field_64259;
    private final int field_18201;
    private final class00392 field_64260;
    private static final /* synthetic */ class01315[] field_18203;

    private class01315(int n2, String string2) {
        this.field_18201 = n2;
        this.field_64260 = class00392.L((String)string2);
    }

    public static class01315[] values() {
        return (class01315[])field_18203.clone();
    }

    public static class01315 valueOf(String string) {
        return Enum.valueOf(class01315.class, string);
    }

    private static /* synthetic */ class01315[] y() {
        return new class01315[]{field_18197, field_18198, field_18199};
    }

    public class00392 N() {
        return this.field_64260;
    }

    static {
        field_18203 = class01315.y();
        field_18200 = class02121.N(class013152 -> class013152.field_18201, (Object[])class01315.values(), (class02126)class02126.field_41665);
        field_64259 = Codec.INT.xmap(field_18200::apply, class013152 -> class013152.field_18201);
    }
}

