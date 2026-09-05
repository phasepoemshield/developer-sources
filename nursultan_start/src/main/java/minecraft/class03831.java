/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06889
 */
package minecraft;

import java.util.List;
import minecraft.class03809;
import minecraft.class06889;

public final class class03831
extends Enum<class03831> {
    public static final /* enum */ class03831 field_47743 = new class03831(class03809.L);
    public static final /* enum */ class03831 field_47744 = new class03831(class03809.y);
    public static final /* enum */ class03831 field_47745 = new class03831(class03809.L);
    public static final /* enum */ class03831 field_48320 = new class03831(class03809.u);
    private final class03809 field_47746;
    private static final /* synthetic */ class03831[] field_47747;

    private class03831(class03809 class038092) {
        this.field_47746 = class038092;
    }

    public static class03831[] values() {
        return (class03831[])field_47747.clone();
    }

    public static class03831 valueOf(String string) {
        return Enum.valueOf(class03831.class, string);
    }

    private static /* synthetic */ class03831[] N() {
        return new class03831[]{field_47743, field_47744, field_47745, field_48320};
    }

    public List<class06889> N(float f, float f2) {
        return this.field_47746.create(f, f2);
    }

    static {
        field_47747 = class03831.N();
    }
}

