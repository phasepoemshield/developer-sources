/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09193
 *  Nursultan.class09223
 *  Nursultan.class09785
 *  Nursultan.class11488
 *  Nursultan.class11730
 *  Nursultan.class11763
 *  Nursultan.class11769
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 *  org.joml.Vector2f
 *  org.msgpack.core.MessageBufferPacker
 *  org.msgpack.core.MessageUnpacker
 */
package Nursultan;

import Nursultan.class09193;
import Nursultan.class09223;
import Nursultan.class09785;
import Nursultan.class11488;
import Nursultan.class11730;
import Nursultan.class11763;
import Nursultan.class11769;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.joml.Vector2f;
import org.msgpack.core.MessageBufferPacker;
import org.msgpack.core.MessageUnpacker;

public class class11292
extends class11488 {
    public Object N_0;
    public Object N_1;
    public Object N_2;
    public Object N_3;
    public static Object y_0;

    public Vector2f L() {
        this.z();
        return (Vector2f)this.N_3;
    }

    public Vector2f L(String string) {
        this.z();
        return (Vector2f)((Map)this.N_0).get(string);
    }

    public Map<String, class11763> M() {
        this.z();
        return (Map)this.N_1;
    }

    private void P() {
        this.z();
        ((Map)this.N_0).clear();
        ((Map)this.N_1).clear();
        for (class11769 object : (List)class11730.N_7) {
            Vector2f vector2f = object.m();
            if (vector2f == null) continue;
            ((Map)this.N_0).put(object.E(), vector2f);
            ((Map)this.N_1).put(object.E(), object.L());
        }
        this.N_3 = class09193.y();
        ((Map)this.N_2).clear();
        for (Map.Entry entry : class09223.N().entrySet()) {
            ((Map)this.N_2).put((String)entry.getKey(), (Boolean)((class09785)entry.getValue()).L());
        }
    }

    public class11292(String string, int n) {
        super(string, n, null);
        this.z();
        this.N_0 = new HashMap();
        this.N_1 = new HashMap();
        this.N_2 = new HashMap();
    }

    static {
        class11292.U();
        y_0 = LogManager.getLogger(String.class);
    }

    public Map<String, Vector2f> B() {
        this.z();
        return (Map)this.N_0;
    }

    public Map<String, Boolean> Z() {
        this.z();
        return (Map)this.N_2;
    }

    private static void U() {
        y_0 = null;
    }

    private void z() {
    }

    public Vector2f y() {
        this.z();
        return (Vector2f)this.N_3;
    }

    public Boolean y(String string) {
        this.z();
        return (Boolean)((Map)this.N_2).get(string);
    }

    public class11763 N(String string) {
        this.z();
        return (class11763)((Map)this.N_1).get(string);
    }

    public void N(MessageBufferPacker messageBufferPacker) throws IOException {
        this.z();
        this.P();
        messageBufferPacker.packArrayHeader(3);
        messageBufferPacker.packMapHeader(((Map)this.N_0).size());
        for (Map.Entry entry : ((Map)this.N_0).entrySet()) {
            messageBufferPacker.packString((String)entry.getKey());
            class11763 class117632 = (class11763)((Map)this.N_1).get(entry.getKey());
            messageBufferPacker.packArrayHeader(3);
            messageBufferPacker.packFloat(((Vector2f)entry.getValue()).x);
            messageBufferPacker.packFloat(((Vector2f)entry.getValue()).y);
            messageBufferPacker.packInt(class117632 != null ? class117632.ordinal() : 0);
        }
        if ((Vector2f)this.N_3 == null) {
            messageBufferPacker.packNil();
        } else {
            messageBufferPacker.packArrayHeader(2);
            messageBufferPacker.packFloat(((Vector2f)this.N_3).x);
            messageBufferPacker.packFloat(((Vector2f)this.N_3).y);
        }
        messageBufferPacker.packMapHeader(((Map)this.N_2).size());
        for (Map.Entry entry : ((Map)this.N_2).entrySet()) {
            messageBufferPacker.packString((String)entry.getKey());
            messageBufferPacker.packBoolean(((Boolean)entry.getValue()).booleanValue());
        }
    }

    public void N(int n, MessageUnpacker messageUnpacker) throws IOException {
        int n2;
        this.z();
        messageUnpacker.unpackArrayHeader();
        ((Map)this.N_0).clear();
        ((Map)this.N_1).clear();
        int n3 = messageUnpacker.unpackMapHeader();
        for (n2 = 0; n2 < n3; ++n2) {
            try {
                String string = messageUnpacker.unpackString();
                int n4 = messageUnpacker.unpackArrayHeader();
                float f = messageUnpacker.unpackFloat();
                float f2 = messageUnpacker.unpackFloat();
                if (n4 > 2) {
                    int n5 = messageUnpacker.unpackInt();
                    class11763[] class11763Array = class11763.values();
                    if (n5 >= 0 && n5 < class11763Array.length) {
                        ((Map)this.N_1).put(string, class11763Array[n5]);
                    }
                    for (int i = 3; i < n4; ++i) {
                        messageUnpacker.skipValue();
                    }
                }
                ((Map)this.N_0).put(string, new Vector2f(f, f2));
                continue;
            }
            catch (Exception exception) {
                ((Logger)y_0).warn("Skipped corrupt hud position #{} in {}: {}", (Object)n2, (Object)this.u(), (Object)exception.getMessage());
            }
        }
        if (messageUnpacker.tryUnpackNil()) {
            this.N_3 = null;
        } else {
            messageUnpacker.unpackArrayHeader();
            float f = messageUnpacker.unpackFloat();
            float f3 = messageUnpacker.unpackFloat();
            this.N_3 = new Vector2f(f, f3);
        }
        ((Map)this.N_2).clear();
        n2 = messageUnpacker.unpackMapHeader();
        for (int i = 0; i < n2; ++i) {
            try {
                String string = messageUnpacker.unpackString();
                boolean bl = messageUnpacker.unpackBoolean();
                ((Map)this.N_2).put(string, bl);
                continue;
            }
            catch (Exception exception) {
                ((Logger)y_0).warn("Skipped corrupt subcategory flag #{} in {}: {}", (Object)i, (Object)this.u(), (Object)exception.getMessage());
            }
        }
    }

    public boolean d_() {
        this.z();
        return ((Map)this.N_0).isEmpty() && (Vector2f)this.N_3 == null && ((Map)this.N_2).isEmpty();
    }
}

