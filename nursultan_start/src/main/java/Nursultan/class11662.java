/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.opengl.GlConst
 *  com.mojang.blaze3d.opengl.GlStateManager
 *  com.mojang.blaze3d.vertex.VertexFormat
 *  com.mojang.blaze3d.vertex.VertexFormatElement
 *  com.mojang.blaze3d.vertex.VertexFormatElement$Type
 *  minecraft.class08523
 *  minecraft.class08852
 *  minecraft.class08859
 *  minecraft.class08861
 *  minecraft.class08865
 *  org.jspecify.annotations.Nullable
 *  org.lwjgl.opengl.ARBVertexAttribBinding
 */
package Nursultan;

import com.mojang.blaze3d.opengl.GlConst;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormatElement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import minecraft.class08523;
import minecraft.class08852;
import minecraft.class08859;
import minecraft.class08861;
import minecraft.class08865;
import org.jspecify.annotations.Nullable;
import org.lwjgl.opengl.ARBVertexAttribBinding;

public class class11662
extends class08865 {
    private final Map<VertexFormat, class08861> N = new HashMap<VertexFormat, class08861>();
    private final class08859 y;
    private final boolean L;

    public class11662(class08859 class088592) {
        String string;
        this.y = class088592;
        this.L = "Mesa".equals(GlStateManager._getString((int)7936)) ? (string = GlStateManager._getString((int)7938)).contains("25.0.0") || string.contains("25.0.1") || string.contains("25.0.2") : false;
    }

    public void N(VertexFormat vertexFormat, @Nullable class08523 class085232) {
        class08861 class088612 = this.N.get(vertexFormat);
        if (class088612 == null) {
            int n = GlStateManager._glGenVertexArrays();
            GlStateManager._glBindVertexArray((int)n);
            if (class085232 != null) {
                List var5 = vertexFormat.getElements();
                for (int i = 0; i < var5.size(); ++i) {
                    VertexFormatElement vertexFormatElement = (VertexFormatElement)var5.get(i);
                    GlStateManager._enableVertexAttribArray((int)i);
                    switch (class08852.N[vertexFormatElement.usage().ordinal()]) {
                        case 1: 
                        case 2: 
                        case 3: {
                            if (vertexFormatElement.type() == VertexFormatElement.Type.FLOAT) {
                                ARBVertexAttribBinding.glVertexAttribFormat((int)i, (int)vertexFormatElement.count(), (int)GlConst.toGl((VertexFormatElement.Type)vertexFormatElement.type()), (boolean)false, (int)vertexFormat.getOffset(vertexFormatElement));
                                break;
                            }
                            ARBVertexAttribBinding.glVertexAttribIFormat((int)i, (int)vertexFormatElement.count(), (int)GlConst.toGl((VertexFormatElement.Type)vertexFormatElement.type()), (int)vertexFormat.getOffset(vertexFormatElement));
                            break;
                        }
                        case 4: 
                        case 5: {
                            ARBVertexAttribBinding.glVertexAttribFormat((int)i, (int)vertexFormatElement.count(), (int)GlConst.toGl((VertexFormatElement.Type)vertexFormatElement.type()), (boolean)true, (int)vertexFormat.getOffset(vertexFormatElement));
                        }
                    }
                    ARBVertexAttribBinding.glVertexAttribBinding((int)i, (int)0);
                }
            }
            if (class085232 != null) {
                ARBVertexAttribBinding.glBindVertexBuffer((int)0, (int)class085232.u, (long)0L, (int)vertexFormat.getVertexSize());
            }
            class08861 class088613 = new class08861(n, vertexFormat, class085232);
            this.y.N(class088613);
            this.N.put(vertexFormat, class088613);
            return;
        }
        GlStateManager._glBindVertexArray((int)class088612.N);
        if (class085232 != null && class088612.L != class085232) {
            if (this.L && class088612.L != null && class088612.L.u == class085232.u) {
                ARBVertexAttribBinding.glBindVertexBuffer((int)0, (int)0, (long)0L, (int)0);
            }
            ARBVertexAttribBinding.glBindVertexBuffer((int)0, (int)class085232.u, (long)0L, (int)vertexFormat.getVertexSize());
            class088612.L = class085232;
        }
    }
}

