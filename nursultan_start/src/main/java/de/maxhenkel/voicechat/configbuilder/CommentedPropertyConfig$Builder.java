/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 */
package de.maxhenkel.voicechat.configbuilder;

import de.maxhenkel.voicechat.configbuilder.CommentedProperties;
import de.maxhenkel.voicechat.configbuilder.CommentedPropertyConfig;
import de.maxhenkel.voicechat.configbuilder.CommentedPropertyConfig$1;
import java.nio.file.Path;
import javax.annotation.Nullable;

public class CommentedPropertyConfig$Builder {
    @Nullable
    private Path path;
    private boolean strict = true;

    public CommentedPropertyConfig$Builder strict(boolean bl) {
        this.strict = bl;
        return this;
    }

    /* synthetic */ CommentedPropertyConfig$Builder(CommentedPropertyConfig$1 commentedPropertyConfig$1) {
        this();
    }

    private CommentedPropertyConfig$Builder() {
    }

    public CommentedPropertyConfig$Builder path(Path path) {
        this.path = path;
        return this;
    }

    public CommentedPropertyConfig build() {
        CommentedPropertyConfig commentedPropertyConfig = new CommentedPropertyConfig(new CommentedProperties(this.strict));
        if (this.path != null) {
            commentedPropertyConfig.path = this.path.toAbsolutePath();
        }
        commentedPropertyConfig.reload();
        return commentedPropertyConfig;
    }
}

