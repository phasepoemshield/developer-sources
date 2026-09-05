/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01372
 *  minecraft.class01404
 *  minecraft.class01414
 *  minecraft.class04673
 *  minecraft.class07211
 *  minecraft.class07536
 *  org.joml.Matrix4f
 *  org.joml.Matrix4fc
 */
package minecraft;

import java.util.EnumMap;
import java.util.Map;
import minecraft.class01372;
import minecraft.class01404;
import minecraft.class01414;
import minecraft.class04673;
import minecraft.class07211;
import minecraft.class07536;
import minecraft.class08539;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;

public class class08510
implements class04673 {
    private static final Map<class01372, class08510> M = class07536.N_74(class01372.class, class08510::new);
    public static final class08510 N = class08510.N(class01372.field_23292);
    final class01372 y;
    final class01404 L;
    final Map<class07211, Matrix4fc> u = new EnumMap<class07211, Matrix4fc>(class07211.class);
    final Map<class07211, Matrix4fc> i = new EnumMap<class07211, Matrix4fc>(class07211.class);
    private final class08539 B = new class08539(this);

    private class08510(class01372 class013722) {
        this.y = class013722;
        this.L = class013722 != class01372.field_23292 ? new class01404((Matrix4fc)new Matrix4f(class013722.y())) : class01404.N();
        for (class07211 class072112 : class07211.values()) {
            Matrix4fc matrix4fc = class01414.N((class01404)this.L, (class07211)class072112).L();
            this.u.put(class072112, matrix4fc);
            this.i.put(class072112, (Matrix4fc)matrix4fc.invertAffine(new Matrix4f()));
        }
    }

    public String toString() {
        return "simple[" + this.y.method_15434() + "]";
    }

    public class04673 N() {
        return this.B;
    }

    public static class08510 N(class01372 class013722) {
        return M.get(class013722);
    }

    public class01404 method_3509() {
        return this.L;
    }
}

