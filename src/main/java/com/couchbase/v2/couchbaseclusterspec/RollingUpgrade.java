package com.couchbase.v2.couchbaseclusterspec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"maxUpgradable","maxUpgradablePercent"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class RollingUpgrade implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * MaxUpgradable allows the number of pods affected by an upgrade at any one time to be increased.  By default a rolling upgrade will upgrade one pod at a time.  This field allows that limit to be removed. This field must be greater than zero. The smallest of `maxUpgradable` and `maxUpgradablePercent` takes precedence if both are defined.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxUpgradable")
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("MaxUpgradable allows the number of pods affected by an upgrade at any one time to be increased.  By default a rolling upgrade will upgrade one pod at a time.  This field allows that limit to be removed. This field must be greater than zero. The smallest of `maxUpgradable` and `maxUpgradablePercent` takes precedence if both are defined.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long maxUpgradable;

    public Long getMaxUpgradable() {
        return maxUpgradable;
    }

    public void setMaxUpgradable(Long maxUpgradable) {
        this.maxUpgradable = maxUpgradable;
    }

    /**
     * MaxUpgradablePercent allows the number of pods affected by an upgrade at any one time to be increased.  By default a rolling upgrade will upgrade one pod at a time.  This field allows that limit to be removed. This field must be an integer percentage, e.g. "10%", in the range 1% to 100%. Percentages are relative to the total cluster size, and rounded down to the nearest whole number, with a minimum of 1.  For example, a 10 pod cluster, and 25% allowed to upgrade, would yield 2.5 pods per iteration, rounded down to 2. The smallest of `maxUpgradable` and `maxUpgradablePercent` takes precedence if both are defined.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("maxUpgradablePercent")
    @io.fabric8.generator.annotation.Pattern("^(100|[1-9][0-9]|[1-9])%$")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("MaxUpgradablePercent allows the number of pods affected by an upgrade at any one time to be increased.  By default a rolling upgrade will upgrade one pod at a time.  This field allows that limit to be removed. This field must be an integer percentage, e.g. \"10%\", in the range 1% to 100%. Percentages are relative to the total cluster size, and rounded down to the nearest whole number, with a minimum of 1.  For example, a 10 pod cluster, and 25% allowed to upgrade, would yield 2.5 pods per iteration, rounded down to 2. The smallest of `maxUpgradable` and `maxUpgradablePercent` takes precedence if both are defined.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String maxUpgradablePercent;

    public String getMaxUpgradablePercent() {
        return maxUpgradablePercent;
    }

    public void setMaxUpgradablePercent(String maxUpgradablePercent) {
        this.maxUpgradablePercent = maxUpgradablePercent;
    }
}

