/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11175
 *  Nursultan.class11181
 *  Nursultan.class11199
 */
package Nursultan;

import Nursultan.class09064;
import Nursultan.class11175;
import Nursultan.class11181;
import Nursultan.class11199;
import java.util.function.IntSupplier;

public class class09097 {
    public static class09064 L(IntSupplier intSupplier, IntSupplier intSupplier2) {
        return class09064.N(intSupplier, intSupplier2).N(class11199.LINEAR, class11199.LINEAR).y(class11175.CLAMP_TO_EDGE).N();
    }

    public static class09064 L(int n, int n2) {
        return class09097.u(() -> n, () -> n2);
    }

    private class09097() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    static {
        class09097.y();
    }

    public static class09064 i(IntSupplier intSupplier, IntSupplier intSupplier2) {
        return class09064.N(intSupplier, intSupplier2).N(class11199.LINEAR, class11199.LINEAR).y(class11175.CLAMP_TO_EDGE).N();
    }

    public static class09064 i(int n, int n2) {
        return class09097.N(() -> n, () -> n2);
    }

    public static class09064 u(IntSupplier intSupplier, IntSupplier intSupplier2) {
        return class09064.N(intSupplier, intSupplier2).N(class11199.LINEAR_MIPMAP_LINEAR, class11199.LINEAR).y(class11175.CLAMP_TO_EDGE).N(true).N();
    }

    public static class09064 u(int n, int n2) {
        return class09097.L(() -> n, () -> n2);
    }

    public static class09064 y(int n, int n2) {
        return class09097.i(() -> n, () -> n2);
    }

    private static void y() {
    }

    public static class09064 y(IntSupplier intSupplier, IntSupplier intSupplier2) {
        return class09064.N(intSupplier, intSupplier2).N(class11199.NEAREST, class11199.NEAREST).y(class11175.CLAMP_TO_EDGE).N();
    }

    public static class09064 N(IntSupplier intSupplier, IntSupplier intSupplier2, boolean bl) {
        return class09064.N(intSupplier, intSupplier2).y(class11181.RG16F).N(class11199.NEAREST, class11199.NEAREST).y(class11175.CLAMP_TO_EDGE).y(bl).N();
    }

    public static class09064 N(int n, int n2, boolean bl) {
        return class09097.N(() -> n, () -> n2, bl);
    }

    public static class09064 N(IntSupplier intSupplier, IntSupplier intSupplier2) {
        return class09064.N(intSupplier, intSupplier2).N(class11199.NEAREST, class11199.NEAREST).y(class11175.CLAMP_TO_EDGE).y(true).N();
    }

    public static class09064 N(int n, int n2) {
        return class09097.y(() -> n, () -> n2);
    }
}

