/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.quiltmc.config.api.metadata.Comments
 */
package org.quiltmc.config.impl;

import java.util.List;
import org.quiltmc.config.api.metadata.Comments;
import org.quiltmc.config.impl.StringIterator;

public final class CommentsImpl
extends StringIterator
implements Comments {
    public CommentsImpl(List list) {
        super(list);
    }
}

