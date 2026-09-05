/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

public final class class10049
extends Enum<class10049> {
    public static final /* enum */ class10049 BOX = new class10049("box");
    public static final /* enum */ class10049 CANVAS = new class10049("canvas");
    public static final /* enum */ class10049 INPUT = new class10049("input");
    public static final /* enum */ class10049 TEXT = new class10049("text");
    public static final /* enum */ class10049 TEXTURE = new class10049("texture");
    private final String tagName;
    private static final /* synthetic */ class10049[] $VALUES;

    private class10049(String string2) {
        this.tagName = string2;
    }

    static {
        $VALUES = class10049.y();
    }

    public static class10049[] values() {
        return (class10049[])$VALUES.clone();
    }

    public static class10049 valueOf(String string) {
        return Enum.valueOf(class10049.class, string);
    }

    private static /* synthetic */ class10049[] y() {
        return new class10049[]{BOX, CANVAS, INPUT, TEXT, TEXTURE};
    }

    public String N() {
        return this.tagName;
    }
}

