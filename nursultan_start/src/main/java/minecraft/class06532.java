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

public final class class06532
extends Enum<class06532> {
    public static final /* enum */ class06532 field_64663 = new class06532(0, "options.textureFiltering.none");
    public static final /* enum */ class06532 field_64664 = new class06532(1, "options.textureFiltering.rgss");
    public static final /* enum */ class06532 field_64665 = new class06532(2, "options.textureFiltering.anisotropic");
    private static final IntFunction<class06532> field_64667;
    public static final Codec<class06532> field_64666;
    private final int field_64668;
    private final class00392 field_64669;
    private static final /* synthetic */ class06532[] field_64670;

    private class06532(int n2, String string2) {
        this.field_64668 = n2;
        this.field_64669 = class00392.L((String)string2);
    }

    public static class06532[] values() {
        return (class06532[])field_64670.clone();
    }

    public static class06532 valueOf(String string) {
        return Enum.valueOf(class06532.class, string);
    }

    private static /* synthetic */ class06532[] y() {
        return new class06532[]{field_64663, field_64664, field_64665};
    }

    public class00392 N() {
        return this.field_64669;
    }

    static {
        field_64670 = class06532.y();
        field_64667 = class02121.N(class065322 -> class065322.field_64668, (Object[])class06532.values(), (class02126)class02126.field_41665);
        field_64666 = Codec.INT.xmap(field_64667::apply, class065322 -> class065322.field_64668);
    }
}

