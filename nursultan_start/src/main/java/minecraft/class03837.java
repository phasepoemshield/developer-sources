/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.hash.HashCode
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import com.google.common.hash.HashCode;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import minecraft.class03802;
import minecraft.class03813;
import minecraft.class03814;
import minecraft.class03816;
import minecraft.class03819;
import minecraft.class03820;
import minecraft.class03824;
import minecraft.class03826;
import minecraft.class03834;
import minecraft.class03843;
import minecraft.class03845;
import minecraft.class03848;
import minecraft.class03849;
import org.jspecify.annotations.Nullable;

public class class03837 {
    private final class03813 L;
    final class03802 N;
    private final class03820 u;
    private final Runnable i;
    private class03826 R;
    final List<class03845> y = new ArrayList<class03845>();

    private @Nullable class03845 L(UUID uUID) {
        for (class03845 class038452 : this.y) {
            if (class038452.N() || !class038452.N.equals(uUID)) continue;
            return class038452;
        }
        return null;
    }

    public void L() {
        this.R = class03826.field_47648;
        for (class03845 class038452 : this.y) {
            if (class038452.B || class038452.N()) continue;
            this.N(class038452);
        }
        this.N();
    }

    private void M() {
        this.y.removeIf(class038452 -> {
            if (class038452.M != class03843.field_47639) {
                return false;
            }
            if (class038452.i != null) {
                class03824 class038242 = class038452.i.field_47657;
                if (class038242 != null) {
                    this.N.N(class038452.N, class038242);
                }
                return true;
            }
            return false;
        });
    }

    public class03837(class03813 class038132, class03802 class038022, class03820 class038202, Runnable runnable, class03826 class038262) {
        this.L = class038132;
        this.N = class038022;
        this.u = class038202;
        this.i = runnable;
        this.R = class038262;
    }

    private boolean B() {
        ArrayList<class03845> arrayList = new ArrayList<class03845>();
        boolean bl = false;
        for (class03845 object : this.y) {
            if (object.N() || !object.B) continue;
            if (object.R != class03819.field_47645) {
                bl = true;
            }
            if (object.R != class03819.field_47643) continue;
            object.R = class03819.field_47644;
            arrayList.add(object);
        }
        if (!arrayList.isEmpty()) {
            HashMap<UUID, class03848> hashMap = new HashMap<UUID, class03848>();
            for (class03845 class038452 : arrayList) {
                hashMap.put(class038452.N, new class03848(class038452.y, class038452.L));
            }
            this.L.N(hashMap, (class03814 class038142) -> this.N((Collection<class03845>)arrayList, (class03814)((Object)((Object)class038142))));
        }
        return bl;
    }

    private void Z() {
        boolean bl = false;
        ArrayList<class03845> arrayList = new ArrayList<class03845>();
        ArrayList<class03845> arrayList2 = new ArrayList<class03845>();
        for (class03845 class038452 : this.y) {
            boolean bl2;
            if (class038452.M == class03843.field_47640) {
                return;
            }
            boolean bl3 = bl2 = class038452.B && class038452.R == class03819.field_47645 && !class038452.N();
            if (bl2 && class038452.M == class03843.field_47639) {
                arrayList.add(class038452);
                bl = true;
            }
            if (class038452.M != class03843.field_47641) continue;
            if (!bl2) {
                bl = true;
                arrayList2.add(class038452);
                continue;
            }
            arrayList.add(class038452);
        }
        if (bl) {
            for (class03845 class038452 : arrayList) {
                if (class038452.M == class03843.field_47641) continue;
                class038452.M = class03843.field_47640;
            }
            for (class03845 class038452 : arrayList2) {
                class038452.M = class03843.field_47640;
            }
            this.u.scheduleReload(new class03816(this, arrayList, arrayList2));
        }
    }

    public void i() {
        this.R = class03826.field_47647;
    }

    public void u() {
        this.R = class03826.field_47649;
        for (class03845 class038452 : this.y) {
            if (class038452.B) continue;
            class038452.N(class03834.field_47653);
        }
        this.N();
    }

    private void y(UUID uUID) {
        for (class03845 class038452 : this.y) {
            if (!class038452.N.equals(uUID)) continue;
            class038452.N(class03834.field_47656);
        }
    }

    public void y() {
        Iterator<class03845> var1 = this.y.iterator();
        while (var1.hasNext()) {
            var1.next().N(class03834.field_47655);
        }
        this.N();
    }

    private void N(UUID uUID, class03845 class038452) {
        this.y(uUID);
        this.y.add(class038452);
        if (this.R == class03826.field_47648) {
            this.N(class038452);
        }
        this.N();
    }

    private void N(class03845 class038452) {
        this.N.N(class038452.N, class03849.field_47699);
        class038452.B = true;
    }

    private void N(Collection<class03845> collection, class03814 class038142) {
        if (!class038142.y().isEmpty()) {
            for (class03845 class038452 : this.y) {
                if (class038452.M == class03843.field_47641) continue;
                if (class038142.y().contains(class038452.N)) {
                    class038452.N(class03834.field_47651);
                    continue;
                }
                class038452.N(class03834.field_47654);
            }
        }
        for (class03845 class038452 : collection) {
            Path path = class038142.N().get(class038452.N);
            if (path == null) continue;
            class038452.R = class03819.field_47645;
            class038452.u = path;
            if (class038452.N()) continue;
            this.N.N(class038452.N, class03849.field_47700);
        }
        this.N();
    }

    public void N(UUID uUID, Path path) {
        URL uRL;
        if (this.R == class03826.field_47649) {
            this.N.N(uUID, class03824.field_47623);
            return;
        }
        try {
            uRL = path.toUri().toURL();
        }
        catch (MalformedURLException malformedURLException) {
            throw new IllegalStateException("Can't convert path to URL " + String.valueOf(path), malformedURLException);
        }
        class03845 class038452 = new class03845(uUID, uRL, null);
        class038452.R = class03819.field_47645;
        class038452.u = path;
        this.N(uUID, class038452);
    }

    public void N(UUID uUID) {
        class03845 class038452 = this.L(uUID);
        if (class038452 != null) {
            class038452.N(class03834.field_47655);
            this.N();
        }
    }

    public void N(UUID uUID, URL uRL, @Nullable HashCode hashCode) {
        if (this.R == class03826.field_47649) {
            this.N.N(uUID, class03824.field_47623);
            return;
        }
        this.N(uUID, new class03845(uUID, uRL, hashCode));
    }

    void N() {
        this.i.run();
    }

    public void R() {
        if (!this.B()) {
            this.Z();
        }
        this.M();
    }
}

