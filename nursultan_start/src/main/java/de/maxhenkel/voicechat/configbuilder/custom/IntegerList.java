/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.configbuilder.custom;

import de.maxhenkel.voicechat.configbuilder.custom.AbstractValueList;
import java.util.List;

public class IntegerList
extends AbstractValueList<Integer> {
    protected IntegerList(Integer ... integerArray) {
        super(integerArray);
    }

    protected IntegerList(List<Integer> list) {
        super(list);
    }

    public static IntegerList of(List<Integer> list) {
        return new IntegerList(list);
    }

    public static IntegerList of(Integer ... integerArray) {
        return new IntegerList(integerArray);
    }
}

