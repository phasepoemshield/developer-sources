/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class00500
 *  minecraft.class00869
 *  minecraft.class04684
 *  minecraft.class04688
 *  minecraft.class07209
 *  minecraft.class07290
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class00394;
import minecraft.class00500;
import minecraft.class00869;
import minecraft.class04684;
import minecraft.class04688;
import minecraft.class07209;
import minecraft.class07290;
import org.jspecify.annotations.Nullable;

public final class class00515
extends Enum<class00515>
implements class07290 {
    public static final /* enum */ class00515 field_12294 = new class00515();
    private static final /* synthetic */ class00515[] field_12295;

    public int method_31607() {
        return 0;
    }

    public class00500 method_8320(class07209 class072092) {
        return class00869.N.W();
    }

    public class04688 method_8316(class07209 class072092) {
        return class04684.N.M();
    }

    public static class00515[] values() {
        return (class00515[])field_12295.clone();
    }

    public static class00515 valueOf(String string) {
        return Enum.valueOf(class00515.class, string);
    }

    private static /* synthetic */ class00515[] N() {
        return new class00515[]{field_12294};
    }

    public @Nullable class00394 method_8321(class07209 class072092) {
        return null;
    }

    public int method_31605() {
        return 0;
    }

    static {
        field_12295 = class00515.N();
    }
}

