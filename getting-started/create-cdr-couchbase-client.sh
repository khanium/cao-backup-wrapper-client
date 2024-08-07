# downloading cdr
mkdir -p /tmp/cdrs && cd /tmp/cdrs
wget https://packages.couchbase.com/releases/couchbase-operator/2.6.4/couchbase-autonomous-operator_2.6.4-kubernetes-macos-arm64.zip
unzip couchbase-autonomous-operator_2.6.4-kubernetes-macos-arm64.zip && mv couchbase-autonomous-operator_2.6.4-126-kubernetes-macos-arm64/crd.yaml ./ && rm -rf couchbase-autonomous-operator_2.6.4-126-kubernetes-macos-arm64 && rm couchbase-autonomous-operator_2.6.4-kubernetes-macos-arm64.zip

# local generation
LOCAL_MANIFEST_FILE=/tmp/cdrs/crd.yaml
mkdir -p /tmp/java && cd /tmp/java
docker run \
  --rm \
  -v "$LOCAL_MANIFEST_FILE":"$LOCAL_MANIFEST_FILE" \
  -v /var/run/docker.sock:/var/run/docker.sock \
  -v "$(pwd)":"$(pwd)" \
  -ti \
  --network host \
  docker.io/apecloud/crd-model-gen:v1.0.7
#  ghcr.io/kubernetes-client/java/crd-model-gen:v1.0.7 \
  /generate.sh \
  -u $LOCAL_MANIFEST_FILE \
  -o "$(pwd)"

# -n com.example.stable
# -p 
