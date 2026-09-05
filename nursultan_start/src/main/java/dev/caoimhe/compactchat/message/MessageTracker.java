/*
 * Decompiled with CFR 0.152.
 */
package dev.caoimhe.compactchat.message;

import dev.caoimhe.compactchat.config.Configuration;

public class MessageTracker {
    private int occurrences = 0;

    public void incrementOccurrences() {
        if (this.occurrences == Configuration.instance().maximumOccurrences) {
            return;
        }
        ++this.occurrences;
    }

    public int occurrences() {
        return this.occurrences;
    }
}

