package ru.metaculture.protection;

public record VnUNuvv(String text, boolean training, boolean loadingModel, long queuedRecords, long writtenRecords, long droppedRecords, long updatedAtMs) {
   public static VnUNuvv idle() {
      return new VnUNuvv("AI idle", false, false, 0L, 0L, 0L, System.currentTimeMillis());
   }
}
