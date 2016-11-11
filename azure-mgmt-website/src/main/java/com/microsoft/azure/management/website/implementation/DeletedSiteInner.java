/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.website.implementation;

import org.joda.time.DateTime;
import java.util.List;
import com.microsoft.azure.management.website.UsageState;
import com.microsoft.azure.management.website.SiteAvailabilityState;
import com.microsoft.azure.management.website.HostNameSslState;
import com.microsoft.azure.management.website.HostingEnvironmentProfile;
import com.microsoft.azure.management.website.CloningInfo;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.rest.serializer.JsonFlatten;
import com.microsoft.azure.Resource;

/**
 * Reports deleted site including the timestamp of operation.
 */
@JsonFlatten
public class DeletedSiteInner extends Resource {
    /**
     * Time when the site was deleted.
     */
    @JsonProperty(value = "properties.deletedTimestamp")
    private DateTime deletedTimestamp;

    /**
     * State of the web app.
     */
    @JsonProperty(value = "properties.state")
    private String state;

    /**
     * Hostnames associated with web app.
     */
    @JsonProperty(value = "properties.hostNames")
    private List<String> hostNames;

    /**
     * Name of repository site.
     */
    @JsonProperty(value = "properties.repositorySiteName")
    private String repositorySiteName;

    /**
     * State indicating whether web app has exceeded its quota usage. Possible
     * values include: 'Normal', 'Exceeded'.
     */
    @JsonProperty(value = "properties.usageState")
    private UsageState usageState;

    /**
     * True if the site is enabled; otherwise, false. Setting this  value to
     * false disables the site (takes the site off line).
     */
    @JsonProperty(value = "properties.enabled")
    private Boolean enabled;

    /**
     * Hostnames for the web app that are enabled. Hostnames need to be
     * assigned and enabled. If some hostnames are assigned but not enabled
     * the app is not served on those hostnames.
     */
    @JsonProperty(value = "properties.enabledHostNames")
    private List<String> enabledHostNames;

    /**
     * Management information availability state for the web app. Possible
     * values are Normal or Limited.
     * Normal means that the site is running correctly and that
     * management information for the site is available.
     * Limited means that only partial management information for
     * the site is available and that detailed site information is
     * unavailable. Possible values include: 'Normal', 'Limited',
     * 'DisasterRecoveryMode'.
     */
    @JsonProperty(value = "properties.availabilityState")
    private SiteAvailabilityState availabilityState;

    /**
     * Hostname SSL states are  used to manage the SSL bindings for site's
     * hostnames.
     */
    @JsonProperty(value = "properties.hostNameSslStates")
    private List<HostNameSslState> hostNameSslStates;

    /**
     * The serverFarmId property.
     */
    @JsonProperty(value = "properties.serverFarmId")
    private String serverFarmId;

    /**
     * Reserved.
     */
    @JsonProperty(value = "properties.reserved")
    private Boolean reserved;

    /**
     * Last time web app was modified in UTC.
     */
    @JsonProperty(value = "properties.lastModifiedTimeUtc")
    private DateTime lastModifiedTimeUtc;

    /**
     * Configuration of web app.
     */
    @JsonProperty(value = "properties.siteConfig")
    private SiteConfigInner siteConfig;

    /**
     * Read-only list of Azure Traffic manager hostnames associated with web
     * app.
     */
    @JsonProperty(value = "properties.trafficManagerHostNames")
    private List<String> trafficManagerHostNames;

    /**
     * If set indicates whether web app is deployed as a premium app.
     */
    @JsonProperty(value = "properties.premiumAppDeployed")
    private Boolean premiumAppDeployed;

    /**
     * If set indicates whether to stop SCM (KUDU) site when the web app is
     * stopped. Default is false.
     */
    @JsonProperty(value = "properties.scmSiteAlsoStopped")
    private Boolean scmSiteAlsoStopped;

    /**
     * Read-only property that specifies which slot this app will swap into.
     */
    @JsonProperty(value = "properties.targetSwapSlot")
    private String targetSwapSlot;

    /**
     * Specification for the hosting environment (App Service Environment) to
     * use for the web app.
     */
    @JsonProperty(value = "properties.hostingEnvironmentProfile")
    private HostingEnvironmentProfile hostingEnvironmentProfile;

    /**
     * Micro services like WebSites, Logic Apps.
     */
    @JsonProperty(value = "properties.microService")
    private String microService;

    /**
     * Name of gateway app associated with web app.
     */
    @JsonProperty(value = "properties.gatewaySiteName")
    private String gatewaySiteName;

