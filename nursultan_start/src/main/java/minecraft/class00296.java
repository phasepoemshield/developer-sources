/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00242
 *  minecraft.class06222
 */
package minecraft;

import java.util.List;
import minecraft.class00242;
import minecraft.class00305;
import minecraft.class06222;

public final class class00296
extends Enum<class00296>
implements class00242 {
    public static final /* enum */ class00296 field_54837 = new class00296(class06222.L, class06222.N, class06222.u, class06222.y);
    public static final /* enum */ class00296 field_54838 = new class00296(class06222.i, class06222.R, class06222.M);
    public static final /* enum */ class00296 field_54839 = new class00296(class06222.B, class06222.Z);
    public static final /* enum */ class00296 field_54840 = new class00296(class06222.z);
    private final List<class00305> field_54841;
    private static final /* synthetic */ class00296[] field_54842;

    private class00296(class00305 ... class00305Array) {
        this.field_54841 = List.of(class00305Array);
    }

    static {
        field_54842 = class00296.y();
    }

    public static class00296[] values() {
        return (class00296[])field_54842.clone();
    }

    public static class00296 valueOf(String string) {
        return Enum.valueOf(class00296.class, string);
    }

    private static /* synthetic */ class00296[] y() {
        return new class00296[]{field_54837, field_54838, field_54839, field_54840};
    }

    public List<class00305> N() {
        return this.field_54841;
    }
}

