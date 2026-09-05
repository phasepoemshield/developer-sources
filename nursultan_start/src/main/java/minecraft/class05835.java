/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01231
 *  minecraft.class04688
 */
package minecraft;

import java.util.function.Predicate;
import minecraft.class01231;
import minecraft.class04688;

public final class class05835
extends Enum<class05835> {
    public static final /* enum */ class05835 field_1348 = new class05835(class046882 -> false);
    public static final /* enum */ class05835 field_1345 = new class05835(class04688::u);
    public static final /* enum */ class05835 field_1347 = new class05835(class046882 -> !class046882.W());
    public static final /* enum */ class05835 field_36338 = new class05835(class046882 -> class046882.N(class01231.N));
    private final Predicate<class04688> field_1346;
    private static final /* synthetic */ class05835[] field_1349;

    private class05835(Predicate<class04688> predicate) {
        this.field_1346 = predicate;
    }

    static {
        field_1349 = class05835.N();
    }

    public static class05835[] values() {
        return (class05835[])field_1349.clone();
    }

    public static class05835 valueOf(String string) {
        return Enum.valueOf(class05835.class, string);
    }

    private static /* synthetic */ class05835[] N() {
        return new class05835[]{field_1348, field_1345, field_1347, field_36338};
    }

    public boolean N(class04688 class046882) {
        return this.field_1346.test(class046882);
    }
}

