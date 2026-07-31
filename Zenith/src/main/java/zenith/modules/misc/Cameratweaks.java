// Module: CameraTweaks
// Category: misc
// Original class: Cameratweaks
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.misc;

import java.util.List;
import net.minecraft.util.math.MathHelper;
import net.minecraft.client.option.Perspective;

@ModuleInfo(
   name = "CameraTweaks",
   description = "Настройки камеры",
   category = Category.MISC
)
public final class Cameratweaks extends Module {
   public static final Cameratweaks IIIIIlIIlIll1IlIl11 = new Cameratweaks();
   private float IIIIIllllllI1I1l111 = 110.0F;
   private float l1Il1l11lIIII1ll1I = 30.0F;
   private float Illl1IIIIIl1lIl = 30.0F;
   private Perspective lIl1llllI1l1IIlllI1I;
   private floatHolder_6 IIIlI1lI11l1111IlIl11;
   private final MultiBooleanSetting IIlll1I11I1111l1 = MultiBooleanSetting.StringHolder_8(
      "module.cameraTweaks.multiSetting",
      "module.cameraTweaks.multiSetting.desc",
      List.of("module.cameraTweaks.ratio", "module.cameraTweaks.clip", "module.cameraTweaks.distance")
   );
   private final NumberSetting I11II11ll1l11IlIlI1lll1 = new NumberSetting(
      "module.cameraTweaks.ratioSetting",
      1.0F,
      0.1F,
      2.0F,
      0.1F,
      "module.cameraTweaks.ratioSetting.desc",
      "x",
      () -> this.IIlll1I11I1111l1.ConstructorHolder(0),
      null
   );
   private final NumberSetting I1ll11lI11I1II1I1I1l111lIIlll = new NumberSetting(
      "module.cameraTweaks.distanceSetting",
      3.0F,
      2.0F,
      5.0F,
      0.5F,
      "module.cameraTweaks.distanceSetting.desc",
      "b",
      () -> this.IIlll1I11I1111l1.ConstructorHolder(2),
      null
   );
   private final BindSetting l11111IlIIl1IIlIl1lI = new BindSetting("module.cameraTweaks.zoomSetting", "module.cameraTweaks.zoomSetting.desc");
   private final BindSetting III1Il1IIIIl1I1 = new BindSetting(
      "module.cameraTweaks.freeLookSetting", "module.cameraTweaks.freeLookSetting.desc"
   );

   private Cameratweaks() {
   }

   @EventTarget
   public void StringHolder_8(KeyEvent i111liliill1iii1iiii1) {
      if (l11I1I1ll1Illll1I1l1111l1II.currentScreen == null) {
         if (i111liliill1iii1iiii1.StringHolder_5(this.l11111IlIIl1IIlIl1lI.Elytramotion())) {
            this.IIIIIllllllI1I1l111 = Math.min(
               this.Illl1IIIIIl1lIl, (float)((Integer)l11I1I1ll1Illll1I1l1111l1II.options.getFov().getValue() - 20)
            );
         }

         if (i111liliill1iii1iiii1.ZenithInternal095(this.l11111IlIIl1IIlIl1lI.Elytramotion(), true)) {
            this.Illl1IIIIIl1lIl = this.IIIIIllllllI1I1l111;
            this.IIIIIllllllI1I1l111 = (float)((Integer)l11I1I1ll1Illll1I1l1111l1II.options.getFov().getValue()).intValue();
         }

         if (i111liliill1iii1iiii1.StringHolder_5(this.III1Il1IIIIl1I1.Elytramotion())) {
            this.lIl1llllI1l1IIlllI1I = l11I1I1ll1Illll1I1l1111l1II.options.getPerspective();
         }
      }
   }

