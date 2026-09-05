/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.config.structure;

import net.caffeinemc.mods.sodium.client.config.search.TextSource;
import net.caffeinemc.mods.sodium.client.config.structure.ModOptions;
import net.caffeinemc.mods.sodium.client.config.structure.Option;
import net.caffeinemc.mods.sodium.client.config.structure.OptionGroup;
import net.caffeinemc.mods.sodium.client.config.structure.OptionPage;

public class Option$OptionNameSource
extends TextSource {
    private final ModOptions modOptions;
    private final OptionPage page;
    private final OptionGroup optionGroup;
    final /* synthetic */ Option this$0;

    Option$OptionNameSource(Option option, ModOptions modOptions, OptionPage optionPage, OptionGroup optionGroup) {
        this.this$0 = option;
        this.modOptions = modOptions;
        this.page = optionPage;
        this.optionGroup = optionGroup;
    }

    public String toString() {
        return "OptionNameSource{option id=" + String.valueOf(this.this$0.id) + "}";
    }

    public Option getOption() {
        return this.this$0;
    }

    public OptionPage getPage() {
        return this.page;
    }

    public ModOptions getModOptions() {
        return this.modOptions;
    }

    @Override
    public String getTextFromSource() {
        return this.this$0.getName().getString();
    }

    public OptionGroup getOptionGroup() {
        return this.optionGroup;
    }
}

