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

public final class class02448
extends Record {
    final long[] cells;
    final int width;
    final int height;

    public int L() {
        return this.height;
    }

    public class02448(long[] lArray, int n, int n2) {
        this.cells = lArray;
        this.width = n;
        this.height = n2;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02448.class, "cells;width;height", "cells", "width", "height"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02448.class, "cells;width;height", "cells", "width", "height"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02448.class, "cells;width;height", "cells", "width", "height"}, this);
    }

    public int y() {
        return this.width;
    }

    public long[] N() {
        return this.cells;
    }
}

