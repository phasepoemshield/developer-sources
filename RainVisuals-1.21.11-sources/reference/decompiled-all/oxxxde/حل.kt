package oxxxde

import java.util.ArrayList
import net.minecraft.client.gui.screen.ChatScreen
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
public object حل : تم {
   private final val binds: MutableList<ظُ> = ArrayList() as java.util.List

   public override fun init() {
      رظ.INSTANCE.register(this)
      binds.clear()
      binds.addAll(خً.INSTANCE.modules)
   }

   public fun mouseX(): Int {
      return (int)(ضك.getMc().mouse.getX() / ضك.getMc().getWindow().getScaleFactor())
   }

   @Commando
   public fun onKey(event: تز) {
      val var10000: Int = event.get(تز.Companion.getBUTTON())
      if (var10000 != null) {
         val button: Int = var10000
         val released: Boolean = event.get(تز.Companion.getRELEASE()) == true
         val mouseEvent: Boolean = event.get(تز.Companion.getMOUSE()) == true
         val mouseX: Int = this.mouseX()
         val mouseY: Int = this.mouseY()
         if (mouseEvent && صص.INSTANCE.getCustomScreen() == null && ضك.getMc().currentScreen is ChatScreen) {
            if (!released && سِ.INSTANCE.onRemoteNotificationClick(mouseX, mouseY, button)) {
               return
            }

            if (!released && بط.INSTANCE.onChatClick(mouseX, mouseY, button)) {
               return
            }

            val `$this$forEach$iv`: Int = if (released) 0 else 1
            val var44: java.util.Collection = ثٌ.INSTANCE.draggables.values()
            val it: java.lang.Iterable = var44
            val var15: java.util.Collection = ArrayList()

            for (var18 in it) {
               if ((var18 as ظذ).getModule().isEnabled()) {
                  var15.add(var18)
               }
            }

            val `$i$f$forEach`: java.util.List = var15 as java.util.List
            if (!released && button == 0) {
               val var35: java.util.Iterator = CollectionsKt.asReversed(`$i$f$forEach`).iterator()

               while (true) {
                  if (!var35.hasNext()) {
                     var45 = null
                     break
                  }

                  val var38: Any = var35.next()
                  if ((var38 as ظذ).isHovering()) {
                     var45 = var38
                     break
                  }
               }

               val var24: ظذ = var45 as ظذ
               if (var45 as ظذ != null) {
                  var24.onClick(button, `$this$forEach$iv`)
               }
            } else {
               for (var34 in `$i$f$forEach`) {
                  (var34 as ظذ).onClick(button, `$this$forEach$iv`)
               }
            }
         }

         if (!released) {
            for (var29 in binds) {
               val var33: ظُ = var29 as ظُ
               val var39: Boolean = صص.INSTANCE.getCustomScreen() == null
                  && ضك.getMc().currentScreen == null
                  && ضك.getMc().player != null
                  && ضك.getMc().world != null
                  if (button == var33.getKey() && var33.getKey() != -1 && var39) {
                  var33.onKey()
               }
            }
         }

         val var46: جع = صص.INSTANCE.getCustomScreen()
         if (var46 != null) {
            if (!mouseEvent && !released && button == 256) {
               var46.close()
               return
            }

            if (!mouseEvent && !released) {
               var46.onKeyPress(mouseX, mouseY, button)
            }

            if (mouseEvent) {
               if (released) {
                  var46.onMouseRelease(mouseX, mouseY, button)
               } else {
                  var46.onMouseClick(mouseX, mouseY, button)
               }
            }
         }

         if (!mouseEvent && !released && صص.INSTANCE.getCustomScreen() == null && ضك.getMc().currentScreen == null && button == سر.INSTANCE.openKey) {
            صص.INSTANCE.setCustomScreen(حز.INSTANCE)
         }
      }
   }

   public fun mouseY(): Int {
      return (int)(ضك.getMc().mouse.getY() / ضك.getMc().getWindow().getScaleFactor())
   }
}