   @EventTarget
   public void StringHolder_8(doubleHolder_2 illli1l1llii1ii1ii1llllii1i1l) {
      if (ZenithInternal066.StringHolder_8(this.l11111IlIIl1IIlIl1lI)) {
         this.IIIIIllllllI1I1l111 = (float)(
            (int)MathHelper.clamp(
               (double)this.IIIIIllllllI1I1l111 - illli1l1llii1ii1ii1llllii1i1l.Elytrabooster() * 10.0,
               10.0,
               (double)((Integer)l11I1I1ll1Illll1I1l1111l1II.options.getFov().getValue()).intValue()
            )
         );
         illli1l1llii1ii1ii1llllii1i1l.EventBus(true);
      }
   }

   @EventTarget
   public void StringHolder_8(ZenithInternal136 ll11l1i1l1ii) {
      if (ZenithInternal066.StringHolder_8(this.III1Il1IIIIl1I1)) {
         if (l11I1I1ll1Illll1I1l1111l1II.options.getPerspective().isFirstPerson()) {
            l11I1I1ll1Illll1I1l1111l1II.options.setPerspective(Perspective.THIRD_PERSON_BACK);
         }
      } else if (this.lIl1llllI1l1IIlllI1I != null) {
         l11I1I1ll1Illll1I1l1111l1II.options.setPerspective(this.lIl1llllI1l1IIlllI1I);
         this.lIl1llllI1l1IIlllI1I = null;
      }

      if (this.l11111IlIIl1IIlIl1lI.isVisible()) {
         ll11l1i1l1ii.ListHolder_6(
            (int)MathHelper.clamp(
               (this.l1Il1l11lIIII1ll1I = doubleHolder_3.StringHolder_8(1.6, this.l1Il1l11lIIII1ll1I, this.IIIIIllllllI1I1l111)) + 1.0F,
               10.0F,
               (float)((Integer)l11I1I1ll1Illll1I1l1111l1II.options.getFov().getValue()).intValue()
            )
         );
         ll11l1i1l1ii.ZenithInternal069();
      }
   }

   @EventTarget
   public void EventBus(ZenithInternal090 l1l11ii1iiillilll) {
      if (ZenithInternal066.StringHolder_8(this.III1Il1IIIIl1I1)) {
         this.IIIlI1lI11l1111IlIl11 = new floatHolder_6(
            (float)((double)this.IIIlI1lI11l1111IlIl11.AutoBrewing() + l1l11ii1iiillilll.Castlefly() * 0.15F),
            (float)MathHelper.clamp((double)this.IIIlI1lI11l1111IlIl11.Basefinder() + l1l11ii1iiillilll.GrimGlide() * 0.15F, -90.0, 90.0)
         );
         l1l11ii1iiillilll.EventBus(true);
      } else {
         this.IIIlI1lI11l1111IlIl11 = new floatHolder_6(
            l11I1I1ll1Illll1I1l1111l1II.player.getYaw(), l11I1I1ll1Illll1I1l1111l1II.player.getPitch()
         );
      }
   }

   @EventTarget
   public void StringHolder_8(booleanHolder_4 illilll1ii11l1i1l) {
      illilll1ii11l1i1l.ZenithInternal070(this.IIlll1I11I1111l1.ConstructorHolder(1));
      if (this.IIlll1I11I1111l1.ConstructorHolder(2)) {
         illilll1ii11l1i1l.ConnectThread(this.I1ll11lI11I1II1I1I1l111lIIlll.lll1lI1llll1IIllIIIII1lll());
      }

      if (this.IIIlI1lI11l1111IlIl11 != null) {
         illilll1ii11l1i1l.StringHolder_8(this.IIIlI1lI11l1111IlIl11);
      }

      if (this.IIlll1I11I1111l1.ConstructorHolder(1)
         || this.IIlll1I11I1111l1.ConstructorHolder(2)
         || this.IIIlI1lI11l1111IlIl11 != null) {
         illilll1ii11l1i1l.ZenithInternal069();
      }
   }

   @EventTarget
   public void StringHolder_8(floatHolder_10 lilili1l1iil) {
      if (this.IIlll1I11I1111l1.ConstructorHolder(0)) {
         lilili1l1iil.ByteBufferHolder_2(this.I11II11ll1l11IlIlI1lll1.lll1lI1llll1IIllIIIII1lll());
         lilili1l1iil.EventBus(true);
      }
   }
}
