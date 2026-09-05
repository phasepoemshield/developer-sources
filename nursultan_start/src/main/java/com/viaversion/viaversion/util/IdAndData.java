/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 */
package com.viaversion.viaversion.util;

import com.google.common.base.Preconditions;
import java.util.Objects;

public class IdAndData {
    private int id;
    private byte data;

    public void setId(int id) {
        this.id = id;
    }

    public void setData(int data) {
        this.data = (byte)data;
    }

    public static int toRawData(int id, int data) {
        return id << 4 | data & 0xF;
    }

    public static int toRawData(int id) {
        return id << 4;
    }

    public int toRawData() {
        return IdAndData.toRawData(this.id, this.data);
    }

    public IdAndData(int id) {
        this.id = id;
        this.data = (byte)-1;
    }

    public IdAndData(int id, int data) {
        Preconditions.checkArgument((data >= 0 && data <= 15 ? 1 : 0) != 0, (Object)("Data has to be between 0 and 15: (id: " + id + " data: " + data + ")"));
        this.id = id;
        this.data = (byte)data;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        IdAndData idAndData = (IdAndData)o;
        return this.id == idAndData.id && this.data == idAndData.data;
    }

    public String toString() {
        return "IdAndData{id=" + this.id + ", data=" + this.data + "}";
    }

    public int hashCode() {
        return Objects.hash(this.id, this.data);
    }

    public static int getId(int rawData) {
        return rawData >> 4;
    }

    public int getId() {
        return this.id;
    }

    public static int getData(int rawData) {
        return rawData & 0xF;
    }

    public byte getData() {
        return this.data;
    }

    public static int removeData(int data) {
        return data & 0xFFFFFFF0;
    }

    public static IdAndData fromRawData(int rawData) {
        return new IdAndData(rawData >> 4, rawData & 0xF);
    }

    public IdAndData withData(int data) {
        return new IdAndData(this.id, data);
    }
}

