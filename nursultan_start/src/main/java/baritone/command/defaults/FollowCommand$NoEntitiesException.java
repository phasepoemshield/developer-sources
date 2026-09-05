/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.command.exception.CommandErrorMessageException
 */
package baritone.command.defaults;

import baritone.api.command.exception.CommandErrorMessageException;

public class FollowCommand$NoEntitiesException
extends CommandErrorMessageException {
    protected FollowCommand$NoEntitiesException() {
        super("No valid entities in range!");
    }
}

