/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class00405
 *  minecraft.class05216
 *  minecraft.class06390
 *  minecraft.class06541
 */
package dev.caoimhe.compactchat.message;

import dev.caoimhe.compactchat.config.Configuration;
import dev.caoimhe.compactchat.ext.IChatHudExt;
import dev.caoimhe.compactchat.message.MessageTracker;
import dev.caoimhe.compactchat.message.content.OccurrenceTextContent;
import dev.caoimhe.compactchat.util.TextUtil;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;
import minecraft.class00392;
import minecraft.class00405;
import minecraft.class05216;
import minecraft.class06390;
import minecraft.class06541;

public class MessageManager {
    private static final class00405 OCCURRENCE_TEXT_STYLE = class00405.N.N(class06541.field_1080);
    private final IChatHudExt chatHud;
    private final Map<String, MessageTracker> messages;
    private String previousMessage;

    public class00392 compactMessage(class00392 class003923) {
        class06390 class063902;
        String string2 = TextUtil.stripIgnoredComponents(class003923);
        MessageTracker messageTracker = (MessageTracker)this.messages.computeIfAbsent(string2, string -> new MessageTracker());
        boolean bl = this.shouldIgnore(class003923, string2);
        this.previousMessage = string2;
        if (bl) {
            if (messageTracker.occurrences() == 0) {
                messageTracker.incrementOccurrences();
            }
            return class003923;
        }
        messageTracker.incrementOccurrences();
        if (messageTracker.occurrences() <= 1) {
            return class003923;
        }
        class05216 class052162 = class003923.L();
        ListIterator<class06390> listIterator = this.chatHud.compactChat$getMessages().listIterator();
        while (listIterator.hasNext()) {
            class063902 = listIterator.next();
            class05216 class052163 = class063902.y().L();
            class052163.method_10855().removeIf(class003922 -> class003922.method_10851() instanceof OccurrenceTextContent);
            String string3 = TextUtil.stripIgnoredComponents((class00392)class052163);
            if (!string3.equals(string2)) continue;
            listIterator.remove();
            this.chatHud.compactChat$refreshMessages();
            break;
        }
        class063902 = OccurrenceTextContent.create(messageTracker.occurrences()).y(OCCURRENCE_TEXT_STYLE);
        return class052162.y((class00392)class063902);
    }

    public MessageManager(IChatHudExt iChatHudExt) {
        this.chatHud = iChatHudExt;
        this.messages = new HashMap<String, MessageTracker>();
        this.previousMessage = null;
    }

    public void clear() {
        this.messages.clear();
    }

    private boolean shouldIgnore(class00392 class003922, String string2) {
        if (class003922.getString().isBlank()) {
            return true;
        }
        if (Configuration.instance().onlyCompactConsecutiveMessages) {
            return !string2.equals(this.previousMessage);
        }
        if (Configuration.instance().ignoreCommonSeparators) {
            return Configuration.instance().commonSeparators.stream().filter(string -> !string.isBlank()).anyMatch(string2::contains);
        }
        return false;
    }
}

