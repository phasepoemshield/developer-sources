/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

final class class05093
extends Enum<class05093> {
    public static final /* enum */ class05093 field_19565 = new class05093("us-east-1", "ec2.us-east-1.amazonaws.com");
    public static final /* enum */ class05093 field_19566 = new class05093("us-west-2", "ec2.us-west-2.amazonaws.com");
    public static final /* enum */ class05093 field_19567 = new class05093("us-west-1", "ec2.us-west-1.amazonaws.com");
    public static final /* enum */ class05093 field_19568 = new class05093("eu-west-1", "ec2.eu-west-1.amazonaws.com");
    public static final /* enum */ class05093 field_19569 = new class05093("ap-southeast-1", "ec2.ap-southeast-1.amazonaws.com");
    public static final /* enum */ class05093 field_19570 = new class05093("ap-southeast-2", "ec2.ap-southeast-2.amazonaws.com");
    public static final /* enum */ class05093 field_19571 = new class05093("ap-northeast-1", "ec2.ap-northeast-1.amazonaws.com");
    public static final /* enum */ class05093 field_19572 = new class05093("sa-east-1", "ec2.sa-east-1.amazonaws.com");
    final String field_19573;
    final String field_19574;
    private static final /* synthetic */ class05093[] field_19575;

    private class05093(String string2, String string3) {
        this.field_19573 = string2;
        this.field_19574 = string3;
    }

    static {
        field_19575 = class05093.N();
    }

    public static class05093[] values() {
        return (class05093[])field_19575.clone();
    }

    public static class05093 valueOf(String string) {
        return Enum.valueOf(class05093.class, string);
    }

    private static /* synthetic */ class05093[] N() {
        return new class05093[]{field_19565, field_19566, field_19567, field_19568, field_19569, field_19570, field_19571, field_19572};
    }
}

