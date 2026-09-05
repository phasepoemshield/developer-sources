/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Splitter
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.mojang.logging.LogUtils
 *  it.unimi.dsi.fastutil.objects.Object2LongMap
 *  minecraft.class02587
 *  minecraft.class05005
 *  minecraft.class05985
 *  minecraft.class07529
 *  org.apache.commons.io.IOUtils
 *  org.apache.commons.lang3.ObjectUtils
 *  org.slf4j.Logger
 */
package minecraft;

import com.google.common.base.Splitter;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.mojang.logging.LogUtils;
import it.unimi.dsi.fastutil.objects.Object2LongMap;
import java.io.BufferedWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TreeMap;
import minecraft.class02587;
import minecraft.class04642;
import minecraft.class04670;
import minecraft.class04681;
import minecraft.class05005;
import minecraft.class05985;
import minecraft.class07529;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.ObjectUtils;
import org.slf4j.Logger;

public class class04640
implements class04681 {
    private static final Logger N = LogUtils.getLogger();
    private static final class05985 L = new class04670();
    private static final Splitter u = Splitter.on((char)'\u001e');
    private static final Comparator<Map.Entry<String, class04642>> i = Map.Entry.comparingByValue(Comparator.comparingLong(class046422 -> class046422.y)).reversed();
    private final Map<String, ? extends class05985> R;
    private final long M;
    private final int B;
    private final long Z;
    private final int z;
    private final int U;

    @Override
    public long L() {
        return this.Z;
    }

    private class05985 L(String string) {
        class05985 class059852 = this.R.get(string);
        return class059852 != null ? class059852 : L;
    }

    public class04640(Map<String, ? extends class05985> map, long l, int n, long l2, int n2) {
        this.R = map;
        this.M = l;
        this.B = n;
        this.Z = l2;
        this.z = n2;
        this.U = n2 - n;
    }

    private Map<String, class04642> B() {
        TreeMap treeMap = Maps.newTreeMap();
        this.R.forEach((string, class059852) -> {
            Object2LongMap var3 = class059852.u();
            if (!var3.isEmpty()) {
                List var4 = u.splitToList((CharSequence)string);
                var3.forEach((string2, l) -> treeMap.computeIfAbsent(string2, string -> new class04642()).N(var4.iterator(), l));
            }
        });
        return treeMap;
    }

    @Override
    public String i() {
        StringBuilder stringBuilder = new StringBuilder();
        this.N(0, "root", stringBuilder);
        return stringBuilder.toString();
    }

    @Override
    public int u() {
        return this.z;
    }

    @Override
    public int y() {
        return this.B;
    }

    private static StringBuilder N(StringBuilder stringBuilder, int n) {
        stringBuilder.append(String.format(Locale.ROOT, "[%02d] ", n));
        for (int i = 0; i < n; ++i) {
            stringBuilder.append("|   ");
        }
        return stringBuilder;
    }

    @Override
    public long N() {
        return this.M;
    }

    protected String N(long l, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        class02587.y.N(stringBuilder, List.of());
        stringBuilder.append("Version: ").append(class07529.y().comp_4024()).append('\n');
        stringBuilder.append("Time span: ").append(l / 1000000L).append(" ms\n");
        stringBuilder.append("Tick span: ").append(n).append(" ticks\n");
        stringBuilder.append("// This is approximately ").append(String.format(Locale.ROOT, "%.2f", Float.valueOf((float)n / ((float)l / 1.0E9f)))).append(" ticks per second. It should be ").append(20).append(" ticks per second\n\n");
        stringBuilder.append("--- BEGIN PROFILE DUMP ---\n\n");
        this.N(0, "root", stringBuilder);
        stringBuilder.append("--- END PROFILE DUMP ---\n\n");
        Map<String, class04642> var5 = this.B();
        if (!var5.isEmpty()) {
            stringBuilder.append("--- BEGIN COUNTER DUMP ---\n\n");
            this.N(var5, stringBuilder, n);
            stringBuilder.append("--- END COUNTER DUMP ---\n\n");
        }
        return stringBuilder.toString();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public boolean N(Path path) {
        boolean bl;
        BufferedWriter bufferedWriter = null;
        try {
            Files.createDirectories(path.getParent(), new FileAttribute[0]);
            bufferedWriter = Files.newBufferedWriter(path, StandardCharsets.UTF_8, new OpenOption[0]);
            bufferedWriter.write(this.N(this.M(), this.R()));
            bl = true;
        }
        catch (Throwable throwable) {
            boolean bl2;
            try {
                N.error("Could not save profiler results to {}", (Object)path, (Object)throwable);
                bl2 = false;
            }
            catch (Throwable throwable2) {
                IOUtils.closeQuietly(bufferedWriter);
                throw throwable2;
            }
            IOUtils.closeQuietly((Writer)bufferedWriter);
            return bl2;
        }
        IOUtils.closeQuietly((Writer)bufferedWriter);
        return bl;
    }

    private static boolean N(String string, String string2) {
        return string2.length() > string.length() && string2.startsWith(string) && string2.indexOf(30, string.length() + 1) < 0;
    }

    @Override
    public List<class05005> N(String object) {
        String string = object;
        long l = this.L("root").N();
        class05985 class059852 = this.L((String)object);
        long l2 = class059852.N();
        long l3 = class059852.L();
        ArrayList arrayList = Lists.newArrayList();
        if (!((String)object).isEmpty()) {
            object = (String)object + "\u001e";
        }
        long l4 = 0L;
        for (String string2 : this.R.keySet()) {
            if (!class04640.N((String)object, string2)) continue;
            l4 += this.L(string2).N();
        }
        float f = l4;
        if (l4 < l2) {
            l4 = l2;
        }
        if (l < l4) {
            l = l4;
        }
        for (String string3 : this.R.keySet()) {
            if (!class04640.N((String)object, string3)) continue;
            class05985 class059853 = this.L(string3);
            long l5 = class059853.N();
            double d = (double)l5 * 100.0 / (double)l4;
            double d2 = (double)l5 * 100.0 / (double)l;
            String string4 = string3.substring(((String)object).length());
            arrayList.add(new class05005(string4, d, d2, class059853.L()));
        }
        if ((float)l4 > f) {
            arrayList.add(new class05005("unspecified", (double)((float)l4 - f) * 100.0 / (double)l4, (double)((float)l4 - f) * 100.0 / (double)l, l3));
        }
        Collections.sort(arrayList);
        arrayList.add(0, new class05005(string, 100.0, (double)l4 * 100.0 / (double)l, l3));
        return arrayList;
    }

    private void N(Map<String, class04642> map, StringBuilder stringBuilder, int n) {
        map.forEach((string, class046422) -> {
            stringBuilder.append("-- Counter: ").append((String)string).append(" --\n");
            this.N(0, "root", class046422.L.get("root"), n, stringBuilder);
            stringBuilder.append("\n\n");
        });
    }

    private void N(int n, String string, class04642 class046422, int n2, StringBuilder stringBuilder) {
        class04640.N(stringBuilder, n).append(string).append(" total:").append(class046422.N).append('/').append(class046422.y).append(" average: ").append(class046422.N / (long)n2).append('/').append(class046422.y / (long)n2).append('\n');
        class046422.L.entrySet().stream().sorted(i).forEach(entry -> this.N(n + 1, (String)entry.getKey(), (class04642)entry.getValue(), n2, stringBuilder));
    }

    private void N(int n, String string2, StringBuilder stringBuilder) {
        List<class05005> var4 = this.N(string2);
        ((class05985)ObjectUtils.firstNonNull((Object[])new class05985[]{this.R.get(string2), L})).u().forEach((string, l) -> class04640.N(stringBuilder, n).append('#').append((String)string).append(' ').append(l).append('/').append(l / (long)this.U).append('\n'));
        if (var4.size() < 3) {
            return;
        }
        for (int i = 1; i < var4.size(); ++i) {
            class05005 class050052 = var4.get(i);
            class04640.N(stringBuilder, n).append(class050052.u).append('(').append(class050052.L).append('/').append(String.format(Locale.ROOT, "%.0f", Float.valueOf((float)class050052.L / (float)this.U))).append(')').append(" - ").append(String.format(Locale.ROOT, "%.2f", class050052.N)).append("%/").append(String.format(Locale.ROOT, "%.2f", class050052.y)).append("%\n");
            if ("unspecified".equals(class050052.u)) continue;
            try {
                this.N(n + 1, string2 + "\u001e" + class050052.u, stringBuilder);
                continue;
            }
            catch (Exception exception) {
                stringBuilder.append("[[ EXCEPTION ").append(exception).append(" ]]");
            }
        }
    }

    @Override
    public int R() {
        return this.U;
    }
}

