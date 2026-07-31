package fun.wonderful.client.ui.autobuy;

import lombok.Generated;

public class AutoBuyHelper {
    private Group group;

    public AutoBuyHelper(Group group) {
        this.group = group;
    }

    public static enum Group {
        RW("RW"),
        HW("HW"),
        FT("FT"),
        SP("SP");

        private final String server;

        @Generated
        private Group(String server) {
            this.server = server;
        }

        @Generated
        public String getServer() {
            return this.server;
        }
    }
}