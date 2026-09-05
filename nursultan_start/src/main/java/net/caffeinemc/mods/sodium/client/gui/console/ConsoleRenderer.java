/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00405
 *  minecraft.class01028
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class04995
 *  minecraft.class05228
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06220
 *  minecraft.class07018
 *  net.caffeinemc.mods.sodium.api.util.ColorARGB
 *  net.caffeinemc.mods.sodium.api.util.ColorU8
 *  net.caffeinemc.mods.sodium.client.console.Console
 *  net.caffeinemc.mods.sodium.client.console.message.Message
 *  net.caffeinemc.mods.sodium.client.console.message.MessageLevel
 *  org.lwjgl.glfw.GLFW
 */
package net.caffeinemc.mods.sodium.client.gui.console;

import java.util.ArrayList;
import java.util.Deque;
import java.util.EnumMap;
import java.util.LinkedList;
import java.util.Objects;
import minecraft.class00405;
import minecraft.class01028;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class04995;
import minecraft.class05228;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06220;
import minecraft.class07018;
import net.caffeinemc.mods.sodium.api.util.ColorARGB;
import net.caffeinemc.mods.sodium.api.util.ColorU8;
import net.caffeinemc.mods.sodium.client.console.Console;
import net.caffeinemc.mods.sodium.client.console.message.Message;
import net.caffeinemc.mods.sodium.client.console.message.MessageLevel;
import net.caffeinemc.mods.sodium.client.gui.console.ConsoleRenderer$ActiveMessage;
import net.caffeinemc.mods.sodium.client.gui.console.ConsoleRenderer$ColorPalette;
import net.caffeinemc.mods.sodium.client.gui.console.ConsoleRenderer$MessageRender;
import org.lwjgl.glfw.GLFW;

public class ConsoleRenderer {
    private static final int BOX_PADDING_X = 3;
    private static final int BOX_PADDING_Y = 1;
    private static final int BOX_MARGIN = 4;
    private static final int CONSOLE_MESSAGE_WIDTH = 270;
    static final ConsoleRenderer INSTANCE = new ConsoleRenderer();
    private final LinkedList<ConsoleRenderer$ActiveMessage> activeMessages = new LinkedList();
    private static final EnumMap<MessageLevel, ConsoleRenderer$ColorPalette> COLORS = new EnumMap(MessageLevel.class);

    public void update(Console console, double d) {
        this.purgeMessages(d);
        this.pollMessages(console, d);
    }

    private static int weightAlpha(double d) {
        return ColorU8.normalizedFloatToByte((float)((float)d));
    }

    private static double getMessageOpacity(ConsoleRenderer$ActiveMessage consoleRenderer$ActiveMessage, double d) {
        double d2 = consoleRenderer$ActiveMessage.timestamp() + consoleRenderer$ActiveMessage.duration() / 2.0;
        if (d > d2) {
            return ConsoleRenderer.getFadeOutOpacity(consoleRenderer$ActiveMessage, d);
        }
        if (d < d2) {
            return ConsoleRenderer.getFadeInOpacity(consoleRenderer$ActiveMessage, d);
        }
        return 1.0;
    }

    private static double getFadeInOpacity(ConsoleRenderer$ActiveMessage consoleRenderer$ActiveMessage, double d) {
        double d2 = 0.25;
        double d3 = consoleRenderer$ActiveMessage.timestamp();
        double d4 = consoleRenderer$ActiveMessage.timestamp() + d2;
        return ConsoleRenderer.getAnimationProgress(d, d3, d4);
    }

    private void purgeMessages(double d) {
        this.activeMessages.removeIf(consoleRenderer$ActiveMessage -> d > consoleRenderer$ActiveMessage.timestamp() + consoleRenderer$ActiveMessage.duration());
    }

    private void pollMessages(Console console, double d) {
        Deque deque = console.getMessageDrain();
        while (!deque.isEmpty()) {
            this.activeMessages.add(ConsoleRenderer$ActiveMessage.create((Message)deque.poll(), d));
        }
    }

    private static double getFadeOutOpacity(ConsoleRenderer$ActiveMessage consoleRenderer$ActiveMessage, double d) {
        double d2 = Math.min(0.5, consoleRenderer$ActiveMessage.duration() * 0.2);
        double d3 = consoleRenderer$ActiveMessage.timestamp() + consoleRenderer$ActiveMessage.duration() - d2;
        double d4 = consoleRenderer$ActiveMessage.timestamp() + consoleRenderer$ActiveMessage.duration();
        return 1.0 - ConsoleRenderer.getAnimationProgress(d, d3, d4);
    }

