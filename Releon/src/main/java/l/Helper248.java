package l;

import java.util.function.Function;
import net.minecraft.client.gl.Defines;
import net.minecraft.client.gl.ShaderProgramKey;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.client.render.RenderLayer.MultiPhaseParameters;
import net.minecraft.client.render.RenderPhase.ShaderProgram;
import net.minecraft.client.render.RenderPhase.Texture;
import net.minecraft.client.render.VertexFormat.DrawMode;
import net.minecraft.util.Identifier;
import net.minecraft.util.TriState;
import net.minecraft.util.Util;

public final class Helper248 {
   private static final ShaderProgramKey GLASS_SHADER = new ShaderProgramKey(
      Helper134.method1170("entity_glass"), VertexFormats.POSITION_COLOR_TEXTURE_OVERLAY_LIGHT_NORMAL, Defines.EMPTY
   );
   private static final Function<Identifier, RenderLayer> GLASS_LAYER = Util.memoize(
      var0 -> RenderLayer.of(
         "entity_glass",
         VertexFormats.POSITION_COLOR_TEXTURE_OVERLAY_LIGHT_NORMAL,
         DrawMode.QUADS,
         1536,
         true,
         true,
         MultiPhaseParameters.builder()
            .program(new ShaderProgram(GLASS_SHADER))
            .texture(new Texture(var0, TriState.FALSE, false))
            .transparency(RenderLayer.TRANSLUCENT_TRANSPARENCY)
            .cull(RenderLayer.DISABLE_CULLING)
            .lightmap(RenderLayer.ENABLE_LIGHTMAP)
            .overlay(RenderLayer.ENABLE_OVERLAY_COLOR)
            .build(true)
      )
   );

   private Helper248() {
   }

   public static RenderLayer method2374(Identifier var0) {
      return GLASS_LAYER.apply(var0);
   }
}
