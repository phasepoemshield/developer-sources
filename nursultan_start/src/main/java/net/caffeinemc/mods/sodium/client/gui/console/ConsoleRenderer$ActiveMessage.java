/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00913
 *  minecraft.class00949
 *  minecraft.class01894
 *  minecraft.class05216
 *  minecraft.class06202
 *  net.caffeinemc.mods.sodium.client.console.message.Message
 *  net.caffeinemc.mods.sodium.client.console.message.MessageLevel
 */
package net.caffeinemc.mods.sodium.client.gui.console;

import minecraft.class00392;
import minecraft.class00913;
import minecraft.class00949;
import minecraft.class01894;
import minecraft.class05216;
import minecraft.class06202;
import net.caffeinemc.mods.sodium.client.console.message.Message;
import net.caffeinemc.mods.sodium.client.console.message.MessageLevel;

record ConsoleRenderer$ActiveMessage(MessageLevel level, class00392 text, double duration, double timestamp) {
    private static final class00949 UNIFORM = new class00913((class01894)class06202.j_4);

    public static ConsoleRenderer$ActiveMessage create(Message message, double d) {
        class05216 class052162 = (message.translated() ? class00392.L((String)message.text()) : class00392.y((String)message.text())).L().N(class004052 -> class004052.N(UNIFORM));
        return new ConsoleRenderer$ActiveMessage(message.level(), (class00392)class052162, message.duration(), d);
    }
}

