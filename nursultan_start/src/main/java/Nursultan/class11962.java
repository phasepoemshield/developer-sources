/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import java.util.HashMap;
import java.util.Map;

public class class11962
extends Enum<class11962> {
    public Integer fields_0d10ceb8f958139b3b4549c17b2a44419_0;
    public boolean fields_0d10ceb8f958139b3b4549c17b2a44419_init;
    public static final /* enum */ class11962 REQUEST_LIST = new class11962(1);
    public static final /* enum */ class11962 REQUEST_CREATE = new class11962(2);
    public static final /* enum */ class11962 REQUEST_UPDATE = new class11962(3);
    public static final /* enum */ class11962 REQUEST_GET = new class11962(4);
    public static final /* enum */ class11962 REQUEST_DELETE = new class11962(5);
    public static final /* enum */ class11962 REQUEST_RENAME = new class11962(6);
    public static Map staticFields_0d10ceb8f958139b3b4549c17b2a44419_6;
    private static final /* synthetic */ class11962[] $VALUES;

    private class11962(int n2) {
        this.y();
        this.fields_0d10ceb8f958139b3b4549c17b2a44419_0 = n2;
    }

    static {
        $VALUES = class11962.R();
        staticFields_0d10ceb8f958139b3b4549c17b2a44419_6 = new HashMap();
        class11962[] class11962Array = class11962.values();
        staticFields_0d10ceb8f958139b3b4549c17b2a44419_6.put(Integer.valueOf(class11962Array[0].fields_0d10ceb8f958139b3b4549c17b2a44419_0), (Object)((Object)class11962Array[0]));
        staticFields_0d10ceb8f958139b3b4549c17b2a44419_6.put(Integer.valueOf(class11962Array[1].fields_0d10ceb8f958139b3b4549c17b2a44419_0), (Object)((Object)class11962Array[1]));
        staticFields_0d10ceb8f958139b3b4549c17b2a44419_6.put(Integer.valueOf(class11962Array[2].fields_0d10ceb8f958139b3b4549c17b2a44419_0), (Object)((Object)class11962Array[2]));
        staticFields_0d10ceb8f958139b3b4549c17b2a44419_6.put(Integer.valueOf(class11962Array[3].fields_0d10ceb8f958139b3b4549c17b2a44419_0), (Object)((Object)class11962Array[3]));
        staticFields_0d10ceb8f958139b3b4549c17b2a44419_6.put(Integer.valueOf(class11962Array[4].fields_0d10ceb8f958139b3b4549c17b2a44419_0), (Object)((Object)class11962Array[4]));
        staticFields_0d10ceb8f958139b3b4549c17b2a44419_6.put(Integer.valueOf(class11962Array[5].fields_0d10ceb8f958139b3b4549c17b2a44419_0), (Object)((Object)class11962Array[5]));
    }

    public static class11962[] values() {
        return (class11962[])$VALUES.clone();
    }

    public static class11962 valueOf(String string) {
        return Enum.valueOf(class11962.class, string);
    }

    private static void u() {
        REQUEST_LIST = null;
        REQUEST_CREATE = null;
        REQUEST_UPDATE = null;
        REQUEST_GET = null;
        REQUEST_DELETE = null;
        REQUEST_RENAME = null;
        staticFields_0d10ceb8f958139b3b4549c17b2a44419_6 = null;
        $VALUES = null;
    }

    private void y() {
        if (!this.fields_0d10ceb8f958139b3b4549c17b2a44419_init) {
            this.fields_0d10ceb8f958139b3b4549c17b2a44419_init = true;
            this.fields_0d10ceb8f958139b3b4549c17b2a44419_0 = 0;
        }
    }

    public static class11962 N(int n) {
        return (class11962)((Object)staticFields_0d10ceb8f958139b3b4549c17b2a44419_6.get(n));
    }

    public int N() {
        return this.fields_0d10ceb8f958139b3b4549c17b2a44419_0;
    }

    private static /* synthetic */ class11962[] R() {
        return new class11962[]{REQUEST_LIST, REQUEST_CREATE, REQUEST_UPDATE, REQUEST_GET, REQUEST_DELETE, REQUEST_RENAME};
    }
}

