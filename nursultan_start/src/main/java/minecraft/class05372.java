/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.util.function.Predicate;
import minecraft.class05377;

public final class class05372
extends Enum<class05372> {
    public static final /* enum */ class05372 field_18487 = new class05372(class05377::i);
    public static final /* enum */ class05372 field_18488 = new class05372(class05377::R);
    public static final /* enum */ class05372 field_18489 = new class05372(class053772 -> true);
    private final Predicate<? super class05377> field_18490;
    private static final /* synthetic */ class05372[] field_18491;

    private class05372(Predicate<? super class05377> predicate) {
        this.field_18490 = predicate;
    }

    static {
        field_18491 = class05372.y();
    }

    public static class05372[] values() {
        return (class05372[])field_18491.clone();
    }

    public static class05372 valueOf(String string) {
        return Enum.valueOf(class05372.class, string);
    }

    private static /* synthetic */ class05372[] y() {
        return new class05372[]{field_18487, field_18488, field_18489};
    }

    public Predicate<? super class05377> N() {
        return this.field_18490;
    }
}

