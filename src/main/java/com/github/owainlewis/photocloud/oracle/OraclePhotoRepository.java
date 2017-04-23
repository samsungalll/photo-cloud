package com.github.owainlewis.photocloud.oracle;

import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.objectstorage.ObjectStorage;
import com.oracle.bmc.objectstorage.model.ObjectSummary;
import com.oracle.bmc.objectstorage.requests.ListObjectsRequest;
import com.oracle.bmc.objectstorage.responses.ListObjectsResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class OraclePhotoRepository {

    private final Logger log = LoggerFactory.getLogger(this.getClass());

    private final String NAMESPACE = "bristoldev";

    private final String BUCKET_NAME = "_photos";

    @Autowired
    ObjectStorage client;

    @Autowired
    AuthenticationDetailsProvider provider;

    public List<String> listBucket() {
        ListObjectsResponse response = client.listObjects(ListObjectsRequest.builder().bucketName(BUCKET_NAME).namespaceName(NAMESPACE).build());
        return response.getListObjects().getObjects()
                .stream()
                .map(ObjectSummary::getName).collect(Collectors.toList());
    }
}
