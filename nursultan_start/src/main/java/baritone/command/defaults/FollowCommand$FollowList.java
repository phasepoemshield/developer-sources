/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  baritone.api.command.datatypes.EntityClassById
 *  baritone.api.command.datatypes.IDatatypeFor
 *  baritone.api.command.datatypes.NearbyPlayer
 */
package baritone.command.defaults;

import baritone.api.command.datatypes.EntityClassById;
import baritone.api.command.datatypes.IDatatypeFor;
import baritone.api.command.datatypes.NearbyPlayer;

enum FollowCommand$FollowList {
    ENTITY((IDatatypeFor)EntityClassById.INSTANCE),
    PLAYER((IDatatypeFor)NearbyPlayer.INSTANCE);

    final IDatatypeFor datatype;

    private FollowCommand$FollowList(IDatatypeFor iDatatypeFor) {
        this.datatype = iDatatypeFor;
    }
}

