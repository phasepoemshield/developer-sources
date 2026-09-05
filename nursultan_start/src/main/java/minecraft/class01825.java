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

public final class class01825
extends Enum<class01825> {
    public static final /* enum */ class01825 field_34788 = new class01825(0, "options.prioritizeChunkUpdates.none");
    public static final /* enum */ class01825 field_34789 = new class01825(1, "options.prioritizeChunkUpdates.byPlayer");
    public static final /* enum */ class01825 field_34790 = new class01825(2, "options.prioritizeChunkUpdates.nearby");
    private static final IntFunction<class01825> field_64425;
    public static final Codec<class01825> field_64424;
    private final int field_34792;
    private final class00392 field_64426;
    private static final /* synthetic */ class01825[] field_34794;

    private class01825(int n2, String string2) {
        this.field_34792 = n2;
        this.field_64426 = class00392.L((String)string2);
    }

    public static class01825[] values() {
        return (class01825[])field_34794.clone();
    }

    public static class01825 valueOf(String string) {
        return Enum.valueOf(class01825.class, string);
    }

    private static /* synthetic */ class01825[] y() {
        return new class01825[]{field_34788, field_34789, field_34790};
    }

    public class00392 N() {
        return this.field_64426;
    }

    static {
        field_34794 = class01825.y();
        field_64425 = class02121.N(class018252 -> class018252.field_34792, (Object[])class01825.values(), (class02126)class02126.field_41665);
        field_64424 = Codec.INT.xmap(field_64425::apply, class018252 -> class018252.field_34792);
    }
}

