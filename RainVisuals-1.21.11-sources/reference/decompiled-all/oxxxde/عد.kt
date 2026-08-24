package oxxxde

import com.mojang.brigadier.arguments.ArgumentType
import com.mojang.brigadier.arguments.StringArgumentType
import com.mojang.brigadier.builder.LiteralArgumentBuilder
import com.mojang.brigadier.context.CommandContext
import com.mojang.brigadier.suggestion.SuggestionsBuilder
import net.minecraft.class_637
import ru.ocz.protection.annotation.Compile

// $VF: Compiled from heavy
public object عد : اه("friend") {
   @Compile
   public override fun execute(builder: LiteralArgumentBuilder<class_637>) {
      builder.executes({ it: CommandContext ->
         دإ.INSTANCE.sendClientMessage("Использование: .friend <add|remove|list|clear> [никнейм]")
         INSTANCE.getSingleSuccess()
      })
      builder.then(
         اه.Companion
            .literal("list")
            .executes(
               { it: CommandContext ->
                  val friends: java.util.List = شغ.INSTANCE.getFriends()
                  دإ.INSTANCE
                     .sendClientMessage(
                        if (friends.isEmpty())
                           "Список друзей пуст"
                           else
                           "Friends: ${CollectionsKt.joinToString$default(friends, ", ", null, null, 0, null, null, 62, null)}"
                     )
                     INSTANCE.getSingleSuccess()
               }
            )
      )
      builder.then(اه.Companion.literal("clear").executes({ it: CommandContext ->
         دإ.INSTANCE.sendClientMessage(if (شغ.INSTANCE.clear()) "Friend list cleared." else "Failed to save friend list.")
         INSTANCE.getSingleSuccess()
      }))
      var var10001: LiteralArgumentBuilder = اه.Companion.literal("add")
      var var10002: اث = اه.Companion
      var var10004: StringArgumentType = StringArgumentType.word()
      builder.then(var10001.then(var10002.argument("name", var10004 as ArgumentType).executes({ it: CommandContext ->
         val name: java.lang.String = StringArgumentType.getString(it, "name")
val var10000: شغ = شغ.INSTANCE
         when (حُ.$EnumSwitchMapping$0[var10000.add(name).ordinal()]) {
            1 -> دإ.INSTANCE.sendClientMessage("Added friend: $name")
            2 -> دإ.INSTANCE.sendClientMessage("Friend is already listed: $name")
            3 -> دإ.INSTANCE.sendClientMessage("Invalid friend nickname")
            4 -> دإ.INSTANCE.sendClientMessage("Failed to save friend list")
            else -> throw NoWhenBranchMatchedException()
         }

         INSTANCE.getSingleSuccess()
      })))
      var10001 = اه.Companion.literal("remove")
      var10002 = اه.Companion
      var10004 = StringArgumentType.word()
      builder.then(var10001.then(var10002.argument("name", var10004 as ArgumentType).suggests({ var0: CommandContext, suggestions: SuggestionsBuilder ->
         val `$this$forEach$iv`: java.lang.Iterable = شغ.INSTANCE.getFriends()
         val var3: SuggestionsBuilder = suggestions

         for (`element$iv` in `$this$forEach$iv`) {
            var3.suggest(`element$iv` as java.lang.String)
         }

         suggestions.buildFuture()
      }).executes({ it: CommandContext ->
         val name: java.lang.String = StringArgumentType.getString(it, "name")
val var10000: شغ = شغ.INSTANCE
         when (حُ.$EnumSwitchMapping$1[var10000.remove(name).ordinal()]) {
            1 -> دإ.INSTANCE.sendClientMessage("Removed friend: $name")
            2 -> دإ.INSTANCE.sendClientMessage("Friend not found: $name")
            3 -> دإ.INSTANCE.sendClientMessage("Invalid friend name")
            4 -> دإ.INSTANCE.sendClientMessage("Failed to save friend list")
            else -> throw NoWhenBranchMatchedException()
         }

         INSTANCE.getSingleSuccess()
      })))
   }
}
