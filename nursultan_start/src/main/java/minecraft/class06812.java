/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Suppliers
 *  com.mojang.blaze3d.pipeline.RenderPipeline
 *  minecraft.class01894
 *  minecraft.class08188
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.base.Suppliers;
import com.mojang.blaze3d.pipeline.RenderPipeline;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;
import minecraft.class01894;
import minecraft.class06823;
import minecraft.class06828;
import minecraft.class06833;
import minecraft.class06835;
import minecraft.class06845;
import minecraft.class06856;
import minecraft.class08188;
import org.jspecify.annotations.Nullable;

public class class06812 {
    private final RenderPipeline N;
    private boolean y = false;
    private boolean L = false;
    private class06833 u = class06833.N;
    private class06856 i = class06856.N;
    private class06835 R = class06835.y;
    private boolean M = false;
    private boolean B = false;
    private int Z = 1536;
    private class06823 z = class06823.field_21853;
    private final Map<String, class06845> U = new HashMap<String, class06845>();

    public class06812 L() {
        this.M = true;
        return this;
    }

    class06812(RenderPipeline renderPipeline) {
        this.N = renderPipeline;
    }

    public class06828 i() {
        return new class06828(this.N, this.U, this.y, this.L, this.u, this.i, this.R, this.z, this.M, this.B, this.Z);
    }

    public class06812 u() {
        this.B = true;
        return this;
    }

    public class06812 y() {
        this.L = true;
        return this;
    }

    public class06812 N(class06856 class068562) {
        this.i = class068562;
        return this;
    }

    public class06812 N(class06835 class068352) {
        this.R = class068352;
        return this;
    }

    public class06812 N(class06823 class068232) {
        this.z = class068232;
        return this;
    }

    public class06812 N(String string, class01894 class018942) {
        this.U.put(string, new class06845(class018942, () -> null));
        return this;
    }

    public class06812 N(String string, class01894 class018942, @Nullable Supplier<class08188> supplier) {
        this.U.put(string, new class06845(class018942, (Supplier<class08188>)Suppliers.memoize(() -> supplier == null ? null : (class08188)supplier.get())));
        return this;
    }

    public class06812 N() {
        this.y = true;
        return this;
    }

    public class06812 N(int n) {
        this.Z = n;
        return this;
    }

    public class06812 N(class06833 class068332) {
        this.u = class068332;
        return this;
    }
}

