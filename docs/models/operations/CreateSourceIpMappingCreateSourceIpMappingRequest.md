# CreateSourceIpMappingCreateSourceIpMappingRequest


## Fields

| Field                                                                                   | Type                                                                                    | Required                                                                                | Description                                                                             |
| --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| `ipRecordSid`                                                                           | *String*                                                                                | :heavy_check_mark:                                                                      | The Twilio-provided string that uniquely identifies the IP Record resource to map from. |
| `sipDomainSid`                                                                          | *String*                                                                                | :heavy_check_mark:                                                                      | The SID of the SIP Domain that the IP Record should be mapped to.                       |