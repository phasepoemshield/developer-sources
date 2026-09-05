/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.blaze3d.pipeline.RenderPipeline$Snippet
 *  net.fabricmc.api.EnvType
 *  net.fabricmc.api.Environment
 */
package net.fabricmc.fabric.impl.client.rendering;

import com.mojang.blaze3d.pipeline.RenderPipeline;
import java.util.Optional;
import java.util.function.Supplier;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;

@Environment(value=EnvType.CLIENT)
public final class FabricRenderPipelineInternals {
    private static final ThreadLocal<Optional<Boolean>> SCOPED_SNIPPET_USE_PIPELINE_VERTEX_FORMAT_FOR_GUI = ThreadLocal.withInitial(Optional::empty);

    private FabricRenderPipelineInternals() {
    }

    public static Optional<Boolean> getScopedUsePipelineVertexFormatForGui() {
        return SCOPED_SNIPPET_USE_PIPELINE_VERTEX_FORMAT_FOR_GUI.get();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static RenderPipeline.Snippet withSnippetUsePipelineVertexFormatForGui(Supplier<RenderPipeline.Snippet> supplier, Optional<Boolean> optional) {
        Optional<Boolean> optional2 = SCOPED_SNIPPET_USE_PIPELINE_VERTEX_FORMAT_FOR_GUI.get();
        try {
            SCOPED_SNIPPET_USE_PIPELINE_VERTEX_FORMAT_FOR_GUI.set(optional);
            RenderPipeline.Snippet snippet = supplier.get();
            return snippet;
        }
        finally {
            if (optional2.isEmpty()) {
                SCOPED_SNIPPET_USE_PIPELINE_VERTEX_FORMAT_FOR_GUI.remove();
            } else {
                SCOPED_SNIPPET_USE_PIPELINE_VERTEX_FORMAT_FOR_GUI.set(optional2);
            }
        }
    }
}

