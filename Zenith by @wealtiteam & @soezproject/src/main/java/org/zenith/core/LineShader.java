package org.zenith.core;

import org.zenith.event.EventTickEnd;

import net.minecraft.client.gl.GlUniform;
import net.minecraft.client.render.VertexFormats;
import net.minecraft.util.Identifier;

public class LineShader extends ShaderWrapper implements ClientWindowProvider {
   public GlUniform glUniform;
   public GlUniform glUniform2;
   public GlUniform glUniform3;
   public GlUniform glUniform4;
   public GlUniform glUniform5;

   public LineShader(Identifier var1) {
      super(var1, VertexFormats.POSITION_TEXTURE_COLOR);
   }

   public void EventTickEnd(float var1) {
      this.glUniform2.set(var1);
      this.glUniform.set(1.0F / (float)val214.getWidth(), 1.0F / (float)val214.getHeight());
      this.glUniform3.set(1.0F);
      this.glUniform4.set(0.0F);
      this.glUniform5.set(1.0F, 1.0F, 1.0F);
   }

   @Override
   protected void float57() {
      this.glUniform = this.HudArmorPanel("Resolution");
      this.glUniform2 = this.HudArmorPanel("Offset");
      this.glUniform3 = this.HudArmorPanel("Saturation");
      this.glUniform4 = this.HudArmorPanel("TintIntensity");
      this.glUniform5 = this.HudArmorPanel("TintColor");
      super.float57();
   }
}
