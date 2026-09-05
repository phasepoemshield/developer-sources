/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05033
 *  minecraft.class06551
 *  minecraft.class06584
 *  minecraft.class07491
 *  minecraft.class07611
 */
package minecraft;

import minecraft.class05033;
import minecraft.class06551;
import minecraft.class06584;
import minecraft.class07491;
import minecraft.class07611;

public final class class05915
extends Enum<class05915>
implements class05033,
class07611<class06584> {
    public static final /* enum */ class05915 field_63054 = new class05915("tool", (class07491<? extends class06584>)class06551.U);
    private final String field_63055;
    private final class07491<? extends class06584> field_63056;
    private static final /* synthetic */ class05915[] field_63057;

    private class05915(String string2, class07491<? extends class06584> class074912) {
        this.field_63055 = string2;
        this.field_63056 = class074912;
    }

    public static class05915[] values() {
        return (class05915[])field_63057.clone();
    }

    public static class05915 valueOf(String string) {
        return Enum.valueOf(class05915.class, string);
    }

    private static /* synthetic */ class05915[] y() {
        return new class05915[]{field_63054};
    }

    public class07491<? extends class06584> N() {
        return this.field_63056;
    }

    public String method_15434() {
        return this.field_63055;
    }

    static {
        field_63057 = class05915.y();
    }
}

