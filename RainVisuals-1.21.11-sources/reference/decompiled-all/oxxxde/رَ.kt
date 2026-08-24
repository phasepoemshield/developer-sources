package oxxxde

// $VF: Compiled from heavy
public object رَ {
   public final val ICON2: جً by LazyKt.lazy({ 
      INSTANCE.get("rain", "icon2")
   })

   public final val GS_BOLD: جً by LazyKt.lazy({ 
      INSTANCE.get("google_sans", "google_sans_bold")
   })

   public const val GS: String = "google_sans"

   public final val GS_SEMI: جً by LazyKt.lazy({ 
      INSTANCE.get("google_sans", "google_sans_semi")
   })

   public const val RAIN: String = "rain"

   public final val ICON: جً by LazyKt.lazy({ 
      INSTANCE.get("rain", "icon")
   })

   public final val GS_REGULAR: جً by LazyKt.lazy({ 
      INSTANCE.get("google_sans", "google_sans_regular")
   })

   public final val all: List<جً> by LazyKt.lazy(
      { 
         CollectionsKt.listOf(
            INSTANCE.getGS_BOLD(),
            INSTANCE.getGS_SEMI(),
            INSTANCE.getGS_MEDIUM(),
            INSTANCE.getGS_REGULAR(),
            INSTANCE.getICON(),
            INSTANCE.getICON2(),
            INSTANCE.getLOGO()
         )
      }
   )
      public final get() {
         return all$delegate.value as MutableList<جً>
      }


   public final val GS_MEDIUM: جً by LazyKt.lazy({ 
      INSTANCE.get("google_sans", "google_sans_medium")
   })

   public final val LOGO: جً by LazyKt.lazy({ 
      INSTANCE.get("rain", "logo")
   })

   fun getGS_MEDIUM(): جً {
      GS_MEDIUM$delegate.value as جً
   }

   fun getGS_REGULAR(): جً {
      GS_REGULAR$delegate.value as جً
   }

   fun getLOGO(): جً {
      LOGO$delegate.value as جً
   }

   fun getICON2(): جً {
      ICON2$delegate.value as جً
   }

   private fun get(folder: String, name: String): جً {
      return ظس().find("$folder/$name").build()
   }

   fun getICON(): جً {
      ICON$delegate.value as جً
   }

   fun getGS_SEMI(): جً {
      GS_SEMI$delegate.value as جً
   }

   fun getGS_BOLD(): جً {
      GS_BOLD$delegate.value as جً
   }
}
