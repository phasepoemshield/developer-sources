/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03255
 *  minecraft.class05904
 *  minecraft.class06260
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class03255;
import minecraft.class05904;
import minecraft.class06260;
import minecraft.class08647;
import org.jspecify.annotations.Nullable;

public final class class08663
extends Record
implements class08647 {
    private final class06260 signModel;
    private final class05904 woodType;
    private final int x0;
    private final int y0;
    private final int x1;
    private final int y1;
    private final float scale;
    private final @Nullable class03255 scissorArea;
    private final @Nullable class03255 bounds;

    public class05904 L() {
        return this.woodType;
    }

    @Override
    public int M() {
        return this.x1;
    }

    public class08663(class06260 class062602, class05904 class059042, int n, int n2, int n3, int n4, float f, @Nullable class03255 class032552) {
        this(class062602, class059042, n, n2, n3, n4, f, class032552, class08647.N(n, n2, n3, n4, class032552));
    }

    public class08663(class06260 class062602, class05904 class059042, int n, int n2, int n3, int n4, float f, @Nullable class03255 class032552, @Nullable class03255 class032553) {
        this.signModel = class062602;
        this.woodType = class059042;
        this.x0 = n;
        this.y0 = n2;
        this.x1 = n3;
        this.y1 = n4;
        this.scale = f;
        this.scissorArea = class032552;
        this.bounds = class032553;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08663.class, "signModel;woodType;x0;y0;x1;y1;scale;scissorArea;bounds", "signModel", "woodType", "x0", "y0", "x1", "y1", "scale", "scissorArea", "bounds"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08663.class, "signModel;woodType;x0;y0;x1;y1;scale;scissorArea;bounds", "signModel", "woodType", "x0", "y0", "x1", "y1", "scale", "scissorArea", "bounds"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08663.class, "signModel;woodType;x0;y0;x1;y1;scale;scissorArea;bounds", "signModel", "woodType", "x0", "y0", "x1", "y1", "scale", "scissorArea", "bounds"}, this);
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

    public class06260 y() {
        return this.signModel;
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

