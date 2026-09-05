/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00405
 *  minecraft.class05936
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collectors;
import minecraft.class00405;
import minecraft.class05199;
import minecraft.class05204;
import minecraft.class05936;
import org.jspecify.annotations.Nullable;

class class05201 {
    final List<class05204> N;
    private String y;

    public class05201(List<class05204> list) {
        this.N = list;
        this.y = list.stream().map(class052042 -> class052042.N).collect(Collectors.joining());
    }

    public @Nullable class05936 N() {
        class05199 class051992 = new class05199();
        this.N.forEach(class051992::N);
        this.N.clear();
        return class051992.N();
    }

    public class05936 N(int n, int n2, class00405 class004052) {
        class05199 class051992 = new class05199();
        ListIterator<class05204> listIterator = this.N.listIterator();
        int n3 = n;
        boolean bl = false;
        while (listIterator.hasNext()) {
            String string;
            class05204 class052042 = listIterator.next();
            String string2 = class052042.N;
            int n4 = string2.length();
            if (!bl) {
                if (n3 > n4) {
                    class051992.N(class052042);
                    listIterator.remove();
                    n3 -= n4;
                } else {
                    string = string2.substring(0, n3);
                    if (!string.isEmpty()) {
                        class051992.N(class05936.N((String)string, (class00405)class052042.y));
                    }
                    n3 += n2;
                    bl = true;
                }
            }
            if (!bl) continue;
            if (n3 > n4) {
                listIterator.remove();
                n3 -= n4;
                continue;
            }
            string = string2.substring(n3);
            if (string.isEmpty()) {
                listIterator.remove();
                break;
            }
            listIterator.set(new class05204(string, class004052));
            break;
        }
        this.y = this.y.substring(n + n2);
        return class051992.y();
    }

    public char N(int n) {
        return this.y.charAt(n);
    }
}

