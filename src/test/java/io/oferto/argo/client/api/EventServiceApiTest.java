/*
 * Argo Workflows API
 * Argo Workflows is an open source container-native workflow engine for orchestrating parallel jobs on Kubernetes. For more information, please see https://argo-workflows.readthedocs.io/en/release-3.5/
 *
 * OpenAPI spec version: VERSION
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.oferto.argo.client.api;

import io.oferto.argo.client.api.EventServiceApi;
import io.oferto.argo.client.model.GrpcGatewayRuntimeError;
import io.oferto.argo.client.model.IoArgoprojWorkflowV1alpha1EventResponse;
import io.oferto.argo.client.model.IoArgoprojWorkflowV1alpha1Item;
import io.oferto.argo.client.model.IoArgoprojWorkflowV1alpha1WorkflowEventBindingList;

import org.junit.Test;
import org.junit.Ignore;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for EventServiceApi
 */
@Ignore
public class EventServiceApiTest {

    private final EventServiceApi api = new EventServiceApi();

    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void eventServiceListWorkflowEventBindingsTest() throws Exception {
        String namespace = null;
        String listOptionsLabelSelector = null;
        String listOptionsFieldSelector = null;
        Boolean listOptionsWatch = null;
        Boolean listOptionsAllowWatchBookmarks = null;
        String listOptionsResourceVersion = null;
        String listOptionsResourceVersionMatch = null;
        String listOptionsTimeoutSeconds = null;
        String listOptionsLimit = null;
        String listOptionsContinue = null;
        IoArgoprojWorkflowV1alpha1WorkflowEventBindingList response = api.eventServiceListWorkflowEventBindings(namespace, listOptionsLabelSelector, listOptionsFieldSelector, listOptionsWatch, listOptionsAllowWatchBookmarks, listOptionsResourceVersion, listOptionsResourceVersionMatch, listOptionsTimeoutSeconds, listOptionsLimit, listOptionsContinue);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws Exception
     *          if the Api call fails
     */
    @Test
    public void eventServiceReceiveEventTest() throws Exception {
        String namespace = null;
        String discriminator = null;
        IoArgoprojWorkflowV1alpha1Item body = null;
        IoArgoprojWorkflowV1alpha1EventResponse response = api.eventServiceReceiveEvent(namespace, discriminator, body);

        // TODO: test validations
    }
    
}
