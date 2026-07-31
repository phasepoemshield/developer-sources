// Module: AutoTool
// Category: misc
// Original class: Autotool
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.misc;

import java.util.Comparator;
import java.util.Objects;
import net.minecraft.util.Hand;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.screen.slot.Slot;
import net.minecraft.util.math.BlockPos;
import net.minecraft.block.BlockState;

@ModuleInfo(
   name = "AutoTool",
   category = Category.MISC,
   description = "Выбирает лучший инструмент для добычи блоков"
)
public final class Autotool extends Module {
   public static final Autotool llllIll11l1I111III = new Autotool();
   private final TimerUtil l1Illl1llI1IIl1ll1lIIlIllll11I = new TimerUtil();
   private Slot l1IIl1IIl1lIlll = null;

   private Autotool() {
   }

   @EventTarget
   public void StringHolder_8(doubleHolder_2 illli1l1llii1ii1ii1llllii1i1l) {
      if (this.l1IIl1IIl1lIlll != null) {
         illli1l1llii1ii1ii1llllii1i1l.EventBus(true);
      }
   }

   @EventTarget
   public void StringHolder_8(BlockPosHolder_2 ll11ii1i1l1) {
      this.l1Illl1llI1IIl1ll1lIIlIllll11I.reset();
      if (!Objects.requireNonNull(l11I1I1ll1Illll1I1l1111l1II.player).isCreative()) {
         Slot Slot = this.EventImpl_21(ll11ii1i1l1.Noslow());
         if (Slot != null && Slot != ListHolder_5.Il1I1l1llI1l1lIIIlIlII1II11I1()) {
            if (this.l1IIl1IIl1lIlll == null) {
               this.l1IIl1IIl1lIlll = Slot;
            }

            if (ListHolder_8.Event(Autotool.class)) {
               ListHolder_8.StringHolder_8(Autotool.class, () -> {
                  if (!(l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler instanceof PlayerScreenHandler)) {
                     ListHolder_5.IIl1IlI1l11Il();
                  }

                  ListHolder_5.StringHolder_8(Slot, Hand.MAIN_HAND, true);
               });
            }
         }
      }
   }

   @EventTarget
   public void ZenithInternal028(EventImpl_22 l11llilil1) {
      if (ListHolder_8.Event(Autotool.class)
         && this.l1IIl1IIl1lIlll != null
         && this.l1Illl1llI1IIl1ll1lIIlIllll11I.hasTimeElapsed(400.0)) {
         Slot Slot = this.l1IIl1IIl1lIlll;
         ListHolder_8.StringHolder_8(Autotool.class, () -> {
            if (!(l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler instanceof PlayerScreenHandler)) {
               ListHolder_5.IIl1IlI1l11Il();
            }

            ListHolder_5.StringHolder_8(Slot, Hand.MAIN_HAND, true);
         });
         this.l1IIl1IIl1lIlll = null;
      }
   }

   private Slot EventImpl_21(BlockPos BlockPos) {
      BlockState BlockState = l11I1I1ll1Illll1I1l1111l1II.world.getBlockState(BlockPos);
      return ZenithInternal066.EventTarget(BlockState)
         ? ListHolder_5.Il1I1l1llI1l1lIIIlIlII1II11I1()
         : l11I1I1ll1Illll1I1l1111l1II.player
            .playerScreenHandler
            .slots
            .stream()
            .sorted(Comparator.comparing(Slot -> Slot.equals(ListHolder_5.Il1I1l1llI1l1lIIIlIlII1II11I1())))
            .filter(Slot -> Slot.getStack().getMiningSpeedMultiplier(BlockState) != 1.0F)
            .max(Comparator.comparingDouble(Slot -> (double)Slot.getStack().getMiningSpeedMultiplier(BlockState)))
            .orElse(null);
   }
}
