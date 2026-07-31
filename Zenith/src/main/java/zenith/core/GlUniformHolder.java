package zenith;

import zenith.hud.*;

import net.minecraft.util.Identifier;

public class GlUniformHolder extends ListHolder implements ZenithInternal151 {
   private net.minecraft.client.gl.GlUniform I11lll1ll1lIlIl1Il1I1I;
   private net.minecraft.client.gl.GlUniform Il11Ill1I11l11III1l11Il1I;
   private net.minecraft.client.gl.GlUniform l11l11lI1Ill1l11III1lI11ll;
   private net.minecraft.client.gl.GlUniform llI1111III1lIllll;
   private net.minecraft.client.gl.GlUniform lIllIIlllI;

   public GlUniformHolder(Identifier Identifier) {
      super(Identifier, net.minecraft.client.render.VertexFormats.POSITION_TEXTURE_COLOR);
   }

   public void GetSettingsHandler(float f) {
      this.Il11Ill1I11l11III1l11Il1I.set(f);
      this.I11lll1ll1lIlIl1Il1I1I.set(1.0F / (float)lI1I1l1IlIlIIIIlIIllIIII.getWidth(), 1.0F / (float)lI1I1l1IlIlIIIIlIIllIIII.getHeight());
      this.l11l11lI1Ill1l11III1lI11ll.set(1.0F);
      this.llI1111III1lIllll.set(0.0F);
      this.lIllIIlllI.set(1.0F, 1.0F, 1.0F);
   }

   @Override
   protected void llllIll1l11l11I1l11l11() {
      this.I11lll1ll1lIlIl1Il1I1I = this.CloudFriendInfo("Resolution");
      this.Il11Ill1I11l11III1l11Il1I = this.CloudFriendInfo("Offset");
      this.l11l11lI1Ill1l11III1lI11ll = this.CloudFriendInfo("Saturation");
      this.llI1111III1lIllll = this.CloudFriendInfo("TintIntensity");
      this.lIllIIlllI = this.CloudFriendInfo("TintColor");
      super.llllIll1l11l11I1l11l11();
   }
}
