/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00500
 *  minecraft.class02121
 *  minecraft.class02126
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class05033
 *  minecraft.class07131
 *  minecraft.class07822
 */
package minecraft;

import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import minecraft.class00500;
import minecraft.class02121;
import minecraft.class02126;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class05033;
import minecraft.class07131;
import minecraft.class07822;
import minecraft.class07841;

public final class class07830
extends Enum<class07830>
implements class05033 {
    public static final /* enum */ class07830 field_13194 = new class07830(0, "WORLD_SURFACE_WG", class07822.field_13207, class07841.N);
    public static final /* enum */ class07830 field_13202 = new class07830(1, "WORLD_SURFACE", class07822.field_16424, class07841.N);
    public static final /* enum */ class07830 field_13195 = new class07830(2, "OCEAN_FLOOR_WG", class07822.field_13207, class07841.y);
    public static final /* enum */ class07830 field_13200 = new class07830(3, "OCEAN_FLOOR", class07822.field_13206, class07841.y);
    public static final /* enum */ class07830 field_13197 = new class07830(4, "MOTION_BLOCKING", class07822.field_16424, class005002 -> class005002.M() || !class005002.Y().W());
    public static final /* enum */ class07830 field_13203 = new class07830(5, "MOTION_BLOCKING_NO_LEAVES", class07822.field_16424, class005002 -> (class005002.M() || !class005002.Y().W()) && !(class005002.i() instanceof class07131));
    public static final Codec<class07830> field_24772;
    private static final IntFunction<class07830> field_56680;
    public static final class02362<ByteBuf, class07830> field_56679;
    private final int field_56681;
    private final String field_13204;
    private final class07822 field_13198;
    private final Predicate<class00500> field_16568;
    private static final /* synthetic */ class07830[] field_13199;

    public boolean L() {
        return this.field_13198 != class07822.field_13207;
    }

    private class07830(int n2, String string2, class07822 class078222, Predicate<class00500> predicate) {
        this.field_56681 = n2;
        this.field_13204 = string2;
        this.field_13198 = class078222;
        this.field_16568 = predicate;
    }

    public static class07830[] values() {
        return (class07830[])field_13199.clone();
    }

    public static class07830 valueOf(String string) {
        return Enum.valueOf(class07830.class, string);
    }

    private static /* synthetic */ class07830[] i() {
        return new class07830[]{field_13194, field_13202, field_13195, field_13200, field_13197, field_13203};
    }

    public Predicate<class00500> u() {
        return this.field_16568;
    }

    public boolean y() {
        return this.field_13198 == class07822.field_16424;
    }

    public String N() {
        return this.field_13204;
    }

    private static /* synthetic */ int N(class07830 class078302) {
        return class078302.field_56681;
    }

    public String method_15434() {
        return this.field_13204;
    }

    static {
        field_13199 = class07830.i();
        field_24772 = class05033.N(class07830::values);
        field_56680 = class02121.N(class078302 -> class078302.field_56681, (Object[])class07830.values(), (class02126)class02126.field_41664);
        field_56679 = class02389.N(field_56680, class078302 -> class078302.field_56681);
    }
}

