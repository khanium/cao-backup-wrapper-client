kubectl --namespace gandalf create serviceaccount external-dns
kubectl create -f 00_clusterole_externaldns.yaml
kubectl create rolebinding --clusterrole external-dns --serviceaccount couchbase:external-dns external-dns
kubectl create -f external-dns.yaml

