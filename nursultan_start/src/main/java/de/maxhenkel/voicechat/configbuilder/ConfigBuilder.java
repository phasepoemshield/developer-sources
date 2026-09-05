/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  de.maxhenkel.voicechat.configbuilder.entry.FloatConfigEntry
 *  de.maxhenkel.voicechat.configbuilder.entry.IntegerConfigEntry
 *  de.maxhenkel.voicechat.configbuilder.entry.LongConfigEntry
 *  de.maxhenkel.voicechat.configbuilder.entry.StringConfigEntry
 *  javax.annotation.Nonnull
 */
package de.maxhenkel.voicechat.configbuilder;

import de.maxhenkel.voicechat.configbuilder.ConfigBuilder$Builder;
import de.maxhenkel.voicechat.configbuilder.entry.BooleanConfigEntry;
import de.maxhenkel.voicechat.configbuilder.entry.ConfigEntry;
import de.maxhenkel.voicechat.configbuilder.entry.DoubleConfigEntry;
import de.maxhenkel.voicechat.configbuilder.entry.EnumConfigEntry;
import de.maxhenkel.voicechat.configbuilder.entry.FloatConfigEntry;
import de.maxhenkel.voicechat.configbuilder.entry.IntegerConfigEntry;
import de.maxhenkel.voicechat.configbuilder.entry.LongConfigEntry;
import de.maxhenkel.voicechat.configbuilder.entry.StringConfigEntry;
import java.util.function.Function;
import javax.annotation.Nonnull;

public interface ConfigBuilder {
    public static <C> ConfigBuilder$Builder<C> builder(@Nonnull Function<ConfigBuilder, C> function) {
        return new ConfigBuilder$Builder(function, null);
    }

    public <T> ConfigEntry<T> entry(String var1, T var2, String ... var3);

    public ConfigBuilder header(String ... var1);

    public DoubleConfigEntry doubleEntry(String var1, Double var2, Double var3, Double var4, String ... var5);

    default public DoubleConfigEntry doubleEntry(String string, Double d, String ... stringArray) {
        return this.doubleEntry(string, d, (Double)null, (Double)null, stringArray);
    }

    default public IntegerConfigEntry integerEntry(String string, Integer n, String ... stringArray) {
        return this.integerEntry(string, n, (Integer)null, (Integer)null, stringArray);
    }

    public IntegerConfigEntry integerEntry(String var1, Integer var2, Integer var3, Integer var4, String ... var5);

    public BooleanConfigEntry booleanEntry(String var1, Boolean var2, String ... var3);

    public StringConfigEntry stringEntry(String var1, String var2, String ... var3);

    public <E extends Enum<E>> EnumConfigEntry<E> enumEntry(String var1, E var2, String ... var3);

    default public LongConfigEntry longEntry(String string, Long l, String ... stringArray) {
        return this.longEntry(string, l, (Long)null, (Long)null, stringArray);
    }

    public LongConfigEntry longEntry(String var1, Long var2, Long var3, Long var4, String ... var5);

    default public FloatConfigEntry floatEntry(String string, Float f, String ... stringArray) {
        return this.floatEntry(string, f, (Float)null, (Float)null, stringArray);
    }

    public FloatConfigEntry floatEntry(String var1, Float var2, Float var3, Float var4, String ... var5);
}

