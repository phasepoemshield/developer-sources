/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.BaritoneAPI
 *  baritone.api.Settings
 *  baritone.api.Settings$Setting
 *  baritone.api.command.IBaritoneChatControl
 *  baritone.api.command.argument.ICommandArgument
 *  baritone.api.command.exception.CommandNotEnoughArgumentsException
 *  baritone.api.command.exception.CommandNotFoundException
 *  baritone.api.command.helpers.TabCompleteHelper
 *  baritone.api.command.manager.ICommandManager
 *  baritone.api.event.events.ChatEvent
 *  baritone.api.event.events.TabCompleteEvent
 *  baritone.api.utils.Helper
 *  baritone.api.utils.SettingsUtil
 *  baritone.behavior.Behavior
 *  minecraft.class00392
 *  minecraft.class00395
 *  minecraft.class00401
 *  minecraft.class00625
 *  minecraft.class00647
 *  minecraft.class05034
 *  minecraft.class05216
 *  minecraft.class06541
 *  minecraft.class07536
 */
package baritone.command;

import baritone.Baritone;
import baritone.api.BaritoneAPI;
import baritone.api.Settings;
import baritone.api.command.IBaritoneChatControl;
import baritone.api.command.argument.ICommandArgument;
import baritone.api.command.exception.CommandNotEnoughArgumentsException;
import baritone.api.command.exception.CommandNotFoundException;
import baritone.api.command.helpers.TabCompleteHelper;
import baritone.api.command.manager.ICommandManager;
import baritone.api.event.events.ChatEvent;
import baritone.api.event.events.TabCompleteEvent;
import baritone.api.utils.Helper;
import baritone.api.utils.SettingsUtil;
import baritone.behavior.Behavior;
import baritone.command.argument.ArgConsumer;
import baritone.command.argument.CommandArguments;
import baritone.command.manager.CommandManager;
import java.util.List;
import java.util.Locale;
import java.util.stream.Stream;
import minecraft.class00392;
import minecraft.class00395;
import minecraft.class00401;
import minecraft.class00625;
import minecraft.class00647;
import minecraft.class05034;
import minecraft.class05216;
import minecraft.class06541;
import minecraft.class07536;

