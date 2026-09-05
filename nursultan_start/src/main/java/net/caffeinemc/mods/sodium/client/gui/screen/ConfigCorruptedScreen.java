/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class04654
 *  minecraft.class05096
 *  minecraft.class05216
 *  minecraft.class05362
 *  minecraft.class06202
 *  net.caffeinemc.mods.sodium.client.SodiumClientMod
 *  net.caffeinemc.mods.sodium.client.console.Console
 *  net.caffeinemc.mods.sodium.client.console.message.MessageLevel
 *  org.jspecify.annotations.Nullable
 */
package net.caffeinemc.mods.sodium.client.gui.screen;

import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Function;
import java.util.stream.Stream;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class04654;
import minecraft.class05096;
import minecraft.class05216;
import minecraft.class05362;
import minecraft.class06202;
import net.caffeinemc.mods.sodium.client.SodiumClientMod;
import net.caffeinemc.mods.sodium.client.console.Console;
import net.caffeinemc.mods.sodium.client.console.message.MessageLevel;
import org.jspecify.annotations.Nullable;

public class ConfigCorruptedScreen
extends class05096 {
    private static final int BUTTON_WIDTH = 140;
    private static final int BUTTON_HEIGHT = 20;
    private static final int SCREEN_PADDING = 32;
    private final @Nullable class05096 prevScreen;
    private final Function<class05096, class05096> nextScreen;

    public ConfigCorruptedScreen(@Nullable class05096 class050962, @Nullable Function<class05096, class05096> function) {
        super((class00392)class00392.L((String)"sodium.console.corrupt_config.console.title"));
        this.prevScreen = class050962;
        this.nextScreen = function;
    }

    public void method_25426() {
        super.method_25426();
        int n = this.field_22790 - 32 - 20;
        this.method_37063((class04654)class05362.method_46430((class00392)class00392.L((String)"gui.continue"), class053622 -> {
            Console.instance().logMessage(MessageLevel.INFO, "sodium.console.corrupt_config.console.config_file_was_reset", true, 3.0);
            SodiumClientMod.restoreDefaultOptions();
            class06202.Nq().N(this.nextScreen.apply(this.prevScreen));
        }).N(this.field_22789 - 32 - 140, n, 140, 20).N());
        this.method_37063((class04654)class05362.method_46430((class00392)class00392.y((String)"Go back"), class053622 -> class06202.Nq().N(this.prevScreen)).N(32, n, 140, 20).N());
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        super.method_25394(class010542, n, n2, f);
        class010542.y(this.field_22793, (class00392)class00392.y((String)"Sodium Renderer"), 32, 32, -1);
        class010542.y(this.field_22793, (class00392)class00392.L((String)"sodium.console.corrupt_config.message.title"), 32, 48, -65536);
        Stream<class05216> stream = Arrays.stream(class00392.L((String)"sodium.console.corrupt_config.message.body").getString().split("\n")).map(class00392::y);
        int n3 = 0;
        Iterator iterator = stream.iterator();
        while (iterator.hasNext()) {
            class05216 class052162 = (class05216)iterator.next();
            ++n3;
            if (class052162.getString().isEmpty()) continue;
            class010542.y(this.field_22793, (class00392)class052162, 32, 68 + n3 * 12, -1);
        }
    }
}

