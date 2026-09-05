/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03063
 *  minecraft.class06202
 *  minecraft.class08066
 */
package minecraft;

import java.util.Locale;
import minecraft.class03063;
import minecraft.class06202;
import minecraft.class08066;
import minecraft.class08743;

public final class class08768
extends Enum<class08768> {
    public static final /* enum */ class08768 field_61022 = new class08768(class08743.field_60923, class08743.field_60925);
    public static final /* enum */ class08768 field_61023 = new class08768(class08743.field_60926);
    public static final /* enum */ class08768 field_61024 = new class08768(class08743.field_60927);
    private final String field_61025;
    private final class08743[] field_61026;
    private static final /* synthetic */ class08768[] field_61027;

    public class08066 L() {
        class06202 class062022 = class06202.Nq();
        class08066 class080662 = switch (this.ordinal()) {
            case 2 -> ((class03063)class062022.B_2).b();
            case 1 -> ((class03063)class062022.B_2).P();
            default -> class062022.e();
        };
        return class080662 != null ? class080662 : class062022.e();
    }

    private class08768(class08743 ... class08743Array) {
        this.field_61026 = class08743Array;
        this.field_61025 = this.toString().toLowerCase(Locale.ROOT);
    }

    static {
        field_61027 = class08768.u();
    }

    public static class08768[] values() {
        return (class08768[])field_61027.clone();
    }

    public static class08768 valueOf(String string) {
        return Enum.valueOf(class08768.class, string);
    }

    private static /* synthetic */ class08768[] u() {
        return new class08768[]{field_61022, field_61023, field_61024};
    }

    public class08743[] y() {
        return this.field_61026;
    }

    public String N() {
        return this.field_61025;
    }
}

