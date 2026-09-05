/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 *  minecraft.class02579
 *  minecraft.class07331
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.blaze3d.vertex.VertexFormat;
import minecraft.class02579;
import minecraft.class07331;
import org.jspecify.annotations.Nullable;

public class class07849 {
    private static final int N = 786432;
    private final class02579 y;
    private static @Nullable class07849 L;

    public void L() {
        this.y.y();
    }

    public class07849() {
        this(786432);
    }

    public class07849(int n) {
        this.y = new class02579(n);
    }

    public static class07849 y() {
        if (L == null) {
            throw new IllegalStateException("Tesselator has not been initialized");
        }
        return L;
    }

    public class07331 N(VertexFormat.class_5596 class_55962, VertexFormat vertexFormat) {
        return new class07331(this.y, class_55962, vertexFormat);
    }

    public static void N() {
        if (L != null) {
            throw new IllegalStateException("Tesselator has already been initialized");
        }
        L = new class07849();
    }
}

