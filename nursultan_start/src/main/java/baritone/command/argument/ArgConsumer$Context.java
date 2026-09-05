/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.IBaritone
 *  baritone.api.command.datatypes.IDatatypeContext
 */
package baritone.command.argument;

import baritone.api.IBaritone;
import baritone.api.command.datatypes.IDatatypeContext;
import baritone.command.argument.ArgConsumer;

final class ArgConsumer$Context
implements IDatatypeContext {
    final /* synthetic */ ArgConsumer this$0;

    ArgConsumer$Context(ArgConsumer argConsumer) {
        this.this$0 = argConsumer;
    }

    public final IBaritone getBaritone() {
        return this.this$0.manager.getBaritone();
    }

    public final ArgConsumer getConsumer() {
        return this.this$0;
    }
}

