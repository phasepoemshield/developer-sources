package oxxxde

import net.minecraft.client.render.state.SkyRenderState

// $VF: Compiled from heavy
public object ثا : دِ("CustomSky", ظن.getRENDER(), "Кастомные шейдеры на небо") {
   private const val SHADER_THEMED: String = "themed"
   private const val SHADER_NIGHTFALL: String = "nightfall"
   private final val shader: ظي = دِ.mode$default(ثا.INSTANCE, "Шейдер", CollectionsKt.listOf("sky", "cinematic", "nightfall", "themed"), 0, null, 12, null)
   private const val SHADER_CINEMATIC: String = "cinematic"
   private const val SHADER_SKY: String = "sky"
   private final val shaderNames: Map<String, String> =
      MapsKt.mapOf("sky" to "Небесный", "cinematic" to "Кинематографичный", "nightfall" to "Сумеречный", "themed" to "Тематический")

   fun renderSky(state: SkyRenderState): Boolean {
      if (!this.isEnabled()) {
         false
      } else {
         val customFog: Boolean = بؤ.INSTANCE.isEnabled()
         val fogColor: Int = if (customFog) بؤ.INSTANCE.resolvedFogColor().getRGB() else state.skyColor
         ظّ.render(shader.getValue(), state, fogColor, if (customFog) بؤ.INSTANCE.getFogDensity().getValue().floatValue() / 100.0F else 0.0F)
      }
   }

   public override fun onDisable() {
      ظّ.release()
   }

   @JvmStatic
   fun {
      shader.withDisplayNameProvider({ it: java.lang.String ->
         var var10000: java.lang.String = shaderNames.get(it)
         if (var10000 == null) {
            var10000 = it
         }

         var10000
      })
   }
}
