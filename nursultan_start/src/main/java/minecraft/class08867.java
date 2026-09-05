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
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.blaze3d.opengl.GlConst;
import com.mojang.blaze3d.opengl.GlStateManager;
import com.mojang.blaze3d.vertex.VertexFormat;
import com.mojang.blaze3d.vertex.VertexFormatElement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import minecraft.class08523;
import minecraft.class08859;
import minecraft.class08861;
import minecraft.class08865;
import org.jspecify.annotations.Nullable;

class class08867
extends class08865 {
    private final Map<VertexFormat, class08861> N = new HashMap<VertexFormat, class08861>();
    private final class08859 y;

    public class08867(class08859 class088592) {
        this.y = class088592;
    }

    @Override
    public void N(VertexFormat vertexFormat, @Nullable class08523 class085232) {
        class08861 class088612 = this.N.get(vertexFormat);
        if (class088612 == null) {
            int n = GlStateManager._glGenVertexArrays();
            GlStateManager._glBindVertexArray((int)n);
            if (class085232 != null) {
                GlStateManager._glBindBuffer((int)34962, (int)class085232.u);
                class08867.N(vertexFormat, true);
            }
            class08861 class088613 = new class08861(n, vertexFormat, class085232);
            this.y.N(class088613);
            this.N.put(vertexFormat, class088613);
            return;
        }
        GlStateManager._glBindVertexArray((int)class088612.N);
        if (class085232 != null && class088612.L != class085232) {
            GlStateManager._glBindBuffer((int)34962, (int)class085232.u);
            class088612.L = class085232;
            class08867.N(vertexFormat, false);
        }
    }

    private static void N(VertexFormat vertexFormat, boolean bl) {
        int n = vertexFormat.getVertexSize();
        List var3 = vertexFormat.getElements();
        block4: for (int i = 0; i < var3.size(); ++i) {
            VertexFormatElement vertexFormatElement = (VertexFormatElement)var3.get(i);
            if (bl) {
                GlStateManager._enableVertexAttribArray((int)i);
            }
            switch (vertexFormatElement.usage()) {
                case POSITION: 
                case GENERIC: 
                case UV: {
                    if (vertexFormatElement.type() == VertexFormatElement.Type.FLOAT) {
                        GlStateManager._vertexAttribPointer((int)i, (int)vertexFormatElement.count(), (int)GlConst.toGl((VertexFormatElement.Type)vertexFormatElement.type()), (boolean)false, (int)n, (long)vertexFormat.getOffset(vertexFormatElement));
                        continue block4;
                    }
                    GlStateManager._vertexAttribIPointer((int)i, (int)vertexFormatElement.count(), (int)GlConst.toGl((VertexFormatElement.Type)vertexFormatElement.type()), (int)n, (long)vertexFormat.getOffset(vertexFormatElement));
                    continue block4;
                }
                case NORMAL: 
                case COLOR: {
                    GlStateManager._vertexAttribPointer((int)i, (int)vertexFormatElement.count(), (int)GlConst.toGl((VertexFormatElement.Type)vertexFormatElement.type()), (boolean)true, (int)n, (long)vertexFormat.getOffset(vertexFormatElement));
                }
            }
        }
    }
}

