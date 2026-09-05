/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.scheduler.Task
 *  com.viaversion.viaversion.api.scheduler.TaskStatus
 */
package com.viaversion.viaversion.scheduler;

import com.viaversion.viaversion.api.scheduler.Task;
import com.viaversion.viaversion.api.scheduler.TaskStatus;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public final class ScheduledTask
implements Task {
    private final ScheduledFuture<?> future;

    public ScheduledTask(ScheduledFuture<?> future) {
        this.future = future;
    }

    public TaskStatus status() {
        if (this.future.getDelay(TimeUnit.MILLISECONDS) > 0L) {
            return TaskStatus.SCHEDULED;
        }
        return this.future.isDone() ? TaskStatus.STOPPED : TaskStatus.RUNNING;
    }

    public void cancel() {
        this.future.cancel(false);
    }
}

