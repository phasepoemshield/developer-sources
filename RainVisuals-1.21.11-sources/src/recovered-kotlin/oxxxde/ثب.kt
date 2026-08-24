package oxxxde

import com.mojang.brigadier.arguments.ArgumentType
import com.mojang.brigadier.arguments.StringArgumentType
import com.mojang.brigadier.builder.LiteralArgumentBuilder
import com.mojang.brigadier.context.CommandContext
import com.mojang.brigadier.suggestion.SuggestionsBuilder
import kotakbaz.rain.command.Command
import kotakbaz.rain.config.ConfigManager
import net.minecraft.class_637
import net.minecraft.util.Util
import ru.ocz.protection.annotation.Compile

// $VF: Compiled from heavy
public object ثب : Command("config") {
   @Compile
   public override fun execute(builder: LiteralArgumentBuilder<class_637>) {
      builder.executes({ it: CommandContext ->
         دإ.INSTANCE.sendClientMessage("Использование: .config <list|save|load|remove|folder> [название]")
         INSTANCE.getSingleSuccess()
      })
      builder.then(
         Command.Companion
            .literal("list")
            .executes(
               { it: CommandContext ->
                  val names: java.util.List = ConfigManager.INSTANCE.getConfigNames()
                  دإ.INSTANCE
                     .sendClientMessage(
                        if (names.isEmpty())
                           "Список конфигов пустой"
                           else
                           "Configs: ${CollectionsKt.joinToString$default(names, ", ", null, null, 0, null, null, 62, null)}"
                     )
                     INSTANCE.getSingleSuccess()
               }
            )
      )
      var var10001: LiteralArgumentBuilder = Command.Companion.literal("save")
      var var10002: اث = Command.Companion
      var var10004: StringArgumentType = StringArgumentType.word()
      builder.then(var10001.then(var10002.argument("name", var10004 as ArgumentType).executes({ it: CommandContext ->
         val name: java.lang.String = StringArgumentType.getString(it, "name")
         val var10000: ConfigManager = ConfigManager.INSTANCE
         if (!var10000.isValidName(name)) {
            دإ.INSTANCE.sendClientMessage("Неверное название конфига")
         } else if (!ConfigManager.INSTANCE.save(name)) {
            دإ.INSTANCE.sendClientMessage("Ошибка сохранения конфига: $name")
         }

         INSTANCE.getSingleSuccess()
      })))
      var10001 = Command.Companion.literal("load")
      var10002 = Command.Companion
      var10004 = StringArgumentType.word()
      builder.then(var10001.then(var10002.argument("name", var10004 as ArgumentType).suggests({ var0: CommandContext, suggestions: SuggestionsBuilder ->
         val `$this$forEach$iv`: java.lang.Iterable = ConfigManager.INSTANCE.getConfigNames()
         val var3: SuggestionsBuilder = suggestions

         for (`element$iv` in `$this$forEach$iv`) {
            var3.suggest(`element$iv` as java.lang.String)
         }

         suggestions.buildFuture()
      }).executes({ it: CommandContext ->
         val name: java.lang.String = StringArgumentType.getString(it, "name")
         val var10000: ConfigManager = ConfigManager.INSTANCE
         if (!var10000.isValidName(name)) {
            دإ.INSTANCE.sendClientMessage("Неверное название конфига")
         } else if (!ConfigManager.INSTANCE.load(name)) {
            دإ.INSTANCE.sendClientMessage("Не найден конфиг: $name")
         }

         INSTANCE.getSingleSuccess()
      })))
      var10001 = Command.Companion.literal("remove")
      var10002 = Command.Companion
      var10004 = StringArgumentType.word()
      builder.then(var10001.then(var10002.argument("name", var10004 as ArgumentType).suggests({ var0: CommandContext, suggestions: SuggestionsBuilder ->
         val `$this$forEach$iv`: java.lang.Iterable = ConfigManager.INSTANCE.getConfigNames()
         val var3: SuggestionsBuilder = suggestions

         for (`element$iv` in `$this$forEach$iv`) {
            var3.suggest(`element$iv` as java.lang.String)
         }

         suggestions.buildFuture()
      }).executes({ it: CommandContext ->
         val name: java.lang.String = StringArgumentType.getString(it, "name")
         val var10000: ConfigManager = ConfigManager.INSTANCE
         if (!var10000.isValidName(name)) {
            دإ.INSTANCE.sendClientMessage("Неверное название конфига")
         } else if (!ConfigManager.INSTANCE.remove(name)) {
            دإ.INSTANCE.sendClientMessage("Не найден конфиг: $name")
         }

         INSTANCE.getSingleSuccess()
      })))
      builder.then(Command.Companion.literal("folder").executes({ it: CommandContext ->
         Util.getOperatingSystem().open(ConfigManager.INSTANCE.configPath.toFile())
         INSTANCE.getSingleSuccess()
      }))
   }
}
