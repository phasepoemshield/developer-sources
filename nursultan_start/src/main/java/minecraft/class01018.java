/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.OptionalInt;

public final class class01018
extends Record {
    private final int width;
    private final int height;
    private final OptionalInt fullscreenWidth;
    private final OptionalInt fullscreenHeight;
    private final boolean isFullscreen;

    public OptionalInt L() {
        return this.fullscreenWidth;
    }

    public class01018(int n, int n2, OptionalInt optionalInt, OptionalInt optionalInt2, boolean bl) {
        this.width = n;
        this.height = n2;
        this.fullscreenWidth = optionalInt;
        this.fullscreenHeight = optionalInt2;
        this.isFullscreen = bl;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class01018.class, "width;height;fullscreenWidth;fullscreenHeight;isFullscreen", "width", "height", "fullscreenWidth", "fullscreenHeight", "isFullscreen"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class01018.class, "width;height;fullscreenWidth;fullscreenHeight;isFullscreen", "width", "height", "fullscreenWidth", "fullscreenHeight", "isFullscreen"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class01018.class, "width;height;fullscreenWidth;fullscreenHeight;isFullscreen", "width", "height", "fullscreenWidth", "fullscreenHeight", "isFullscreen"}, this);
    }

    public boolean i() {
        return this.isFullscreen;
    }

    public OptionalInt u() {
        return this.fullscreenHeight;
    }

    public int y() {
        return this.height;
    }

    public int N() {
        return this.width;
    }

    public class01018 N(int n, int n2) {
        return new class01018(n, n2, this.fullscreenWidth, this.fullscreenHeight, this.isFullscreen);
    }

    public class01018 N(boolean bl) {
        return new class01018(this.width, this.height, this.fullscreenWidth, this.fullscreenHeight, bl);
    }
}

