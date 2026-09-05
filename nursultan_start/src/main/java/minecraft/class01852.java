/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.MatchException
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00392
 *  minecraft.class04702
 *  minecraft.class04713
 *  minecraft.class05096
 *  minecraft.class05097
 *  minecraft.class05138
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Objects;
import minecraft.class00392;
import minecraft.class01880;
import minecraft.class04702;
import minecraft.class04713;
import minecraft.class05096;
import minecraft.class05097;
import minecraft.class05138;
import org.jspecify.annotations.Nullable;

public final class class01852
extends Record {
    private final class01880 type;
    private final @Nullable class05097 exception;

    public class01852(class01880 class018802, @Nullable class05097 class050972) {
        this.type = class018802;
        this.exception = class050972;
    }

    public class01852(class05097 class050972) {
        this(class01880.field_45189, class050972);
    }

    public class01852(class01880 class018802) {
        this(class018802, null);
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01852.class, "type;exception", "type", "exception"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01852.class, "type;exception", "type", "exception"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01852.class, "type;exception", "type", "exception"}, this);
    }

    public @Nullable class05097 y() {
        return this.exception;
    }

    public @Nullable class05096 N(class05096 class050962) {
        return switch (this.type.ordinal()) {
            default -> throw new MatchException(null, null);
            case 0 -> null;
            case 1 -> new class05138(class050962);
            case 2 -> new class04713(class050962);
            case 3 -> new class04702((class00392)class00392.L((String)"mco.error.invalid.session.title"), (class00392)class00392.L((String)"mco.error.invalid.session.message"), class050962);
            case 4 -> new class04702(Objects.requireNonNull(this.exception), class050962);
        };
    }

    public class01880 N() {
        return this.type;
    }
}

