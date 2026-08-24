package oxxxde

import com.mojang.brigadier.CommandDispatcher
import com.mojang.brigadier.ParseResults
import com.mojang.brigadier.StringReader
import com.mojang.brigadier.exceptions.CommandSyntaxException
import com.mojang.brigadier.suggestion.Suggestions
import java.util.ArrayList
import java.util.concurrent.CompletableFuture
import net.minecraft.class_637
import net.minecraft.client.gui.hud.InGameHud
import net.minecraft.client.network.ClientCommandSource
import net.minecraft.client.network.ClientPlayNetworkHandler
import net.minecraft.text.MutableText
import net.minecraft.text.Style
import net.minecraft.text.Text
import net.minecraft.text.TextColor
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo

// $VF: Compiled from heavy
public object دإ : ه {
   public final val dispatcher: CommandDispatcher<class_637> = CommandDispatcher()
   private final val prefixSegments: List<Pair<Char, Int>> =
      CollectionsKt.listOf('[' to 7566195, 'R' to 7566195, 'a' to 7566195, 'i' to 9605778, 'n' to 11645361, ']' to 13684944, ':' to 15724527)
      private final val commandList: MutableList<اه> = ArrayList() as java.util.List

   fun buildPrefix(): MutableText {
      val var10000: MutableText = Text.empty()
      val text: MutableText = var10000

      for (`element$iv` in prefixSegments) {
         text.append(
            Text.literal(java.lang.String.valueOf(((`element$iv` as Pair).component1() as Character).charValue()))
               .setStyle(Style.EMPTY.withColor(TextColor.fromRgb(((`element$iv` as Pair).component2() as java.lang.Number).intValue())).withBold(true)) as Text
         )
      }

      text
   }

   public fun registerCommands(vararg commands: اه) {
      for (`element$iv` in commands) {
         ((اه)`element$iv`).register(dispatcher)
         commandList.add((اه)`element$iv`)
      }
   }

   public fun getPrefix(): String {
      return "."
   }

   public fun createCommands(message: String, ci: CallbackInfo) {
      if (StringsKt.startsWith$default(message, this.getPrefix(), false, 2, null)) {
         var var10000: java.lang.String = message.substring(this.getPrefix().length())
         val commandText: java.lang.String = var10000
         var commandName: java.lang.String = var10000
         var `$i$f$none`: Int = 0
         val var8: Int = commandName.length()

         while (true) {
            if (`$i$f$none` >= var8) {
               var21 = -1
               break
            }

            if (CharsKt.isWhitespace(commandName.charAt(`$i$f$none`))) {
               var21 = `$i$f$none`
               break
            }

            `$i$f$none`++
         }

         var10000 = var10000.substring(0, if (var21 == -1) var10000.length() else var21)
         commandName = var10000
         val var15: java.lang.Iterable = commandList
         var var23: Boolean
         if (commandList is java.util.Collection && commandList.isEmpty()) {
            var23 = true
         } else {
            val var18: java.util.Iterator = var15.iterator()

            while (true) {
               if (!var18.hasNext()) {
                  var23 = true
                  break
               }

               if (StringsKt.equals((var18.next() as اه).name, commandName, true)) {
                  var23 = false
                  break
               }
            }
         }

         if (!var23) {
            try {
               dispatcher.execute(commandText, this.source())
            } catch (var12: CommandSyntaxException) {
            }

            ci.cancel()
         }
      }
   }

   public fun parse(reader: StringReader): ParseResults<class_637>? {
      val var10000: ClientCommandSource = this.source()
      return if (var10000 == null) null else dispatcher.parse(reader, var10000)
   }

   public override fun load() {
   }

   public fun getCommands(): List<اه> {
      return CollectionsKt.toList(commandList)
   }

   fun source(): ClientCommandSource? {
      val var10000: ClientPlayNetworkHandler = ضك.getMc().getNetworkHandler()
      if (var10000 != null) var10000.getCommandSource() else null
   }

   public fun suggest(parseResults: ParseResults<*>, cursor: Int): CompletableFuture<Suggestions> {
      return dispatcher.getCompletionSuggestions(parseResults, cursor)
   }

   fun sendClientMessage(message: Text) {
      val var10000: InGameHud = ضك.getMc().inGameHud
      if (var10000 != null) {
         var10000.getChatHud().addMessage(this.buildPrefix().append(Text.literal(" ") as Text).append(message) as Text)
      }
   }

   public fun sendClientMessage(message: String) {
      val var10001: MutableText = Text.literal(message)
      this.sendClientMessage(var10001 as Text)
   }
}
