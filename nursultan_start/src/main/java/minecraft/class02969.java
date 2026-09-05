/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00751
 *  minecraft.class01022
 *  minecraft.class01042
 *  minecraft.class02003
 *  minecraft.class04206
 */
package minecraft;

import java.util.List;
import minecraft.class00751;
import minecraft.class01022;
import minecraft.class01042;
import minecraft.class02003;
import minecraft.class04206;

public final class class02969
extends Enum<class02969> {
    public static final /* enum */ class02969 field_39971 = new class02969();
    public static final /* enum */ class02969 field_39972 = new class02969();
    public static final /* enum */ class02969 field_39973 = new class02969();
    public static final /* enum */ class02969 field_39974 = new class02969();
    private static final List<class02969> field_39975;
    private static final class01022 field_39976;
    private static final /* synthetic */ class02969[] field_39977;

    static {
        field_39977 = class02969.y();
        field_39975 = List.of(class02969.values());
        field_39976 = class01042.N((class00751)class04206.NF);
    }

    public static class02969[] values() {
        return (class02969[])field_39977.clone();
    }

    public static class02969 valueOf(String string) {
        return Enum.valueOf(class02969.class, string);
    }

    private static /* synthetic */ class02969[] y() {
        return new class02969[]{field_39971, field_39972, field_39973, field_39974};
    }

    public static class02003<class02969> N() {
        return new class02003(field_39975).N((Object)field_39971, new class01022[]{field_39976});
    }
}

