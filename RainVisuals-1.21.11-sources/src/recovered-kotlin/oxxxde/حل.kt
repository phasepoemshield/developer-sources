package oxxxde

import java.util.ArrayList
import kotakbaz.rain.client.draggable.Draggable
import kotakbaz.rain.client.listener.Listener
import kotakbaz.rain.client.util.other.CustomScreen
import kotakbaz.rain.event.events.KeyEvent
import kotakbaz.rain.ui.mainmenu.RainMainMenuScreen$Link
import kotakbaz.rain.ui.menu.MenuScreen
import net.minecraft.client.gui.screen.ChatScreen
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
public object حل : Listener {
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
      val var10000: Int = event.get(KeyEvent.Companion.BUTTON)
      if (var10000 != null) {
         val button: Int = var10000
         val released: Boolean = event.get(KeyEvent.Companion.RELEASE) == true
         val mouseEvent: Boolean = event.get(KeyEvent.Companion.MOUSE) == true
         val mouseX: Int = this.mouseX()
         val mouseY: Int = this.mouseY()
         if (mouseEvent && صص.INSTANCE.customScreen == null && ضك.getMc().currentScreen is ChatScreen) {
            if (!released && RainMainMenuScreen$Link.INSTANCE.onRemoteNotificationClick(mouseX, mouseY, button)) {
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
               if ((var18 as Draggable).module.isEnabled()) {
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
                  if ((var38 as Draggable).isHovering()) {
                     var45 = var38
                     break
                  }
               }

               val var24: Draggable = var45 as Draggable
               if (var45 as Draggable != null) {
                  var24.onClick(button, `$this$forEach$iv`)
               }
            } else {
               for (var34 in `$i$f$forEach`) {
                  (var34 as Draggable).onClick(button, `$this$forEach$iv`)
               }
            }
         }

         if (!released) {
            for (var29 in binds) {
               val var33: ظُ = var29 as ظُ
               val var39: Boolean = صص.INSTANCE.customScreen == null
                  && ضك.getMc().currentScreen == null
                  && ضك.getMc().player != null
                  && ضك.getMc().world != null
                  if (button == var33.getKey() && var33.getKey() != -1 && var39) {
                  var33.onKey()
               }
            }
         }

         val var46: CustomScreen = صص.INSTANCE.customScreen
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

         if (!mouseEvent && !released && صص.INSTANCE.customScreen == null && ضك.getMc().currentScreen == null && button == سر.INSTANCE.openKey) {
            صص.INSTANCE.customScreen = MenuScreen.INSTANCE as CustomScreen
         }
      }
   }

   public fun mouseY(): Int {
      return (int)(ضك.getMc().mouse.getY() / ضك.getMc().getWindow().getScaleFactor())
   }
}
