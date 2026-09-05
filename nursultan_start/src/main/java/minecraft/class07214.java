/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class07225
 */
package minecraft;

import minecraft.class07185;
import minecraft.class07217;
import minecraft.class07223;
import minecraft.class07225;

public abstract class class07214
extends Enum<class07214> {
    public static final /* enum */ class07214 field_10962 = new class07225("NONE", 0);
    public static final /* enum */ class07214 field_10963 = new class07217("FORWARD", 1);
    public static final /* enum */ class07214 field_10965 = new class07223("BACKWARD", 2);
    public static final class07185[] field_10961;
    public static final class07214[] field_10960;
    private static final /* synthetic */ class07214[] field_10964;

    static {
        field_10964 = class07214.y();
        field_10961 = class07185.values();
        field_10960 = class07214.values();
    }

    public static class07214[] values() {
        return (class07214[])field_10964.clone();
    }

    public static class07214 valueOf(String string) {
        return Enum.valueOf(class07214.class, string);
    }

    private static /* synthetic */ class07214[] y() {
        return new class07214[]{field_10962, field_10963, field_10965};
    }

    public static class07214 N(class07185 class071852, class07185 class071853) {
        return field_10960[Math.floorMod(class071853.ordinal() - class071852.ordinal(), 3)];
    }

    public abstract class07185 N(class07185 var1);

    public abstract class07214 N();

    public abstract double N(double var1, double var3, double var5, class07185 var7);

    public abstract int N(int var1, int var2, int var3, class07185 var4);
}

