package oxxxde

import net.fabricmc.fabric.api.client.event.lifecycle.v1.ClientTickEvents
import net.minecraft.client.MinecraftClient
import net.minecraft.client.gui.screen.DisconnectedScreen
import net.minecraft.client.gui.screen.Screen
import net.minecraft.client.gui.screen.multiplayer.ConnectScreen
import net.minecraft.client.network.ServerAddress
import net.minecraft.client.network.ServerInfo
import sweetie.evaware.flora.api.Commando

// $VF: Compiled from heavy
public object خأ : دِ("AutoRecconect", ظن.getPLAYER(), "Автоматически переподключает при кике") {
   private final var reconnectStarted: Boolean
   @JvmStatic
   private ServerInfo lastServer;
   private final var disconnectedAt: Long
   private const val RECONNECT_DELAY_MS: Long = 3000L
   @JvmStatic
   private DisconnectedScreen trackedScreen;

   public override fun onEnable() {
      this.captureCurrentServer()
      this.resetDisconnectState()
   }

   public override fun onDisable() {
      lastServer = null
      this.resetDisconnectState()
   }

   @JvmStatic
   fun {
      ClientTickEvents.END_CLIENT_TICK
         .register(
            { client: MinecraftClient ->
               // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
               // java.lang.NullPointerException: Cannot invoke "java.util.List.stream()" because the return value of "org.jetbrains.java.decompiler.modules.decompiler.stats.Statement.getExprents()" is null
               //   at org.vineflower.kotlin.expr.KNewExprent.lambda$toJava$0(KNewExprent.java:128)
               //   at java.base/java.util.stream.ReferencePipeline$7$1.accept(ReferencePipeline.java:273)
               //   at java.base/java.util.ArrayList$ArrayListSpliterator.forEachRemaining(ArrayList.java:1708)
               //   at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:509)
               //   at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:499)
               //   at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:575)
               //   at java.base/java.util.stream.AbstractPipeline.evaluateToArrayNode(AbstractPipeline.java:260)
               //   at java.base/java.util.stream.ReferencePipeline.toArray(ReferencePipeline.java:616)
               //   at java.base/java.util.stream.ReferencePipeline.toArray(ReferencePipeline.java:622)
               //   at java.base/java.util.stream.ReferencePipeline.toList(ReferencePipeline.java:627)
               //   at org.vineflower.kotlin.expr.KNewExprent.toJava(KNewExprent.java:131)
               //   at org.jetbrains.java.decompiler.modules.decompiler.ExprProcessor.getCastedExprent(ExprProcessor.java:1054)
               //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.appendParamList(InvocationExprent.java:1151)
               //   at org.jetbrains.java.decompiler.modules.decompiler.exps.InvocationExprent.toJava(InvocationExprent.java:921)
            }
         )
      }

   private fun resetDisconnectState() {
      trackedScreen = null
      disconnectedAt = 0L
      reconnectStarted = false
   }

   private fun captureCurrentServer() {
      val var10000: ServerInfo = ضك.getMc().getCurrentServerEntry()
      if (var10000 != null) {
         val copy: ServerInfo = ServerInfo(var10000.name, var10000.address, var10000.getServerType())
         copy.copyWithSettingsFrom(var10000)
         lastServer = copy
      }
   }

   @Commando
   public fun onUpdate(event: سح) {
      this.captureCurrentServer()
   }

   fun tickDisconnectedScreen(screen: DisconnectedScreen) {
      if (this.isEnabled()) {
         if (lastServer != null) {
            val server: ServerInfo = lastServer
            if (ضك.getMc().currentScreen === screen) {
               if (trackedScreen != screen) {
                  trackedScreen = screen
                  disconnectedAt = System.currentTimeMillis()
                  reconnectStarted = false
               }

               if (!reconnectStarted && System.currentTimeMillis() - disconnectedAt >= 3000L) {
                  reconnectStarted = true
                  ConnectScreen.connect(screen as Screen, ضك.getMc(), ServerAddress.parse(server.address), server, false, null)
               }
            }
         }
      }
   }
}
