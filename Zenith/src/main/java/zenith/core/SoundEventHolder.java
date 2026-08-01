package zenith;

import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundCategory;
import net.minecraft.registry.Registries;

public class SoundEventHolder implements ZenithInternal076 {
   public final SoundEvent IIl1I1lIIl1IIIIIII = SoundEvent.of(Identifier.of("zenith:gui_open"));
   public final SoundEvent lIII1l1I1lIllI1llIIlIlll = SoundEvent.of(Identifier.of("zenith:gui_close"));
   public final SoundEvent Illl1ll11lI1I = SoundEvent.of(Identifier.of("zenith:module_enable"));
   public final SoundEvent ll1III = SoundEvent.of(Identifier.of("zenith:module_disable"));
   public final SoundEvent IIl1l1II1I11IllI1I111Ill1 = SoundEvent.of(Identifier.of("zenith:click_left"));
   public final SoundEvent l11l11lII11lIl1l = SoundEvent.of(Identifier.of("zenith:click_right"));
   public final SoundEvent II11l111l1IllII = SoundEvent.of(Identifier.of("zenith:slider_step"));

   public SoundEventHolder() {
      Registry.register(Registries.SOUND_EVENT, this.IIl1I1lIIl1IIIIIII.id(), this.IIl1I1lIIl1IIIIIII);
      Registry.register(Registries.SOUND_EVENT, this.lIII1l1I1lIllI1llIIlIlll.id(), this.lIII1l1I1lIllI1llIIlIlll);
      Registry.register(Registries.SOUND_EVENT, this.Illl1ll11lI1I.id(), this.Illl1ll11lI1I);
      Registry.register(Registries.SOUND_EVENT, this.ll1III.id(), this.ll1III);
      Registry.register(Registries.SOUND_EVENT, this.IIl1l1II1I11IllI1I111Ill1.id(), this.IIl1l1II1I11IllI1I111Ill1);
      Registry.register(Registries.SOUND_EVENT, this.l11l11lII11lIl1l.id(), this.l11l11lII11lIl1l);
      Registry.register(Registries.SOUND_EVENT, this.II11l111l1IllII.id(), this.II11l111l1IllII);
   }

   public void StringHolder_8(SoundEvent SoundEvent) {
      this.StringHolder_8(SoundEvent, Interface.ll11lIl1IlIl1lI1.II1I11IIl1ll1I1lIlllIIlllIl.lll1lI1llll1IIllIIIII1lll(), 1.0F);
   }

   public void StringHolder_8(SoundEvent SoundEvent, float f, float f1) {
      if (!ZenithInternal066.lII1IlIll11()) {
         l11I1I1ll1Illll1I1l1111l1II.world
            .playSound(
               l11I1I1ll1Illll1I1l1111l1II.player, l11I1I1ll1Illll1I1l1111l1II.player.getBlockPos(), SoundEvent, SoundCategory.BLOCKS, f, f1
            );
      }
   }

   public SoundEvent I11Il1I1lllI1ll11III() {
      return this.IIl1I1lIIl1IIIIIII;
   }

   public SoundEvent lIII1Il1l1I1l1111l1IllIl() {
      return this.lIII1l1I1lIllI1llIIlIlll;
   }

   public SoundEvent lI1II1lII1IlIIIlll1Ill1() {
      return this.Illl1ll11lI1I;
   }

   public SoundEvent IllIIlIIl11111Il1I1l1I11l1() {
      return this.ll1III;
   }

   public SoundEvent lll1llIl1lIIl11111l111lI1l1l() {
      return this.IIl1l1II1I11IllI1I111Ill1;
   }

   public SoundEvent llIlII11IIll() {
      return this.l11l11lII11lIl1l;
   }

   public SoundEvent ll1II1111l11l1IlI() {
      return this.II11l111l1IllII;
   }
}
