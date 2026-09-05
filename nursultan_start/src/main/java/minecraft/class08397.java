/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05989
 *  minecraft.class07049
 */
package minecraft;

import java.util.function.Consumer;
import minecraft.class05989;
import minecraft.class07049;

public final class class08397
extends Enum<class08397> {
    public static final /* enum */ class08397 field_56642 = new class08397(class070492 -> {
        class070492.method_32319(true);
        if (class070492.method_32316()) {
            class070492.method_32317(Math.min(class070492.method_32315(), class070492.method_32312() + 1));
        }
    });
    public static final /* enum */ class08397 field_61896 = new class08397(class07049::method_67635);
    public static final /* enum */ class08397 field_56643 = new class08397(class05989::N);
    public static final /* enum */ class08397 field_56644 = new class08397(class07049::method_67633);
    public static final /* enum */ class08397 field_56645 = new class08397(class07049::method_5646);
    private final Consumer<class07049> field_56646;
    private static final /* synthetic */ class08397[] field_56647;

    private class08397(Consumer<class07049> consumer) {
        this.field_56646 = consumer;
    }

    static {
        field_56647 = class08397.y();
    }

    public static class08397[] values() {
        return (class08397[])field_56647.clone();
    }

    public static class08397 valueOf(String string) {
        return Enum.valueOf(class08397.class, string);
    }

    private static /* synthetic */ class08397[] y() {
        return new class08397[]{field_56642, field_61896, field_56643, field_56644, field_56645};
    }

    public Consumer<class07049> N() {
        return this.field_56646;
    }
}

