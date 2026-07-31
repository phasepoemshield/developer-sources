package fun.wonderful.api.storages.implement;

import com.mojang.brigadier.CommandDispatcher;
import fun.wonderful.api.commands.Command;
import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import net.minecraft.command.CommandSource;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.ClientCommandSource;

public class CommandStorage {
    private final CommandDispatcher<CommandSource> dispatcher = new CommandDispatcher();
    private final List<Command> commands = new ArrayList<Command>();
    private String prefix = ".";

    public CommandStorage() {
        this.registry();
    }

    private void registry() {
        // Native command execute() stubs crash without the protected DLL; skip registration in the Java rescue build.
    }

    public CommandSource getSource() {
        return new ClientCommandSource(null, MinecraftClient.getInstance());
    }

    private void addCommands(Command ... command) {
        for (Command cmd : command) {
            cmd.register(this.dispatcher);
            this.commands.add(cmd);
        }
    }

    @Generated
    public CommandDispatcher<CommandSource> getDispatcher() {
        return this.dispatcher;
    }

    @Generated
    public List<Command> getCommands() {
        return this.commands;
    }

    @Generated
    public String getPrefix() {
        return this.prefix;
    }

    @Generated
    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }
}