/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  java.lang.Record
 *  java.lang.runtime.ObjectMethods
 *  minecraft.class00323
 *  minecraft.class00549
 *  minecraft.class02299
 *  minecraft.class04326
 *  minecraft.class04335
 *  minecraft.class08175
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.util.Pair;
import java.lang.invoke.MethodHandle;
import java.lang.runtime.ObjectMethods;
import java.time.Duration;
import java.time.Instant;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import minecraft.class00323;
import minecraft.class00549;
import minecraft.class02299;
import minecraft.class03201;
import minecraft.class03204;
import minecraft.class03205;
import minecraft.class03214;
import minecraft.class03226;
import minecraft.class03227;
import minecraft.class03228;
import minecraft.class03234;
import minecraft.class04326;
import minecraft.class04335;
import minecraft.class08175;
import org.jspecify.annotations.Nullable;

public final class class03224
extends Record {
    private final Instant recordingStarted;
    private final Instant recordingEnded;
    private final Duration recordingDuration;
    private final @Nullable Duration worldCreationDuration;
    private final List<class08175> fps;
    private final List<class03228> serverTickTimes;
    private final List<class03226> cpuLoadStats;
    private final class03214 heapSummary;
    private final class03204 threadAllocationSummary;
    private final class04326<class04335> receivedPacketsSummary;
    private final class04326<class04335> sentPacketsSummary;
    private final class04326<class02299> writtenChunks;
    private final class04326<class02299> readChunks;
    private final class03234 fileWrites;
    private final class03234 fileReads;
    private final List<class03201> chunkGenStats;
    private final List<class00323> structureGenStats;

    public Instant L() {
        return this.recordingStarted;
    }

    public List<class08175> M() {
        return this.fps;
    }

    public class04326<class02299> P() {
        return this.readChunks;
    }

    public class03234 T() {
        return this.fileReads;
    }

    public class03224(Instant instant, Instant instant2, Duration duration, @Nullable Duration duration2, List<class08175> list, List<class03228> list2, List<class03226> list3, class03214 class032142, class03204 class032042, class04326<class04335> class043262, class04326<class04335> class043263, class04326<class02299> class043264, class04326<class02299> class043265, class03234 class032342, class03234 class032343, List<class03201> list4, List<class00323> list5) {
        this.recordingStarted = instant;
        this.recordingEnded = instant2;
        this.recordingDuration = duration;
        this.worldCreationDuration = duration2;
        this.fps = list;
        this.serverTickTimes = list2;
        this.cpuLoadStats = list3;
        this.heapSummary = class032142;
        this.threadAllocationSummary = class032042;
        this.receivedPacketsSummary = class043262;
        this.sentPacketsSummary = class043263;
        this.writtenChunks = class043264;
        this.readChunks = class043265;
        this.fileWrites = class032342;
        this.fileReads = class032343;
        this.chunkGenStats = list4;
        this.structureGenStats = list5;
    }

    public final boolean equals(Object object) {
        return (boolean)ObjectMethods.bootstrap("equals", new MethodHandle[]{class03224.class, "recordingStarted;recordingEnded;recordingDuration;worldCreationDuration;fps;serverTickTimes;cpuLoadStats;heapSummary;threadAllocationSummary;receivedPacketsSummary;sentPacketsSummary;writtenChunks;readChunks;fileWrites;fileReads;chunkGenStats;structureGenStats", "recordingStarted", "recordingEnded", "recordingDuration", "worldCreationDuration", "fps", "serverTickTimes", "cpuLoadStats", "heapSummary", "threadAllocationSummary", "receivedPacketsSummary", "sentPacketsSummary", "writtenChunks", "readChunks", "fileWrites", "fileReads", "chunkGenStats", "structureGenStats"}, this, object);
    }

    public final String toString() {
        return ObjectMethods.bootstrap("toString", new MethodHandle[]{class03224.class, "recordingStarted;recordingEnded;recordingDuration;worldCreationDuration;fps;serverTickTimes;cpuLoadStats;heapSummary;threadAllocationSummary;receivedPacketsSummary;sentPacketsSummary;writtenChunks;readChunks;fileWrites;fileReads;chunkGenStats;structureGenStats", "recordingStarted", "recordingEnded", "recordingDuration", "worldCreationDuration", "fps", "serverTickTimes", "cpuLoadStats", "heapSummary", "threadAllocationSummary", "receivedPacketsSummary", "sentPacketsSummary", "writtenChunks", "readChunks", "fileWrites", "fileReads", "chunkGenStats", "structureGenStats"}, this);
    }

    public final int hashCode() {
        return (int)ObjectMethods.bootstrap("hashCode", new MethodHandle[]{class03224.class, "recordingStarted;recordingEnded;recordingDuration;worldCreationDuration;fps;serverTickTimes;cpuLoadStats;heapSummary;threadAllocationSummary;receivedPacketsSummary;sentPacketsSummary;writtenChunks;readChunks;fileWrites;fileReads;chunkGenStats;structureGenStats", "recordingStarted", "recordingEnded", "recordingDuration", "worldCreationDuration", "fps", "serverTickTimes", "cpuLoadStats", "heapSummary", "threadAllocationSummary", "receivedPacketsSummary", "sentPacketsSummary", "writtenChunks", "readChunks", "fileWrites", "fileReads", "chunkGenStats", "structureGenStats"}, this);
    }

    public List<class03228> B() {
        return this.serverTickTimes;
    }

    public List<class03226> Z() {
        return this.cpuLoadStats;
    }

    public Duration i() {
        return this.recordingDuration;
    }

    public List<class03201> b() {
        return this.chunkGenStats;
    }

    public class03234 s() {
        return this.fileWrites;
    }

    public class04326<class02299> m() {
        return this.writtenChunks;
    }

    public List<class00323> j() {
        return this.structureGenStats;
    }

    public class03204 U() {
        return this.threadAllocationSummary;
    }

    public class03214 z() {
        return this.heapSummary;
    }

    public Instant u() {
        return this.recordingEnded;
    }

    public String y() {
        return new class03227().N(this);
    }

    public class04326<class04335> E() {
        return this.receivedPacketsSummary;
    }

    public List<Pair<class00549, class03205<class03201>>> N() {
        return this.chunkGenStats.stream().collect(Collectors.groupingBy(class03201::u)).entrySet().stream().map(entry -> Pair.of((Object)((class00549)entry.getKey()), class03205.N((List)entry.getValue()))).filter(pair -> ((Optional)pair.getSecond()).isPresent()).map(pair -> Pair.of((Object)((class00549)pair.getFirst()), (Object)((Object)((class03205)((Object)((Object)((Optional)pair.getSecond()).get())))))).sorted(Comparator.comparing(pair -> ((class03205)((Object)((Object)pair.getSecond()))).R()).reversed()).toList();
    }

    public class04326<class04335> W() {
        return this.sentPacketsSummary;
    }

    public @Nullable Duration R() {
        return this.worldCreationDuration;
    }
}