    /**
     * Specifies if the client affinity is enabled when load balancing http
     * request for multiple instances of the web app.
     */
    @JsonProperty(value = "properties.clientAffinityEnabled")
    private Boolean clientAffinityEnabled;

    /**
     * Specifies if the client certificate is enabled for the web app.
     */
    @JsonProperty(value = "properties.clientCertEnabled")
    private Boolean clientCertEnabled;

    /**
     * Specifies if the public hostnames are disabled the web app.
     * If set to true the app is only accessible via API
     * Management process.
     */
    @JsonProperty(value = "properties.hostNamesDisabled")
    private Boolean hostNamesDisabled;

    /**
     * List of comma separated IP addresses that this web app uses for
     * outbound connections. Those can be used when configuring firewall
     * rules for databases accessed by this web app.
     */
    @JsonProperty(value = "properties.outboundIpAddresses")
    private String outboundIpAddresses;

    /**
     * Size of a function container.
     */
    @JsonProperty(value = "properties.containerSize")
    private Integer containerSize;

    /**
     * Maximum allowed daily memory-time quota (applicable on dynamic sites
     * only).
     */
    @JsonProperty(value = "properties.dailyMemoryTimeQuota")
    private Integer dailyMemoryTimeQuota;

    /**
     * Site suspended till in case memory-time quota is exceeded.
     */
    @JsonProperty(value = "properties.suspendedTill")
    private DateTime suspendedTill;

    /**
     * Maximum number of workers
     * This only applies to function container.
     */
    @JsonProperty(value = "properties.maxNumberOfWorkers")
    private Integer maxNumberOfWorkers;

    /**
     * This is only valid for web app creation. If specified, web app is
     * cloned from
     * a source web app.
     */
    @JsonProperty(value = "properties.cloningInfo")
    private CloningInfo cloningInfo;

    /**
     * Resource group web app belongs to.
     */
    @JsonProperty(value = "properties.resourceGroup")
    private String resourceGroup;

    /**
     * Site is a default container.
     */
    @JsonProperty(value = "properties.isDefaultContainer")
    private Boolean isDefaultContainer;

    /**
     * Default hostname of the web app.
     */
    @JsonProperty(value = "properties.defaultHostName")
    private String defaultHostName;

    /**
     * Get the deletedTimestamp value.
     *
     * @return the deletedTimestamp value
     */
    public DateTime deletedTimestamp() {
        return this.deletedTimestamp;
    }

    /**
     * Set the deletedTimestamp value.
     *
     * @param deletedTimestamp the deletedTimestamp value to set
     * @return the DeletedSiteInner object itself.
     */
    public DeletedSiteInner withDeletedTimestamp(DateTime deletedTimestamp) {
        this.deletedTimestamp = deletedTimestamp;
        return this;
    }

    /**
     * Get the state value.
     *
     * @return the state value
     */
    public String state() {
        return this.state;
    }

    /**
     * Set the state value.
     *
     * @param state the state value to set
     * @return the DeletedSiteInner object itself.
     */
    public DeletedSiteInner withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * Get the hostNames value.
     *
     * @return the hostNames value
     */
    public List<String> hostNames() {
        return this.hostNames;
    }

    /**
     * Set the hostNames value.
     *
     * @param hostNames the hostNames value to set
     * @return the DeletedSiteInner object itself.
     */
    public DeletedSiteInner withHostNames(List<String> hostNames) {
        this.hostNames = hostNames;
        return this;
    }

    /**
     * Get the repositorySiteName value.
     *
     * @return the repositorySiteName value
     */
    public String repositorySiteName() {
        return this.repositorySiteName;
    }

    /**
     * Set the repositorySiteName value.
     *
     * @param repositorySiteName the repositorySiteName value to set
     * @return the DeletedSiteInner object itself.
     */
    public DeletedSiteInner withRepositorySiteName(String repositorySiteName) {
        this.repositorySiteName = repositorySiteName;
        return this;
    }

    /**
     * Get the usageState value.
     *
     * @return the usageState value
     */
    public UsageState usageState() {
        return this.usageState;
    }

    /**
     * Set the usageState value.
     *
     * @param usageState the usageState value to set
     * @return the DeletedSiteInner object itself.
     */
    public DeletedSiteInner withUsageState(UsageState usageState) {
        this.usageState = usageState;
        return this;
    }

    /**
     * Get the enabled value.
     *
     * @return the enabled value
     */
    public Boolean enabled() {
        return this.enabled;
    }

