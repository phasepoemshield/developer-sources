/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NonNull
 */
package net.caffeinemc.mods.sodium.client.console;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Objects;
import net.caffeinemc.mods.sodium.client.console.ConsoleSink;
import net.caffeinemc.mods.sodium.client.console.message.Message;
import net.caffeinemc.mods.sodium.client.console.message.MessageLevel;
import org.jspecify.annotations.NonNull;

public class Console
implements ConsoleSink {
    public static final Console INSTANCE = new Console();
    private final ArrayDeque<Message> messages = new ArrayDeque();

    @Override
    public void logMessage(@NonNull MessageLevel messageLevel, @NonNull String string, boolean bl, double d) {
        Objects.requireNonNull(messageLevel);
        Objects.requireNonNull(string);
        this.messages.addLast(new Message(messageLevel, string, bl, d));
    }

    public static ConsoleSink instance() {
        return INSTANCE;
    }

    public Deque<Message> getMessageDrain() {
        return this.messages;
    }
}

