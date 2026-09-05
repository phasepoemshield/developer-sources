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

public final class class08027
extends Enum<class08027> {
    public static final /* enum */ class08027 field_7538 = new class08027(0, "options.chat.visibility.full");
    public static final /* enum */ class08027 field_7539 = new class08027(1, "options.chat.visibility.system");
    public static final /* enum */ class08027 field_7536 = new class08027(2, "options.chat.visibility.hidden");
    private static final IntFunction<class08027> field_7534;
    public static final Codec<class08027> field_64374;
    private final int field_7535;
    private final class00392 field_64375;
    private static final /* synthetic */ class08027[] field_7537;

    private class08027(int n2, String string2) {
        this.field_7535 = n2;
        this.field_64375 = class00392.L((String)string2);
    }

    public static class08027[] values() {
        return (class08027[])field_7537.clone();
    }

    public static class08027 valueOf(String string) {
        return Enum.valueOf(class08027.class, string);
    }

    private static /* synthetic */ class08027[] y() {
        return new class08027[]{field_7538, field_7539, field_7536};
    }

    public class00392 N() {
        return this.field_64375;
    }

    static {
        field_7537 = class08027.y();
        field_7534 = class02121.N(class080272 -> class080272.field_7535, (Object[])class08027.values(), (class02126)class02126.field_41665);
        field_64374 = Codec.INT.xmap(field_7534::apply, class080272 -> class080272.field_7535);
    }
}