    /**
     * Set the enabled value.
     *
     * @param enabled the enabled value to set
     * @return the DeletedSiteInner object itself.
     */
    public DeletedSiteInner withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * Get the enabledHostNames value.
     *
     * @return the enabledHostNames value
     */
    public List<String> enabledHostNames() {
        return this.enabledHostNames;
    }

    /**
     * Set the enabledHostNames value.
     *
     * @param enabledHostNames the enabledHostNames value to set
     * @return the DeletedSiteInner object itself.
     */
    public DeletedSiteInner withEnabledHostNames(List<String> enabledHostNames) {
        this.enabledHostNames = enabledHostNames;
        return this;
    }

    /**
     * Get the availabilityState value.
     *
     * @return the availabilityState value
     */
    public SiteAvailabilityState availabilityState() {
        return this.availabilityState;
    }

    /**
     * Set the availabilityState value.
     *
     * @param availabilityState the availabilityState value to set
     * @return the DeletedSiteInner object itself.
     */
    public DeletedSiteInner withAvailabilityState(SiteAvailabilityState availabilityState) {
        this.availabilityState = availabilityState;
        return this;
    }

    /**
     * Get the hostNameSslStates value.
     *
     * @return the hostNameSslStates value
     */
    public List<HostNameSslState> hostNameSslStates() {
        return this.hostNameSslStates;
    }

    /**
     * Set the hostNameSslStates value.
     *
     * @param hostNameSslStates the hostNameSslStates value to set
     * @return the DeletedSiteInner object itself.
     */
    public DeletedSiteInner withHostNameSslStates(List<HostNameSslState> hostNameSslStates) {
        this.hostNameSslStates = hostNameSslStates;
        return this;
    }

    /**
     * Get the serverFarmId value.
     *
     * @return the serverFarmId value
     */
    public String serverFarmId() {
        return this.serverFarmId;
    }

    /**
     * Set the serverFarmId value.
     *
     * @param serverFarmId the serverFarmId value to set
     * @return the DeletedSiteInner object itself.
     */
    public DeletedSiteInner withServerFarmId(String serverFarmId) {
        this.serverFarmId = serverFarmId;
        return this;
    }

    /**
     * Get the reserved value.
     *
     * @return the reserved value
     */
    public Boolean reserved() {
        return this.reserved;
    }

    /**
     * Set the reserved value.
     *
     * @param reserved the reserved value to set
     * @return the DeletedSiteInner object itself.
     */
    public DeletedSiteInner withReserved(Boolean reserved) {
        this.reserved = reserved;
        return this;
    }

    /**
     * Get the lastModifiedTimeUtc value.
     *
     * @return the lastModifiedTimeUtc value
     */
    public DateTime lastModifiedTimeUtc() {
        return this.lastModifiedTimeUtc;
    }

    /**
     * Set the lastModifiedTimeUtc value.
     *
     * @param lastModifiedTimeUtc the lastModifiedTimeUtc value to set
     * @return the DeletedSiteInner object itself.
     */
    public DeletedSiteInner withLastModifiedTimeUtc(DateTime lastModifiedTimeUtc) {
        this.lastModifiedTimeUtc = lastModifiedTimeUtc;
        return this;
    }

    /**
     * Get the siteConfig value.
     *
     * @return the siteConfig value
     */
    public SiteConfigInner siteConfig() {
        return this.siteConfig;
    }

    /**
     * Set the siteConfig value.
     *
     * @param siteConfig the siteConfig value to set
     * @return the DeletedSiteInner object itself.
     */
    public DeletedSiteInner withSiteConfig(SiteConfigInner siteConfig) {
        this.siteConfig = siteConfig;
        return this;
    }

    /**
     * Get the trafficManagerHostNames value.
     *
     * @return the trafficManagerHostNames value
     */
    public List<String> trafficManagerHostNames() {
        return this.trafficManagerHostNames;
    }

    /**
     * Set the trafficManagerHostNames value.
     *
     * @param trafficManagerHostNames the trafficManagerHostNames value to set
     * @return the DeletedSiteInner object itself.
     */
    public DeletedSiteInner withTrafficManagerHostNames(List<String> trafficManagerHostNames) {
        this.trafficManagerHostNames = trafficManagerHostNames;
        return this;
    }

    /**
     * Get the premiumAppDeployed value.
     *
     * @return the premiumAppDeployed value
     */
    public Boolean premiumAppDeployed() {
        return this.premiumAppDeployed;
    }

    /**
     * Set the premiumAppDeployed value.
     *
     * @param premiumAppDeployed the premiumAppDeployed value to set
     * @return the DeletedSiteInner object itself.
     */
    public DeletedSiteInner withPremiumAppDeployed(Boolean premiumAppDeployed) {
        this.premiumAppDeployed = premiumAppDeployed;
        return this;
    }

