package com.github.owainlewis.photocloud;

import com.github.owainlewis.photocloud.oracle.OraclePhotoRepository;
import com.oracle.bmc.Region;
import com.oracle.bmc.auth.AuthenticationDetailsProvider;
import com.oracle.bmc.auth.ConfigFileAuthenticationDetailsProvider;
import com.oracle.bmc.objectstorage.ObjectStorage;
import com.oracle.bmc.objectstorage.ObjectStorageClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public AuthenticationDetailsProvider getAuthenticationDetailsProvider () throws IOException {
        return new ConfigFileAuthenticationDetailsProvider("DEFAULT");
    }

    @Bean
    public ObjectStorage objectStorageClient() throws IOException {
        ConfigFileAuthenticationDetailsProvider provider = new ConfigFileAuthenticationDetailsProvider("DEFAULT");
        ObjectStorage objectStorageClient = new ObjectStorageClient(provider);
        objectStorageClient.setRegion(Region.US_PHOENIX_1);
        return objectStorageClient;
    }

    @Bean
    public OraclePhotoRepository getOraclePhotoRepository () {
        return new OraclePhotoRepository();
    }
}
