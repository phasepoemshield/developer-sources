/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMap
 *  it.unimi.dsi.fastutil.objects.Object2ObjectMaps
 */
package net.irisshaders.iris.shaderpack.option;

import it.unimi.dsi.fastutil.objects.Object2ObjectLinkedOpenHashMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectMaps;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.Enumeration;
import java.util.Map;
import java.util.Properties;
import java.util.function.BiConsumer;

public class OrderBackedProperties
extends Properties {
    private final transient Map<Object, Object> backing = Object2ObjectMaps.synchronize((Object2ObjectMap)new Object2ObjectLinkedOpenHashMap());

    @Override
    public synchronized Object put(Object object, Object object2) {
        this.backing.put(object, object2);
        return super.put(object, object2);
    }

    @Override
    public void store(OutputStream outputStream, String string) throws IOException {
        this.customStore0(new BufferedWriter(new OutputStreamWriter(outputStream, StandardCharsets.ISO_8859_1)), string, true);
    }

    @Override
    public void store(Writer writer, String string) throws IOException {
        this.customStore0(new BufferedWriter(writer), string, true);
    }

    @Override
    public synchronized void forEach(BiConsumer<? super Object, ? super Object> biConsumer) {
        this.backing.forEach(biConsumer);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void customStore0(BufferedWriter bufferedWriter, String string, boolean bl) throws IOException {
        bufferedWriter.write("#" + String.valueOf(new Date()));
        bufferedWriter.newLine();
        OrderBackedProperties orderBackedProperties = this;
        synchronized (orderBackedProperties) {
            Enumeration<Object> enumeration = this.keys();
            while (enumeration.hasMoreElements()) {
                String string2 = (String)enumeration.nextElement();
                String string3 = (String)this.get(string2);
                bufferedWriter.write(string2 + "=" + string3);
                bufferedWriter.newLine();
            }
        }
        bufferedWriter.flush();
    }
}

