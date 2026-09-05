/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.mojang.blaze3d.opengl.GlStateManager
 */
package net.irisshaders.iris.gl.program;

import com.google.common.collect.ImmutableList;
import com.mojang.blaze3d.opengl.GlStateManager;
import java.util.List;
import net.irisshaders.iris.gl.image.ImageBinding;
import net.irisshaders.iris.gl.program.GlUniform1iCall;
import net.irisshaders.iris.gl.program.ProgramImages$Builder;

public class ProgramImages {
    private final ImmutableList<ImageBinding> imageBindings;
    private List<GlUniform1iCall> initializer;

    ProgramImages(ImmutableList<ImageBinding> immutableList, List<GlUniform1iCall> list) {
        this.imageBindings = immutableList;
        this.initializer = list;
    }

    public void update() {
        if (this.initializer != null) {
            for (GlUniform1iCall glUniform1iCall : this.initializer) {
                GlStateManager._glUniform1i((int)glUniform1iCall.location(), (int)glUniform1iCall.value());
            }
            this.initializer = null;
        }
        for (ImageBinding imageBinding : this.imageBindings) {
            imageBinding.update();
        }
    }

    public static ProgramImages$Builder builder(int n) {
        return new ProgramImages$Builder(n);
    }

    public int getActiveImages() {
        return this.imageBindings.size();
    }
}

