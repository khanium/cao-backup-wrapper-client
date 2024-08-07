package com.couchbase.v2.couchbasebackuprestorespec;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"int","str"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class End implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * Int references a relative backup by index.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("int")
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Int references a relative backup by index.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long _int;

    public Long get_int() {
        return _int;
    }

    public void set_int(Long _int) {
        this._int = _int;
    }

    /**
     * Str references an absolute backup by name.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("str")
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("Str references an absolute backup by name.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private String str;

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}

