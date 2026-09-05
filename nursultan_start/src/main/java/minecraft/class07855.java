/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00676
 *  minecraft.class04782
 *  minecraft.class07209
 *  minecraft.class07817
 *  minecraft.class07818
 *  minecraft.class07823
 */
package minecraft;

import java.util.List;
import minecraft.class00676;
import minecraft.class04782;
import minecraft.class07209;
import minecraft.class07817;
import minecraft.class07818;
import minecraft.class07823;
import minecraft.class07840;
import minecraft.class07851;
import minecraft.class07856;

public abstract class class07855
extends Enum<class07855> {
    public static final /* enum */ class07855 field_13097 = new class07817("START", 0);
    public static final /* enum */ class07855 field_13095 = new class07851("PREPARING_TO_SUMMON_PILLARS", 1);
    public static final /* enum */ class07855 field_13094 = new class07840("SUMMONING_PILLARS", 2);
    public static final /* enum */ class07855 field_13098 = new class07823("SUMMONING_DRAGON", 3);
    public static final /* enum */ class07855 field_13099 = new class07818("END", 4);
    private static final /* synthetic */ class07855[] field_13096;

    static {
        field_13096 = class07855.N();
    }

    public static class07855[] values() {
        return (class07855[])field_13096.clone();
    }

    public static class07855 valueOf(String string) {
        return Enum.valueOf(class07855.class, string);
    }

    private static /* synthetic */ class07855[] N() {
        return new class07855[]{field_13097, field_13095, field_13094, field_13098, field_13099};
    }

    public abstract void N(class04782 var1, class07856 var2, List<class00676> var3, int var4, class07209 var5);
}

