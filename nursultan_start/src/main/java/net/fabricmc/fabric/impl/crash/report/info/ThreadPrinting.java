/*
 * Decompiled with CFR 0.152.
 */
package net.fabricmc.fabric.impl.crash.report.info;

import java.lang.management.LockInfo;
import java.lang.management.MonitorInfo;
import java.lang.management.ThreadInfo;
import net.fabricmc.fabric.impl.crash.report.info.ThreadPrinting$1;

public class ThreadPrinting {
    public static String fullThreadInfoToString(ThreadInfo threadInfo) {
        StringBuilder stringBuilder = new StringBuilder("\"" + threadInfo.getThreadName() + "\"" + (threadInfo.isDaemon() ? " daemon" : "") + " prio=" + threadInfo.getPriority() + " Id=" + threadInfo.getThreadId() + " " + String.valueOf((Object)threadInfo.getThreadState()));
        if (threadInfo.getLockName() != null) {
            stringBuilder.append(" on ").append(threadInfo.getLockName());
        }
        if (threadInfo.getLockOwnerName() != null) {
            stringBuilder.append(" owned by \"").append(threadInfo.getLockOwnerName()).append("\" Id=").append(threadInfo.getLockOwnerId());
        }
        if (threadInfo.isSuspended()) {
            stringBuilder.append(" (suspended)");
        }
        if (threadInfo.isInNative()) {
            stringBuilder.append(" (in native)");
        }
        stringBuilder.append('\n');
        StackTraceElement[] stackTraceElementArray = threadInfo.getStackTrace();
        for (int i = 0; i < stackTraceElementArray.length; ++i) {
            Object object;
            LockInfo[] lockInfoArray = stackTraceElementArray[i];
            stringBuilder.append("\tat ").append(lockInfoArray.toString());
            stringBuilder.append('\n');
            if (i == 0 && threadInfo.getLockInfo() != null) {
                object = threadInfo.getThreadState();
                switch (ThreadPrinting$1.$SwitchMap$java$lang$Thread$State[((Enum)object).ordinal()]) {
                    case 1: {
                        stringBuilder.append("\t-  blocked on ").append(threadInfo.getLockInfo());
                        stringBuilder.append('\n');
                        break;
                    }
                    case 2: 
                    case 3: {
                        stringBuilder.append("\t-  waiting on ").append(threadInfo.getLockInfo());
                        stringBuilder.append('\n');
                        break;
                    }
                }
            }
            object = threadInfo.getLockedMonitors();
            int n = ((MonitorInfo[])object).length;
            for (int j = 0; j < n; ++j) {
                Object object2 = object[j];
                if (((MonitorInfo)object2).getLockedStackDepth() != i) continue;
                stringBuilder.append("\t-  locked ").append(object2);
                stringBuilder.append('\n');
            }
        }
        LockInfo[] lockInfoArray = threadInfo.getLockedSynchronizers();
        if (lockInfoArray.length > 0) {
            stringBuilder.append("\n\tNumber of locked synchronizers = ").append(lockInfoArray.length);
            stringBuilder.append('\n');
            for (LockInfo lockInfo : lockInfoArray) {
                stringBuilder.append("\t- ").append(lockInfo);
                stringBuilder.append('\n');
            }
        }
        stringBuilder.append('\n');
        return stringBuilder.toString();
    }
}

