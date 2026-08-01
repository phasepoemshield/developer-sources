package zenith;

@ModuleInfo(
   name = "Anti Invisible",
   category = Category.RENDER,
   description = "Видно инвизок"
)
public final class AntiInvisible extends Module {
   public static final AntiInvisible l1ll1lIl1llllll1 = new AntiInvisible();
   private final ColorSetting llIl1I11l11Il1lI = new ColorSetting(
      "module.antiInvisible.colorSetting", "module.antiInvisible.colorSetting.desc", ByteBufferHolder.ll1lIllll111I1lIIl1lIl.ZenithInternal039(0.5F)
   );

   private AntiInvisible() {
   }

   @EventTarget
   public void StringHolder_8(ZenithInternal139 ll1l1ii1ll1li1il) {
      ll1l1ii1ll1li1il.ZenithException_2(this.llIl1I11l11Il1lI.l1IllIl1l1llIlI11I11Il1l1l1lI1().lllIlll1Ill111l111Il11II11lII());
      ll1l1ii1ll1li1il.ZenithInternal069();
   }

   public ColorSetting lIII1l11II1II1IlIlII1lIlI1I() {
      return this.llIl1I11l11Il1lI;
   }
}
