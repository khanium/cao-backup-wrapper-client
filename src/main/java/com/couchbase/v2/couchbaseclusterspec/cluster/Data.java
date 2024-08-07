package com.couchbase.v2.couchbaseclusterspec.cluster;

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"auxIOThreads","nonIOThreads","readerThreads","writerThreads"})
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(using = com.fasterxml.jackson.databind.JsonDeserializer.None.class)
@javax.annotation.processing.Generated("io.fabric8.java.generator.CRGeneratorRunner")
public class Data implements io.fabric8.kubernetes.api.model.KubernetesResource {

    /**
     * AuxIOThreads allows the number of threads used by the data service, per pod, to be altered.  This indicates the number of threads that are to be used in the AuxIO thread pool to run auxiliary I/O tasks. This value must be between 1 and 64 threads and is only supported on CB versions 7.1.0+. and should only be increased where there are sufficient CPU resources allocated for their use. If not specified, this defaults to the default value set by Couchbase Server.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("auxIOThreads")
    @io.fabric8.generator.annotation.Max(64.0)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("AuxIOThreads allows the number of threads used by the data service, per pod, to be altered.  This indicates the number of threads that are to be used in the AuxIO thread pool to run auxiliary I/O tasks. This value must be between 1 and 64 threads and is only supported on CB versions 7.1.0+. and should only be increased where there are sufficient CPU resources allocated for their use. If not specified, this defaults to the default value set by Couchbase Server.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long auxIOThreads;

    public Long getAuxIOThreads() {
        return auxIOThreads;
    }

    public void setAuxIOThreads(Long auxIOThreads) {
        this.auxIOThreads = auxIOThreads;
    }

    /**
     * NonIOThreads allows the number of threads used by the data service, per pod, to be altered.  This indicates the number of threads that are to be used in the NonIO thread pool to run in memory tasks. This value must be between 1 and 64 threads and is only supported on CB versions 7.1.0+. and should only be increased where there are sufficient CPU resources allocated for their use. If not specified, this defaults to the default value set by Couchbase Server.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("nonIOThreads")
    @io.fabric8.generator.annotation.Max(64.0)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("NonIOThreads allows the number of threads used by the data service, per pod, to be altered.  This indicates the number of threads that are to be used in the NonIO thread pool to run in memory tasks. This value must be between 1 and 64 threads and is only supported on CB versions 7.1.0+. and should only be increased where there are sufficient CPU resources allocated for their use. If not specified, this defaults to the default value set by Couchbase Server.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long nonIOThreads;

    public Long getNonIOThreads() {
        return nonIOThreads;
    }

    public void setNonIOThreads(Long nonIOThreads) {
        this.nonIOThreads = nonIOThreads;
    }

    /**
     * ReaderThreads allows the number of threads used by the data service, per pod, to be altered.  This value must be between 4 and 64 threads for CB versions below 7.1.0 and, or 1 and 64 for CB versions 7.1.0+. and should only be increased where there are sufficient CPU resources allocated for their use.  If not specified, this defaults to the default value set by Couchbase Server.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("readerThreads")
    @io.fabric8.generator.annotation.Max(64.0)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("ReaderThreads allows the number of threads used by the data service, per pod, to be altered.  This value must be between 4 and 64 threads for CB versions below 7.1.0 and, or 1 and 64 for CB versions 7.1.0+. and should only be increased where there are sufficient CPU resources allocated for their use.  If not specified, this defaults to the default value set by Couchbase Server.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long readerThreads;

    public Long getReaderThreads() {
        return readerThreads;
    }

    public void setReaderThreads(Long readerThreads) {
        this.readerThreads = readerThreads;
    }

    /**
     * WriterThreads allows the number of threads used by the data service, per pod, to be altered.  This setting is especially relevant when using "durable writes", increasing this field will have a large impact on performance.  This value must be between 4 and 64 threads for CB versions below 7.1.0 and, // or 1 and 64 for CB versions 7.1.0+. and should only be increased where there are sufficient CPU resources allocated for their use. If not specified, this defaults to the default value set by Couchbase Server.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("writerThreads")
    @io.fabric8.generator.annotation.Max(64.0)
    @io.fabric8.generator.annotation.Min(1.0)
    @com.fasterxml.jackson.annotation.JsonPropertyDescription("WriterThreads allows the number of threads used by the data service, per pod, to be altered.  This setting is especially relevant when using \"durable writes\", increasing this field will have a large impact on performance.  This value must be between 4 and 64 threads for CB versions below 7.1.0 and, // or 1 and 64 for CB versions 7.1.0+. and should only be increased where there are sufficient CPU resources allocated for their use. If not specified, this defaults to the default value set by Couchbase Server.")
    @com.fasterxml.jackson.annotation.JsonSetter(nulls = com.fasterxml.jackson.annotation.Nulls.SKIP)
    private Long writerThreads;

    public Long getWriterThreads() {
        return writerThreads;
    }

    public void setWriterThreads(Long writerThreads) {
        this.writerThreads = writerThreads;
    }
}

