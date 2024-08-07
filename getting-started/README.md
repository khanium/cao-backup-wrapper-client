# Overview

This repository details how to backup a Couchbase cluster and restore data in the face of disaster. A conceptual overview of using the Autonomous Operator to backup and restore Couchbase clusters can be found in Couchbase Backup and Restore.

The Autonomous Operator supports two of the backup strategies available in cbbackupmgr: Full Only and Full/Incremental. Complete descriptions and explanations of these strategies can be found in the cbbackupmgr documentation. The examples on this page assume a backup schedule based on the Full/Incremental strategy for both creating backups and performing restores.

---
**Important!**

Backup and restore jobs rely on a shared persistent volume claim (PVC) when in use. On Kubernetes platforms you must specify a value for couchbaseclusters.spec.security.podSecurityContext.fsGroup in order for volume permissions to be the same across all jobs. Red Hat OpenShift is not affected by this constraint.

For further information about setting file system groups see the persistent volume concepts page.

---

## Getting Started K8


### 0. Starting Kind as K8 cluster
https://kind.sigs.k8s.io/docs/user/quick-start/

```console
echo "0. starting Kubernetes cluster..."
kind create cluster --config kind-k8-cluster-3w.yaml
```

kind-k8-cluster-3w.yaml

```file
kind: Cluster
apiVersion: kind.x-k8s.io/v1alpha4
nodes:
 - role: control-plane
 - role: worker
 - role: worker
 - role: worker
```

### 1. Operator
Download Couchbase Operator & deploy Couchbase CRD, admission controller and operator services. 

```console
echo "1. Installing Couchbase Operator..."
cd cb-operator
kubectl create -f crd.yaml
bin/cao create admission
bin/cao create operator
```

### 2. Grant Backup permissions

```
echo "2. Deploying Couchbase Cluster Server..."
kubectl apply -f cb-cluster-backup.yaml
kubectl get pods -w
```