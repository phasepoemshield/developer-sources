/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02150
 */
package minecraft;

import java.util.function.Consumer;
import minecraft.class02150;

public final class class05753
extends Enum<class05753> {
    public static final /* enum */ class05753 field_18348 = new class05753(class021502 -> {});
    public static final /* enum */ class05753 field_18349 = new class05753(class02150::N);
    private final Consumer<class02150<?>> field_18350;
    private static final /* synthetic */ class05753[] field_18351;

    private class05753(Consumer<class02150<?>> consumer) {
        this.field_18350 = consumer;
    }

    static {
        field_18351 = class05753.N();
    }

    public static class05753[] values() {
        return (class05753[])field_18351.clone();
    }

    public static class05753 valueOf(String string) {
        return Enum.valueOf(class05753.class, string);
    }

    public void N(class02150<?> class021502) {
        this.field_18350.accept(class021502);
    }

    private static /* synthetic */ class05753[] N() {
        return new class05753[]{field_18348, field_18349};
    }
}

