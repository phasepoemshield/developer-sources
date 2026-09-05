/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class10460
 *  com.mojang.logging.LogUtils
 *  minecraft.class01894
 *  minecraft.class02253
 *  minecraft.class04594
 *  minecraft.class04681
 *  minecraft.class07536
 *  org.apache.commons.io.IOUtils
 *  org.slf4j.Logger
 */
package minecraft;

import Nursultan.class10460;
import com.mojang.logging.LogUtils;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.UncheckedIOException;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileAttribute;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class01894;
import minecraft.class02253;
import minecraft.class04530;
import minecraft.class04536;
import minecraft.class04542;
import minecraft.class04594;
import minecraft.class04681;
import minecraft.class07536;
import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;

public class class04524 {
    public static final Path N = Paths.get("debug/profiling", new String[0]);
    public static final String y = "metrics";
    public static final String L = "deviations";
    public static final String u = "profiling.txt";
    private static final Logger i = LogUtils.getLogger();
    private final String R;

    public class04524(String string) {
        this.R = string;
    }

    private void N(Set<class04530> set, Path path) {
        if (set.isEmpty()) {
            throw new IllegalArgumentException("Expected at least one sampler to persist");
        }
        set.stream().collect(Collectors.groupingBy(class04530::i)).forEach((class022532, list) -> this.N((class02253)class022532, (List<class04530>)list, path));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void N(class02253 class022532, List<class04530> list, Path path) {
        Path path2 = path.resolve(class07536.N_75((String)class022532.N(), class01894::y) + ".csv");
        BufferedWriter bufferedWriter = null;
        try {
            Files.createDirectories(path2.getParent(), new FileAttribute[0]);
            bufferedWriter = Files.newBufferedWriter(path2, StandardCharsets.UTF_8, new OpenOption[0]);
            class10460 class104602 = class04594.N();
            class104602.N("@tick");
            for (class04530 object2 : list) {
                class104602.N(object2.u());
            }
            class04594 class045942 = class104602.N((Writer)bufferedWriter);
            List list2 = list.stream().map(class04530::R).collect(Collectors.toList());
            int n = list2.stream().mapToInt(class04542::N).summaryStatistics().getMin();
            int n2 = list2.stream().mapToInt(class04542::y).summaryStatistics().getMax();
            for (int i = n; i <= n2; ++i) {
                int n3 = i;
                Stream<String> stream = list2.stream().map(class045422 -> String.valueOf(class045422.N(n3)));
                Object[] objectArray = Stream.concat(Stream.of(String.valueOf(i)), stream).toArray(String[]::new);
                class045942.N(objectArray);
            }
            i.info("Flushed metrics to {}", (Object)path2);
            IOUtils.closeQuietly((Writer)bufferedWriter);
        }
        catch (Exception exception) {
            i.error("Could not save profiler results to {}", (Object)path2, (Object)exception);
        }
        finally {
            IOUtils.closeQuietly(bufferedWriter);
        }
    }

    private void N(Map<class04530, List<class04536>> map, Path path) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd_HH.mm.ss.SSS", Locale.UK).withZone(ZoneId.systemDefault());
        map.forEach((class045302, list) -> list.forEach(class045362 -> {
            String string = dateTimeFormatter.format(class045362.N);
            Path path2 = path.resolve(class07536.N_75((String)class045302.u(), class01894::y)).resolve(String.format(Locale.ROOT, "%d@%s.txt", class045362.y, string));
            class045362.L.N(path2);
        }));
    }

    private void N(class04681 class046812, Path path) {
        class046812.N(path.resolve(u));
    }

    public Path N(Set<class04530> set, Map<class04530, List<class04536>> map, class04681 class046812) {
        try {
            Files.createDirectories(N, new FileAttribute[0]);
        }
        catch (IOException iOException) {
            throw new UncheckedIOException(iOException);
        }
        try {
            Path path = Files.createTempDirectory("minecraft-profiling", new FileAttribute[0]);
            path.toFile().deleteOnExit();
            Files.createDirectories(N, new FileAttribute[0]);
            Path path2 = path.resolve(this.R);
            Path path3 = path2.resolve(y);
            this.N(set, path3);
            if (!map.isEmpty()) {
                this.N(map, path2.resolve(L));
            }
            this.N(class046812, path2);
            return path;
        }
        catch (IOException iOException) {
            throw new UncheckedIOException(iOException);
        }
    }
}

