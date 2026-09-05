/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import minecraft.class05121;
import minecraft.class05134;

public class class05118
extends class05134<class05118> {
    private final String L;

    public class05118(String string, String string2, int n, int n2) {
        super(string, n, n2);
        this.L = string2;
    }

    @Override
    public class05118 i() {
        try {
            if (this.L != null) {
                this.N.setRequestProperty("Content-Type", "application/json; charset=utf-8");
            }
            this.N.setDoInput(true);
            this.N.setDoOutput(true);
            this.N.setUseCaches(false);
            this.N.setRequestMethod("POST");
            OutputStream outputStream = this.N.getOutputStream();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter(outputStream, StandardCharsets.UTF_8);
            outputStreamWriter.write(this.L);
            outputStreamWriter.close();
            outputStream.flush();
            return this;
        }
        catch (Exception exception) {
            throw new class05121(exception.getMessage(), exception);
        }
    }
}

