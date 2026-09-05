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

public final class class03785
extends Enum<class03785> {
    public static final /* enum */ class03785 field_40490 = new class03785();
    public static final /* enum */ class03785 field_40491 = new class03785();
    private static final List<class03785> field_40492;
    private static final class01022 field_40493;
    private static final /* synthetic */ class03785[] field_40494;

    public static class03785[] values() {
        return (class03785[])field_40494.clone();
    }

    public static class03785 valueOf(String string) {
        return Enum.valueOf(class03785.class, string);
    }

    private static /* synthetic */ class03785[] y() {
        return new class03785[]{field_40490, field_40491};
    }

    public static class02003<class03785> N() {
        return new class02003(field_40492).N((Object)field_40490, new class01022[]{field_40493});
    }

    static {
        field_40494 = class03785.y();
        field_40492 = List.of(class03785.values());
        field_40493 = class01042.N((class00751)class04206.NF);
    }
}

