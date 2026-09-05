/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.Baritone
 *  baritone.api.IBaritone
 *  baritone.api.Settings
 *  baritone.api.Settings$Setting
 *  baritone.api.command.Command
 *  baritone.api.command.IBaritoneChatControl
 *  baritone.api.command.argument.IArgConsumer
 *  baritone.api.command.datatypes.RelativeFile
 *  baritone.api.command.exception.CommandException
 *  baritone.api.command.exception.CommandInvalidStateException
 *  baritone.api.command.exception.CommandInvalidTypeException
 *  baritone.api.command.helpers.Paginator
 *  baritone.api.command.helpers.TabCompleteHelper
 *  baritone.api.utils.SettingsUtil
 *  minecraft.class00392
 *  minecraft.class00395
 *  minecraft.class00401
 *  minecraft.class00625
 *  minecraft.class00640
 *  minecraft.class00647
 *  minecraft.class05216
 *  minecraft.class06202
 *  minecraft.class06541
 */
package baritone.command.defaults;

import baritone.Baritone;
import baritone.api.IBaritone;
import baritone.api.Settings;
import baritone.api.command.Command;
import baritone.api.command.IBaritoneChatControl;
import baritone.api.command.argument.IArgConsumer;
import baritone.api.command.datatypes.RelativeFile;
import baritone.api.command.exception.CommandException;
import baritone.api.command.exception.CommandInvalidStateException;
import baritone.api.command.exception.CommandInvalidTypeException;
import baritone.api.command.helpers.Paginator;
import baritone.api.command.helpers.TabCompleteHelper;
import baritone.api.utils.SettingsUtil;
import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class00392;
import minecraft.class00395;
import minecraft.class00401;
import minecraft.class00625;
import minecraft.class00640;
import minecraft.class00647;
import minecraft.class05216;
import minecraft.class06202;
import minecraft.class06541;

