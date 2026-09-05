/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.configbuilder;

import java.util.ArrayList;
import java.util.List;

public class CommentedProperties$Property {
    private List<String> comments;
    private String value;

    static /* synthetic */ List access$102(CommentedProperties$Property commentedProperties$Property, List list) {
        commentedProperties$Property.comments = list;
        return commentedProperties$Property.comments;
    }

    static /* synthetic */ String access$000(CommentedProperties$Property commentedProperties$Property) {
        return commentedProperties$Property.value;
    }

    static /* synthetic */ List access$100(CommentedProperties$Property commentedProperties$Property) {
        return commentedProperties$Property.comments;
    }

    public CommentedProperties$Property(String string) {
        this(new ArrayList<String>(), string);
    }

    public CommentedProperties$Property(List<String> list, String string) {
        this.comments = list;
        this.value = string;
    }
}

