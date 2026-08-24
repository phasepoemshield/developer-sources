package oxxxde

import com.google.gson.annotations.SerializedName
import org.jetbrains.annotations.NotNull

// $VF: Compiled from heavy
public class اح {
   public final var atlas: ال = ال()
      private set

   public final var metrics: صك = صك()
      private set

   @SerializedName("kerning")
   @NotNull
   public final var kernings: List<تخ>

   public final var glyphs: List<دح> = CollectionsKt.emptyList()

   fun setAtlas(`<set-?>`: ال) {
      this.atlas = `<set-?>`
   }

   fun setMetrics(`<set-?>`: صك) {
      this.metrics = `<set-?>`
   }

   fun getAtlas(): ال {
      this.atlas
   }

   fun getMetrics(): صك {
      this.metrics
   }
}
