/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  net.irisshaders.iris.shaderpack.option.menu.OptionMenuElement
 */
package net.irisshaders.iris.gui.element.widget;

import java.util.Optional;
import minecraft.class00392;
import net.irisshaders.iris.gui.element.widget.AbstractElementWidget;
import net.irisshaders.iris.shaderpack.option.menu.OptionMenuElement;

public abstract class CommentedElementWidget<T extends OptionMenuElement>
extends AbstractElementWidget<T> {
    public CommentedElementWidget(T t) {
        super(t);
    }

    public abstract Optional<class00392> getCommentBody();

    public abstract Optional<class00392> getCommentTitle();
}

