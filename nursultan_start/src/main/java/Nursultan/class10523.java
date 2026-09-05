/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05623
 */
package Nursultan;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import minecraft.class05623;

public class class10523
extends Thread {
    final /* synthetic */ class05623 N;

    public class10523(class05623 class056232, String string) {
        this.N = class056232;
        super(string);
    }

    @Override
    public void run() {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in, StandardCharsets.UTF_8));
        try {
            String string;
            while (!this.N.NX() && this.N.Nj() && (string = bufferedReader.readLine()) != null) {
                this.N.N(string, this.N.yu());
            }
        }
        catch (IOException iOException) {
            class05623.N.error("Exception handling console input", (Throwable)iOException);
        }
    }
}

