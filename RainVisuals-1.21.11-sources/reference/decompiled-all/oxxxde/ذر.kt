package oxxxde

// $VF: Compiled from heavy
public object ذر {
   public final val DISPATCHER: بئ = ظق.INSTANCE.getDispatcher()
   public final val BASIC_RECT: ضِ = ضِ(ذر.ADVANCED_RECT)
   public final val ADVANCED_RECT: زج = زج()
   public final val KAWASE: اْ = اْ()
   public final val BLURRED_RECT: جء = جء(ذر.TEXTURE_RECT, KAWASE)
   public final val TEXTURE_RECT: جث = جث(ADVANCED_RECT)

   fun getBLURRED_RECT(): جء {
      BLURRED_RECT
   }

   fun getADVANCED_RECT(): زج {
      ADVANCED_RECT
   }

   fun getDISPATCHER(): بئ {
      DISPATCHER
   }

   fun getTEXTURE_RECT(): جث {
      TEXTURE_RECT
   }

   fun getKAWASE(): اْ {
      KAWASE
   }

   fun getBASIC_RECT(): ضِ {
      BASIC_RECT
   }
}
