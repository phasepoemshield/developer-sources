/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  minecraft.class02277
 *  minecraft.class03175
 *  minecraft.class05290
 *  minecraft.class06290
 *  minecraft.class07001
 *  minecraft.class07321
 *  minecraft.class07529
 *  minecraft.class07726
 *  minecraft.class07742
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.longs.Long2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.nio.file.Path;
import minecraft.class02277;
import minecraft.class03175;
import minecraft.class05290;
import minecraft.class06290;
import minecraft.class07001;
import minecraft.class07321;
import minecraft.class07357;
import minecraft.class07529;
import minecraft.class07726;
import minecraft.class07742;
import org.jspecify.annotations.Nullable;

public final class class07368
implements AutoCloseable {
    public static final String N = ".mca";
    private static final int y = 256;
    private final Long2ObjectLinkedOpenHashMap<class07357> L = new Long2ObjectLinkedOpenHashMap();
    private final class02277 u;
    private final Path i;
    private final boolean R;

    class07368(class02277 class022772, Path path, boolean bl) {
        this.i = path;
        this.R = bl;
        this.u = class022772;
    }

    @Override
    public void close() throws IOException {
        class05290 class052902 = new class05290();
        for (class07357 class073572 : this.L.values()) {
            try {
                class073572.close();
            }
            catch (IOException iOException) {
                class052902.N((Throwable)iOException);
            }
        }
        class052902.N();
    }

    public class02277 y() {
        return this.u;
    }

    private class07357 y(class07321 class073212) throws IOException {
        long l = class07321.u((int)class073212.Z(), (int)class073212.z());
        class07357 class073572 = (class07357)this.L.getAndMoveToFirst(l);
        if (class073572 != null) {
            return class073572;
        }
        if (this.L.size() >= 256) {
            ((class07357)this.L.removeLast()).close();
        }
        class06290.L((Path)this.i);
        Path path = this.i.resolve("r." + class073212.Z() + "." + class073212.z() + N);
        class07357 class073573 = new class07357(this.u, path, this.i, this.R);
        this.L.putAndMoveToFirst(l, (Object)class073573);
        return class073573;
    }

    protected void N(class07321 class073212, @Nullable class07001 class070012) throws IOException {
        if (class07529.D) {
            return;
        }
        class07357 class073572 = this.y(class073212);
        if (class070012 == null) {
            class073572.u(class073212);
        } else {
            try (DataOutputStream dataOutputStream = class073572.L(class073212);){
                class07742.N((class07001)class070012, (DataOutput)dataOutputStream);
            }
        }
    }

    public void N() throws IOException {
        ObjectIterator var1 = this.L.values().iterator();
        while (var1.hasNext()) {
            ((class07357)var1.next()).y();
        }
    }

    public void N(class07321 class073212, class03175 class031752) throws IOException {
        try (DataInputStream dataInputStream = this.y(class073212).N(class073212);){
            if (dataInputStream != null) {
                class07742.N_81((DataInput)dataInputStream, (class03175)class031752, (class07726)class07726.L());
            }
        }
    }

    public @Nullable class07001 N(class07321 class073212) throws IOException {
        try (DataInputStream dataInputStream = this.y(class073212).N(class073212);){
            if (dataInputStream == null) {
                class07001 class070012 = null;
                return class070012;
            }
            class07001 class070013 = class07742.N((DataInput)dataInputStream);
            return class070013;
        }
    }
}

