package oxxxde

import com.mojang.brigadier.arguments.ArgumentType
import com.mojang.brigadier.arguments.StringArgumentType
import com.mojang.brigadier.builder.LiteralArgumentBuilder
import com.mojang.brigadier.context.CommandContext
import com.mojang.brigadier.suggestion.SuggestionsBuilder
import net.minecraft.class_637
import net.minecraft.util.Util
import ru.ocz.protection.annotation.Compile

// $VF: Compiled from heavy
public object ثب : اه("config") {
   @Compile
   public override fun execute(builder: LiteralArgumentBuilder<class_637>) {
      builder.executes({ it: CommandContext ->
         دإ.INSTANCE.sendClientMessage("Использование: .config <list|save|load|remove|folder> [название]")
         INSTANCE.getSingleSuccess()
      })
      builder.then(
         اه.Companion
            .literal("list")
            .executes(
               { it: CommandContext ->
                  val names: java.util.List = اك.INSTANCE.getConfigNames()
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
      var var10001: LiteralArgumentBuilder = اه.Companion.literal("save")
      var var10002: اث = اه.Companion
      var var10004: StringArgumentType = StringArgumentType.word()
      builder.then(var10001.then(var10002.argument("name", var10004 as ArgumentType).executes({ it: CommandContext ->
         val name: java.lang.String = StringArgumentType.getString(it, "name")
         val var10000: اك = اك.INSTANCE
         if (!var10000.isValidName(name)) {
            دإ.INSTANCE.sendClientMessage("Неверное название конфига")
         } else if (!اك.INSTANCE.save(name)) {
            دإ.INSTANCE.sendClientMessage("Ошибка сохранения конфига: $name")
         }

         INSTANCE.getSingleSuccess()
      })))
      var10001 = اه.Companion.literal("load")
      var10002 = اه.Companion
      var10004 = StringArgumentType.word()
      builder.then(var10001.then(var10002.argument("name", var10004 as ArgumentType).suggests({ var0: CommandContext, suggestions: SuggestionsBuilder ->
         val `$this$forEach$iv`: java.lang.Iterable = اك.INSTANCE.getConfigNames()
         val var3: SuggestionsBuilder = suggestions

         for (`element$iv` in `$this$forEach$iv`) {
            var3.suggest(`element$iv` as java.lang.String)
         }

         suggestions.buildFuture()
      }).executes({ it: CommandContext ->
         val name: java.lang.String = StringArgumentType.getString(it, "name")
         val var10000: اك = اك.INSTANCE
         if (!var10000.isValidName(name)) {
            دإ.INSTANCE.sendClientMessage("Неверное название конфига")
         } else if (!اك.INSTANCE.load(name)) {
            دإ.INSTANCE.sendClientMessage("Не найден конфиг: $name")
         }

         INSTANCE.getSingleSuccess()
      })))
      var10001 = اه.Companion.literal("remove")
      var10002 = اه.Companion
      var10004 = StringArgumentType.word()
      builder.then(var10001.then(var10002.argument("name", var10004 as ArgumentType).suggests({ var0: CommandContext, suggestions: SuggestionsBuilder ->
         val `$this$forEach$iv`: java.lang.Iterable = اك.INSTANCE.getConfigNames()
         val var3: SuggestionsBuilder = suggestions

         for (`element$iv` in `$this$forEach$iv`) {
            var3.suggest(`element$iv` as java.lang.String)
         }

         suggestions.buildFuture()
      }).executes({ it: CommandContext ->
         val name: java.lang.String = StringArgumentType.getString(it, "name")
         val var10000: اك = اك.INSTANCE
         if (!var10000.isValidName(name)) {
            دإ.INSTANCE.sendClientMessage("Неверное название конфига")
         } else if (!اك.INSTANCE.remove(name)) {
            دإ.INSTANCE.sendClientMessage("Не найден конфиг: $name")
         }

         INSTANCE.getSingleSuccess()
      })))
      builder.then(اه.Companion.literal("folder").executes({ it: CommandContext ->
         Util.getOperatingSystem().open(اك.INSTANCE.configPath.toFile())
         INSTANCE.getSingleSuccess()
      }))
   }
}
