/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

public final class class05565
extends Enum<class05565> {
    public static final /* enum */ class05565 field_28533 = new class05565("button");
    public static final /* enum */ class05565 field_28534 = new class05565("chiseled");
    public static final /* enum */ class05565 field_29503 = new class05565("cracked");
    public static final /* enum */ class05565 field_33689 = new class05565("cut");
    public static final /* enum */ class05565 field_28535 = new class05565("door");
    public static final /* enum */ class05565 field_40592 = new class05565("fence");
    public static final /* enum */ class05565 field_28536 = new class05565("fence");
    public static final /* enum */ class05565 field_40593 = new class05565("fence_gate");
    public static final /* enum */ class05565 field_28537 = new class05565("fence_gate");
    public static final /* enum */ class05565 field_40594 = new class05565("mosaic");
    public static final /* enum */ class05565 field_28538 = new class05565("sign");
    public static final /* enum */ class05565 field_28539 = new class05565("slab");
    public static final /* enum */ class05565 field_28540 = new class05565("stairs");
    public static final /* enum */ class05565 field_28541 = new class05565("pressure_plate");
    public static final /* enum */ class05565 field_28542 = new class05565("polished");
    public static final /* enum */ class05565 field_28543 = new class05565("trapdoor");
    public static final /* enum */ class05565 field_28544 = new class05565("wall");
    public static final /* enum */ class05565 field_28545 = new class05565("wall_sign");
    private final String field_28546;
    private static final /* synthetic */ class05565[] field_28547;

    private class05565(String string2) {
        this.field_28546 = string2;
    }

    static {
        field_28547 = class05565.y();
    }

    public static class05565[] values() {
        return (class05565[])field_28547.clone();
    }

    public static class05565 valueOf(String string) {
        return Enum.valueOf(class05565.class, string);
    }

    private static /* synthetic */ class05565[] y() {
        return new class05565[]{field_28533, field_28534, field_29503, field_33689, field_28535, field_40592, field_28536, field_40593, field_28537, field_40594, field_28538, field_28539, field_28540, field_28541, field_28542, field_28543, field_28544, field_28545};
    }

    public String N() {
        return this.field_28546;
    }
}

