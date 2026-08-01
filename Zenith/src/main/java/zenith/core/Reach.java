package zenith;

@ModuleInfo(
   name = "Reach",
   category = Category.COMBAT,
   description = ""
)
public final class Reach extends Module {
   public static final Reach I1I1IIlIll = new Reach();
   public final MultiBooleanSetting lIIIl1IIllIlllIl111l = new MultiBooleanSetting("module.reach.mods", "module.reach.mods.desc");
   public final MultiBooleanSetting$II1Il11l111II11IIl I1lIIIIl11Il1II1ll11llII = new MultiBooleanSetting$II1Il11l111II11IIl(
      this.lIIIl1IIllIlllIl111l, "module.reach.defoult", true
   );
   public final NumberSetting IIIlllIl1I1 = new NumberSetting(
      "module.reach.reach", 3.0F, 3.0F, 6.0F, 0.05F, "module.reach.reach.desc", "b", this.I1lIIIIl11Il1II1ll11llII::Spider, null
   );
   public final NumberSetting IlIIlllIIIlllI1Il1Il11llI1lll = new NumberSetting(
      "module.reach.reachBlock", 3.0F, 3.0F, 20.0F, 0.05F, "module.reach.reachBlock.desc", "b", this.I1lIIIIl11Il1II1ll11llII::Spider, null
   );

   private Reach() {
   }
}
