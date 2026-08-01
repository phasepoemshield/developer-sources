package zenith;

import zenith.hud.*;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.gl.Defines;
import net.minecraft.client.gl.ShaderProgramKey;
import net.minecraft.util.Identifier;
import net.minecraft.client.render.RenderPhase;
import net.minecraft.client.gl.ShaderProgram;
import net.minecraft.client.gl.ShaderLoader.CopyNameLootFunction52;
import net.minecraft.client.render.RenderPhase.SmallPufferfishEntityModel2;
import zenith.zov.utility.mixin.accessors.ShaderProgramAccessor;

public class ListHolder implements ZenithInternal076 {
   private static final List<Runnable> llI11l1I11ll1IIl1lII11Il1II = new ArrayList<>();
   protected ShaderProgram I11IIl11I11Il;
   protected ShaderProgramKey lI11IlI111lllI1IIl1III1II;

   public ListHolder(Identifier Identifier, net.minecraft.client.render.VertexFormat VertexFormat) {
      this.lI11IlI111lllI1IIl1III1II = new ShaderProgramKey(Identifier.withPrefixedPath("core/"), VertexFormat, Defines.EMPTY);
      llI11l1I11ll1IIl1lII11Il1II.add(() -> {
         try {
            this.I11IIl11I11Il = l11I1I1ll1Illll1I1l1111l1II.getShaderLoader().getProgramToLoad(this.lI11IlI111lllI1IIl1III1II);
            this.llllIll1l11l11I1l11l11();
         } catch (CopyNameLootFunction52 CopyNameLootFunction52) {
         }
      });
   }

   public RenderPhase Il1IIl11I1Il1l1II1III1() {
      return new SmallPufferfishEntityModel2(this.lI11IlI111lllI1IIl1III1II);
   }

   public ShaderProgram IlllIllllII() {
      return RenderSystem.setShader(this.lI11IlI111lllI1IIl1III1II);
   }

   protected void llllIll1l11l11I1l11l11() {
   }

   public net.minecraft.client.gl.GlUniform CloudFriendInfo(String s) {
      return ((ShaderProgramAccessor)this.I11IIl11I11Il).getUniformsByName().get(s);
   }

   public static void llIl11llllIllIIll1lll1I1l() {
      llI11l1I11ll1IIl1lII11Il1II.forEach(Runnable::run);
   }
}
