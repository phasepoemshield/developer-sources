/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.impl.CommentsImpl
 */
package org.quiltmc.config.api.annotations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.quiltmc.config.api.metadata.Comments;
import org.quiltmc.config.api.metadata.MetadataType$Builder;
import org.quiltmc.config.impl.CommentsImpl;

public final class Comment$Builder
implements MetadataType$Builder {
    private final List comments;

    public Comment$Builder() {
        ArrayList arrayList;
        ArrayList arrayList2 = arrayList;
        arrayList = new ArrayList(0);
        v1.comments = arrayList2;
    }

    public void add(String ... stringArray) {
        for (String string : stringArray) {
            this.comments.addAll(Arrays.asList(string.split("\n")));
        }
    }

    @Override
    public Comments build() {
        return new CommentsImpl(this.comments);
    }
}

