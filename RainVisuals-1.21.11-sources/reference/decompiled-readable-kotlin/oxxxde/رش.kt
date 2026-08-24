package oxxxde

import java.util.Locale
import kotakbaz.rain.module.Module
import kotakbaz.rain.module.setting.settings.BooleanSetting
import kotakbaz.rain.module.setting.settings.SliderSetting
import net.minecraft.util.Identifier

// $VF: Compiled from heavy
public object رش : Module("SoundsController", PLAYER, "Регулировка выбранных звуков") {
   @JvmStatic
   private BooleanSetting expBottle = Module.boolean$default(رش.INSTANCE, "Пузырёк опыта", false, null, 4, null);
   @JvmStatic
   private SliderSetting expBottleVolume = Module.slider$default(رش.INSTANCE, "Громкость пузырька опыта", 10.0F, 0.0F, 10.0F, 1.0F, null, 32, null)
      .setVisible({ 
         expBottle.getValue()
      });
   @JvmStatic
   private BooleanSetting firework = Module.boolean$default(رش.INSTANCE, "Фейерверк", false, null, 4, null);
   private final val tridentReturnMarkers: Set<String> = SetsKt.setOf("item.trident.return", "item/trident/return", "trident.return", "trident/return")
   private final val expBottleMarkers: Set<String> = SetsKt.setOf("experience_bottle", "experience_orb", "splash_potion")
   @JvmStatic
   private SliderSetting tridentReturnVolume = Module.slider$default(INSTANCE, "Громкость трезубца", 10.0F, 0.0F, 10.0F, 1.0F, null, 32, null).setVisible({ 
      tridentReturn.getValue()
   });
   @JvmStatic
   private BooleanSetting tridentReturn = Module.boolean$default(INSTANCE, "Возвращение трезубца", false, null, 4, null);
   private final val fireworkMarkers: Set<String> = SetsKt.setOf("firework_rocket", "firework_rocket", "firework", "fireworks")
   @JvmStatic
   private SliderSetting fireworkVolume = Module.slider$default(INSTANCE, "Громкость фейерверка", 10.0F, 0.0F, 10.0F, 1.0F, null, 32, null).setVisible({ 
      firework.getValue()
   });

   fun shouldMutePlayback(soundEventId: Identifier?, soundResourceId: Identifier?): Boolean {
      val var10000: java.lang.Float = this.getVolumeMultiplier(soundEventId, soundResourceId)
      var10000 != null && var10000.floatValue() <= 0.0F
   }

   private fun isFireworkSound(normalized: String): Boolean {
      val `$this$any$iv`: java.lang.Iterable = fireworkMarkers
      var var10000: Boolean
      if (fireworkMarkers is java.util.Collection && fireworkMarkers.isEmpty()) {
         var10000 = false
      } else {
         val var4: java.util.Iterator = `$this$any$iv`.iterator()

         while (true) {
            if (!var4.hasNext()) {
               var10000 = false
               break
            }

            if (StringsKt.contains$default(normalized, var4.next() as java.lang.CharSequence, false, 2, null)) {
               var10000 = true
               break
            }
         }
      }

      return var10000
   }

   private fun isExpBottleSound(normalized: String): Boolean {
      val `$this$any$iv`: java.lang.Iterable = expBottleMarkers
      var var10000: Boolean
      if (expBottleMarkers is java.util.Collection && expBottleMarkers.isEmpty()) {
         var10000 = false
      } else {
         val var4: java.util.Iterator = `$this$any$iv`.iterator()

         while (true) {
            if (!var4.hasNext()) {
               var10000 = false
               break
            }

            if (StringsKt.contains$default(normalized, var4.next() as java.lang.CharSequence, false, 2, null)) {
               var10000 = true
               break
            }
         }
      }

      return var10000
   }

