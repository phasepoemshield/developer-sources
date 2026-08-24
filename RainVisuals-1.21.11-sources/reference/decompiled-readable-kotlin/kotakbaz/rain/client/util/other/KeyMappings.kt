package kotakbaz.rain.client.util.other

import java.lang.reflect.Field
import java.util.HashMap
import java.util.Locale
import org.lwjgl.glfw.GLFW

// $VF: Compiled from heavy
public object KeyMappings {
   private const val NONE: String = "None"

   private final val keyLabels: Map<Int, String> by LazyKt.lazy({ 
      val mappings: HashMap = HashMap()
      val var10000: Array<Field> = GLFW.class.getDeclaredFields()

      for (field in var10000) {
         val var12: java.lang.String = field.getName()
         if (StringsKt.startsWith$default(var12, "GLFW_KEY_", false, 2, null) && field.getType() == Int::class.javaPrimitiveType) {
            val var7: KeyMappings = INSTANCE

            var `$this$keyLabels_delegate_u24lambda_u240_u240`: Any
            try {
               `$this$keyLabels_delegate_u24lambda_u240_u240` = Result.constructor_impl/* $VF was: constructor-impl */(field.getInt(null))
            } catch (var10: java.lang.Throwable) {
               `$this$keyLabels_delegate_u24lambda_u240_u240` = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var10))
            }

            val var13: Int = (if (isFailure) null else `$this$keyLabels_delegate_u24lambda_u240_u240`) as Int
            if (var13 != null) {
               val keyCode: Int = var13
               val var14: java.lang.String = field.getName()
               mappings.put(keyCode, INSTANCE.formatKeyLabel(StringsKt.removePrefix(var14, "GLFW_KEY_")))
            }
         }
      }

      mappings
   })
      private final get() {
         return keyLabels$delegate.value as MutableMap<Int, java.lang.String>
      }


   private final val mouseLabels: Map<Int, String> =
      MapsKt.mapOf(0 to "MouseLeft", 1 to "MouseRight", 2 to "MouseMiddle", 3 to "Mouse4", 4 to "Mouse5", 5 to "Mouse6", 6 to "Mouse7", 7 to "Mouse8")

   public fun getKey(key: Int): String {
      if (key == -1) {
         return "None"
      } else {
         val var2: java.lang.String = mouseLabels.get(key)
         if (var2 != null) {
            return var2
         } else {
            var var10000: java.lang.String = this.keyLabels.get(key)
            if (var10000 == null) {
               var10000 = "None"
            }

            return var10000
         }
      }
   }

   private fun formatWord(raw: String): String {
      if (raw.length() == 0) {
         return ""
      } else {
         var var10000: java.lang.String = raw.toLowerCase(Locale.ROOT)
         val var3: java.lang.String = StringsKt.replace$default(
            StringsKt.replace$default(
               StringsKt.replace$default(
                  StringsKt.replace$default(StringsKt.replace$default(var10000, "accent", "", false, 4, null), "control", "ctrl", false, 4, null),
                  "super",
                  "Super",
                  false,
                  4,
                  null
               ),
               "minus",
               "Minus",
               false,
               4,
               null
            ),
            "equals",
            "Equals",
            false,
            4,
            null
         )
         if (var3.length() > 0) {
            val var14: StringBuilder = StringBuilder()
            val it: Char = var3.charAt(0)
            val var15: StringBuilder = var14.append((Object)(if (Character.isLowerCase(it)) CharsKt.titlecase(it) else java.lang.String.valueOf(it)))
            val var10001: java.lang.String = var3.substring(1)
            var10000 = var15.append(var10001).toString()
         } else {
            var10000 = var3
         }

         return var10000
      }
   }

   private fun formatKeyLabel(input: String): String {
      if (input.length() == 0) {
         return input
      } else if (StringsKt.startsWith$default(input, "LEFT_", false, 2, null)) {
         val var4: java.lang.String = input.substring(5)
         return "L${this.formatWord(var4)}"
      } else if (StringsKt.startsWith$default(input, "RIGHT_", false, 2, null)) {
         val var3: java.lang.String = input.substring(6)
         return "R${this.formatWord(var3)}"
      } else if (StringsKt.startsWith$default(input, "KP_", false, 2, null)) {
         val var10001: java.lang.String = input.substring(3)
         return "Numpad${this.formatWord(var10001)}"
      } else {
         when (input.hashCode()) {
            -1076824476 -> {
               if (input.equals("NUM_LOCK")) {
                  return "NumLock"
               }
            }
            -595411886 -> {
               if (input.equals("PAGE_DOWN")) {
                  return "PageDown"
               }
            }
            -85535157 -> {
               if (input.equals("PAGE_UP")) {
                  return "PageUp"
               }
            }
            928738910 -> {
               if (input.equals("PRINT_SCREEN")) {
                  return "PrintScreen"
               }
            }
            1225304009 -> {
               if (input.equals("CAPS_LOCK")) {
                  return "CapsLock"
               }
            }
            else -> {}
         }

         return this.formatWord(StringsKt.replace$default(input, "_", "", false, 4, null))
      }
   }
}
