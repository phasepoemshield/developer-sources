/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01894
 *  minecraft.class04227
 *  minecraft.class05523
 *  minecraft.class05946
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.Map;
import java.util.function.Consumer;
import minecraft.class00195;
import minecraft.class00225;
import minecraft.class01894;
import minecraft.class04227;
import minecraft.class05523;
import minecraft.class05946;

public final class class00194
extends Record {
    private final Map<class01894, class00195<class05946<class00225>>> tests;
    private final class05946<Consumer<class05523>> functionKey;
    private final Consumer<class05523> function;

    public Consumer<class05523> L() {
        return this.function;
    }

    public class00194(Map<class01894, class00195<class05946<class00225>>> map, class01894 class018942, Consumer<class05523> consumer) {
        this(map, (class05946<Consumer<class05523>>)class05946.N((class05946)class04227.NJ, (class01894)class018942), consumer);
    }

    public class00194(Map<class01894, class00195<class05946<class00225>>> map, class05946<Consumer<class05523>> class059462, Consumer<class05523> consumer) {
        this.tests = map;
        this.functionKey = class059462;
        this.function = consumer;
    }

    public class00194(class01894 class018942, class00195<class05946<class00225>> class001952, Consumer<class05523> consumer) {
        this(Map.of(class018942, class001952), class018942, consumer);
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class00194.class, "tests;functionKey;function", "tests", "functionKey", "function"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class00194.class, "tests;functionKey;function", "tests", "functionKey", "function"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class00194.class, "tests;functionKey;function", "tests", "functionKey", "function"}, this);
    }

    public class05946<Consumer<class05523>> y() {
        return this.functionKey;
    }

    public Map<class01894, class00195<class05946<class00225>>> N() {
        return this.tests;
    }
}

