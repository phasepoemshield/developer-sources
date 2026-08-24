package oxxxde

import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.StandardOpenOption
import net.minecraft.client.network.ServerInfo
import net.minecraft.client.network.ServerInfo.ServerType
import net.minecraft.client.option.ServerList
import org.slf4j.Logger
import org.slf4j.LoggerFactory

// $VF: Compiled from heavy
public object ضأ {
   private final val defaults: List<سص> =
      CollectionsKt.listOf(سص("ФанТайм", "funtime.su"), سص("ХолиВорлд", "hub.holyworld.me"), سص("ВеллМайн", "rain.wellmine.fun"))
      private const val MARKER_FILE_NAME: String = ".default-servers-v2"
   private final val logger: Logger = LoggerFactory.getLogger("Rain Default Servers")

   public fun initialize() {
      val rainDirectory: Path = ضك.getMc().runDirectory.toPath().resolve("Rain")
      val marker: Path = rainDirectory.resolve(".default-servers-v2")
      if (!Files.exists(marker)) {
         val var3: ضأ = this

         var `$this$initialize_u24lambda_u240`: Any
         try {
            `$this$initialize_u24lambda_u240` = var3
            val var6: ServerList = ServerList(ضك.getMc())
            var6.loadFile()
            var changed: Boolean = false

            for (`element$iv` in defaults) {
               val var12: سص = `element$iv` as سص
               val hidden: java.lang.Iterable = RangesKt.until((int)0, (int)var6.size())
               var var10000: Boolean
               if (hidden is java.util.Collection && (hidden as java.util.Collection).isEmpty()) {
                  var10000 = false
               } else {
                  val var16: java.util.Iterator = hidden.iterator()

                  while (true) {
                     if (!var16.hasNext()) {
                        var10000 = false
                        break
                     }

                     if (StringsKt.equals(var6.get((var16 as IntIterator).nextInt()).address, var12.address, true)) {
                        var10000 = true
                        break
                     }
                  }
               }

               if (!var10000) {
                  val var28: ServerInfo = var6.tryUnhide(var12.address)
                  if (var28 != null) {
                     var28.name = var12.name
                  } else {
                     var6.add(ServerInfo(var12.name, var12.address, ServerType.OTHER), false)
                  }

                  changed = true
               }
            }

            if (changed) {
               var6.saveFile()
            }

            Files.createDirectories(rainDirectory)
            Files.writeString(marker, "1", StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING, StandardOpenOption.WRITE)
            logger.info("Default multiplayer servers initialized")
            `$this$initialize_u24lambda_u240` = Result.constructor_impl/* $VF was: constructor-impl */(Unit.INSTANCE)
         } catch (var21: java.lang.Throwable) {
            `$this$initialize_u24lambda_u240` = Result.constructor_impl/* $VF was: constructor-impl */(ResultKt.createFailure(var21))
         }

         val var29: java.lang.Throwable = Result.exceptionOrNull_impl/* $VF was: exceptionOrNull-impl */(`$this$initialize_u24lambda_u240`)
         if (var29 != null) {
            logger.warn("Failed to initialize default multiplayer servers", var29)
         }
      }
   }
}
