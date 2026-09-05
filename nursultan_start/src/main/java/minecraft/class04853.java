/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class05031
 *  minecraft.class05033
 */
package minecraft;

import minecraft.class00392;
import minecraft.class05031;
import minecraft.class05033;

public final class class04853
extends Enum<class04853>
implements class05033 {
    public static final /* enum */ class04853 field_23329 = new class04853("rollable");
    public static final /* enum */ class04853 field_23330 = new class04853("aligned");
    public static final class05031<class04853> field_54790;
    private final String field_23331;
    private static final /* synthetic */ class04853[] field_23332;

    private class04853(String string2) {
        this.field_23331 = string2;
    }

    public static class04853[] values() {
        return (class04853[])field_23332.clone();
    }

    public static class04853 valueOf(String string) {
        return Enum.valueOf(class04853.class, string);
    }

    private static /* synthetic */ class04853[] y() {
        return new class04853[]{field_23329, field_23330};
    }

    public class00392 N() {
        return class00392.L((String)("jigsaw_block.joint." + this.field_23331));
    }

    public String method_15434() {
        return this.field_23331;
    }

    static {
        field_23332 = class04853.y();
        field_54790 = class05033.N(class04853::values);
    }
}

