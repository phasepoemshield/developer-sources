/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class02708
 *  minecraft.class03255
 *  minecraft.class06563
 *  minecraft.class08647
 *  minecraft.class08842
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import minecraft.class02708;
import minecraft.class03255;
import minecraft.class06563;
import minecraft.class08647;
import minecraft.class08842;
import org.jspecify.annotations.Nullable;

public final class class08667
extends Record
implements class08647 {
    private final class08842 flag;
    private final class06563 baseColor;
    private final class02708 resultBannerPatterns;
    private final int x0;
    private final int y0;
    private final int x1;
    private final int y1;
    private final @Nullable class03255 scissorArea;
    private final @Nullable class03255 bounds;

    public class06563 L() {
        return this.baseColor;
    }

    public int M() {
        return this.x1;
    }

    public class08667(class08842 class088422, class06563 class065632, class02708 class027082, int n, int n2, int n3, int n4, @Nullable class03255 class032552) {
        this(class088422, class065632, class027082, n, n2, n3, n4, class032552, class08647.N((int)n, (int)n2, (int)n3, (int)n4, (class03255)class032552));
    }

    public class08667(class08842 class088422, class06563 class065632, class02708 class027082, int n, int n2, int n3, int n4, @Nullable class03255 class032552, @Nullable class03255 class032553) {
        this.flag = class088422;
        this.baseColor = class065632;
        this.resultBannerPatterns = class027082;
        this.x0 = n;
        this.y0 = n2;
        this.x1 = n3;
        this.y1 = n4;
        this.scissorArea = class032552;
        this.bounds = class032553;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class08667.class, "flag;baseColor;resultBannerPatterns;x0;y0;x1;y1;scissorArea;bounds", "flag", "baseColor", "resultBannerPatterns", "x0", "y0", "x1", "y1", "scissorArea", "bounds"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class08667.class, "flag;baseColor;resultBannerPatterns;x0;y0;x1;y1;scissorArea;bounds", "flag", "baseColor", "resultBannerPatterns", "x0", "y0", "x1", "y1", "scissorArea", "bounds"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class08667.class, "flag;baseColor;resultBannerPatterns;x0;y0;x1;y1;scissorArea;bounds", "flag", "baseColor", "resultBannerPatterns", "x0", "y0", "x1", "y1", "scissorArea", "bounds"}, this);
    }

    public int B() {
        return this.y1;
    }

    public @Nullable class03255 Z() {
        return this.scissorArea;
    }

    public int i() {
        return this.x0;
    }

    public class02708 u() {
        return this.resultBannerPatterns;
    }

    public class08842 y() {
        return this.flag;
    }

    public float N() {
        return 16.0f;
    }

    public @Nullable class03255 comp_4274() {
        return this.bounds;
    }

    public int R() {
        return this.y0;
    }
}

