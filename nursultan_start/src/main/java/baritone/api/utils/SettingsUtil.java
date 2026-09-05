/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.BaritoneAPI
 *  baritone.api.Settings
 *  baritone.api.Settings$Setting
 *  minecraft.class06202
 */
package baritone.api.utils;

import baritone.api.BaritoneAPI;
import baritone.api.Settings;
import baritone.api.utils.Helper;
import baritone.api.utils.SettingsUtil$Parser;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import minecraft.class06202;

public class SettingsUtil {
    public static final String SETTINGS_DEFAULT_NAME = "settings.txt";
    private static final Pattern SETTING_PATTERN = Pattern.compile("^(?<setting>[^ ]+) +(?<value>.+)");

    public static synchronized void save(Settings settings) {
        try (BufferedWriter bufferedWriter = Files.newBufferedWriter(SettingsUtil.settingsByName(SETTINGS_DEFAULT_NAME), new OpenOption[0]);){
            for (Settings.Setting setting : SettingsUtil.modifiedSettings(settings)) {
                bufferedWriter.write(SettingsUtil.settingToString(setting) + "\n");
            }
        }
        catch (Exception exception) {
            Helper.HELPER.logDirect("Exception thrown while saving Baritone settings!");
            exception.printStackTrace();
        }
    }

    private static boolean isComment(String string) {
        return string.startsWith("#") || string.startsWith("//");
    }

    public static void readAndApply(Settings settings, String string2) {
        try {
            SettingsUtil.forEachLine(SettingsUtil.settingsByName(string2), string -> {
                Matcher matcher = SETTING_PATTERN.matcher((CharSequence)string);
                if (!matcher.matches()) {
                    Helper.HELPER.logDirect("Invalid syntax in setting file: " + string);
                    return;
                }
                String string2 = matcher.group("setting").toLowerCase();
                String string3 = matcher.group("value");
                if ("allowjumpat256".equals(string2)) {
                    string2 = "allowjumpatbuildlimit";
                }
                try {
                    SettingsUtil.parseAndApply(settings, string2, string3);
                }
                catch (Exception exception) {
                    Helper.HELPER.logDirect("Unable to parse line " + string);
                    exception.printStackTrace();
                }
            });
        }
        catch (NoSuchFileException noSuchFileException) {
            Helper.HELPER.logDirect("Baritone settings file not found, resetting.");
        }
        catch (Exception exception) {
            Helper.HELPER.logDirect("Exception while reading Baritone settings, some settings may be reset to default values!");
            exception.printStackTrace();
        }
    }

    public static String maybeCensor(int n) {
        if (((Boolean)BaritoneAPI.getSettings().censorCoordinates.value).booleanValue()) {
            return "<censored>";
        }
        return Integer.toString(n);
    }

    public static List<Settings.Setting> modifiedSettings(Settings settings) {
        ArrayList<Settings.Setting> arrayList = new ArrayList<Settings.Setting>();
        for (Settings.Setting setting : settings.allSettings) {
            if (setting.value == null) {
                System.out.println("NULL SETTING?" + setting.getName());
                continue;
            }
            if (setting.isJavaOnly() || setting.value == setting.defaultValue) continue;
            arrayList.add(setting);
        }
        return arrayList;
    }

    public static String settingToString(Settings.Setting setting) throws IllegalStateException {
        if (setting.isJavaOnly()) {
            return setting.getName();
        }
        return setting.getName() + " " + SettingsUtil.settingValueToString(setting);
    }

    public static void parseAndApply(Settings settings, String string, String string2) throws IllegalStateException, NumberFormatException {
        SettingsUtil$Parser settingsUtil$Parser;
        Object t;
        Settings.Setting setting = (Settings.Setting)settings.byLowerName.get(string);
        if (setting == null) {
            throw new IllegalStateException("No setting by that name");
        }
        Class clazz = setting.getValueClass();
        if (!clazz.isInstance(t = (settingsUtil$Parser = SettingsUtil$Parser.getParser(setting.getType())).parse(setting.getType(), string2))) {
            throw new IllegalStateException(String.valueOf(settingsUtil$Parser) + " parser returned incorrect type, expected " + String.valueOf(clazz) + " got " + String.valueOf(t) + " which is " + String.valueOf(t.getClass()));
        }
        setting.value = t;
    }

    @Deprecated
    public static boolean javaOnlySetting(Settings.Setting setting) {
        return setting.isJavaOnly();
    }

    private static void forEachLine(Path path, Consumer<String> consumer) throws IOException {
        try (BufferedReader bufferedReader = Files.newBufferedReader(path);){
            String string;
            while ((string = bufferedReader.readLine()) != null) {
                if (string.isEmpty() || SettingsUtil.isComment(string)) continue;
                consumer.accept(string);
            }
        }
    }

    private static Path settingsByName(String string) {
        return ((File)class06202.Nq().l_1).toPath().resolve("baritone").resolve(string);
    }

    public static <T> String settingValueToString(Settings.Setting<T> setting, T t) throws IllegalArgumentException {
        SettingsUtil$Parser settingsUtil$Parser = SettingsUtil$Parser.getParser(setting.getType());
        if (settingsUtil$Parser == null) {
            throw new IllegalStateException("Missing " + String.valueOf(setting.getValueClass()) + " " + setting.getName());
        }
        return settingsUtil$Parser.toString(setting.getType(), (Object)t);
    }

    public static String settingValueToString(Settings.Setting setting) throws IllegalArgumentException {
        return SettingsUtil.settingValueToString(setting, setting.value);
    }

    public static String settingTypeToString(Settings.Setting setting) {
        return setting.getType().getTypeName().replaceAll("(?:\\w+\\.)+(\\w+)", "$1");
    }

    public static String settingDefaultToString(Settings.Setting setting) throws IllegalArgumentException {
        return SettingsUtil.settingValueToString(setting, setting.defaultValue);
    }
}

