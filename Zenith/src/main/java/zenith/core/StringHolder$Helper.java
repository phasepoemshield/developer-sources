package zenith;

enum Shaderhand$II1Il11l111II11IIl {
   IlIl1IlIIIl1lII1lIII11l("module.shaderHand.shader.aqua", "sirius_aqua", 0.6F, false),
   I1lIlIlII1111l("module.shaderHand.shader.flow", "sirius_flow", 0.06F, false),
   I1llI1l111("module.shaderHand.shader.smoke", "sirius_smoke", 3.0F, false),
   IIlll11llIl1I("module.shaderHand.shader.holyFuck", "sirius_holyfuck", 0.6F, true),
   llll11Il11IIlI1l("module.shaderHand.shader.gang", "sirius_gang", 0.6F, true),
   I1l1I11l11l1IlI("module.shaderHand.shader.gamer", "sirius_gamer", 1.8F, false),
   II1l111l1111I111lIIIlIlII1l1lI("module.shaderHand.shader.galaxy", "sirius_galaxy", 0.06F, false),
   IlIll1111I1l1I1lII1("module.shaderHand.shader.techno", "sirius_techno", 0.6F, false),
   lIllIl1I11III1lI("module.shaderHand.shader.golden", "sirius_golden", 0.6F, false),
   lll1II1lI1II11IlIlI("module.shaderHand.shader.guiShader", "sirius_guishader", 1.2F, false),
   lll11l1ll11I1I11I1III1l1l111("module.shaderHand.shader.hidef", "sirius_hidef", 3.0F, false),
   II11Il1lI1l11I1I("module.shaderHand.shader.homie", "sirius_homie", 0.06F, false),
   lI11IlIIllI111I1lllIlIl1l111("module.shaderHand.shader.sheldon", "sirius_sheldon", 0.06F, false),
   I1Il111Ill11("module.shaderHand.shader.smoky", "sirius_smoky", 0.06F, false),
   Il1ll1l1IIlIIlIl1IIII11l11I111("module.shaderHand.shader.yippieOwns", "sirius_yippieowns", 6.0F, false),
   Ill1I1l1lII("module.shaderHand.shader.purple", "sirius_purple", 3.0F, false);

   private final String lI1lIIIll1ll1IlI1I1I;
   private final String Illl1l1l11lllIll111Il;
   private final float Il11l1l11I1l11IIIlIlIl111;
   private final boolean II111l11IlIlII111Il;

   private Shaderhand$II1Il11l111II11IIl(String s1, String s2, float f, boolean flag) {
      this.lI1lIIIll1ll1IlI1I1I = s1;
      this.Illl1l1l11lllIll111Il = s2;
      this.Il11l1l11I1l11IIIlIlIl111 = f;
      this.II111l11IlIlII111Il = flag;
   }

   private static Shaderhand$II1Il11l111II11IIl GetDisplayNameHandler_2(int i) {
      Shaderhand$II1Il11l111II11IIl[] ai11l11llllli11i111il1$ii1il11l111ii11iil = values();
      return i >= 0 && i < ai11l11llllli11i111il1$ii1il11l111ii11iil.length ? ai11l11llllli11i111il1$ii1il11l111ii11iil[i] : IlIl1IlIIIl1lII1lIII11l;
   }

   private static String[] lIIII1l11III11ll() {
      Shaderhand$II1Il11l111II11IIl[] ai11l11llllli11i111il1$ii1il11l111ii11iil = values();
      String[] astring = new String[ai11l11llllli11i111il1$ii1il11l111ii11iil.length];

      for (int i = 0; i < ai11l11llllli11i111il1$ii1il11l111ii11iil.length; i++) {
         astring[i] = ai11l11llllli11i111il1$ii1il11l111ii11iil[i].lI1lIIIll1ll1IlI1I1I;
      }

      return astring;
   }
}
