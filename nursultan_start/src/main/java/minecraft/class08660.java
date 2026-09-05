/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class03255
 *  minecraft.class05005
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.util.List;
import minecraft.class03255;
import minecraft.class05005;
import minecraft.class08647;
import org.jspecify.annotations.Nullable;

public final class class08660
extends Record
implements class08647 {
    private final List<class05005> chartData;
    private final int x0;
    private final int y0;
    private final int x1;
    private final int y1;
    private final @Nullable class03255 scissorArea;
    private final @Nullable class03255 bounds;

    @Override
    public int M() {
        return this.x1;
    }

    public class08660(List<class05005> list, int n, int n2, int n3, int n4, @Nullable class03255 class032552) {
        this(list, n, n2, n3, n4, class032552, class08647.N(n, n2, n3, n4, class032552));
    }

    public class08660(List<class05005> list, int n, int n2, int n3, int n4, @Nullable class03255 class032552, @Nullable class03255 class032553) {
        this.chartData = list;
        this.x0 = n;
        this.y0 = n2;
        this.x1 = n3;
        this.y1 = n4;
        this.scissorArea = class032552;
        this.bounds = class032553;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08660.class, "chartData;x0;y0;x1;y1;scissorArea;bounds", "chartData", "x0", "y0", "x1", "y1", "scissorArea", "bounds"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08660.class, "chartData;x0;y0;x1;y1;scissorArea;bounds", "chartData", "x0", "y0", "x1", "y1", "scissorArea", "bounds"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08660.class, "chartData;x0;y0;x1;y1;scissorArea;bounds", "chartData", "x0", "y0", "x1", "y1", "scissorArea", "bounds"}, this);
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

    public List<class05005> y() {
        return this.chartData;
    }

    @Override
    public float N() {
        return 1.0f;
    }

    public @Nullable class03255 comp_4274() {
        return this.bounds;
    }

    @Override
    public int R() {
        return this.y0;
    }
}

