/*
 * Decompiled with CFR 0.152.
 */
package net.irisshaders.iris.shaderpack.parsing;

import net.irisshaders.iris.shaderpack.parsing.CommentDirective$Type;

public class CommentDirective {
    private final CommentDirective$Type type;
    private final String directive;
    private final int location;

    CommentDirective(CommentDirective$Type commentDirective$Type, String string, int n) {
        this.type = commentDirective$Type;
        this.directive = string;
        this.location = n;
    }

    public int getLocation() {
        return this.location;
    }

    public CommentDirective$Type getType() {
        return this.type;
    }

    public String getDirective() {
        return this.directive;
    }
}

