/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5595
 *  com.mojang.blaze3d.vertex.VertexFormat$class_5596
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 */
package minecraft;

import com.mojang.blaze3d.vertex.VertexFormat;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;

public final class class02583
extends Record {
    private final VertexFormat format;
    private final int vertexCount;
    private final int indexCount;
    private final VertexFormat.class_5596 mode;
    private final VertexFormat.class_5595 indexType;

    public int L() {
        return this.indexCount;
    }

    public class02583(VertexFormat vertexFormat, int n, int n2, VertexFormat.class_5596 class_55962, VertexFormat.class_5595 class_55952) {
        this.format = vertexFormat;
        this.vertexCount = n;
        this.indexCount = n2;
        this.mode = class_55962;
        this.indexType = class_55952;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class02583.class, "format;vertexCount;indexCount;mode;indexType", "format", "vertexCount", "indexCount", "mode", "indexType"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class02583.class, "format;vertexCount;indexCount;mode;indexType", "format", "vertexCount", "indexCount", "mode", "indexType"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class02583.class, "format;vertexCount;indexCount;mode;indexType", "format", "vertexCount", "indexCount", "mode", "indexType"}, this);
    }

    public VertexFormat.class_5595 i() {
        return this.indexType;
    }

    public VertexFormat.class_5596 u() {
        return this.mode;
    }

    public int y() {
        return this.vertexCount;
    }

    public VertexFormat N() {
        return this.format;
    }
}

