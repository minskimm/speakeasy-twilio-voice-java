/* 
 * Code generated by Speakeasy (https://speakeasy.com). DO NOT EDIT.
 */

package org.openapis.openapi.models.operations;

import java.lang.Exception;
import java.lang.Long;
import java.lang.String;
import java.time.LocalDate;
import java.util.Optional;

public class SDKMethodInterfaces {


    public interface MethodCallDeleteArchivedCall {
        DeleteArchivedCallResponse deleteArchivedCall(
            LocalDate date,
            String sid,
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallCreateByocTrunk {
        CreateByocTrunkResponse createByocTrunk(
            Optional<? extends CreateByocTrunkCreateByocTrunkRequest> request,
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallListByocTrunk {
        ListByocTrunkResponse listByocTrunk(
            Optional<Long> pageSize,
            Optional<Long> page,
            Optional<String> pageToken,
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallFetchByocTrunk {
        FetchByocTrunkResponse fetchByocTrunk(
            String sid,
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallUpdateByocTrunk {
        UpdateByocTrunkResponse updateByocTrunk(
            String sid,
            Optional<? extends UpdateByocTrunkUpdateByocTrunkRequest> requestBody,
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallDeleteByocTrunk {
        DeleteByocTrunkResponse deleteByocTrunk(
            String sid,
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallCreateConnectionPolicy {
        CreateConnectionPolicyResponse createConnectionPolicy(
            Optional<? extends CreateConnectionPolicyCreateConnectionPolicyRequest> request,
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallListConnectionPolicy {
        ListConnectionPolicyResponse listConnectionPolicy(
            Optional<Long> pageSize,
            Optional<Long> page,
            Optional<String> pageToken,
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallFetchConnectionPolicy {
        FetchConnectionPolicyResponse fetchConnectionPolicy(
            String sid,
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallUpdateConnectionPolicy {
        UpdateConnectionPolicyResponse updateConnectionPolicy(
            String sid,
            Optional<? extends UpdateConnectionPolicyUpdateConnectionPolicyRequest> requestBody,
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallDeleteConnectionPolicy {
        DeleteConnectionPolicyResponse deleteConnectionPolicy(
            String sid,
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallCreateConnectionPolicyTarget {
        CreateConnectionPolicyTargetResponse createConnectionPolicyTarget(
            String connectionPolicySid,
            Optional<? extends CreateConnectionPolicyTargetCreateConnectionPolicyTargetRequest> requestBody,
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallListConnectionPolicyTarget {
        ListConnectionPolicyTargetResponse listConnectionPolicyTarget(
            String connectionPolicySid,
            Optional<Long> pageSize,
            Optional<Long> page,
            Optional<String> pageToken,
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallFetchConnectionPolicyTarget {
        FetchConnectionPolicyTargetResponse fetchConnectionPolicyTarget(
            String connectionPolicySid,
            String sid,
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallUpdateConnectionPolicyTarget {
        UpdateConnectionPolicyTargetResponse updateConnectionPolicyTarget(
            String connectionPolicySid,
            String sid,
            Optional<? extends UpdateConnectionPolicyTargetUpdateConnectionPolicyTargetRequest> requestBody,
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallDeleteConnectionPolicyTarget {
        DeleteConnectionPolicyTargetResponse deleteConnectionPolicyTarget(
            String connectionPolicySid,
            String sid,
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallFetchDialingPermissionsCountry {
        FetchDialingPermissionsCountryResponse fetchDialingPermissionsCountry(
            String isoCode,
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallListDialingPermissionsCountry {
        ListDialingPermissionsCountryResponse listDialingPermissionsCountry(
            ListDialingPermissionsCountryRequest request,
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallCreateDialingPermissionsCountryBulkUpdate {
        CreateDialingPermissionsCountryBulkUpdateResponse createDialingPermissionsCountryBulkUpdate(
            Optional<? extends CreateDialingPermissionsCountryBulkUpdateCreateDialingPermissionsCountryBulkUpdateRequest> request,
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallListDialingPermissionsHrsPrefixes {
        ListDialingPermissionsHrsPrefixesResponse listDialingPermissionsHrsPrefixes(
            String isoCode,
            Optional<Long> pageSize,
            Optional<Long> page,
            Optional<String> pageToken,
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallFetchDialingPermissionsSettings {
        FetchDialingPermissionsSettingsResponse fetchDialingPermissionsSettings(
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallUpdateDialingPermissionsSettings {
        UpdateDialingPermissionsSettingsResponse updateDialingPermissionsSettings(
            Optional<? extends UpdateDialingPermissionsSettingsUpdateDialingPermissionsSettingsRequest> request,
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallCreateIpRecord {
        CreateIpRecordResponse createIpRecord(
            Optional<? extends CreateIpRecordCreateIpRecordRequest> request,
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallListIpRecord {
        ListIpRecordResponse listIpRecord(
            Optional<Long> pageSize,
            Optional<Long> page,
            Optional<String> pageToken,
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallFetchIpRecord {
        FetchIpRecordResponse fetchIpRecord(
            String sid,
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallUpdateIpRecord {
        UpdateIpRecordResponse updateIpRecord(
            String sid,
            Optional<? extends UpdateIpRecordUpdateIpRecordRequest> requestBody,
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallDeleteIpRecord {
        DeleteIpRecordResponse deleteIpRecord(
            String sid,
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallCreateSourceIpMapping {
        CreateSourceIpMappingResponse createSourceIpMapping(
            Optional<? extends CreateSourceIpMappingCreateSourceIpMappingRequest> request,
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallListSourceIpMapping {
        ListSourceIpMappingResponse listSourceIpMapping(
            Optional<Long> pageSize,
            Optional<Long> page,
            Optional<String> pageToken,
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallFetchSourceIpMapping {
        FetchSourceIpMappingResponse fetchSourceIpMapping(
            String sid,
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallUpdateSourceIpMapping {
        UpdateSourceIpMappingResponse updateSourceIpMapping(
            String sid,
            Optional<? extends UpdateSourceIpMappingUpdateSourceIpMappingRequest> requestBody,
            Optional<String> serverURL) throws Exception;
    }


    public interface MethodCallDeleteSourceIpMapping {
        DeleteSourceIpMappingResponse deleteSourceIpMapping(
            String sid,
            Optional<String> serverURL) throws Exception;
    }


}
