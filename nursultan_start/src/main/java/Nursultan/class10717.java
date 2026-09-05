/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import java.util.Arrays;
import java.util.Collection;

public class class10717
extends Enum<class10717> {
    public static final /* enum */ class10717 SINGLE_WORD;
    public static final /* enum */ class10717 GREEDY_PHRASE;
    private static final /* synthetic */ class10717[] $VALUES;
    public Object fields_087762afe2ca3344abe8671e76bb865b2_0;

    private class10717(String ... stringArray) {
        this.B();
        this.fields_087762afe2ca3344abe8671e76bb865b2_0 = Arrays.asList(stringArray);
    }

    static {
        class10717.R();
        SINGLE_WORD = new class10717("word", "words_with_underscores");
        GREEDY_PHRASE = new class10717("word", "words with spaces", "\"and symbols\"");
        $VALUES = class10717.u();
    }

    public static class10717[] values() {
        return (class10717[])$VALUES.clone();
    }

    public static class10717 valueOf(String string) {
        return Enum.valueOf(class10717.class, string);
    }

    private void B() {
    }

    private static /* synthetic */ class10717[] u() {
        return new class10717[]{SINGLE_WORD, GREEDY_PHRASE};
    }

    public Collection<String> N() {
        return (Collection)this.fields_087762afe2ca3344abe8671e76bb865b2_0;
    }

    private static void R() {
    }
}

