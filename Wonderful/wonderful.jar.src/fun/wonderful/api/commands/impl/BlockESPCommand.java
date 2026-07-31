package fun.wonderful.api.commands.impl;

import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.suggestion.SuggestionProvider;
import com.mojang.brigadier.suggestion.SuggestionsBuilder;
import fun.wonderful.api.commands.Command;
import fun.wonderful.api.utils.chat.ChatUtils;
import fun.wonderful.client.modules.impl.render.BlockESP;
import java.util.Set;
import java.util.stream.Collectors;
import net.minecraft.command.CommandSource;
import net.minecraft.util.Identifier;
import net.minecraft.registry.DefaultedRegistry;
import net.minecraft.registry.Registries;
import ru.ocz.protection.annotation.Compile;

public class BlockESPCommand
extends Command {
    public BlockESPCommand() {
        super("blockesp");
    }

    @Override
    @Compile
    public native void execute(LiteralArgumentBuilder<CommandSource> var1);

        return (context, builder1) -> {
            String input = builder1.getRemaining().toLowerCase();
            Registries.BLOCK.stream().map(arg_0 -> ((DefaultedRegistry)Registries.BLOCK).getId(arg_0)).map(Identifier::getPath).filter(name -> name.startsWith(input)).limit(20L).forEach(arg_0 -> ((SuggestionsBuilder)builder1).suggest(arg_0));
            return builder1.buildFuture();
        };
    }

        return context -> {
            String blockName = (String)context.getArgument("block", String.class);
            if (BlockESP.INSTANCE.isTracking(blockName)) {
                ChatUtils.sendMessage("§cБлок §e" + blockName + "§c уже отслеживается!");
                return 1;
            }
            boolean exists = Registries.BLOCK.stream().anyMatch(block -> {
                String name = Registries.BLOCK.getId(block).getPath();
                return name.equalsIgnoreCase(blockName);
            });
            if (!exists) {
                ChatUtils.sendMessage("§cБлок §e" + blockName + "§c не найден!");
                return 1;
            }
            BlockESP.INSTANCE.addBlock(blockName);
            ChatUtils.sendMessage("§aБлок §e" + blockName + "§a добавлен в отслеживание!");
            return 1;
        };
    }

        return (context, builder1) -> {
            BlockESP.INSTANCE.getTrackedBlocks().stream().sorted(String::compareTo).filter(name -> name.startsWith(builder1.getRemaining().toLowerCase())).forEach(arg_0 -> ((SuggestionsBuilder)builder1).suggest(arg_0));
            return builder1.buildFuture();
        };
    }

        return context -> {
            String blockName = (String)context.getArgument("block", String.class);
            if (!BlockESP.INSTANCE.isTracking(blockName)) {
                ChatUtils.sendMessage("§cБлок §e" + blockName + "§c не отслеживается!");
                return 1;
            }
            BlockESP.INSTANCE.removeBlock(blockName);
            ChatUtils.sendMessage("§aБлок §e" + blockName + "§a удалён из отслеживания!");
            return 1;
        };
    }

        return context -> {
            Set<String> blocks = BlockESP.INSTANCE.getTrackedBlocks();
            if (blocks.isEmpty()) {
                ChatUtils.sendMessage("§cСписок отслеживаемых блоков пуст!");
                return 1;
            }
            String blockList = blocks.stream().sorted().collect(Collectors.joining("§7, §e"));
            ChatUtils.sendMessage("§aОтслеживаемые блоки §7(§e" + blocks.size() + "§7)§a: §e" + blockList);
            return 1;
        };
    }

        return context -> {
            if (BlockESP.INSTANCE.getTrackedBlocks().isEmpty()) {
                ChatUtils.sendMessage("§cСписок отслеживаемых блоков уже пуст!");
                return 1;
            }
            BlockESP.INSTANCE.clearBlocks();
            ChatUtils.sendMessage("§aСписок отслеживаемых блоков очищен!");
            return 1;
        };
    }
}