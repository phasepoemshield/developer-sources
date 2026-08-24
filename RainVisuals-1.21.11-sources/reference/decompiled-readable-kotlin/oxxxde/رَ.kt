package oxxxde

import kotakbaz.rain.client.util.render.font.Font
import kotakbaz.rain.client.util.render.font.FontBuilder

// $VF: Compiled from heavy
public object رَ {
   public final val ICON2: جً by LazyKt.lazy({ 
      INSTANCE.get("rain", "icon2")
   })
      public final get() {
         return ICON2$delegate.value as Font
      }


   public final val GS_BOLD: جً by LazyKt.lazy({ 
      INSTANCE.get("google_sans", "google_sans_bold")
   })
      public final get() {
         return GS_BOLD$delegate.value as Font
      }


   public const val GS: String = "google_sans"

   public final val GS_SEMI: جً by LazyKt.lazy({ 
      INSTANCE.get("google_sans", "google_sans_semi")
   })
      public final get() {
         return GS_SEMI$delegate.value as Font
      }


   public const val RAIN: String = "rain"

   public final val ICON: جً by LazyKt.lazy({ 
      INSTANCE.get("rain", "icon")
   })
      public final get() {
         return ICON$delegate.value as Font
      }


   public final val GS_REGULAR: جً by LazyKt.lazy({ 
      INSTANCE.get("google_sans", "google_sans_regular")
   })
      public final get() {
         return GS_REGULAR$delegate.value as Font
      }


   public final val all: List<جً> by LazyKt.lazy({ 
      CollectionsKt.listOf(INSTANCE.GS_BOLD, INSTANCE.GS_SEMI, INSTANCE.GS_MEDIUM, INSTANCE.GS_REGULAR, INSTANCE.ICON, INSTANCE.ICON2, INSTANCE.LOGO)
   })
      public final get() {
         return all$delegate.value as MutableList<Font>
      }


   public final val GS_MEDIUM: جً by LazyKt.lazy({ 
      INSTANCE.get("google_sans", "google_sans_medium")
   })
      public final get() {
         return GS_MEDIUM$delegate.value as Font
      }


   public final val LOGO: جً by LazyKt.lazy({ 
      INSTANCE.get("rain", "logo")
   })
      public final get() {
         return LOGO$delegate.value as Font
      }


   private fun get(folder: String, name: String): جً {
      return FontBuilder().find("$folder/$name").build()
   }
}
