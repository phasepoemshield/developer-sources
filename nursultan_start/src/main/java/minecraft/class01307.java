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

public final class class01307
extends Enum<class01307> {
    public static final /* enum */ class01307 field_18151 = new class01307(0, "options.off");
    public static final /* enum */ class01307 field_18152 = new class01307(1, "options.attack.crosshair");
    public static final /* enum */ class01307 field_18153 = new class01307(2, "options.attack.hotbar");
    private static final IntFunction<class01307> field_64419;
    public static final Codec<class01307> field_64418;
    private final int field_18155;
    private final class00392 field_64420;
    private static final /* synthetic */ class01307[] field_18157;

    private class01307(int n2, String string2) {
        this.field_18155 = n2;
        this.field_64420 = class00392.L((String)string2);
    }

    public static class01307[] values() {
        return (class01307[])field_18157.clone();
    }

    public static class01307 valueOf(String string) {
        return Enum.valueOf(class01307.class, string);
    }

    private static /* synthetic */ class01307[] y() {
        return new class01307[]{field_18151, field_18152, field_18153};
    }

    public class00392 N() {
        return this.field_64420;
    }

    static {
        field_18157 = class01307.y();
        field_64419 = class02121.N(class013072 -> class013072.field_18155, (Object[])class01307.values(), (class02126)class02126.field_41665);
        field_64418 = Codec.INT.xmap(field_64419::apply, class013072 -> class013072.field_18155);
    }
}

