/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class11662
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  minecraft.class08523
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.opengl.GLCapabilities
 */
package minecraft;

import Nursultan.class11662;
import com.mojang.blaze3d.vertex.VertexFormat;
import java.util.Set;
import minecraft.class08523;
import minecraft.class08859;
import minecraft.class08867;
import minecraft.class08879;
import org.jspecify.annotations.Nullable;
import org.lwjgl.opengl.GLCapabilities;

public abstract class class08865 {
    public static class08865 N(GLCapabilities gLCapabilities, class08859 class088592, Set<String> set) {
        if (gLCapabilities.GL_ARB_vertex_attrib_binding && class08879.N) {
            set.add("GL_ARB_vertex_attrib_binding");
            return new class11662(class088592);
        }
        return new class08867(class088592);
    }

    public abstract void N(VertexFormat var1, @Nullable class08523 var2);
}

