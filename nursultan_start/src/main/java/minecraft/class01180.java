/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01421
 *  minecraft.class06584
 *  minecraft.class07070
 *  minecraft.class08827
 */
package minecraft;

import minecraft.class01172;
import minecraft.class01421;
import minecraft.class06584;
import minecraft.class07070;
import minecraft.class08827;

public class class01180
extends Enum<class01180> {
    public static final /* enum */ class01180 field_3409 = new class01180(false, false);
    public static final /* enum */ class01180 field_3410 = new class01180(false, false);
    public static final /* enum */ class01180 field_3406 = new class01180(false, false);
    public static final /* enum */ class01180 field_3403 = new class01180(true, true);
    public static final /* enum */ class01180 field_63542 = new class01180(false, true);
    public static final /* enum */ class01180 field_3405 = new class01180(true, true);
    public static final /* enum */ class01180 field_3408 = new class01180(true, true);
    public static final /* enum */ class01180 field_27434 = new class01180(false, false);
    public static final /* enum */ class01180 field_39071 = new class01180(false, false);
    public static final /* enum */ class01180 field_42877 = new class01180(false, false);
    public static final /* enum */ class01180 field_63543 = new class01172("SPEAR", 10, false, true);
    private final boolean field_25722;
    private final boolean field_64557;
    private static final /* synthetic */ class01180[] field_3404;

    private static /* synthetic */ class01180[] L() {
        return new class01180[]{field_3409, field_3410, field_3406, field_3403, field_63542, field_3405, field_3408, field_27434, field_39071, field_42877, field_63543};
    }

    class01180(boolean bl, boolean bl2) {
        this.field_25722 = bl;
        this.field_64557 = bl2;
    }

    static {
        field_3404 = class01180.L();
    }

    public static class01180[] values() {
        return (class01180[])field_3404.clone();
    }

    public static class01180 valueOf(String string) {
        return Enum.valueOf(class01180.class, string);
    }

    public boolean y() {
        return this.field_64557;
    }

    public <S extends class08827> void N(S s, class01421 class014212, float f, class07070 class070702, class06584 class065842) {
    }

    public boolean N() {
        return this.field_25722;
    }
}

