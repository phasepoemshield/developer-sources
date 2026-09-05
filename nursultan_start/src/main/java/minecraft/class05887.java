/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00394
 *  minecraft.class05033
 *  minecraft.class06551
 *  minecraft.class07491
 *  minecraft.class07611
 */
package minecraft;

import minecraft.class00394;
import minecraft.class05033;
import minecraft.class06551;
import minecraft.class07491;
import minecraft.class07611;

public final class class05887
extends Enum<class05887>
implements class05033,
class07611<class00394> {
    public static final /* enum */ class05887 field_49436 = new class05887("block_entity", (class07491<? extends class00394>)class06551.z);
    private final String field_49438;
    private final class07491<? extends class00394> field_63053;
    private static final /* synthetic */ class05887[] field_49439;

    private class05887(String string2, class07491<? extends class00394> class074912) {
        this.field_49438 = string2;
        this.field_63053 = class074912;
    }

    public static class05887[] values() {
        return (class05887[])field_49439.clone();
    }

    public static class05887 valueOf(String string) {
        return Enum.valueOf(class05887.class, string);
    }

    private static /* synthetic */ class05887[] y() {
        return new class05887[]{field_49436};
    }

    public class07491<? extends class00394> N() {
        return this.field_63053;
    }

    public String method_15434() {
        return this.field_49438;
    }

    static {
        field_49439 = class05887.y();
    }
}

