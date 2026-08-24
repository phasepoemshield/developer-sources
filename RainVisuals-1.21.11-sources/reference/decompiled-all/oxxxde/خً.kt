package oxxxde

import java.util.ArrayList
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
            ثة.INSTANCE,
            خأ.INSTANCE,
            ظه.INSTANCE,
            بإ.INSTANCE,
            ظا.INSTANCE,
            ذض.INSTANCE,
            ضق.INSTANCE,
            رج.INSTANCE,
            شء.INSTANCE,
            دّ.INSTANCE,
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
            اف.INSTANCE,
            ضا.INSTANCE,
            ذك.INSTANCE,
            رش.INSTANCE,
            صَ.INSTANCE,
            زب.INSTANCE,
            بآ.INSTANCE,
            بط.INSTANCE,
            خا.INSTANCE,
            اؤ.INSTANCE,
            سِ.INSTANCE,
            خص.INSTANCE,
            ثأ.INSTANCE,
            ذً.INSTANCE,
            تأ.INSTANCE,
            رع.INSTANCE,
            ضت.INSTANCE,
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
            ثض.INSTANCE,
            شص.INSTANCE,
            جض.INSTANCE,
            زأ.INSTANCE,
            ثِ.INSTANCE,
            شح.INSTANCE,
            ضع.INSTANCE,
            اّ.INSTANCE,
            خي.INSTANCE,
            بج.INSTANCE,
            ظؤ.INSTANCE,
            زت.INSTANCE,
            حش.INSTANCE,
            صِ.INSTANCE,
            صب.INSTANCE,
            جط.INSTANCE,
            شز.INSTANCE,
            جق.INSTANCE,
            رو.INSTANCE
         )
      }
   }

   public fun syncAvailabilityStates() {
      for (`element$iv` in modules) {
         (`element$iv` as دِ).syncEnabledState()
      }
   }

   private fun add(vararg module: دِ) {
      CollectionsKt.addAll(modules, module)
   }
}
