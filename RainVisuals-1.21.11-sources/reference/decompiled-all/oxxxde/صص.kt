package oxxxde

import net.fabricmc.api.ClientModInitializer
import net.minecraft.client.option.KeyBinding
import ru.ocz.protection.annotation.Compile
import ru.ocz.protection.annotation.VMProtect
import ru.ocz.protection.virtualmachine.annotation.RecompileFormat
import ru/ocz/protection/annotation/VMProtect.Type

// $VF: Compiled from heavy
@RecompileFormat
public object صص : ClientModInitializer {
   private final var wasCursorLock: Boolean

   public final var customScreen: جع?
      private set

   public fun registerTextures() {
   }

   @VMProtect(ru.ocz.protection.annotation.VMProtect.Type.VIRTUALIZATION)
   @Compile(ops = 10)
   public fun initializeClientLogic() {
      ضأ.INSTANCE.initialize()
      زد.INSTANCE.register()
      ظظ.INSTANCE.initialize()
      ثث.INSTANCE.initialize()
      بم.INSTANCE.initialize()
      شْ.INSTANCE.initialize()
      خً.INSTANCE.load()
      حْ.INSTANCE.load(خً.INSTANCE.modules)
      دع.INSTANCE.load()
      شغ.INSTANCE.load()
      ذة.INSTANCE.load()
      ضت.INSTANCE.applyLegacyBindIfNeeded(ذة.INSTANCE.legacyBindKey())
      دإ.INSTANCE.load()
      دس.initializeRemoteCatalog()
      this.registerTextures()
      رٌ.INSTANCE.initialize()
      خز.INSTANCE.initialize()
      عز.INSTANCE.initialize()
      تَ.INSTANCE.initialize()

      try {
         جٍ.startup()
         val var4: Any = Result.constructor_impl/* $VF was: constructor-impl */(Unit.INSTANCE)
      } catch (var3: java.lang.Throwable) {
         val var1: Any = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var3))
      }

      Runtime.getRuntime().addShutdownHook(Thread(lamda$initializeClientLogic$1_628aea61()))
   }

   fun setCustomScreen(value: جع?) {
      if (!ضك.getMc().isOnThread()) {
         ضك.getMc().execute({ 
            INSTANCE.setCustomScreen(`$value`)
         })
      } else if (customScreen != value) {
         val openingCustomScreen: Boolean = customScreen == null && value != null
         val closingCustomScreen: Boolean = customScreen != null && value == null
         if (openingCustomScreen) {
            KeyBinding.unpressAll()
         }

         if (value != null) {
            wasCursorLock = ضك.getMc().mouse.isCursorLocked()
            ضك.getMc().mouse.unlockCursor()
         } else if (wasCursorLock && ضك.getMc().currentScreen == null && ضك.getMc().world != null && ضك.getMc().getNetworkHandler() != null) {
            ضك.getMc().mouse.lockCursor()
         } else {
            ضك.getMc().mouse.unlockCursor()
         }

         customScreen = value
         if (openingCustomScreen) {
            value.init()
         }

         if (closingCustomScreen) {
            KeyBinding.updatePressedStates()
         }
      }
   }

   public open fun onInitializeClient() {
      this.initializeClientLogic()
   }

   public fun closeCustomScreenImmediately() {
      if (!ضك.getMc().isOnThread()) {
         ضك.getMc().execute(oxxxde/صص##Lambda_1_336(this))
      } else if (customScreen != null) {
         customScreen.close()
         this.setCustomScreen(null)
      }
   }

   fun getCustomScreen(): جع? {
      customScreen
   }
}
