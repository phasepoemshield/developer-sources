package org.zenith.core;

import org.zenith.utility.mixin.accessors.ShaderProgramAccessor;












import net.minecraft.client.MinecraftClient;
import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.gl.Defines;
import net.minecraft.client.gl.GlUniform;
import net.minecraft.client.gl.ShaderProgram;
import net.minecraft.client.gl.ShaderProgramKey;
import net.minecraft.client.gl.ShaderLoader.LoadException;
import net.minecraft.client.render.RenderPhase;
import net.minecraft.client.render.VertexFormat;
import net.minecraft.util.Identifier;

public class ShaderWrapper implements ClientProvider {
   public static final MinecraftClient minecraftClient3 = MinecraftClient.getInstance();
   public static final List<Runnable> list109 = new ArrayList<>();
   protected ShaderProgram shaderProgram;
   protected ShaderProgramKey shaderProgramKey5;

   public ShaderWrapper(Identifier var1, VertexFormat var2) {
      this.shaderProgramKey5 = new ShaderProgramKey(var1.withPrefixedPath("core/"), var2, Defines.EMPTY);
      list109.add(() -> {
         try {
            this.shaderProgram = minecraftClient3.getShaderLoader().getProgramToLoad(this.shaderProgramKey5);
            this.float57();
         } catch (LoadException loadexception) {
         }
      });
   }

   public RenderPhase float250() {
      return new net.minecraft.client.render.RenderPhase.ShaderProgram(this.shaderProgramKey5);
   }

   public ShaderProgram float251() {
      return RenderSystem.setShader(this.shaderProgramKey5);
   }

   protected void float57() {
   }

   public GlUniform HudArmorPanel(String var1) {
      return ((ShaderProgramAccessor)this.shaderProgram).getUniformsByName().get(var1);
   }

   public static void float245() {
      list109.forEach(Runnable::run);
   }
}
