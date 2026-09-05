/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import minecraft.class03824;
import org.jspecify.annotations.Nullable;

final class class03834
extends Enum<class03834> {
    public static final /* enum */ class03834 field_47651 = new class03834(class03824.field_47626);
    public static final /* enum */ class03834 field_47652 = new class03834(class03824.field_47627);
    public static final /* enum */ class03834 field_47653 = new class03834(class03824.field_47623);
    public static final /* enum */ class03834 field_47654 = new class03834(class03824.field_47625);
    public static final /* enum */ class03834 field_47655 = new class03834(null);
    public static final /* enum */ class03834 field_47656 = new class03834(null);
    final @Nullable class03824 field_47657;
    private static final /* synthetic */ class03834[] field_47658;

    private class03834(class03824 class038242) {
        this.field_47657 = class038242;
    }

    static {
        field_47658 = class03834.N();
    }

    public static class03834[] values() {
        return (class03834[])field_47658.clone();
    }

    public static class03834 valueOf(String string) {
        return Enum.valueOf(class03834.class, string);
    }

    private static /* synthetic */ class03834[] N() {
        return new class03834[]{field_47651, field_47652, field_47653, field_47654, field_47655, field_47656};
    }
}

