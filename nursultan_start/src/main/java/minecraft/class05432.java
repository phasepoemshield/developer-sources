/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00891
 *  minecraft.class01894
 *  minecraft.class05388
 *  minecraft.class05403
 *  minecraft.class05404
 *  minecraft.class06581
 */
package minecraft;

import minecraft.class00891;
import minecraft.class01894;
import minecraft.class05388;
import minecraft.class05403;
import minecraft.class05404;
import minecraft.class05433;
import minecraft.class06581;

public final class class05432
extends Enum<class05432> {
    public static final /* enum */ class05432 field_22839 = new class05432(class05433.Ns, class05433.Nj, false);
    public static final /* enum */ class05432 field_22840 = new class05432(class05433.NP, class05433.Nb, false);
    public static final /* enum */ class05432 field_55176 = new class05432(class05433.NT, class05433.Nv, true);
    private final class05403 field_55177;
    private final class05403 field_55178;
    private final boolean field_55179;
    private static final /* synthetic */ class05432[] field_22841;

    private static /* synthetic */ class05432[] L() {
        return new class05432[]{field_22839, field_22840, field_55176};
    }

    private class05432(class05403 class054032, class05403 class054033, boolean bl) {
        this.field_55177 = class054032;
        this.field_55178 = class054033;
        this.field_55179 = bl;
    }

    static {
        field_22841 = class05432.L();
    }

    public static class05432[] values() {
        return (class05432[])field_22841.clone();
    }

    public static class05432 valueOf(String string) {
        return Enum.valueOf(class05432.class, string);
    }

    public class05388 y(class00891 class008912) {
        return this.field_55179 ? class05388.M((class00891)class008912) : class05388.R((class00891)class008912);
    }

    public class05403 y() {
        return this.field_55178;
    }

    public class01894 N(class05404 class054042, class00891 class008912) {
        class06581 class065812 = class008912.B();
        if (this.field_55179) {
            return class054042.y(class065812, class008912, "_emissive");
        }
        return class054042.N(class065812, class008912);
    }

    public class05388 N(class00891 class008912) {
        return this.field_55179 ? class05388.i((class00891)class008912) : class05388.L((class00891)class008912);
    }

    public class05403 N() {
        return this.field_55177;
    }
}

