/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03556
 *  minecraft.class04891
 *  minecraft.class04909
 *  minecraft.class05033
 */
package minecraft;

import minecraft.class03556;
import minecraft.class04891;
import minecraft.class04909;
import minecraft.class05033;
import minecraft.class08065;

public final class class08089
extends Enum<class08089>
implements class05033 {
    public static final /* enum */ class08089 field_12648 = new class08089("harp", (class03556<class04891>)class04909.nk, class08065.field_41606);
    public static final /* enum */ class08089 field_12653 = new class08089("basedrum", (class03556<class04891>)class04909.nn, class08065.field_41606);
    public static final /* enum */ class08089 field_12643 = new class08089("snare", (class03556<class04891>)class04909.nO, class08065.field_41606);
    public static final /* enum */ class08089 field_12645 = new class08089("hat", (class03556<class04891>)class04909.nY, class08065.field_41606);
    public static final /* enum */ class08089 field_12651 = new class08089("bass", (class03556<class04891>)class04909.nt, class08065.field_41606);
    public static final /* enum */ class08089 field_12650 = new class08089("flute", (class03556<class04891>)class04909.nd, class08065.field_41606);
    public static final /* enum */ class08089 field_12644 = new class08089("bell", (class03556<class04891>)class04909.nG, class08065.field_41606);
    public static final /* enum */ class08089 field_12654 = new class08089("guitar", (class03556<class04891>)class04909.nw, class08065.field_41606);
    public static final /* enum */ class08089 field_12647 = new class08089("chime", (class03556<class04891>)class04909.nl, class08065.field_41606);
    public static final /* enum */ class08089 field_12655 = new class08089("xylophone", (class03556<class04891>)class04909.ng, class08065.field_41606);
    public static final /* enum */ class08089 field_18284 = new class08089("iron_xylophone", (class03556<class04891>)class04909.nI, class08065.field_41606);
    public static final /* enum */ class08089 field_18285 = new class08089("cow_bell", (class03556<class04891>)class04909.nJ, class08065.field_41606);
    public static final /* enum */ class08089 field_18286 = new class08089("didgeridoo", (class03556<class04891>)class04909.no, class08065.field_41606);
    public static final /* enum */ class08089 field_18287 = new class08089("bit", (class03556<class04891>)class04909.nq, class08065.field_41606);
    public static final /* enum */ class08089 field_18288 = new class08089("banjo", (class03556<class04891>)class04909.nK, class08065.field_41606);
    public static final /* enum */ class08089 field_18289 = new class08089("pling", (class03556<class04891>)class04909.nQ, class08065.field_41606);
    public static final /* enum */ class08089 field_41324 = new class08089("zombie", (class03556<class04891>)class04909.nV, class08065.field_41607);
    public static final /* enum */ class08089 field_41325 = new class08089("skeleton", (class03556<class04891>)class04909.ne, class08065.field_41607);
    public static final /* enum */ class08089 field_41326 = new class08089("creeper", (class03556<class04891>)class04909.nH, class08065.field_41607);
    public static final /* enum */ class08089 field_41327 = new class08089("dragon", (class03556<class04891>)class04909.nc, class08065.field_41607);
    public static final /* enum */ class08089 field_41328 = new class08089("wither_skeleton", (class03556<class04891>)class04909.nX, class08065.field_41607);
    public static final /* enum */ class08089 field_41329 = new class08089("piglin", (class03556<class04891>)class04909.na, class08065.field_41607);
    public static final /* enum */ class08089 field_41604 = new class08089("custom_head", (class03556<class04891>)class04909.OK, class08065.field_41608);
    private final String field_12646;
    private final class03556<class04891> field_12649;
    private final class08065 field_41605;
    private static final /* synthetic */ class08089[] field_12652;

    public boolean L() {
        return this.field_41605 == class08065.field_41608;
    }

    private class08089(String string2, class03556<class04891> class035562, class08065 class080652) {
        this.field_12646 = string2;
        this.field_12649 = class035562;
        this.field_41605 = class080652;
    }

    public static class08089[] values() {
        return (class08089[])field_12652.clone();
    }

    public static class08089 valueOf(String string) {
        return Enum.valueOf(class08089.class, string);
    }

    private static /* synthetic */ class08089[] i() {
        return new class08089[]{field_12648, field_12653, field_12643, field_12645, field_12651, field_12650, field_12644, field_12654, field_12647, field_12655, field_18284, field_18285, field_18286, field_18287, field_18288, field_18289, field_41324, field_41325, field_41326, field_41327, field_41328, field_41329, field_41604};
    }

    public boolean u() {
        return this.field_41605 != class08065.field_41606;
    }

    public boolean y() {
        return this.field_41605 == class08065.field_41606;
    }

    public class03556<class04891> N() {
        return this.field_12649;
    }

    public String method_15434() {
        return this.field_12646;
    }

    static {
        field_12652 = class08089.i();
    }
}

