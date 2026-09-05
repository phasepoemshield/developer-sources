/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.scheduler.TaskStatus
 */
package com.viaversion.viaversion.api.scheduler;

import com.viaversion.viaversion.api.scheduler.TaskStatus;

public interface Task {
    public TaskStatus status();

    public void cancel();
}