    private static double getAnimationProgress(double d, double d2, double d3) {
        return class04995.N((double)class04995.L((double)d, (double)d2, (double)d3), (double)0.0, (double)1.0);
    }

    public void draw(class01054 class010542) {
        int n;
        int n2;
        double d = GLFW.glfwGetTime();
        class06202 class062022 = class06202.Nq();
        ArrayList<ConsoleRenderer$MessageRender> arrayList = new ArrayList<ConsoleRenderer$MessageRender>();
        int n3 = 4;
        int n4 = 4;
        for (ConsoleRenderer$ActiveMessage consoleRenderer$ActiveMessage : this.activeMessages) {
            double d2 = ConsoleRenderer.getMessageOpacity(consoleRenderer$ActiveMessage, d);
            if (d2 < 0.025) continue;
            ArrayList<class01028> object = new ArrayList<class01028>();
            n2 = 270;
            class05228 class052282 = ((class01590)class062022.i_3).y();
            class052282.N((class05936)consoleRenderer$ActiveMessage.text(), n2 - 20, class00405.N, (class059362, bl) -> object.add(class07018.y().N(class059362)));
            Objects.requireNonNull((class01590)class062022.i_3);
            n = 9 * object.size() + 2;
            arrayList.add(new ConsoleRenderer$MessageRender(n3, n4, n2, n, consoleRenderer$ActiveMessage.level(), object, d2));
            n4 += n;
        }
        double d3 = ((class06220)class062022.L_2).i() / (double)class062022.Nt().j();
        double d4 = ((class06220)class062022.L_2).R() / (double)class062022.Nt().j();
        boolean bl2 = false;
        for (ConsoleRenderer$MessageRender consoleRenderer$MessageRender : arrayList) {
            if (!(d3 >= (double)consoleRenderer$MessageRender.x) || !(d3 < (double)(consoleRenderer$MessageRender.x + consoleRenderer$MessageRender.width)) || !(d4 >= (double)consoleRenderer$MessageRender.y) || !(d4 < (double)(consoleRenderer$MessageRender.y + consoleRenderer$MessageRender.height))) continue;
            bl2 = true;
            break;
        }
        for (ConsoleRenderer$MessageRender consoleRenderer$MessageRender : arrayList) {
            n2 = consoleRenderer$MessageRender.x();
            int n5 = consoleRenderer$MessageRender.y();
            n = consoleRenderer$MessageRender.width();
            int n6 = consoleRenderer$MessageRender.height();
            ConsoleRenderer$ColorPalette consoleRenderer$ColorPalette = COLORS.get(consoleRenderer$MessageRender.level());
            double d2 = consoleRenderer$MessageRender.opacity();
            if (bl2) {
                d2 *= 0.4;
            }
            class010542.N(n2, n5, n2 + n, n5 + n6, ColorARGB.withAlpha((int)consoleRenderer$ColorPalette.background(), (int)ConsoleRenderer.weightAlpha(d2)));
            class010542.N(n2, n5, n2 + 1, n5 + n6, ColorARGB.withAlpha((int)consoleRenderer$ColorPalette.foreground(), (int)ConsoleRenderer.weightAlpha(d2)));
            for (class01028 class010282 : consoleRenderer$MessageRender.lines()) {
                class010542.N((class01590)class062022.i_3, class010282, n2 + 3 + 3, n5 + 1, ColorARGB.withAlpha((int)consoleRenderer$ColorPalette.text(), (int)ConsoleRenderer.weightAlpha(d2)), false);
                Objects.requireNonNull((class01590)class062022.i_3);
                n5 += 9;
            }
        }
    }

    static {
        COLORS.put(MessageLevel.INFO, new ConsoleRenderer$ColorPalette(ColorARGB.pack((int)255, (int)255, (int)255), ColorARGB.pack((int)15, (int)15, (int)15), ColorARGB.pack((int)15, (int)15, (int)15)));
        COLORS.put(MessageLevel.WARN, new ConsoleRenderer$ColorPalette(ColorARGB.pack((int)224, (int)187, (int)0), ColorARGB.pack((int)25, (int)21, (int)0), ColorARGB.pack((int)180, (int)150, (int)0)));
        COLORS.put(MessageLevel.SEVERE, new ConsoleRenderer$ColorPalette(ColorARGB.pack((int)220, (int)0, (int)0), ColorARGB.pack((int)25, (int)0, (int)0), ColorARGB.pack((int)160, (int)0, (int)0)));
    }
}

