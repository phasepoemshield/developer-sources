/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00405
 *  minecraft.class05935
 *  minecraft.class05977
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Optional;
import minecraft.class00405;
import minecraft.class01751;
import minecraft.class05935;
import minecraft.class05977;

public final class class01725
extends Record
implements class01751 {
    private final String text;

    public class01725(String string) {
        this.text = string;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01725.class, "text", "text"}, this, object);
    }

    public String toString() {
        return "literal{" + this.text + "}";
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01725.class, "text", "text"}, this);
    }

    @Override
    public String comp_737() {
        return this.text;
    }

    public <T> Optional<T> method_27660(class05935<T> class059352, class00405 class004052) {
        return class059352.accept(class004052, this.text);
    }

    public <T> Optional<T> method_27659(class05977<T> class059772) {
        return class059772.accept(this.text);
    }
}

