package oxxxde

import java.util.Locale
import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
import net.fabricmc.fabric.api.client.message.v1.ClientReceiveMessageEvents
import net.minecraft.client.MinecraftClient
import net.minecraft.client.gui.screen.DisconnectedScreen
import net.minecraft.client.gui.screen.multiplayer.ConnectScreen
import net.minecraft.client.network.ClientPlayNetworkHandler
import net.minecraft.client.network.ServerAddress
import net.minecraft.client.network.ServerInfo
import net.minecraft.client.network.ServerInfo.ServerType
import net.minecraft.text.Text

// $VF: Compiled from heavy
internal object زء {
   private final var pendingAnarchy: Int?
   private final var welcomeReceived: Boolean
   private final var connectionStartPending: Boolean
   private final var trackedLevel: Any?
   private final var readyTicks: Int
   private const val REQUEST_TIMEOUT_MS: Long = 90000L
   private const val SERVER_ADDRESS: String = "funtime.su"
   private final var requestedAtMs: Long
   private const val READY_FALLBACK_MS: Long = 20000L
   private final var connectedAtMs: Long
   private final var connectionStarted: Boolean
   private const val COMMAND_DELAY_TICKS: Int = 10
   private const val CANCEL_SCREEN_GRACE_MS: Long = 1000L

   public fun connect(anarchy: Int) {
      pendingAnarchy = anarchy
      requestedAtMs = System.currentTimeMillis()
      connectedAtMs = 0L
      readyTicks = 0
      connectionStartPending = true
      connectionStarted = false
      welcomeReceived = false
      trackedLevel = null
      صص.INSTANCE.closeCustomScreenImmediately()
      if (ضك.getMc().world != null) {
         ضك.getMc().disconnect(Text.translatable("disconnect.quitting") as Text)
      }
   }

   private fun clearPending() {
      pendingAnarchy = null
      requestedAtMs = 0L
      connectedAtMs = 0L
      readyTicks = 0
      connectionStartPending = false
      connectionStarted = false
      welcomeReceived = false
      trackedLevel = null
   }

   @JvmStatic
   fun {
      ClientTickEvents.END_CLIENT_TICK.register(INSTANCE.oxxxde/زء##Lambda_0_161(INSTANCE))
      ClientReceiveMessageEvents.GAME.register({ message: Text, var1: Boolean ->
         if (pendingAnarchy != null && ضه.INSTANCE.isFunTime()) {
            var var10000: java.lang.String = message.getString()
            val var4: Locale = Locale.ROOT
            var10000 = var10000.toLowerCase(var4)
            if (StringsKt.contains$default(var10000, "добро пожаловать", false, 2, null) && StringsKt.contains$default(var10000, "funtime", false, 2, null)) {
               welcomeReceived = true
               readyTicks = 0
            }
         }
      })
   }

   fun tick(client: MinecraftClient) {
      if (pendingAnarchy != null) {
         val anarchy: Int = pendingAnarchy
         val elapsedMs: Long = System.currentTimeMillis() - requestedAtMs
         if (elapsedMs >= 90000L) {
            this.clearPending()
         } else if (connectionStartPending) {
            if (client.world == null && client.getNetworkHandler() == null) {
               connectionStartPending = false
               connectionStarted = true
               ConnectScreen.connect(جذ(), client, ServerAddress.parse("funtime.su"), ServerInfo("ФанТайм", "funtime.su", ServerType.OTHER), false, null)
            }
         } else if (client.world != null
            || !connectionStarted
            || elapsedMs < 1000L
            || client.currentScreen !is جذ && client.currentScreen !is DisconnectedScreen) {
            if (ضه.INSTANCE.isFunTime() && client.world != null && client.player != null && client.getNetworkHandler() != null) {
               if (trackedLevel != client.world) {
                  trackedLevel = client.world
                  connectedAtMs = System.currentTimeMillis()
                  readyTicks = 0
               }

               if (welcomeReceived || System.currentTimeMillis() - connectedAtMs >= 20000L) {
                  val var7: Int = readyTicks++
                  if (readyTicks >= 10) {
                     val var10000: ClientPlayNetworkHandler = client.getNetworkHandler()
                     if (var10000 != null) {
                        var10000.sendChatCommand("an$anarchy")
                     }

                     this.clearPending()
                  }
               }
            } else {
               readyTicks = 0
            }
         } else {
            this.clearPending()
         }
      }
   }
}