   fun normalizedKeys(soundResourceId: Identifier, soundEventId: Identifier): MutableSet<java.lang.String> {
      val var3: java.util.Set = SetsKt.createSetBuilder()
      if (soundEventId != null) {
         var var10001: رش = INSTANCE
         var var10002: java.lang.String = soundEventId.toString()
         var3.add(var10001.normalize(var10002))
         var10001 = INSTANCE
         var10002 = soundEventId.getPath()
         var3.add(var10001.normalize(var10002))
      }

      if (soundResourceId != null) {
         var var11: رش = INSTANCE
         var var14: java.lang.String = soundResourceId.toString()
         var3.add(var11.normalize(var14))
         var11 = INSTANCE
         var14 = soundResourceId.getPath()
         var3.add(var11.normalize(var14))
      }

      SetsKt.build(var3)
   }

   private fun normalize(value: String): String {
      val var10000: Locale = Locale.ROOT
      val var3: java.lang.String = value.toLowerCase(var10000)
      return var3
   }

   fun getVolumeMultiplier(soundEventId: Identifier?, soundResourceId: Identifier?): java.lang.Float? {
      if (!this.isEnabled()) {
         null
      } else {
         val soundKeys: java.util.Set = this.normalizedKeys(soundEventId, soundResourceId)
         if (soundKeys.isEmpty()) {
            null
         } else {
            if (expBottle.getValue()) {
               val `$this$any$iv`: java.lang.Iterable = soundKeys
               var var10000: Boolean
               if (soundKeys is java.util.Collection && (soundKeys as java.util.Collection).isEmpty()) {
                  var10000 = false
               } else {
                  val var6: java.util.Iterator = `$this$any$iv`.iterator()

                  while (true) {
                     if (!var6.hasNext()) {
                        var10000 = false
                        break
                     }

                     if (this.isExpBottleSound(var6.next() as java.lang.String)) {
                        var10000 = true
                        break
                     }
                  }
               }

               if (var10000) {
                  expBottleVolume.getValue().floatValue() / 10.0F
               }
            }

            if (tridentReturn.getValue()) {
               val var10: java.lang.Iterable = soundKeys
               var var22: Boolean
               if (soundKeys is java.util.Collection && (soundKeys as java.util.Collection).isEmpty()) {
                  var22 = false
               } else {
                  val var14: java.util.Iterator = var10.iterator()

                  while (true) {
                     if (!var14.hasNext()) {
                        var22 = false
                        break
                     }

                     if (this.isTridentReturnSound(var14.next() as java.lang.String)) {
                        var22 = true
                        break
                     }
                  }
               }

               if (var22) {
                  tridentReturnVolume.getValue().floatValue() / 10.0F
               }
            }

            if (firework.getValue()) {
               val var11: java.lang.Iterable = soundKeys
               var var23: Boolean
               if (soundKeys is java.util.Collection && (soundKeys as java.util.Collection).isEmpty()) {
                  var23 = false
               } else {
                  val var15: java.util.Iterator = var11.iterator()

                  while (true) {
                     if (!var15.hasNext()) {
                        var23 = false
                        break
                     }

                     if (this.isFireworkSound(var15.next() as java.lang.String)) {
                        var23 = true
                        break
                     }
                  }
               }

               if (var23) {
                  fireworkVolume.getValue().floatValue() / 10.0F
               }
            }

            null
         }
      }
   }

   private fun isTridentReturnSound(normalized: String): Boolean {
      val `$this$any$iv`: java.lang.Iterable = tridentReturnMarkers
      var var10000: Boolean
      if (tridentReturnMarkers is java.util.Collection && tridentReturnMarkers.isEmpty()) {
         var10000 = false
      } else {
         val var4: java.util.Iterator = `$this$any$iv`.iterator()

         while (true) {
            if (!var4.hasNext()) {
               var10000 = false
               break
            }

            if (StringsKt.contains$default(normalized, var4.next() as java.lang.CharSequence, false, 2, null)) {
               var10000 = true
               break
            }
         }
      }

      return var10000
   }
}
