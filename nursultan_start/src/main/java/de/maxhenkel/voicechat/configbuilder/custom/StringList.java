/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.configbuilder.custom;

import de.maxhenkel.voicechat.configbuilder.custom.AbstractValueList;
import java.util.List;

public class StringList
extends AbstractValueList<String> {
    protected StringList(String ... stringArray) {
        super(stringArray);
    }

    protected StringList(List<String> list) {
        super(list);
    }

    public static StringList of(List<String> list) {
        return new StringList(list);
    }

    public static StringList of(String ... stringArray) {
        return new StringList(stringArray);
    }
}

