/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00780
 *  minecraft.class02121
 *  minecraft.class02126
 *  minecraft.class02362
 *  minecraft.class02389
 *  minecraft.class03556
 *  minecraft.class03557
 *  minecraft.class05031
 *  minecraft.class05033
 */
package minecraft;

import io.netty.buffer.ByteBuf;
import java.util.function.IntFunction;
import minecraft.class00780;
import minecraft.class02121;
import minecraft.class02126;
import minecraft.class02362;
import minecraft.class02389;
import minecraft.class03556;
import minecraft.class03557;
import minecraft.class05031;
import minecraft.class05033;

public final class class01319
extends Enum<class01319>
implements class05033 {
    public static final /* enum */ class01319 field_17996 = new class01319(0, "red");
    public static final /* enum */ class01319 field_17997 = new class01319(1, "snow");
    public static final class01319 field_57610;
    public static final class05031<class01319> field_41548;
    private static final IntFunction<class01319> field_17998;
    public static final class02362<ByteBuf, class01319> field_55960;
    private final int field_18000;
    private final String field_18001;
    private static final /* synthetic */ class01319[] field_18003;

    private class01319(int n2, String string2) {
        this.field_18000 = n2;
        this.field_18001 = string2;
    }

    public static class01319[] values() {
        return (class01319[])field_18003.clone();
    }

    public static class01319 valueOf(String string) {
        return Enum.valueOf(class01319.class, string);
    }

    private static /* synthetic */ class01319[] y() {
        return new class01319[]{field_17996, field_17997};
    }

    public int N() {
        return this.field_18000;
    }

    public static class01319 N(int n) {
        return field_17998.apply(n);
    }

    public static class01319 N(class03556<class00780> class035562) {
        return class035562.N(class03557.NP) ? field_17997 : field_17996;
    }

    public String method_15434() {
        return this.field_18001;
    }

    static {
        field_18003 = class01319.y();
        field_57610 = field_17996;
        field_41548 = class05033.N(class01319::values);
        field_17998 = class02121.N(class01319::N, (Object[])class01319.values(), (class02126)class02126.field_41664);
        field_55960 = class02389.N(field_17998, class01319::N);
    }
}

