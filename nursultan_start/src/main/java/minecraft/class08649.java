/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class01127
 *  minecraft.class01894
 *  minecraft.class03255
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class01127;
import minecraft.class01894;
import minecraft.class03255;
import minecraft.class08647;
import org.jspecify.annotations.Nullable;

public final class class08649
extends Record
implements class08647 {
    private final class01127 bookModel;
    private final class01894 texture;
    private final float open;
    private final float flip;
    private final int x0;
    private final int y0;
    private final int x1;
    private final int y1;
    private final float scale;
    private final @Nullable class03255 scissorArea;
    private final @Nullable class03255 bounds;

    public class01894 L() {
        return this.texture;
    }

    @Override
    public int M() {
        return this.x1;
    }

    public class08649(class01127 class011272, class01894 class018942, float f, float f2, int n, int n2, int n3, int n4, float f3, @Nullable class03255 class032552) {
        this(class011272, class018942, f, f2, n, n2, n3, n4, f3, class032552, class08647.N(n, n2, n3, n4, class032552));
    }

    public class08649(class01127 class011272, class01894 class018942, float f, float f2, int n, int n2, int n3, int n4, float f3, @Nullable class03255 class032552, @Nullable class03255 class032553) {
        this.bookModel = class011272;
        this.texture = class018942;
        this.open = f;
        this.flip = f2;
        this.x0 = n;
        this.y0 = n2;
        this.x1 = n3;
        this.y1 = n4;
        this.scale = f3;
        this.scissorArea = class032552;
        this.bounds = class032553;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08649.class, "bookModel;texture;open;flip;x0;y0;x1;y1;scale;scissorArea;bounds", "bookModel", "texture", "open", "flip", "x0", "y0", "x1", "y1", "scale", "scissorArea", "bounds"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08649.class, "bookModel;texture;open;flip;x0;y0;x1;y1;scale;scissorArea;bounds", "bookModel", "texture", "open", "flip", "x0", "y0", "x1", "y1", "scale", "scissorArea", "bounds"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08649.class, "bookModel;texture;open;flip;x0;y0;x1;y1;scale;scissorArea;bounds", "bookModel", "texture", "open", "flip", "x0", "y0", "x1", "y1", "scale", "scissorArea", "bounds"}, this);
    }

    @Override
    public int B() {
        return this.y1;
    }

    @Override
    public @Nullable class03255 Z() {
        return this.scissorArea;
    }

    @Override
    public int i() {
        return this.x0;
    }

    public float z() {
        return this.flip;
    }

    public float u() {
        return this.open;
    }

    public class01127 y() {
        return this.bookModel;
    }

    @Override
    public float N() {
        return this.scale;
    }

    public @Nullable class03255 comp_4274() {
        return this.bounds;
    }

    @Override
    public int R() {
        return this.y0;
    }
}

