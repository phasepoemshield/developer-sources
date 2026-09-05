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

public final class class01299
extends Enum<class01299> {
    public static final /* enum */ class01299 field_18176 = new class01299(0, "options.narrator.off");
    public static final /* enum */ class01299 field_18177 = new class01299(1, "options.narrator.all");
    public static final /* enum */ class01299 field_18178 = new class01299(2, "options.narrator.chat");
    public static final /* enum */ class01299 field_18179 = new class01299(3, "options.narrator.system");
    private static final IntFunction<class01299> field_18180;
    public static final Codec<class01299> field_64423;
    private final int field_18181;
    private final class00392 field_24212;
    private static final /* synthetic */ class01299[] field_18183;

    public boolean L() {
        return this == field_18177 || this == field_18178;
    }

    private class01299(int n2, String string2) {
        this.field_18181 = n2;
        this.field_24212 = class00392.L((String)string2);
    }

    public static class01299[] values() {
        return (class01299[])field_18183.clone();
    }

    public static class01299 valueOf(String string) {
        return Enum.valueOf(class01299.class, string);
    }

    public boolean i() {
        return this == field_18177 || this == field_18179 || this == field_18178;
    }

    public boolean u() {
        return this == field_18177 || this == field_18179;
    }

    public class00392 y() {
        return this.field_24212;
    }

    public int N() {
        return this.field_18181;
    }

    public static class01299 N(int n) {
        return field_18180.apply(n);
    }

    private static /* synthetic */ class01299[] R() {
        return new class01299[]{field_18176, field_18177, field_18178, field_18179};
    }

    static {
        field_18183 = class01299.R();
        field_18180 = class02121.N(class01299::N, (Object[])class01299.values(), (class02126)class02126.field_41665);
        field_64423 = Codec.INT.xmap(class01299::N, class01299::N);
    }
}

