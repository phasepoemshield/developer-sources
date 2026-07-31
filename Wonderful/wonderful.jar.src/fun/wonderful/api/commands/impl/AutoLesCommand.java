package fun.wonderful.api.commands.impl;

import com.mojang.brigadier.arguments.BoolArgumentType;
import com.mojang.brigadier.arguments.FloatArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import fun.wonderful.api.commands.Command;
import fun.wonderful.api.storages.implement.helpertstorages.enumvar.ModuleClass;
import fun.wonderful.api.utils.chat.ChatUtils;
import fun.wonderful.client.modules.impl.player.AutoForest;
import java.util.function.Consumer;
import java.util.function.Supplier;
import net.minecraft.command.CommandSource;

public class AutoLesCommand
extends Command {
    public AutoLesCommand() {
        super("autoles");
    }

    @Override
    public void execute(LiteralArgumentBuilder<CommandSource> builder) {
        builder.executes(ctx -> {
            this.sendStatus();
            return 1;
        });
        builder.then(this.literal("enable").executes(ctx -> {
            if (!this.module().isCurrentSessionEnabled()) {
                this.module().enableForCurrentSession();
            }
            ChatUtils.sendMessage("АвтоЛес включён");
            return 1;
        }));
        builder.then(this.literal("disable").executes(ctx -> {
            if (this.module().isCurrentSessionEnabled()) {
                this.module().disableForCurrentSession();
            }
            ChatUtils.sendMessage("АвтоЛес выключен");
            return 1;
        }));
        builder.then(this.literal("mode").then(this.arg("value", StringArgumentType.word()).suggests((ctx, suggestions) -> {
            this.module().getModeSuggestions().forEach(arg_0 -> ((SuggestionsBuilder)suggestions).suggest(arg_0));
            return suggestions.buildFuture();
        }).executes(ctx -> {
            String value = (String)ctx.getArgument("value", String.class);
            if (!this.module().setModeAlias(value)) {
                ChatUtils.sendMessage("Неизвестный режим. Доступно: normal, fast");
                return 1;
            }
            ChatUtils.sendMessage("Режим: " + this.module().getModeAlias());
            return 1;
        })));
        builder.then(this.booleanSetting("swing", value -> this.module().setSwingEnabled((boolean)value), () -> this.module().isSwingEnabled()));
        builder.then(this.booleanSetting("autosell", value -> this.module().setAutoSellEnabled((boolean)value), () -> this.module().isAutoSellEnabled()));
        builder.then(this.booleanSetting("autopay", value -> this.module().setAutoPayEnabled((boolean)value), () -> this.module().isAutoPayEnabled()));
        builder.then(this.booleanSetting("visuals", value -> this.module().setPreserveVisualsEnabled((boolean)value), () -> this.module().isPreserveVisualsEnabled()));
        builder.then(this.floatSetting("pps", value -> this.module().setPacketsPerSecond(value.floatValue()), () -> Float.valueOf(this.module().getPacketsPerSecond())));
        builder.then(this.floatSetting("radius", value -> this.module().setBreakRadius(value.floatValue()), () -> Float.valueOf(this.module().getBreakRadius())));
        builder.then(this.floatSetting("payamount", value -> this.module().setPayAmount(value.floatValue()), () -> Float.valueOf(this.module().getPayAmount())));
        builder.then(this.floatSetting("interval", value -> this.module().setIntervalSeconds(value.floatValue()), () -> Float.valueOf(this.module().getIntervalSeconds())));
        builder.then(((LiteralArgumentBuilder)this.literal("pay").then(this.literal("clear").executes(ctx -> {
            this.module().clearPayTarget();
            ChatUtils.sendMessage("Ник для перевода очищен");
            return 1;
        }))).then(this.arg("nick", StringArgumentType.word()).executes(ctx -> {
            String nick = (String)ctx.getArgument("nick", String.class);
            if (!this.module().setPayTarget(nick)) {
                ChatUtils.sendMessage("Ник не может быть пустым");
                return 1;
            }
            ChatUtils.sendMessage("Ник для перевода: " + this.module().getPayTarget());
            return 1;
        })));
        builder.then(this.literal("status").executes(ctx -> {
            this.sendStatus();
            return 1;
        }));
    }

    private LiteralArgumentBuilder<CommandSource> booleanSetting(String name, Consumer<Boolean> setter, Supplier<Boolean> getter) {
        return (LiteralArgumentBuilder)this.literal(name).then(this.arg("value", BoolArgumentType.bool()).suggests((ctx, suggestions) -> {
            suggestions.suggest("true");
            suggestions.suggest("false");
            return suggestions.buildFuture();
        }).executes(ctx -> {
            boolean value = BoolArgumentType.getBool((CommandContext)ctx, (String)"value");
            setter.accept(value);
            ChatUtils.sendMessage(this.settingLabel(name) + ": " + ((Boolean)getter.get() != false ? "включено" : "выключено"));
            return 1;
        }));
    }

    private LiteralArgumentBuilder<CommandSource> floatSetting(String name, Consumer<Float> setter, Supplier<Float> getter) {
        return (LiteralArgumentBuilder)this.literal(name).then(this.arg("value", FloatArgumentType.floatArg()).executes(ctx -> {
            float value = FloatArgumentType.getFloat((CommandContext)ctx, (String)"value");
            setter.accept(Float.valueOf(value));
            ChatUtils.sendMessage(this.settingLabel(name) + ": " + String.valueOf(getter.get()));
            return 1;
        }));
    }

    private void sendStatus() {
        AutoForest module = this.module();
        ChatUtils.sendMessage("АвтоЛес: " + (module.isCurrentSessionEnabled() ? "включён" : "выключен"));
        ChatUtils.sendMessage("Режим=" + module.getModeAlias() + ", Мах рукой=" + this.booleanText(module.isSwingEnabled()) + ", Автопродажа=" + this.booleanText(module.isAutoSellEnabled()) + ", AutoPay=" + this.booleanText(module.isAutoPayEnabled()) + ", Визуализация=" + this.booleanText(module.isPreserveVisualsEnabled()));
        ChatUtils.sendMessage("Пакетов в секунду=" + module.getPacketsPerSecond() + ", Радиус=" + module.getBreakRadius() + ", Сумма перевода=" + module.getPayAmount() + ", Задержка=" + module.getIntervalSeconds() + ", Ник перевода=" + (module.getPayTarget().isBlank() ? "<пусто>" : module.getPayTarget()));
    }

    private AutoForest module() {
        return ModuleClass.autoForest;
    }

    private String booleanText(boolean value) {
        return value ? "включено" : "выключено";
    }

    private String settingLabel(String name) {
        return switch (name) {
            case "swing" -> "Мах рукой";
            case "autosell" -> "Автопродажа";
            case "autopay" -> "AutoPay";
            case "visuals" -> "Визуализация";
            case "pps" -> "Пакетов в секунду";
            case "radius" -> "Радиус";
            case "payamount" -> "Сумма перевода";
            case "interval" -> "Задержка";
            default -> name;
        };
    }
}