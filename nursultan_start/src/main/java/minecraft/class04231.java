/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04200
 *  minecraft.class04215
 */
package minecraft;

import java.io.IOException;
import java.nio.file.Files;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import minecraft.class04200;
import minecraft.class04215;
import minecraft.class04242;

public class class04231
implements Iterable<class04200> {
    private final List<class04200> N;

    public Set<class04215> L() {
        return this.N.stream().map(class04200::u).collect(Collectors.toSet());
    }

    class04231(List<class04200> list) {
        this.N = new ArrayList<class04200>(list);
    }

    @Override
    public Iterator<class04200> iterator() {
        return this.N.iterator();
    }

    public Stream<class04200> y() {
        return this.N.stream();
    }

    public class04231 N(LocalDate localDate, int n) {
        this.N.removeIf(class042002 -> {
            LocalDate localDate2 = class042002.u().N().plusDays(n);
            if (!localDate.isBefore(localDate2)) {
                try {
                    Files.delete(class042002.L());
                    return true;
                }
                catch (IOException iOException) {
                    class04242.N.warn("Failed to delete expired event log file: {}", (Object)class042002.L(), (Object)iOException);
                }
            }
            return false;
        });
        return this;
    }

    public class04231 N() {
        ListIterator<class04200> var1 = this.N.listIterator();
        while (var1.hasNext()) {
            class04200 class042002 = var1.next();
            try {
                var1.set((class04200)class042002.y());
            }
            catch (IOException iOException) {
                class04242.N.warn("Failed to compress event log file: {}", (Object)class042002.L(), (Object)iOException);
            }
        }
        return this;
    }
}

