/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import minecraft.class01539;
import minecraft.class01553;
import minecraft.class01576;

final class class01548
extends Enum<class01548> {
    public static final /* enum */ class01548 field_13655 = new class01548(class01539.N, class01576.N);
    public static final /* enum */ class01548 field_13652 = new class01548(class01539.N, (class051632, class072092, class009032, class047822) -> {
        if (class072092.method_10263() == class051632.B() || class072092.method_10263() == class051632.U() || class072092.method_10264() == class051632.Z() || class072092.method_10264() == class051632.E() || class072092.method_10260() == class051632.z() || class072092.method_10260() == class051632.W()) {
            return class009032;
        }
        return null;
    });
    public static final /* enum */ class01548 field_13656 = new class01548(class01539.N, (class051632, class072092, class009032, class047822) -> {
        if (class072092.method_10263() == class051632.B() || class072092.method_10263() == class051632.U() || class072092.method_10264() == class051632.Z() || class072092.method_10264() == class051632.E() || class072092.method_10260() == class051632.z() || class072092.method_10260() == class051632.W()) {
            return class009032;
        }
        return class01553.N;
    });
    public static final /* enum */ class01548 field_13651 = new class01548((class047822, class072092) -> class047822.N(class072092, true), class01576.N);
    public final class01576 field_13654;
    public final class01539 field_55587;
    private static final /* synthetic */ class01548[] field_13653;

    private class01548(class01539 class015392, class01576 class015762) {
        this.field_55587 = class015392;
        this.field_13654 = class015762;
    }

    static {
        field_13653 = class01548.N();
    }

    public static class01548[] values() {
        return (class01548[])field_13653.clone();
    }

    public static class01548 valueOf(String string) {
        return Enum.valueOf(class01548.class, string);
    }

    private static /* synthetic */ class01548[] N() {
        return new class01548[]{field_13655, field_13652, field_13656, field_13651};
    }
}

