/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09378
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.msgpack.core.MessageBufferPacker
 *  org.msgpack.core.MessageUnpacker
 *  org.msgpack.value.ArrayValue
 */
package Nursultan;

import Nursultan.class09378;
import Nursultan.class11488;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessageUnpacker;
import org.msgpack.value.ArrayValue;

public abstract class class11490<T>
extends class11488 {
    public static Object y_0;

    public abstract void L(T var1);

    private static void L() {
    }

    private static void M() {
        y_0 = null;
    }

    public class11490(String string, int n, class09378 class093782) {
        super(string, n, class093782);
    }

    static {
        class11490.L();
        class11490.y();
        class11490.M();
        y_0 = LogManager.getLogger(String.class);
    }

    public void y(T t, T t2) {
        this.y(t);
        this.L(t2);
    }

    public abstract void y(T var1);

    private static void y() {
    }

    @Override
    public void N(int n, MessageUnpacker messageUnpacker) throws IOException {
        Object object3;
        int n2 = messageUnpacker.unpackArrayHeader();
        HashMap<Object, Object> hashMap = new HashMap<Object, Object>(n2);
        for (int i = 0; i < n2; ++i) {
            try {
                object3 = messageUnpacker.unpackValue();
                T t = this.N(n, object3.asArrayValue());
                if (t == null) continue;
                hashMap.put(this.N(t), t);
                continue;
            }
            catch (Exception exception) {
                ((Logger)y_0).warn("Skipped corrupt record #{} in {}: {}", (Object)i, (Object)this.u(), (Object)exception.getMessage());
            }
        }
        List list = this.N();
        object3 = (Map)list.stream().collect(Collectors.toMap(this::N, object -> object, (object, object2) -> object2, () -> new HashMap(list.size())));
        list.stream().filter(object -> !hashMap.containsKey(this.N(object))).forEach(this::y);
        hashMap.forEach((arg_0, arg_1) -> this.N((Map)object3, arg_0, arg_1));
    }

    public abstract void N(MessageBufferPacker var1, T var2) throws IOException;

    @Override
    public void N(MessageBufferPacker messageBufferPacker) throws IOException {
        List<T> list = this.N();
        messageBufferPacker.packArrayHeader(list.size());
        for (T t : list) {
            this.N(messageBufferPacker, t);
        }
    }

    public abstract T N(int var1, ArrayValue var2) throws Exception;

    private /* synthetic */ void N(Map map, Object object, Object object2) {
        Object v = map.get(object);
        if (v == null) {
            this.L(object2);
        } else if (!this.N(v, object2)) {
            this.y(v, object2);
        }
    }

    public abstract Object N(T var1);

    public abstract boolean N(T var1, T var2);

    public abstract List<T> N();

    @Override
    public boolean d_() {
        return this.N().isEmpty();
    }
}

