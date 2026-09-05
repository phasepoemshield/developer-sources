/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  fun.crashsystem.jdrpc.libs.org.apache.commons.lang3.ArrayUtils
 */
package fun.crashsystem.jdrpc.libs.org.apache.commons.lang3.text.translate;

import fun.crashsystem.jdrpc.libs.org.apache.commons.lang3.ArrayUtils;
import fun.crashsystem.jdrpc.libs.org.apache.commons.lang3.text.translate.CharSequenceTranslator;
import java.io.IOException;
import java.io.Writer;

@Deprecated
public class AggregateTranslator
extends CharSequenceTranslator {
    private final CharSequenceTranslator[] translators;

    public AggregateTranslator(CharSequenceTranslator ... translators) {
        this.translators = (CharSequenceTranslator[])ArrayUtils.clone((Object[])translators);
    }

    @Override
    public int translate(CharSequence input, int index, Writer out) throws IOException {
        for (CharSequenceTranslator translator : this.translators) {
            int consumed = translator.translate(input, index, out);
            if (consumed == 0) continue;
            return consumed;
        }
        return 0;
    }
}

