/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00405
 *  minecraft.class01751
 *  minecraft.class04439
 *  minecraft.class05216
 *  minecraft.class05935
 *  minecraft.class05977
 */
package dev.caoimhe.compactchat.message.content;

import dev.caoimhe.compactchat.config.Configuration;
import java.util.Optional;
import minecraft.class00405;
import minecraft.class01751;
import minecraft.class04439;
import minecraft.class05216;
import minecraft.class05935;
import minecraft.class05977;

public class OccurrenceTextContent
implements class01751 {
    private final int occurrences;

    public static class05216 create(int n2) {
        return class05216.N((class04439)new OccurrenceTextContent(n2));
    }

    public OccurrenceTextContent(int n2) {
        this.occurrences = n2;
    }

    public String toString() {
        return "compactChatTextOccurrences{occurrences = " + this.occurrences + "}";
    }

    public String comp_737() {
        if (this.occurrences >= Configuration.instance().maximumOccurrences) {
            return " (" + Configuration.instance().maximumOccurrences + "+)";
        }
        return " (" + this.occurrences + ")";
    }

    public <T> Optional<T> method_27660(class05935<T> class059352, class00405 class004052) {
        return class059352.accept(class004052, this.comp_737());
    }

    public <T> Optional<T> method_27659(class05977<T> class059772) {
        return class059772.accept(this.comp_737());
    }
}

