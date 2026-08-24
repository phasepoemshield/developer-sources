package oxxxde

import java.util.ArrayList
import kotakbaz.rain.module.Module
import kotakbaz.rain.module.modules.hud.TargetHudModule
import kotakbaz.rain.module.modules.hud.container.HudModule
import kotakbaz.rain.module.modules.player.AutoInvestModule
import kotakbaz.rain.module.modules.player.AutoReissueModule
import kotakbaz.rain.module.modules.player.ChangeHandModule
import kotakbaz.rain.module.modules.player.CommandFixModule
import kotakbaz.rain.module.modules.render.ItemPhysicModule
import kotakbaz.rain.module.modules.render.SoulsModule
import kotakbaz.rain.module.modules.render.WayPointModule
import kotakbaz.rain.ui.mainmenu.RainMainMenuScreen$Link
import ru.ocz.protection.annotation.Compile
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat

// $VF: Compiled from heavy
@RecompileFormat
public object خً : ه {
   public final val modules: MutableList<دِ> = ArrayList() as java.util.List

   @Compile(ops = 10)
   public override fun load() {
      if (modules.isEmpty()) {
         this.add(
            د.INSTANCE,
            حغ.INSTANCE,
            تص.INSTANCE,
            سظ.INSTANCE,
            AutoInvestModule.INSTANCE,
            خأ.INSTANCE,
            AutoReissueModule.INSTANCE,
            بإ.INSTANCE,
            ظا.INSTANCE,
            ذض.INSTANCE,
            ضق.INSTANCE,
            رج.INSTANCE,
            شء.INSTANCE,
            CommandFixModule.INSTANCE,
            خث.INSTANCE,
            اإ.INSTANCE,
            سه.INSTANCE,
            ثك.INSTANCE,
            جؤ.INSTANCE,
            بو.INSTANCE,
            تب.INSTANCE,
            ات.INSTANCE,
            شا.INSTANCE,
            ج.INSTANCE,
            خِ.INSTANCE,
            ثو.INSTANCE,
            ChangeHandModule.INSTANCE,
            ضا.INSTANCE,
            ذك.INSTANCE,
            رش.INSTANCE,
            صَ.INSTANCE,
            زب.INSTANCE,
            TargetHudModule.INSTANCE,
            بط.INSTANCE,
            خا.INSTANCE,
            اؤ.INSTANCE,
            RainMainMenuScreen$Link.INSTANCE,
            خص.INSTANCE,
            ثأ.INSTANCE,
            ذً.INSTANCE,
            تأ.INSTANCE,
            رع.INSTANCE,
            WayPointModule.INSTANCE,
            بَ.INSTANCE,
            ظث.INSTANCE,
            ذج.INSTANCE,
            عج.INSTANCE,
            ثا.INSTANCE,
            تع.INSTANCE,
            سء.INSTANCE,
            بؤ.INSTANCE,
            رز.INSTANCE,
            ْ.INSTANCE,
            خْ.INSTANCE,
            رإ.INSTANCE,
            سٌ.INSTANCE,
            دظ.INSTANCE,
            ثر.INSTANCE,
            ItemPhysicModule.INSTANCE,
            شص.INSTANCE,
            جض.INSTANCE,
            زأ.INSTANCE,
            ثِ.INSTANCE,
            شح.INSTANCE,
            ضع.INSTANCE,
            اّ.INSTANCE,
            خي.INSTANCE,
            HudModule.INSTANCE,
            ظؤ.INSTANCE,
            زت.INSTANCE,
            حش.INSTANCE,
            صِ.INSTANCE,
            صب.INSTANCE,
            SoulsModule.INSTANCE,
            شز.INSTANCE,
            جق.INSTANCE,
            رو.INSTANCE
         )
      }
   }

   public fun syncAvailabilityStates() {
      for (`element$iv` in modules) {
         (`element$iv` as Module).syncEnabledState()
      }
   }

   private fun add(vararg module: دِ) {
      CollectionsKt.addAll(modules, module)
   }
}
