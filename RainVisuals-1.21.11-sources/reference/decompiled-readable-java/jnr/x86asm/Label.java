/*
 * Decompiled with CFR 0.152.
 */
package jnr.x86asm;

import java.util.LinkedList;
import java.util.List;
import jnr.x86asm.LABEL_STATE;
import jnr.x86asm.LinkData;
import jnr.x86asm.Operand;

public final class Label
extends Operand {
    final List<LinkData> links = new LinkedList<LinkData>();
    int position;
    LABEL_STATE state;
    final int id;

    final boolean isBound() {
        return this.state == LABEL_STATE.LABEL_STATE_BOUND;
    }

    public Label(int id) {
        super(4, 4);
        this.id = id;
        this.state = LABEL_STATE.LABEL_STATE_UNUSED;
        this.position = -1;
    }

    final boolean isLinked() {
        return this.state == LABEL_STATE.LABEL_STATE_LINKED;
    }

    final boolean isUnused() {
        return this.state == LABEL_STATE.LABEL_STATE_UNUSED;
    }

    final int position() {
        return this.position;
    }

    final void link(LinkData link) {
        this.links.add(link);
        this.state = LABEL_STATE.LABEL_STATE_LINKED;
    }

    public Label() {
        this(0);
    }
}