public class SetCommand
extends Command {
    public SetCommand(IBaritone iBaritone) {
        super(iBaritone, new String[]{"set", "setting", "settings"});
    }

    public void execute(String string, IArgConsumer iArgConsumer) throws CommandException {
        boolean bl;
        boolean bl2;
        String string2;
        String string3 = string2 = iArgConsumer.hasAny() ? iArgConsumer.getString().toLowerCase(Locale.US) : "list";
        if (Arrays.asList("s", "save").contains(string2)) {
            SettingsUtil.save((Settings)Baritone.settings());
            this.logDirect("Settings saved");
            return;
        }
        if (Arrays.asList("load", "ld").contains(string2)) {
            String string4 = "settings.txt";
            if (iArgConsumer.hasAny()) {
                string4 = iArgConsumer.getString();
            }
            SettingsUtil.modifiedSettings((Settings)Baritone.settings()).forEach(Settings.Setting::reset);
            SettingsUtil.readAndApply((Settings)Baritone.settings(), (String)string4);
            this.logDirect("Settings reloaded from " + string4);
            return;
        }
        boolean bl3 = Arrays.asList("m", "mod", "modified").contains(string2);
        boolean bl4 = Arrays.asList("all", "l", "list").contains(string2);
        boolean bl5 = bl2 = bl3 || bl4;
        if (bl2) {
            String string5 = iArgConsumer.hasAny() && iArgConsumer.peekAsOrNull(Integer.class) == null ? iArgConsumer.getString() : "";
            iArgConsumer.requireMax(1);
            List list = (bl3 ? SettingsUtil.modifiedSettings((Settings)Baritone.settings()) : Baritone.settings().allSettings).stream().filter(setting -> !setting.isJavaOnly()).filter(setting -> setting.getName().toLowerCase(Locale.US).contains(string5.toLowerCase(Locale.US))).sorted((setting, setting2) -> String.CASE_INSENSITIVE_ORDER.compare(setting.getName(), setting2.getName())).collect(Collectors.toList());
            Paginator.paginate((IArgConsumer)iArgConsumer, (Paginator)new Paginator(list), () -> this.logDirect(!string5.isEmpty() ? String.format("All %ssettings containing the string '%s':", bl3 ? "modified " : "", string5) : String.format("All %ssettings:", bl3 ? "modified " : "")), setting -> {
                class05216 class052162 = class00392.y((String)String.format(" (%s)", SettingsUtil.settingTypeToString((Settings.Setting)setting)));
                class052162.y(class052162.method_10866().N(class06541.field_1063));
                class05216 class052163 = class00392.y((String)"");
                class052163.y(class052163.method_10866().N(class06541.field_1080));
                class052163.i(setting.getName());
                class052163.i(String.format("\nType: %s", SettingsUtil.settingTypeToString((Settings.Setting)setting)));
                class052163.i(String.format("\n\nValue:\n%s", SettingsUtil.settingValueToString((Settings.Setting)setting)));
                class052163.i(String.format("\n\nDefault Value:\n%s", SettingsUtil.settingDefaultToString((Settings.Setting)setting)));
                String string = (String)Baritone.settings().prefix.value + String.format("set %s ", setting.getName());
                class05216 class052164 = class00392.y((String)setting.getName());
                class052164.y(class052164.method_10866().N(class06541.field_1080));
                class052164.y((class00392)class052162);
                class052164.y(class052164.method_10866().N((class00395)new class00401((class00392)class052163)).N((class00647)new class00640(string)));
                return class052164;
            }, (String)(IBaritoneChatControl.FORCE_COMMAND_PREFIX + "set " + string2 + " " + string5));
            return;
        }
        iArgConsumer.requireMax(1);
        boolean bl6 = string2.equalsIgnoreCase("reset");
        boolean bl7 = string2.equalsIgnoreCase("toggle");
        boolean bl8 = bl = bl6 || bl7;
        if (bl6) {
            if (!iArgConsumer.hasAny()) {
                this.logDirect("Please specify 'all' as an argument to reset to confirm you'd really like to do this");
                this.logDirect("ALL settings will be reset. Use the 'set modified' or 'modified' commands to see what will be reset.");
                this.logDirect("Specify a setting name instead of 'all' to only reset one setting");
            } else if (iArgConsumer.peekString().equalsIgnoreCase("all")) {
                SettingsUtil.modifiedSettings((Settings)Baritone.settings()).forEach(Settings.Setting::reset);
                this.logDirect("All settings have been reset to their default values");
                SettingsUtil.save((Settings)Baritone.settings());
                return;
            }
        }
        if (bl7) {
            iArgConsumer.requireMin(1);
        }
        String string6 = bl ? iArgConsumer.getString() : string2;
        Settings.Setting setting3 = Baritone.settings().allSettings.stream().filter(setting -> setting.getName().equalsIgnoreCase(string6)).findFirst().orElse(null);
        if (setting3 == null) {
            throw new CommandInvalidTypeException(iArgConsumer.consumed(), "a valid setting");
        }
        if (setting3.isJavaOnly()) {
            throw new CommandInvalidStateException(String.format("Setting %s can only be used via the api.", setting3.getName()));
        }
        if (!bl && !iArgConsumer.hasAny()) {
            this.logDirect(String.format("Value of setting %s:", setting3.getName()));
            this.logDirect(SettingsUtil.settingValueToString((Settings.Setting)setting3));
        } else {
            String string7;
            String string8 = SettingsUtil.settingValueToString((Settings.Setting)setting3);
            if (bl6) {
                setting3.reset();
            } else if (bl7) {
                if (setting3.getValueClass() != Boolean.class) {
                    throw new CommandInvalidTypeException(iArgConsumer.consumed(), "a toggleable setting", "some other setting");
                }
                String string9 = string7 = setting3;
                ((Settings.Setting)string9).value = (Boolean)((Settings.Setting)string9).value ^ true;
                this.logDirect(String.format("Toggled setting %s to %s", setting3.getName(), Boolean.toString((Boolean)setting3.value)));
            } else {
                string7 = iArgConsumer.getString();
                try {
                    SettingsUtil.parseAndApply((Settings)Baritone.settings(), (String)string2, (String)string7);
                }
                catch (Throwable throwable) {
                    throwable.printStackTrace();
                    throw new CommandInvalidTypeException(iArgConsumer.consumed(), "a valid value", throwable);
                }
            }
            if (!bl7) {
                this.logDirect(String.format("Successfully %s %s to %s", bl6 ? "reset" : "set", setting3.getName(), SettingsUtil.settingValueToString((Settings.Setting)setting3)));
            }
            string7 = class00392.y((String)String.format("Old value: %s", string8));
            string7.y(string7.method_10866().N(class06541.field_1080).N((class00395)new class00401((class00392)class00392.y((String)"Click to set the setting back to this value"))).N((class00647)new class00625(IBaritoneChatControl.FORCE_COMMAND_PREFIX + String.format("set %s %s", setting3.getName(), string8))));
            this.logDirect(new class00392[]{string7});
            if (setting3.getName().equals("chatControl") && !((Boolean)setting3.value).booleanValue() && !((Boolean)Baritone.settings().chatControlAnyway.value).booleanValue() || setting3.getName().equals("chatControlAnyway") && !((Boolean)setting3.value).booleanValue() && !((Boolean)Baritone.settings().chatControl.value).booleanValue()) {
                this.logDirect("Warning: Chat commands will no longer work. If you want to revert this change, use prefix control (if enabled) or click the old value listed above.", class06541.field_1061);
            } else if (setting3.getName().equals("prefixControl") && !((Boolean)setting3.value).booleanValue()) {
                this.logDirect("Warning: Prefixed commands will no longer work. If you want to revert this change, use chat control (if enabled) or click the old value listed above.", class06541.field_1061);
            }
        }
        SettingsUtil.save((Settings)Baritone.settings());
    }

    public String getShortDesc() {
        return "View or change settings";
    }

    public List<String> getLongDesc() {
        return Arrays.asList("Using the set command, you can manage all of Baritone's settings. Almost every aspect is controlled by these settings - go wild!", "", "Usage:", "> set - Same as `set list`", "> set list [page] - View all settings", "> set modified [page] - View modified settings", "> set <setting> - View the current value of a setting", "> set <setting> <value> - Set the value of a setting", "> set reset all - Reset ALL SETTINGS to their defaults", "> set reset <setting> - Reset a setting to its default", "> set toggle <setting> - Toggle a boolean setting", "> set save - Save all settings (this is automatic tho)", "> set load - Load settings from settings.txt", "> set load [filename] - Load settings from another file in your minecraft/baritone");
    }

    public Stream<String> tabComplete(String string, IArgConsumer iArgConsumer) throws CommandException {
        if (iArgConsumer.hasAny()) {
            String string2 = iArgConsumer.getString();
            if (iArgConsumer.hasExactlyOne() && !Arrays.asList("s", "save").contains(iArgConsumer.peekString().toLowerCase(Locale.US))) {
                if (string2.equalsIgnoreCase("reset")) {
                    return new TabCompleteHelper().addModifiedSettings().prepend(new String[]{"all"}).filterPrefix(iArgConsumer.getString()).stream();
                }
                if (string2.equalsIgnoreCase("toggle")) {
                    return new TabCompleteHelper().addToggleableSettings().filterPrefix(iArgConsumer.getString()).stream();
                }
                if (Arrays.asList("ld", "load").contains(string2.toLowerCase(Locale.US))) {
                    return RelativeFile.tabComplete((IArgConsumer)iArgConsumer, (File)((File)class06202.Nq().l_1).toPath().resolve("baritone").toFile());
                }
                Settings.Setting setting = (Settings.Setting)Baritone.settings().byLowerName.get(string2.toLowerCase(Locale.US));
                if (setting != null) {
                    if (setting.getType() == Boolean.class) {
                        TabCompleteHelper tabCompleteHelper = new TabCompleteHelper();
                        if (((Boolean)setting.value).booleanValue()) {
                            tabCompleteHelper.append(new String[]{"true", "false"});
                        } else {
                            tabCompleteHelper.append(new String[]{"false", "true"});
                        }
                        return tabCompleteHelper.filterPrefix(iArgConsumer.getString()).stream();
                    }
                    return Stream.of(SettingsUtil.settingValueToString((Settings.Setting)setting));
                }
            } else if (!iArgConsumer.hasAny()) {
                return new TabCompleteHelper().addSettings().sortAlphabetically().prepend(new String[]{"list", "modified", "reset", "toggle", "save", "load"}).filterPrefix(string2).stream();
            }
        }
        return Stream.empty();
    }
}

