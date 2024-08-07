echo "0. starting Kubernetes cluster..."
kind create cluster --config kind-k8-cluster-3w.yaml
echo "1. Installing Couchbase Operator..."
cd cb-operator
kubectl create -f crd.yaml
bin/cao create admission
bin/cao create operator
echo "2. Deploying Couchbase Cluster Server..."
kubectl apply -f cb-cluster-backup.yaml
kubectl get pods -w

