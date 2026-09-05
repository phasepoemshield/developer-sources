/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09938
 *  Nursultan.class09991
 */
package Nursultan;

import Nursultan.class09777;
import Nursultan.class09784;
import Nursultan.class09798;
import Nursultan.class09801;
import Nursultan.class09804;
import Nursultan.class09813;
import Nursultan.class09814;
import Nursultan.class09938;
import Nursultan.class09991;
import java.util.function.Consumer;
import java.util.function.Supplier;

public final class class09778 {
    public static class09801 L() {
        return new class09801();
    }

    public static class09814 L(String string) {
        return new class09814().L(string);
    }

    private class09778() {
    }

    public static class09814 i() {
        return new class09814();
    }

    public static class09777 u() {
        return new class09777();
    }

    public static class09777 y(String string) {
        return new class09777().L(string);
    }

    public static class09798 y(String string, class09991 class099912) {
        return ((class09777)new class09777().L(string).N(class099912)).i();
    }

    public static class09784 y() {
        return new class09784();
    }

    public static <T> class09804<T> N(Supplier<T> supplier) {
        return new class09804<Supplier<T>>(supplier);
    }

    private static <T> void N(Consumer<T> consumer, T t) {
        if (consumer != null) {
            consumer.accept(t);
        }
    }

    public static <T> class09804<T> N() {
        return new class09804();
    }

    public static class09813 N_1(class09938 class099382) {
        return new class09813().N(class099382);
    }

    public static class09798 N(Consumer<class09784> consumer) {
        class09784 class097842 = new class09784();
        class09778.N(consumer, class097842);
        return class097842.i();
    }

    public static class09798 N(class09991 class099912, Consumer<class09784> consumer) {
        class09784 class097842 = (class09784)new class09784().N(class099912);
        class09778.N(consumer, class097842);
        return class097842.i();
    }

    public static class09798 N(class09991 class099912) {
        return class09778.N(class099912, null);
    }

    public static class09798 N(String string, class09991 class099912) {
        return ((class09801)new class09801().L(string).N(class099912)).i();
    }

    public static <T> class09804<T> N(T t) {
        return new class09804<T>(t);
    }

    public static class09801 N(String string) {
        return new class09801().L(string);
    }

    public static class09813 R() {
        return new class09813();
    }
}

