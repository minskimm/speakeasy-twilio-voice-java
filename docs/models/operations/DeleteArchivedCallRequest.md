# DeleteArchivedCallRequest


## Fields

| Field                                                                             | Type                                                                              | Required                                                                          | Description                                                                       |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------- |
| `date`                                                                            | [LocalDate](https://docs.oracle.com/javase/8/docs/api/java/time/LocalDate.html)   | :heavy_check_mark:                                                                | The date of the Call in UTC.                                                      |
| `sid`                                                                             | *String*                                                                          | :heavy_check_mark:                                                                | The Twilio-provided Call SID that uniquely identifies the Call resource to delete |