public class ExampleBaritoneControl
extends Behavior
implements Helper {
    private static final Settings settings = BaritoneAPI.getSettings();
    private final ICommandManager manager;

    public ExampleBaritoneControl(Baritone baritone) {
        super(baritone);
        this.manager = baritone.getCommandManager();
    }

    public void onSendChatMessage(ChatEvent chatEvent) {
        String string = chatEvent.getMessage();
        String string2 = (String)ExampleBaritoneControl.settings.prefix.value;
        boolean bl = string.startsWith(IBaritoneChatControl.FORCE_COMMAND_PREFIX);
        if (string.startsWith(string2) || bl) {
            chatEvent.cancel();
            String string3 = string.substring(bl ? IBaritoneChatControl.FORCE_COMMAND_PREFIX.length() : string2.length());
            if (!this.runCommand(string3) && !string3.trim().isEmpty()) {
                new CommandNotFoundException((String)CommandManager.expand(string3).N()).handle(null, null);
            }
        }
    }

    public boolean runCommand(String string) {
        if (string.trim().equalsIgnoreCase("damn")) {
            this.logDirect("daniel");
            return false;
        }
        if (string.trim().equalsIgnoreCase("orderpizza")) {
            try {
                class07536.m().N("https://www.dominos.com/en/pages/order/");
            }
            catch (Exception exception) {
                // empty catch block
            }
            return false;
        }
        if (string.isEmpty()) {
            return this.runCommand("help");
        }
        class05034<String, List<ICommandArgument>> class050342 = CommandManager.expand(string);
        String string2 = (String)class050342.N();
        String string3 = string.substring(((String)class050342.N()).length());
        ArgConsumer argConsumer = new ArgConsumer(this.manager, (List)class050342.y());
        if (!argConsumer.hasAny()) {
            Settings.Setting setting = (Settings.Setting)ExampleBaritoneControl.settings.byLowerName.get(string2.toLowerCase(Locale.US));
            if (setting != null) {
                this.logRanCommand(string2, string3);
                if (setting.getValueClass() == Boolean.class) {
                    this.manager.execute(String.format("set toggle %s", setting.getName()));
                } else {
                    this.manager.execute(String.format("set %s", setting.getName()));
                }
                return true;
            }
        } else if (argConsumer.hasExactlyOne()) {
            for (Settings.Setting setting : ExampleBaritoneControl.settings.allSettings) {
                if (setting.isJavaOnly() || !setting.getName().equalsIgnoreCase((String)class050342.N())) continue;
                this.logRanCommand(string2, string3);
                try {
                    this.manager.execute(String.format("set %s %s", setting.getName(), argConsumer.getString()));
                }
                catch (CommandNotEnoughArgumentsException commandNotEnoughArgumentsException) {
                    // empty catch block
                }
                return true;
            }
        }
        if (this.manager.getCommand((String)class050342.N()) != null) {
            this.logRanCommand(string2, string3);
        }
        return this.manager.execute(class050342);
    }

    public void onPreTabComplete(TabCompleteEvent tabCompleteEvent) {
        if (!((Boolean)ExampleBaritoneControl.settings.prefixControl.value).booleanValue()) {
            return;
        }
        String string = tabCompleteEvent.prefix;
        String string3 = (String)ExampleBaritoneControl.settings.prefix.value;
        if (!string.startsWith(string3)) {
            return;
        }
        String string4 = string.substring(string3.length());
        List<ICommandArgument> list = CommandArguments.from(string4, true);
        Stream<String> stream = this.tabComplete(string4);
        if (list.size() == 1) {
            stream = stream.map(string2 -> string3 + string2);
        }
        tabCompleteEvent.completions = (String[])stream.toArray(String[]::new);
    }

    private void logRanCommand(String string, String string2) {
        if (((Boolean)ExampleBaritoneControl.settings.echoCommands.value).booleanValue()) {
            String string3 = string + string2;
            String string4 = (Boolean)ExampleBaritoneControl.settings.censorRanCommands.value != false ? string + " ..." : string3;
            class05216 class052162 = class00392.y((String)String.format("> %s", string4));
            class052162.y(class052162.method_10866().N(class06541.field_1068).N((class00395)new class00401((class00392)class00392.y((String)"Click to rerun command"))).N((class00647)new class00625(IBaritoneChatControl.FORCE_COMMAND_PREFIX + string3)));
            this.logDirect(new class00392[]{class052162});
        }
    }

    public Stream<String> tabComplete(String string) {
        try {
            List<ICommandArgument> list = CommandArguments.from(string, true);
            ArgConsumer argConsumer = new ArgConsumer(this.manager, list);
            if (argConsumer.hasAtMost(2)) {
                if (argConsumer.hasExactly(1)) {
                    return new TabCompleteHelper().addCommands(this.manager).addSettings().filterPrefix(argConsumer.getString()).stream();
                }
                Settings.Setting setting = (Settings.Setting)ExampleBaritoneControl.settings.byLowerName.get(argConsumer.getString().toLowerCase(Locale.US));
                if (setting != null && !setting.isJavaOnly()) {
                    if (setting.getValueClass() == Boolean.class) {
                        TabCompleteHelper tabCompleteHelper = new TabCompleteHelper();
                        if (((Boolean)setting.value).booleanValue()) {
                            tabCompleteHelper.append(new String[]{"true", "false"});
                        } else {
                            tabCompleteHelper.append(new String[]{"false", "true"});
                        }
                        return tabCompleteHelper.filterPrefix(argConsumer.getString()).stream();
                    }
                    return Stream.of(SettingsUtil.settingValueToString((Settings.Setting)setting));
                }
            }
            return this.manager.tabComplete(string);
        }
        catch (CommandNotEnoughArgumentsException commandNotEnoughArgumentsException) {
            return Stream.empty();
        }
    }
}