    /**
     * Get the scmSiteAlsoStopped value.
     *
     * @return the scmSiteAlsoStopped value
     */
    public Boolean scmSiteAlsoStopped() {
        return this.scmSiteAlsoStopped;
    }

    /**
     * Set the scmSiteAlsoStopped value.
     *
     * @param scmSiteAlsoStopped the scmSiteAlsoStopped value to set
     * @return the DeletedSiteInner object itself.
     */
    public DeletedSiteInner withScmSiteAlsoStopped(Boolean scmSiteAlsoStopped) {
        this.scmSiteAlsoStopped = scmSiteAlsoStopped;
        return this;
    }

    /**
     * Get the targetSwapSlot value.
     *
     * @return the targetSwapSlot value
     */
    public String targetSwapSlot() {
        return this.targetSwapSlot;
    }

    /**
     * Set the targetSwapSlot value.
     *
     * @param targetSwapSlot the targetSwapSlot value to set
     * @return the DeletedSiteInner object itself.
     */
    public DeletedSiteInner withTargetSwapSlot(String targetSwapSlot) {
        this.targetSwapSlot = targetSwapSlot;
        return this;
    }

    /**
     * Get the hostingEnvironmentProfile value.
     *
     * @return the hostingEnvironmentProfile value
     */
    public HostingEnvironmentProfile hostingEnvironmentProfile() {
        return this.hostingEnvironmentProfile;
    }

    /**
     * Set the hostingEnvironmentProfile value.
     *
     * @param hostingEnvironmentProfile the hostingEnvironmentProfile value to set
     * @return the DeletedSiteInner object itself.
     */
    public DeletedSiteInner withHostingEnvironmentProfile(HostingEnvironmentProfile hostingEnvironmentProfile) {
        this.hostingEnvironmentProfile = hostingEnvironmentProfile;
        return this;
    }

    /**
     * Get the microService value.
     *
     * @return the microService value
     */
    public String microService() {
        return this.microService;
    }

    /**
     * Set the microService value.
     *
     * @param microService the microService value to set
     * @return the DeletedSiteInner object itself.
     */
    public DeletedSiteInner withMicroService(String microService) {
        this.microService = microService;
        return this;
    }

    /**
     * Get the gatewaySiteName value.
     *
     * @return the gatewaySiteName value
     */
    public String gatewaySiteName() {
        return this.gatewaySiteName;
    }

    /**
     * Set the gatewaySiteName value.
     *
     * @param gatewaySiteName the gatewaySiteName value to set
     * @return the DeletedSiteInner object itself.
     */
    public DeletedSiteInner withGatewaySiteName(String gatewaySiteName) {
        this.gatewaySiteName = gatewaySiteName;
        return this;
    }

    /**
     * Get the clientAffinityEnabled value.
     *
     * @return the clientAffinityEnabled value
     */
    public Boolean clientAffinityEnabled() {
        return this.clientAffinityEnabled;
    }

    /**
     * Set the clientAffinityEnabled value.
     *
     * @param clientAffinityEnabled the clientAffinityEnabled value to set
     * @return the DeletedSiteInner object itself.
     */
    public DeletedSiteInner withClientAffinityEnabled(Boolean clientAffinityEnabled) {
        this.clientAffinityEnabled = clientAffinityEnabled;
        return this;
    }

    /**
     * Get the clientCertEnabled value.
     *
     * @return the clientCertEnabled value
     */
    public Boolean clientCertEnabled() {
        return this.clientCertEnabled;
    }

    /**
     * Set the clientCertEnabled value.
     *
     * @param clientCertEnabled the clientCertEnabled value to set
     * @return the DeletedSiteInner object itself.
     */
    public DeletedSiteInner withClientCertEnabled(Boolean clientCertEnabled) {
        this.clientCertEnabled = clientCertEnabled;
        return this;
    }

    /**
     * Get the hostNamesDisabled value.
     *
     * @return the hostNamesDisabled value
     */
    public Boolean hostNamesDisabled() {
        return this.hostNamesDisabled;
    }

    /**
     * Set the hostNamesDisabled value.
     *
     * @param hostNamesDisabled the hostNamesDisabled value to set
     * @return the DeletedSiteInner object itself.
     */
    public DeletedSiteInner withHostNamesDisabled(Boolean hostNamesDisabled) {
        this.hostNamesDisabled = hostNamesDisabled;
        return this;
    }

