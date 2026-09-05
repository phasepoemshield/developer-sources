/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ObjectMap$Entry
 *  it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectIterator
 *  minecraft.class00500
 *  minecraft.class03448
 *  minecraft.class04453
 *  minecraft.class07209
 */
package minecraft;

import it.unimi.dsi.fastutil.longs.Long2ObjectMap;
import it.unimi.dsi.fastutil.longs.Long2ObjectOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectIterator;
import minecraft.class00500;
import minecraft.class01916;
import minecraft.class03448;
import minecraft.class04453;
import minecraft.class07209;

public class class01909
implements AutoCloseable {
    private final Long2ObjectOpenHashMap<class01916> field_37953 = new Long2ObjectOpenHashMap();
    private int field_37954;
    private boolean field_37955;

    @Override
    public void close() {
        this.field_37955 = false;
    }

    public boolean method_41940(class07209 class072092, class00500 class005002) {
        class01916 class019162 = (class01916)this.field_37953.get(class072092.method_10063());
        if (class019162 == null) {
            return false;
        }
        class019162.N(class005002);
        return true;
    }

    public void method_41938(int n, class03448 class034482) {
        ObjectIterator var3 = this.field_37953.long2ObjectEntrySet().iterator();
        while (var3.hasNext()) {
            Long2ObjectMap.Entry entry = (Long2ObjectMap.Entry)var3.next();
            class01916 class019162 = (class01916)entry.getValue();
            if (class019162.y > n) continue;
            class07209 class072092 = class07209.method_10092((long)entry.getLongKey());
            var3.remove();
            class034482.N(class072092, class019162.L, class019162.N);
        }
    }

    public void method_41941(class07209 class072092, class00500 class005002, class04453 class044532) {
        this.field_37953.compute(class072092.method_10063(), (l, class019162) -> {
            if (class019162 != null) {
                return class019162.N(this.field_37954);
            }
            return new class01916(this.field_37954, class005002, class044532.method_73189());
        });
    }

    public boolean method_41943() {
        return this.field_37955;
    }

    public int method_41942() {
        return this.field_37954;
    }

    public class01909 method_41937() {
        ++this.field_37954;
        this.field_37955 = true;
        return this;
    }
}

