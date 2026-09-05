/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public class class11165
extends Enum<class11165> {
    public static final /* enum */ class11165 OTHER;
    public static final /* enum */ class11165 ARMOR;
    public String fields_0a262264537dd3115aa48ba594652f10f_0;
    public static final /* enum */ class11165 TOOLS;
    public static final /* enum */ class11165 SPHERES;
    public static final /* enum */ class11165 TALISMANS;
    public static final /* enum */ class11165 POTIONS;
    public static final /* enum */ class11165 CONSUMABLES;
    public static final /* enum */ class11165 ARROWS;
    public static final /* enum */ class11165 BLOCKS;
    private static final /* synthetic */ class11165[] $VALUES;

    private class11165(String string2) {
        this.R();
        this.fields_0a262264537dd3115aa48ba594652f10f_0 = string2;
    }

    static {
        class11165.i();
        OTHER = new class11165("autobuy.category.other");
        ARMOR = new class11165("autobuy.category.armor");
        TOOLS = new class11165("autobuy.category.tools");
        SPHERES = new class11165("autobuy.category.spheres");
        TALISMANS = new class11165("autobuy.category.talismans");
        POTIONS = new class11165("autobuy.category.potions");
        CONSUMABLES = new class11165("autobuy.category.consumables");
        ARROWS = new class11165("autobuy.category.arrows");
        BLOCKS = new class11165("autobuy.category.blocks");
        $VALUES = class11165.y();
    }

    public static class11165[] values() {
        return (class11165[])$VALUES.clone();
    }

    public static class11165 valueOf(String string) {
        return Enum.valueOf(class11165.class, string);
    }

    private static void i() {
    }

    private static /* synthetic */ class11165[] y() {
        return new class11165[]{OTHER, ARMOR, TOOLS, SPHERES, TALISMANS, POTIONS, CONSUMABLES, ARROWS, BLOCKS};
    }

    public String N() {
        return this.fields_0a262264537dd3115aa48ba594652f10f_0;
    }

    private void R() {
    }
}

