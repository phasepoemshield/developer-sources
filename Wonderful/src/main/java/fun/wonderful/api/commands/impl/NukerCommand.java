package fun.wonderful.api.commands.impl;

import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import fun.wonderful.api.commands.Command;
import fun.wonderful.api.utils.chat.ChatUtils;
import fun.wonderful.client.modules.impl.player.Nuker;
import java.util.Set;
import java.util.stream.Collectors;
import net.minecraft.command.CommandSource;
import net.minecraft.util.Identifier;
import net.minecraft.registry.DefaultedRegistry;
import net.minecraft.registry.Registries;

public class NukerCommand
extends Command {
    public NukerCommand() {
        super("nuker");
    }

    public NukerCommand(String command) {
        super(command);
    }

    @Override
    public void execute(LiteralArgumentBuilder<CommandSource> builder) {
        ((LiteralArgumentBuilder)((LiteralArgumentBuilder)((LiteralArgumentBuilder)builder.then(this.literal("add").then(this.arg("block", StringArgumentType.word()).suggests((context, builder1) -> {
            String input = Nuker.normalizeBlockName(builder1.getRemaining());
            Registries.BLOCK.stream().map(arg_0 -> ((DefaultedRegistry)Registries.BLOCK).getId(arg_0)).map(Identifier::getPath).filter(name -> name.startsWith(input)).limit(20L).forEach(arg_0 -> ((SuggestionsBuilder)builder1).suggest(arg_0));
            return builder1.buildFuture();
        }).executes(context -> {
            String blockName = Nuker.normalizeBlockName((String)context.getArgument("block", String.class));
            if (Nuker.INSTANCE.isTargetBlock(blockName)) {
                ChatUtils.sendMessage("§cБлок §e" + blockName + "§c уже в списке Nuker!");
                return 1;
            }
            if (!this.blockExists(blockName)) {
                ChatUtils.sendMessage("§cБлок §e" + blockName + "§c не найден!");
                return 1;
            }
            Nuker.INSTANCE.addBlock(blockName);
            ChatUtils.sendMessage("§aБлок §e" + blockName + "§a добавлен в Nuker!");
            return 1;
        })))).then(this.literal("remove").then(this.arg("block", StringArgumentType.word()).suggests((context, builder1) -> {
            String input = Nuker.normalizeBlockName(builder1.getRemaining());
            Nuker.INSTANCE.getTargetBlocks().stream().sorted(String::compareTo).filter(name -> name.startsWith(input)).forEach(arg_0 -> ((SuggestionsBuilder)builder1).suggest(arg_0));
            return builder1.buildFuture();
        }).executes(context -> {
            String blockName = Nuker.normalizeBlockName((String)context.getArgument("block", String.class));
            if (!Nuker.INSTANCE.isTargetBlock(blockName)) {
                ChatUtils.sendMessage("§cБлока §e" + blockName + "§c нет в списке Nuker!");
                return 1;
            }
            Nuker.INSTANCE.removeBlock(blockName);
            ChatUtils.sendMessage("§aБлок §e" + blockName + "§a удален из Nuker!");
            return 1;
        })))).then(this.literal("list").executes(context -> {
            Set<String> blocks = Nuker.INSTANCE.getTargetBlocks();
            if (blocks.isEmpty()) {
                ChatUtils.sendMessage("§cСписок Nuker пуст!");
                return 1;
            }
            String blockList = blocks.stream().sorted().collect(Collectors.joining("§7, §e"));
            ChatUtils.sendMessage("§aБлоки Nuker §7(§e" + blocks.size() + "§7)§a: §e" + blockList);
            return 1;
        }))).then(this.literal("clear").executes(context -> {
            if (Nuker.INSTANCE.getTargetBlocks().isEmpty()) {
                ChatUtils.sendMessage("§cСписок Nuker уже пуст!");
                return 1;
            }
            Nuker.INSTANCE.clearBlocks();
            ChatUtils.sendMessage("§aСписок Nuker очищен!");
            return 1;
        }));
    }

    private boolean blockExists(String blockName) {
        return Registries.BLOCK.stream().anyMatch(block -> Registries.BLOCK.getId(block).getPath().equalsIgnoreCase(blockName));
    }
}