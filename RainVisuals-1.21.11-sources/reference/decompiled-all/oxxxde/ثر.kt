package oxxxde

import java.awt.Color
import kotlin.math.MathKt
import net.minecraft.client.gui.DrawContext
import net.minecraft.item.Item
import net.minecraft.item.ItemStack
import net.minecraft.item.Items
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat

// $VF: Compiled from heavy
@RecompileFormat
public object ثر : دِ("ItemHighliter", ظن.getRENDER(), "Подсвечивает выбранные предметы в инвентаре") {
   private final val driedKelp: زغ
   private final val pulse: خذ = دِ.boolean$default(ثر.INSTANCE, "Пульсация", false, null, 4, null)

   private final val pulseMinAlpha: طُ = دِ.slider$default(ثر.INSTANCE, "Прозрачность", 30.0F, 0.0F, 100.0F, 1.0F, null, 32, null).setVisible({ 
      pulse.getValue()
   })

   private final val totem: زغ

   private final val pulseSpeed: طُ = دِ.slider$default(ثر.INSTANCE, "Скорость пульсации", 2.0F, 0.1F, 8.0F, 0.1F, null, 32, null).setVisible({ 
      pulse.getValue()
   })

   private final val splashPotion: زغ
   private final val sugar: زغ
   private final val snowball: زغ
   private final val experienceBottle: زغ
   private final val chorusFruit: زغ
   private final val netheriteScrap: زغ
   private const val ITEM_SIZE: Int = 16
   private final val enderEye: زغ
   private final val enchantedGoldenApple: زغ
   private final val enderPearl: زغ
   private final val goldenApple: زغ
   private final val highlights: List<زغ>

   private fun resolveColor(baseColor: Color): Color {
      if (!pulse.getValue()) {
         return baseColor
      } else {
         val minimumFactor: Float = RangesKt.coerceIn(pulseMinAlpha.getValue().floatValue() / 100.0F, 0.0F, 1.0F)
         return Color(
            baseColor.getRed(),
            baseColor.getGreen(),
            baseColor.getBlue(),
            RangesKt.coerceIn(
               MathKt.roundToInt(
                  (float)baseColor.getAlpha()
                     * (
                        minimumFactor
                           + (1.0F - minimumFactor)
                              * (float)(
                                 (Math.sin((double)System.currentTimeMillis() / 1000.0 * pulseSpeed.getValue().doubleValue() * 2.0 * Math.PI) + 1.0) * 0.5
                              )
                     )
               ),
               0,
               255
            )
         )
      }
   }

   fun renderHighlight(stack: DrawContext, y: ItemStack, context: Int, x: Int) {
      val var10000: Color = this.resolveItemColor(stack)
      if (var10000 != null) {
         context.fill(x, y, x + 16, y + 16, this.resolveColor(var10000).getRGB())
      }
   }

   @JvmStatic
   fun {
      var var10000: ثر = INSTANCE
      var var10001: Item = Items.ENDER_EYE
      enderEye = highlightEntry$default(var10000, var10001, "Дезореинтация", Color(255, 84, 84, 255), null, null, 24, null)
      var10000 = INSTANCE
      var10001 = Items.SUGAR
      sugar = highlightEntry$default(var10000, var10001, "Явная пыль", Color(255, 255, 255, 255), null, null, 24, null)
      var10000 = INSTANCE
      var10001 = Items.TOTEM_OF_UNDYING
      totem = highlightEntry$default(var10000, var10001, "Тотем", Color(126, 255, 111, 255), null, null, 24, null)
      var10000 = INSTANCE
      var10001 = Items.EXPERIENCE_BOTTLE
      experienceBottle = highlightEntry$default(var10000, var10001, "Пузырёк опыта", Color(89, 255, 150, 255), null, null, 24, null)
      var10000 = INSTANCE
      var10001 = Items.NETHERITE_SCRAP
      netheriteScrap = highlightEntry$default(var10000, var10001, "Трапка", Color(125, 125, 125, 255), null, null, 24, null)
      var10000 = INSTANCE
      var10001 = Items.DRIED_KELP
      driedKelp = highlightEntry$default(var10000, var10001, "Пласт", Color(140, 176, 88, 255), null, null, 24, null)
      var10000 = INSTANCE
      var10001 = Items.GOLDEN_APPLE
      goldenApple = highlightEntry$default(var10000, var10001, "Золотое яблоко", Color(255, 210, 64, 255), null, null, 24, null)
      var10000 = INSTANCE
      var10001 = Items.ENCHANTED_GOLDEN_APPLE
      enchantedGoldenApple = highlightEntry$default(var10000, var10001, "Зачарованое яблоко", Color(255, 104, 220, 255), null, null, 24, null)
      var10000 = INSTANCE
      var10001 = Items.CHORUS_FRUIT
      chorusFruit = highlightEntry$default(var10000, var10001, "Хорус", Color(198, 118, 255, 255), null, null, 24, null)
      var10000 = INSTANCE
      var10001 = Items.ENDER_PEARL
      enderPearl = highlightEntry$default(var10000, var10001, "Эндер жемчуг", Color(87, 255, 220, 255), null, null, 24, null)
      var10000 = INSTANCE
      var10001 = Items.SNOWBALL
      snowball = highlightEntry$default(var10000, var10001, "Снежок заморозка", Color(210, 244, 255, 255), null, null, 24, null)
      var10000 = INSTANCE
      var10001 = Items.SPLASH_POTION
      splashPotion = highlightEntry$default(var10000, var10001, "Взрывное зелье", Color(112, 170, 255, 255), null, null, 24, null)
      highlights = CollectionsKt.listOf(
         enderEye,
         sugar,
         totem,
         experienceBottle,
         netheriteScrap,
         driedKelp,
         goldenApple,
         enchantedGoldenApple,
         chorusFruit,
         enderPearl,
         snowball,
         splashPotion
      )
   }

   fun resolveItemColor(stack: ItemStack): Color {
      if (this.isEnabled() && !stack.isEmpty()) {
         val var5: java.util.Iterator = highlights.iterator()

         var var10000: Any
         while (true) {
            if (!var5.hasNext()) {
               var10000 = null
               break
            }

            val `element$iv`: Any = var5.next()
            if ((`element$iv` as زغ).getToggle().getValue() && stack.isOf((`element$iv` as زغ).getItem())) {
               var10000 = `element$iv`
               break
            }
         }

         val var2: زغ = var10000 as زغ
         if (var10000 as زغ != null) {
            val var9: رت = var2.getColor()
            if (var9 != null) {
               var9.getValue() as Color
            }
         }

         null
      } else {
         null
      }
   }

   fun highlightEntry(item: Item, configKey: java.lang.String, name: Color, defaultColor: java.lang.String, colorText: java.lang.String): زغ {
      val toggle: خذ = this.boolean(name, true, "$configKey.enabled")
      زغ(item, toggle, this.color(colorText, defaultColor, "$configKey.color").setVisible({ 
         `$toggle`.getValue()
      }))
   }
}
