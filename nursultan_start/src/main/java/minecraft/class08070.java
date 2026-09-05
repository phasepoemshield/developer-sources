/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.serialization.Codec
 *  minecraft.class00392
 *  minecraft.class05033
 *  minecraft.class06338
 */
package minecraft;

import com.mojang.serialization.Codec;
import minecraft.class00392;
import minecraft.class05033;
import minecraft.class06338;

public final class class08070
extends Enum<class08070>
implements class05033 {
    public static final /* enum */ class08070 field_12695 = new class08070("save");
    public static final /* enum */ class08070 field_12697 = new class08070("load");
    public static final /* enum */ class08070 field_12699 = new class08070("corner");
    public static final /* enum */ class08070 field_12696 = new class08070("data");
    @Deprecated
    public static final Codec<class08070> field_56673;
    private final String field_12698;
    private final class00392 field_26444;
    private static final /* synthetic */ class08070[] field_12700;

    private class08070(String string2) {
        this.field_12698 = string2;
        this.field_26444 = class00392.L((String)("structure_block.mode_info." + string2));
    }

    public static class08070[] values() {
        return (class08070[])field_12700.clone();
    }

    public static class08070 valueOf(String string) {
        return Enum.valueOf(class08070.class, string);
    }

    private static /* synthetic */ class08070[] y() {
        return new class08070[]{field_12695, field_12697, field_12699, field_12696};
    }

    public class00392 N() {
        return this.field_26444;
    }

    public String method_15434() {
        return this.field_12698;
    }

    static {
        field_12700 = class08070.y();
        field_56673 = class06338.L(class08070::valueOf);
    }
}

