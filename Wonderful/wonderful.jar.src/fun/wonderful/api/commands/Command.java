package fun.wonderful.api.commands;

import com.mojang.brigadier.CommandDispatcher;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import fun.wonderful.api.QClient;
import lombok.Generated;
import net.minecraft.command.CommandSource;

public abstract class Command
implements QClient {
    private final String command;

    public Command(String command) {
        this.command = command;
    }

    public abstract void execute(LiteralArgumentBuilder<CommandSource> var1);

    public void register(CommandDispatcher<CommandSource> dispatcher) {
        LiteralArgumentBuilder builder = LiteralArgumentBuilder.literal((String)this.command);
        this.execute((LiteralArgumentBuilder<CommandSource>)builder);
        dispatcher.register(builder);
    }

    protected <T> RequiredArgumentBuilder<CommandSource, T> arg(String name, ArgumentType<T> type) {
        return RequiredArgumentBuilder.argument((String)name, type);
    }

    protected LiteralArgumentBuilder<CommandSource> literal(String name) {
        return LiteralArgumentBuilder.literal((String)name);
    }

    @Generated
    public String getCommand() {
        return this.command;
    }
}