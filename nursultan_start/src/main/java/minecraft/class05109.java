/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  minecraft.class04970
 *  minecraft.class07536
 *  org.apache.commons.io.IOUtils
 */
package minecraft;

import com.google.common.collect.Lists;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import minecraft.class04970;
import minecraft.class05093;
import minecraft.class07536;
import org.apache.commons.io.IOUtils;

public class class05109 {
    private static long y() {
        return class07536.L();
    }

    public static List<class04970> N() {
        return class05109.N(class05093.values());
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static int N(String string) {
        int n = 700;
        long l = 0L;
        Socket socket = null;
        for (int i = 0; i < 5; ++i) {
            try {
                InetSocketAddress inetSocketAddress = new InetSocketAddress(string, 80);
                socket = new Socket();
                long l2 = class05109.y();
                socket.connect(inetSocketAddress, 700);
                l += class05109.y() - l2;
                IOUtils.closeQuietly((Socket)socket);
                continue;
            }
            catch (Exception exception) {
                l += 700L;
                continue;
            }
            finally {
                IOUtils.closeQuietly(socket);
            }
        }
        return (int)((double)l / 5.0);
    }

    public static List<class04970> N(class05093 ... class05093Array) {
        for (class05093 class050932 : class05093Array) {
            class05109.N(class050932.field_19574);
        }
        ArrayList arrayList = Lists.newArrayList();
        for (class05093 class050933 : class05093Array) {
            arrayList.add(new class04970(class050933.field_19573, class05109.N(class050933.field_19574)));
        }
        arrayList.sort(Comparator.comparingInt(class04970::y));
        return arrayList;
    }
}

