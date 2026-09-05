/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  minecraft.class07211
 */
package minecraft;

import com.google.common.collect.Sets;
import java.util.Arrays;
import java.util.Set;
import minecraft.class00753;
import minecraft.class07211;

public final class class00758
extends Enum<class00758> {
    public static final /* enum */ class00758 field_11069 = new class00758(class07211.field_11043);
    public static final /* enum */ class00758 field_11074 = new class00758(class07211.field_11043, class07211.field_11034);
    public static final /* enum */ class00758 field_11075 = new class00758(class07211.field_11034);
    public static final /* enum */ class00758 field_11070 = new class00758(class07211.field_11035, class07211.field_11034);
    public static final /* enum */ class00758 field_11073 = new class00758(class07211.field_11035);
    public static final /* enum */ class00758 field_11068 = new class00758(class07211.field_11035, class07211.field_11039);
    public static final /* enum */ class00758 field_11072 = new class00758(class07211.field_11039);
    public static final /* enum */ class00758 field_11076 = new class00758(class07211.field_11043, class07211.field_11039);
    private final Set<class07211> field_11078;
    private final class00753 field_37995;
    private static final /* synthetic */ class00758[] field_11071;

    public int L() {
        return this.field_37995.method_10260();
    }

    private class00758(class07211 ... class07211Array) {
        this.field_11078 = Sets.immutableEnumSet(Arrays.asList(class07211Array));
        this.field_37995 = new class00753(0, 0, 0);
        for (class07211 class072112 : class07211Array) {
            this.field_37995.method_20787(this.field_37995.method_10263() + class072112.P()).method_10099(this.field_37995.method_10264() + class072112.s()).method_20788(this.field_37995.method_10260() + class072112.T());
        }
    }

    static {
        field_11071 = class00758.u();
    }

    public static class00758[] values() {
        return (class00758[])field_11071.clone();
    }

    public static class00758 valueOf(String string) {
        return Enum.valueOf(class00758.class, string);
    }

    private static /* synthetic */ class00758[] u() {
        return new class00758[]{field_11069, field_11074, field_11075, field_11070, field_11073, field_11068, field_11072, field_11076};
    }

    public int y() {
        return this.field_37995.method_10263();
    }

    public Set<class07211> N() {
        return this.field_11078;
    }
}