    /**
     * Get the outboundIpAddresses value.
     *
     * @return the outboundIpAddresses value
     */
    public String outboundIpAddresses() {
        return this.outboundIpAddresses;
    }

    /**
     * Set the outboundIpAddresses value.
     *
     * @param outboundIpAddresses the outboundIpAddresses value to set
     * @return the DeletedSiteInner object itself.
     */
    public DeletedSiteInner withOutboundIpAddresses(String outboundIpAddresses) {
        this.outboundIpAddresses = outboundIpAddresses;
        return this;
    }

    /**
     * Get the containerSize value.
     *
     * @return the containerSize value
     */
    public Integer containerSize() {
        return this.containerSize;
    }

    /**
     * Set the containerSize value.
     *
     * @param containerSize the containerSize value to set
     * @return the DeletedSiteInner object itself.
     */
    public DeletedSiteInner withContainerSize(Integer containerSize) {
        this.containerSize = containerSize;
        return this;
    }

    /**
     * Get the dailyMemoryTimeQuota value.
     *
     * @return the dailyMemoryTimeQuota value
     */
    public Integer dailyMemoryTimeQuota() {
        return this.dailyMemoryTimeQuota;
    }

    /**
     * Set the dailyMemoryTimeQuota value.
     *
     * @param dailyMemoryTimeQuota the dailyMemoryTimeQuota value to set
     * @return the DeletedSiteInner object itself.
     */
    public DeletedSiteInner withDailyMemoryTimeQuota(Integer dailyMemoryTimeQuota) {
        this.dailyMemoryTimeQuota = dailyMemoryTimeQuota;
        return this;
    }

    /**
     * Get the suspendedTill value.
     *
     * @return the suspendedTill value
     */
    public DateTime suspendedTill() {
        return this.suspendedTill;
    }

    /**
     * Set the suspendedTill value.
     *
     * @param suspendedTill the suspendedTill value to set
     * @return the DeletedSiteInner object itself.
     */
    public DeletedSiteInner withSuspendedTill(DateTime suspendedTill) {
        this.suspendedTill = suspendedTill;
        return this;
    }

    /**
     * Get the maxNumberOfWorkers value.
     *
     * @return the maxNumberOfWorkers value
     */
    public Integer maxNumberOfWorkers() {
        return this.maxNumberOfWorkers;
    }

    /**
     * Set the maxNumberOfWorkers value.
     *
     * @param maxNumberOfWorkers the maxNumberOfWorkers value to set
     * @return the DeletedSiteInner object itself.
     */
    public DeletedSiteInner withMaxNumberOfWorkers(Integer maxNumberOfWorkers) {
        this.maxNumberOfWorkers = maxNumberOfWorkers;
        return this;
    }

    /**
     * Get the cloningInfo value.
     *
     * @return the cloningInfo value
     */
    public CloningInfo cloningInfo() {
        return this.cloningInfo;
    }

    /**
     * Set the cloningInfo value.
     *
     * @param cloningInfo the cloningInfo value to set
     * @return the DeletedSiteInner object itself.
     */
    public DeletedSiteInner withCloningInfo(CloningInfo cloningInfo) {
        this.cloningInfo = cloningInfo;
        return this;
    }

    /**
     * Get the resourceGroup value.
     *
     * @return the resourceGroup value
     */
    public String resourceGroup() {
        return this.resourceGroup;
    }

    /**
     * Set the resourceGroup value.
     *
     * @param resourceGroup the resourceGroup value to set
     * @return the DeletedSiteInner object itself.
     */
    public DeletedSiteInner withResourceGroup(String resourceGroup) {
        this.resourceGroup = resourceGroup;
        return this;
    }

    /**
     * Get the isDefaultContainer value.
     *
     * @return the isDefaultContainer value
     */
    public Boolean isDefaultContainer() {
        return this.isDefaultContainer;
    }

    /**
     * Set the isDefaultContainer value.
     *
     * @param isDefaultContainer the isDefaultContainer value to set
     * @return the DeletedSiteInner object itself.
     */
    public DeletedSiteInner withIsDefaultContainer(Boolean isDefaultContainer) {
        this.isDefaultContainer = isDefaultContainer;
        return this;
    }

    /**
     * Get the defaultHostName value.
     *
     * @return the defaultHostName value
     */
    public String defaultHostName() {
        return this.defaultHostName;
    }

    /**
     * Set the defaultHostName value.
     *
     * @param defaultHostName the defaultHostName value to set
     * @return the DeletedSiteInner object itself.
     */
    public DeletedSiteInner withDefaultHostName(String defaultHostName) {
        this.defaultHostName = defaultHostName;
        return this;
    }

}