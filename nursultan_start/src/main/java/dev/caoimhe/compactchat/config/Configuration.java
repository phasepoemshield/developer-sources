/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.autoconfig.AutoConfig
 *  me.shedaniel.autoconfig.ConfigData
 *  me.shedaniel.autoconfig.annotation.Config
 *  me.shedaniel.autoconfig.annotation.ConfigEntry$BoundedDiscrete
 *  me.shedaniel.autoconfig.annotation.ConfigEntry$Gui$Tooltip
 *  me.shedaniel.autoconfig.serializer.GsonConfigSerializer
 */
package dev.caoimhe.compactchat.config;

import java.util.List;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.serializer.GsonConfigSerializer;

@Config(name="compact-chat")
public class Configuration
implements ConfigData {
    @ConfigEntry.Gui.Tooltip
    public int maximumOccurrences = 100;
    @ConfigEntry.BoundedDiscrete(min=0L, max=100L)
    @ConfigEntry.Gui.Tooltip
    public int ignoreFirstCharactersCount = 0;
    @ConfigEntry.Gui.Tooltip
    public boolean onlyCompactConsecutiveMessages = false;
    @ConfigEntry.Gui.Tooltip
    public boolean ignoreCommonSeparators = true;
    @ConfigEntry.Gui.Tooltip
    public List<String> commonSeparators = List.of("-----", "======");

    public static void initialize() {
        AutoConfig.register(Configuration.class, GsonConfigSerializer::new);
    }

    public static Configuration instance() {
        return (Configuration)AutoConfig.getConfigHolder(Configuration.class).getConfig();
    }
}

