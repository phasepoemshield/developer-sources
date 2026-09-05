/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package minecraft;

import minecraft.class00392;

public final class class04969
extends Enum<class04969> {
    public static final /* enum */ class04969 field_19437 = new class04969("normal");
    public static final /* enum */ class04969 field_19438 = new class04969("minigame");
    public static final /* enum */ class04969 field_19439 = new class04969("adventureMap");
    public static final /* enum */ class04969 field_19440 = new class04969("experience");
    public static final /* enum */ class04969 field_19441 = new class04969("inspiration");
    public static final /* enum */ class04969 field_63822 = new class04969("unknown");
    private static final String field_63823 = "mco.backup.entry.worldType.";
    private final class00392 field_63824;
    private static final /* synthetic */ class04969[] field_19442;

    private class04969(String string2) {
        this.field_63824 = class00392.L((String)(field_63823 + string2));
    }

    static {
        field_19442 = class04969.y();
    }

    public static class04969[] values() {
        return (class04969[])field_19442.clone();
    }

    public static class04969 valueOf(String string) {
        return Enum.valueOf(class04969.class, string);
    }

    private static /* synthetic */ class04969[] y() {
        return new class04969[]{field_19437, field_19438, field_19439, field_19440, field_19441, field_63822};
    }

    public class00392 N() {
        return this.field_63824;
    }
}

