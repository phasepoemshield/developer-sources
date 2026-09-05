/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import java.util.HashMap;
import java.util.Map;

public class class09259
extends Enum<class09259> {
    public Integer fields_011b43d235ff23c79a8f05a92e0b76308_0;
    public boolean fields_011b43d235ff23c79a8f05a92e0b76308_init;
    public static final /* enum */ class09259 LIST_RESPONSE = new class09259(1);
    public static final /* enum */ class09259 BLOB = new class09259(2);
    public static final /* enum */ class09259 ACK = new class09259(3);
    public static final /* enum */ class09259 NACK = new class09259(4);
    public static Map staticFields_011b43d235ff23c79a8f05a92e0b76308_4;
    private static final /* synthetic */ class09259[] $VALUES;

    private static /* synthetic */ class09259[] M() {
        return new class09259[]{LIST_RESPONSE, BLOB, ACK, NACK};
    }

    private class09259(int n2) {
        this.y();
        this.fields_011b43d235ff23c79a8f05a92e0b76308_0 = n2;
    }

    static {
        $VALUES = class09259.M();
        staticFields_011b43d235ff23c79a8f05a92e0b76308_4 = new HashMap();
        class09259[] class09259Array = class09259.values();
        staticFields_011b43d235ff23c79a8f05a92e0b76308_4.put(Integer.valueOf(class09259Array[0].fields_011b43d235ff23c79a8f05a92e0b76308_0), (Object)((Object)class09259Array[0]));
        staticFields_011b43d235ff23c79a8f05a92e0b76308_4.put(Integer.valueOf(class09259Array[1].fields_011b43d235ff23c79a8f05a92e0b76308_0), (Object)((Object)class09259Array[1]));
        staticFields_011b43d235ff23c79a8f05a92e0b76308_4.put(Integer.valueOf(class09259Array[2].fields_011b43d235ff23c79a8f05a92e0b76308_0), (Object)((Object)class09259Array[2]));
        staticFields_011b43d235ff23c79a8f05a92e0b76308_4.put(Integer.valueOf(class09259Array[3].fields_011b43d235ff23c79a8f05a92e0b76308_0), (Object)((Object)class09259Array[3]));
    }

    public static class09259[] values() {
        return (class09259[])$VALUES.clone();
    }

    public static class09259 valueOf(String string) {
        return Enum.valueOf(class09259.class, string);
    }

    private static void B() {
        LIST_RESPONSE = null;
        BLOB = null;
        ACK = null;
        NACK = null;
        staticFields_011b43d235ff23c79a8f05a92e0b76308_4 = null;
        $VALUES = null;
    }

    private void y() {
        if (!this.fields_011b43d235ff23c79a8f05a92e0b76308_init) {
            this.fields_011b43d235ff23c79a8f05a92e0b76308_init = true;
            this.fields_011b43d235ff23c79a8f05a92e0b76308_0 = 0;
        }
    }

    public static class09259 N(int n) {
        return (class09259)((Object)staticFields_011b43d235ff23c79a8f05a92e0b76308_4.get(n));
    }

    public int N() {
        return this.fields_011b43d235ff23c79a8f05a92e0b76308_0;
    }
}

