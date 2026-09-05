/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class03773
 *  net.fabricmc.fabric.api.transfer.v1.transaction.base.SnapshotParticipant
 */
package Nursultan;

import minecraft.class03773;
import net.fabricmc.fabric.api.transfer.v1.transaction.base.SnapshotParticipant;

public class class10236
extends SnapshotParticipant<Integer> {
    final /* synthetic */ class03773 N;

    public class10236(class03773 class037732) {
        this.N = class037732;
    }

    protected void readSnapshot(Integer n) {
        this.N.R = n;
    }

    protected Integer createSnapshot() {
        return this.N.R;
    }

    public void onFinalCommit() {
        this.N.N(this.N.R);
    }
}

