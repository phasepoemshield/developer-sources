/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.IBaritone
 *  baritone.api.command.Command
 *  baritone.api.command.IBaritoneChatControl
 *  baritone.api.command.ICommand
 *  baritone.api.command.argument.IArgConsumer
 *  baritone.api.command.exception.CommandException
 *  baritone.api.command.exception.CommandNotFoundException
 *  baritone.api.command.helpers.Paginator
 *  baritone.api.command.helpers.TabCompleteHelper
 *  minecraft.class00392
 *  minecraft.class00395
 *  minecraft.class00401
 *  minecraft.class00625
 *  minecraft.class00647
 *  minecraft.class05216
 *  minecraft.class06541
 */
package baritone.command.defaults;

import baritone.api.IBaritone;
import baritone.api.command.Command;
import baritone.api.command.IBaritoneChatControl;
import baritone.api.command.ICommand;
import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.exception.CommandException;
import baritone.api.command.exception.CommandNotFoundException;
import baritone.api.command.helpers.Paginator;
import baritone.api.command.helpers.TabCompleteHelper;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class00392;
import minecraft.class00395;
import minecraft.class00401;
import minecraft.class00625;
import minecraft.class00647;
import minecraft.class05216;
import minecraft.class06541;

public class HelpCommand
extends Command {
    public HelpCommand(IBaritone iBaritone) {
        super(iBaritone, new String[]{"help", "?"});
    }

    public void execute(String string, IArgConsumer iArgConsumer) throws CommandException {
        iArgConsumer.requireMax(1);
        if (!iArgConsumer.hasAny() || iArgConsumer.is(Integer.class)) {
            Paginator.paginate((IArgConsumer)iArgConsumer, (Paginator)new Paginator(this.baritone.getCommandManager().getRegistry().descendingStream().filter(iCommand -> !iCommand.hiddenFromHelp()).collect(Collectors.toList())), () -> this.logDirect("All Baritone commands (clickable):"), iCommand -> {
                String string2 = String.join((CharSequence)"/", iCommand.getNames());
                String string3 = (String)iCommand.getNames().get(0);
                class05216 class052162 = class00392.y((String)(" - " + iCommand.getShortDesc()));
                class052162.y(class052162.method_10866().N(class06541.field_1063));
                class05216 class052163 = class00392.y((String)string2);
                class052163.y(class052163.method_10866().N(class06541.field_1068));
                class05216 class052164 = class00392.y((String)"");
                class052164.y(class052164.method_10866().N(class06541.field_1080));
                class052164.y((class00392)class052163);
                class052164.i("\n" + iCommand.getShortDesc());
                class052164.i("\n\nClick to view full help");
                String string4 = IBaritoneChatControl.FORCE_COMMAND_PREFIX + String.format("%s %s", string, iCommand.getNames().get(0));
                class05216 class052165 = class00392.y((String)string3);
                class052165.y(class052165.method_10866().N(class06541.field_1080));
                class052165.y((class00392)class052162);
                class052165.y(class052165.method_10866().N((class00395)new class00401((class00392)class052164)).N((class00647)new class00625(string4)));
                return class052165;
            }, (String)(IBaritoneChatControl.FORCE_COMMAND_PREFIX + string));
        } else {
            String string2 = iArgConsumer.getString().toLowerCase();
            ICommand iCommand2 = this.baritone.getCommandManager().getCommand(string2);
            if (iCommand2 == null) {
                throw new CommandNotFoundException(string2);
            }
            this.logDirect(String.format("%s - %s", String.join((CharSequence)" / ", iCommand2.getNames()), iCommand2.getShortDesc()));
            this.logDirect("");
            iCommand2.getLongDesc().forEach(arg_0 -> ((HelpCommand)this).logDirect(arg_0));
            this.logDirect("");
            class05216 class052162 = class00392.y((String)"Click to return to the help menu");
            class052162.y(class052162.method_10866().N((class00647)new class00625(IBaritoneChatControl.FORCE_COMMAND_PREFIX + string)));
            this.logDirect(new class00392[]{class052162});
        }
    }

    public String getShortDesc() {
        return "View all commands or help on specific ones";
    }

    public List<String> getLongDesc() {
        return Arrays.asList("Using this command, you can view detailed help information on how to use certain commands of Baritone.", "", "Usage:", "> help - Lists all commands and their short descriptions.", "> help <command> - Displays help information on a specific command.");
    }

    public Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) throws CommandException {
        if (iArgConsumer.hasExactlyOne()) {
            return new TabCompleteHelper().addCommands(this.baritone.getCommandManager()).filterPrefix(iArgConsumer.getString()).stream();
        }
        return Stream.empty();
    }
}

