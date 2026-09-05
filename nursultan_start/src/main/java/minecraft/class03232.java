/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.datafixers.util.Pair
 *  minecraft.class00323
 *  minecraft.class02299
 *  minecraft.class04326
 *  minecraft.class04335
 *  minecraft.class08175
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.mojang.datafixers.util.Pair;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.nio.file.Path;
import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import jdk.jfr.consumer.RecordedEvent;
import jdk.jfr.consumer.RecordingFile;
import minecraft.class00323;
import minecraft.class02299;
import minecraft.class03201;
import minecraft.class03203;
import minecraft.class03212;
import minecraft.class03217;
import minecraft.class03219;
import minecraft.class03224;
import minecraft.class03225;
import minecraft.class03226;
import minecraft.class03228;
import minecraft.class04326;
import minecraft.class04335;
import minecraft.class08175;
import org.jspecify.annotations.Nullable;

public class class03232 {
    private Instant N = Instant.EPOCH;
    private Instant y = Instant.EPOCH;
    private final List<class03201> L = new ArrayList<class03201>();
    private final List<class00323> u = new ArrayList<class00323>();
    private final List<class03226> i = new ArrayList<class03226>();
    private final Map<class04335, class03217> R = new HashMap<class04335, class03217>();
    private final Map<class04335, class03217> M = new HashMap<class04335, class03217>();
    private final Map<class02299, class03217> B = new HashMap<class02299, class03217>();
    private final Map<class02299, class03217> Z = new HashMap<class02299, class03217>();
    private final List<class03219> z = new ArrayList<class03219>();
    private final List<class03219> U = new ArrayList<class03219>();
    private int E;
    private Duration W = Duration.ZERO;
    private final List<class03225> m = new ArrayList<class03225>();
    private final List<class03203> P = new ArrayList<class03203>();
    private final List<class08175> s = new ArrayList<class08175>();
    private final List<class03228> T = new ArrayList<class03228>();
    private @Nullable Duration b = null;

    private class03232(Stream<RecordedEvent> stream) {
        this.N(stream);
    }

    private void y(RecordedEvent recordedEvent, int n, Map<class02299, class03217> map) {
        map.computeIfAbsent(class02299.N((RecordedEvent)recordedEvent), class022992 -> new class03217()).N(n);
    }

    private static <T> class04326<T> N(Duration duration, Map<T, class03217> map) {
        List list = map.entrySet().stream().map(entry -> Pair.of(entry.getKey(), (Object)((class03217)entry.getValue()).N())).toList();
        return new class04326(duration, list);
    }

    public static class03224 N(Path path) {
        class03224 class032242;
        RecordingFile recordingFile = new RecordingFile(path);
        try {
            class03212 class032122 = new class03212(recordingFile);
            Stream<RecordedEvent> stream = StreamSupport.stream(Spliterators.spliteratorUnknownSize(class032122, 1297), false);
            class032242 = new class03232(stream).N();
        }
        catch (Throwable throwable) {
            try {
                try {
                    recordingFile.close();
                }
                catch (Throwable throwable2) {
                    throwable.addSuppressed(throwable2);
                }
                throw throwable;
            }
            catch (IOException iOException) {
                throw new UncheckedIOException(iOException);
            }
        }
        recordingFile.close();
        return class032242;
    }

    private class03224 N() {
        Duration duration = Duration.between(this.N, this.y);
        return new class03224(this.N, this.y, duration, this.b, this.s, this.T, this.i, class03225.N(duration, this.m, this.W, this.E), class03203.N(this.P), class03232.N(duration, this.R), class03232.N(duration, this.M), class03232.N(duration, this.Z), class03232.N(duration, this.B), class03219.N(duration, this.z), class03219.N(duration, this.U), this.L, this.u);
    }

    private void N(Stream<RecordedEvent> stream) {
        stream.forEach(recordedEvent -> {
            if (recordedEvent.getEndTime().isAfter(this.y) || this.y.equals(Instant.EPOCH)) {
                this.y = recordedEvent.getEndTime();
            }
            if (recordedEvent.getStartTime().isBefore(this.N) || this.N.equals(Instant.EPOCH)) {
                this.N = recordedEvent.getStartTime();
            }
            switch (recordedEvent.getEventType().getName()) {
                case "minecraft.ChunkGeneration": {
                    this.L.add(class03201.N(recordedEvent));
                    break;
                }
                case "minecraft.StructureGeneration": {
                    this.u.add(class00323.N((RecordedEvent)recordedEvent));
                    break;
                }
                case "minecraft.LoadWorld": {
                    this.b = recordedEvent.getDuration();
                    break;
                }
                case "minecraft.ClientFps": {
                    this.s.add(class08175.N((RecordedEvent)recordedEvent, (String)"fps"));
                    break;
                }
                case "minecraft.ServerTickTime": {
                    this.T.add(class03228.N(recordedEvent));
                    break;
                }
                case "minecraft.PacketReceived": {
                    this.N((RecordedEvent)recordedEvent, recordedEvent.getInt("bytes"), this.R);
                    break;
                }
                case "minecraft.PacketSent": {
                    this.N((RecordedEvent)recordedEvent, recordedEvent.getInt("bytes"), this.M);
                    break;
                }
                case "minecraft.ChunkRegionRead": {
                    this.y((RecordedEvent)recordedEvent, recordedEvent.getInt("bytes"), this.B);
                    break;
                }
                case "minecraft.ChunkRegionWrite": {
                    this.y((RecordedEvent)recordedEvent, recordedEvent.getInt("bytes"), this.Z);
                    break;
                }
                case "jdk.ThreadAllocationStatistics": {
                    this.P.add(class03203.N(recordedEvent));
                    break;
                }
                case "jdk.GCHeapSummary": {
                    this.m.add(class03225.N(recordedEvent));
                    break;
                }
                case "jdk.CPULoad": {
                    this.i.add(class03226.N(recordedEvent));
                    break;
                }
                case "jdk.FileWrite": {
                    this.N((RecordedEvent)recordedEvent, this.z, "bytesWritten");
                    break;
                }
                case "jdk.FileRead": {
                    this.N((RecordedEvent)recordedEvent, this.U, "bytesRead");
                    break;
                }
                case "jdk.GarbageCollection": {
                    ++this.E;
                    this.W = this.W.plus(recordedEvent.getDuration());
                    break;
                }
            }
        });
    }

    private void N(RecordedEvent recordedEvent, int n, Map<class04335, class03217> map) {
        map.computeIfAbsent(class04335.N((RecordedEvent)recordedEvent), class043352 -> new class03217()).N(n);
    }

    private void N(RecordedEvent recordedEvent, List<class03219> list, String string) {
        list.add(new class03219(recordedEvent.getDuration(), recordedEvent.getString("path"), recordedEvent.getLong(string)));
    }
}

