/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import java.util.HashMap;
import java.util.Map;

public class class09277
extends Enum<class09277> {
    public static Map staticFields_1d54b4a02dc4838eea56bc15fad4166ae_0;
    private static final /* synthetic */ class09277[] $VALUES;
    public Integer fields_0d54b4a02dc4838eea56bc15fad4166ae_0;
    public boolean fields_0d54b4a02dc4838eea56bc15fad4166ae_init;
    public static final /* enum */ class09277 LIST_RESPONSE;
    public static final /* enum */ class09277 CREATE_RESPONSE;
    public static final /* enum */ class09277 UPDATE_RESPONSE;
    public static final /* enum */ class09277 GET_RESPONSE;
    public static final /* enum */ class09277 DELETE_RESPONSE;
    public static final /* enum */ class09277 RENAME_RESPONSE;
    public static final /* enum */ class09277 NACK;

    private void L() {
        if (!this.fields_0d54b4a02dc4838eea56bc15fad4166ae_init) {
            this.fields_0d54b4a02dc4838eea56bc15fad4166ae_init = true;
            this.fields_0d54b4a02dc4838eea56bc15fad4166ae_0 = 0;
        }
    }

    private static /* synthetic */ class09277[] M() {
        return new class09277[]{LIST_RESPONSE, CREATE_RESPONSE, UPDATE_RESPONSE, GET_RESPONSE, DELETE_RESPONSE, RENAME_RESPONSE, NACK};
    }

    private class09277(int n2) {
        this.L();
        this.fields_0d54b4a02dc4838eea56bc15fad4166ae_0 = n2;
    }

    static {
        LIST_RESPONSE = new class09277(1);
        CREATE_RESPONSE = new class09277(2);
        UPDATE_RESPONSE = new class09277(3);
        GET_RESPONSE = new class09277(4);
        DELETE_RESPONSE = new class09277(5);
        RENAME_RESPONSE = new class09277(6);
        NACK = new class09277(7);
        $VALUES = class09277.M();
        staticFields_1d54b4a02dc4838eea56bc15fad4166ae_0 = new HashMap();
        class09277[] class09277Array = class09277.values();
        staticFields_1d54b4a02dc4838eea56bc15fad4166ae_0.put(Integer.valueOf(class09277Array[0].fields_0d54b4a02dc4838eea56bc15fad4166ae_0), (Object)((Object)class09277Array[0]));
        staticFields_1d54b4a02dc4838eea56bc15fad4166ae_0.put(Integer.valueOf(class09277Array[1].fields_0d54b4a02dc4838eea56bc15fad4166ae_0), (Object)((Object)class09277Array[1]));
        staticFields_1d54b4a02dc4838eea56bc15fad4166ae_0.put(Integer.valueOf(class09277Array[2].fields_0d54b4a02dc4838eea56bc15fad4166ae_0), (Object)((Object)class09277Array[2]));
        staticFields_1d54b4a02dc4838eea56bc15fad4166ae_0.put(Integer.valueOf(class09277Array[3].fields_0d54b4a02dc4838eea56bc15fad4166ae_0), (Object)((Object)class09277Array[3]));
        staticFields_1d54b4a02dc4838eea56bc15fad4166ae_0.put(Integer.valueOf(class09277Array[4].fields_0d54b4a02dc4838eea56bc15fad4166ae_0), (Object)((Object)class09277Array[4]));
        staticFields_1d54b4a02dc4838eea56bc15fad4166ae_0.put(Integer.valueOf(class09277Array[5].fields_0d54b4a02dc4838eea56bc15fad4166ae_0), (Object)((Object)class09277Array[5]));
        staticFields_1d54b4a02dc4838eea56bc15fad4166ae_0.put(Integer.valueOf(class09277Array[6].fields_0d54b4a02dc4838eea56bc15fad4166ae_0), (Object)((Object)class09277Array[6]));
    }

    public static class09277[] values() {
        return (class09277[])$VALUES.clone();
    }

    public static class09277 valueOf(String string) {
        return Enum.valueOf(class09277.class, string);
    }

    private static void u() {
        LIST_RESPONSE = null;
        CREATE_RESPONSE = null;
        UPDATE_RESPONSE = null;
        GET_RESPONSE = null;
        DELETE_RESPONSE = null;
        RENAME_RESPONSE = null;
        NACK = null;
        staticFields_1d54b4a02dc4838eea56bc15fad4166ae_0 = null;
        $VALUES = null;
    }

    public static class09277 N(int n) {
        return (class09277)((Object)staticFields_1d54b4a02dc4838eea56bc15fad4166ae_0.get(n));
    }

    public int N() {
        return this.fields_0d54b4a02dc4838eea56bc15fad4166ae_0;
    }
}

