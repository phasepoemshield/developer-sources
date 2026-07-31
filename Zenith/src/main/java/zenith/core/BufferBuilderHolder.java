package zenith;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gl.ShaderProgramKeys;
import net.minecraft.client.render.VertexFormat.LootPool96;
import org.joml.Matrix4f;

public class BufferBuilderHolder {
   private net.minecraft.client.render.BufferBuilder Ill1IlI1IlIll1l11I1lIllI1lI;
   private boolean IIlI11Il11l;

   public boolean lIl1I1I111llll11() {
      return this.IIlI11Il11l;
   }

   public void lIl1IlI111() {
      if (!this.IIlI11Il11l) {
         RenderSystem.setShader(ShaderProgramKeys.POSITION_COLOR);
         RenderSystem.enableBlend();
         RenderSystem.defaultBlendFunc();
         this.Ill1IlI1IlIll1l11I1lIllI1lI = RenderSystem.renderThreadTesselator().begin(LootPool96.QUADS, net.minecraft.client.render.VertexFormats.POSITION_COLOR);
         this.IIlI11Il11l = true;
      }
   }

   public void EventBus(Matrix4f matrix4f, float f, float f1, float f2, float f3, ByteBufferHolder il1iliilli1l1iill) {
      int i = il1iliilli1l1iill.lllIlll1Ill111l111Il11II11lII();
      this.Ill1IlI1IlIll1l11I1lIllI1lI.vertex(matrix4f, f, f1 + f3, 0.0F).color(i);
      this.Ill1IlI1IlIll1l11I1lIllI1lI.vertex(matrix4f, f + f2, f1 + f3, 0.0F).color(i);
      this.Ill1IlI1IlIll1l11I1lIllI1lI.vertex(matrix4f, f + f2, f1, 0.0F).color(i);
      this.Ill1IlI1IlIll1l11I1lIllI1lI.vertex(matrix4f, f, f1, 0.0F).color(i);
   }

   public void flush() {
      if (this.IIlI11Il11l) {
         net.minecraft.client.render.BufferRenderer.drawWithGlobalProgram(this.Ill1IlI1IlIll1l11I1lIllI1lI.end());
         RenderSystem.disableBlend();
         this.Ill1IlI1IlIll1l11I1lIllI1lI = null;
         this.IIlI11Il11l = false;
      }
   }
}
