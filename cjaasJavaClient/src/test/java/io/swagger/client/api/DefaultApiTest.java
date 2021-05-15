/*
 * Customer Journey as a Service (CJaaS)
 * Something amazing, something special - the Customer Journey as a Service (CJaaS) is a core data layer to enable Journeys across products built upon serverless multi-cloud architecture, to be available as a SaaS service for applications inside and outside of Cisco. [**Cisco Experimental - Not For Production Use**]
 *
 * OpenAPI spec version: 0.5.0
 * Contact: cjaas-earlyaccess@cisco.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */

package io.swagger.client.api;

import io.swagger.client.ApiException;
import io.swagger.client.model.AccountSettings;
import io.swagger.client.model.CloudEvent;
import io.swagger.client.model.OnlineOrchestration;
import io.swagger.client.model.ProfileViewBuilderTemplate;
import io.swagger.client.model.ProfileViewQueryResponse;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DefaultApi
 */
@Ignore
public class DefaultApiTest {

    private final DefaultApi api = new DefaultApi();

    /**
     * Delete All Events Collected within Namespace(i.e Org)
     *
     * Delete All Events Collected for Org
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void clearTapeTest() throws ApiException {
        String authorization = null;
        String response = api.clearTape(authorization);

        // TODO: test validations
    }
    /**
     * Delete Events Collected on Specific Person
     *
     * Delete Events on Specific Person
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void clearTapeByPersonTest() throws ApiException {
        String authorization = null;
        String person = null;
        String response = api.clearTapeByPerson(authorization, person);

        // TODO: test validations
    }
    /**
     * Data sink accepts events that describe what occurred - when - by whom on every interaction across touchpoints and applications
     *
     * Data Ingestion is based on Cloud Events specification for describing event data in a common way. Data Sink accepts data in the form of POST or GET with support for both Header based authorization and as-well via Query string
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dataSinkTest() throws ApiException {
        CloudEvent body = null;
        String authorization = null;
        api.dataSink(body, authorization);

        // TODO: test validations
    }
    /**
     * Data sink accepts events that describe what occurred - when - by whom on every interaction across touchpoints and applications
     *
     * Data Ingestion is based on Cloud Events specification for describing event data in a common way. Data Sink accepts data in the form of POST or GET with support for both Header based authorization and as-well via Query string
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void dataSinkGetTest() throws ApiException {
        String sig = null;
        String data = null;
        api.dataSinkGet(sig, data);

        // TODO: test validations
    }
    /**
     * Journeys are built around a concept of Identity. An identity shapes how Journey is connected together. Get Identity by Id
     *
     * Every event in the Journey has an Identity of the originating individual, different channels can have their own unique Identities, API consumers can tie multiple duplicate Identities together to a unique single individual nondestructively (i.e soft merge) without modifying the Tape. Once aliased, all duplicates are treated as a single Identity for any purpose (Query or View)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void identitiesTest() throws ApiException {
        String authorization = null;
        String id = null;
        String response = api.identities(authorization, id);

        // TODO: test validations
    }
    /**
     * Tie multiple duplicate Identities together to a unique single individual nondestructively (i.e soft merge) without modifying the Tape
     *
     * Every event in the Journey has an Identity of the originating individual, different channels can have their own unique Identities, API consumers can tie multiple duplicate Identities together to a unique single individual nondestructively (i.e soft merge) without modifying the Tape. Once aliased, all duplicates are treated as a single Identity for any purpose (Query or View)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void identitiesAliasTest() throws ApiException {
        String authorization = null;
        String id = null;
        String alias = null;
        String response = api.identitiesAlias(authorization, id, alias);

        // TODO: test validations
    }
    /**
     * Delete a Identity
     *
     * Remove a soft merge
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void identitiesDeleteTest() throws ApiException {
        String authorization = null;
        String id = null;
        String response = api.identitiesDelete(authorization, id);

        // TODO: test validations
    }
    /**
     * The Tape holds running stream of customer journey events that arrive onto Data Sink from all channels - across mediums
     *
     * Tape is a append-only, immutable data ledger that can be queried to retrieve snapshot of latest events that moment in time or historically to play-back events as they occurred to understand or analyze Journeys using ML/AI models
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void journeysTest() throws ApiException {
        String authorization = null;
        String $filter = null;
        Integer $top = null;
        List<CloudEvent> response = api.journeys(authorization, $filter, $top);

        // TODO: test validations
    }
    /**
     * The Tape holds running stream of customer journey events that arrive onto Data Sink from all channels - across mediums
     *
     * Tape is a append-only, immutable data ledger that can be queried to retrieve snapshot of latest events that moment in time or historically to play-back events as they occurred to understand or analyze Journeys using ML/AI models
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void journeysByPersonTest() throws ApiException {
        String authorization = null;
        String person = null;
        String $filter = null;
        Integer $top = null;
        List<CloudEvent> response = api.journeysByPerson(authorization, person, $filter, $top);

        // TODO: test validations
    }
    /**
     * Create or Rotate or Delete a Specific Key
     *
     * With Shared Access Signatures API consumers get choice of granular control on how to access API(paths), which resources to scope(ex:datasink), with what permissions the request needs(read / write), from which  source (ex: website) and how long(10s to 10 years) among many other parameters.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void keysTest() throws ApiException {
        String authorization = null;
        String operation = null;
        String id = null;
        String response = api.keys(authorization, operation, id);

        // TODO: test validations
    }
    /**
     * CJaaS APIs are designed to be accessed with Shared Access Signature(SAS) to resources without transmitting any actual sensitive keys(hello! API Keys) or even exchanging a password for a proxy such as oAuth bearer
     *
     * With Shared Access Signatures API consumers get choice of granular control on how to access API(paths), which resources to scope(ex:datasink), with what permissions the request needs(read / write), from which  source (ex: website) and how long(10s to 10 years) among many other parameters.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void keysDeleteTest() throws ApiException {
        String authorization = null;
        String id = null;
        String response = api.keysDelete(authorization, id);

        // TODO: test validations
    }
    /**
     * List All SAS Keys
     *
     * With Shared Access Signatures API consumers get choice of granular control on how to access API(paths), which resources to scope(ex:datasink), with what permissions the request needs(read / write), from which  source (ex: website) and how long(10s to 10 years) among many other parameters.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void keysListTest() throws ApiException {
        String authorization = null;
        String response = api.keysList(authorization);

        // TODO: test validations
    }
    /**
     * Trigger a Online Orchestration such as Webex Walkin or Display Offer Or Chat Bot to intercept and modify your Customer&#x27;s Journey Midway
     *
     * Trigger a Online Orchestration such as Webex Walkin or Display Offer Or Chat Bot to modify your Customer&#x27;s Journey Midway
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void onlineOrchestrationTriggerTest() throws ApiException {
        OnlineOrchestration body = null;
        String person = null;
        String authorization = null;
        String sig = null;
        String response = api.onlineOrchestrationTrigger(body, person, authorization, sig);

        // TODO: test validations
    }
    /**
     * A Profile is a bespoke view of a customer&#x27;s journey
     *
     * The profile view is created based on a view template that is provided as input.   **Sample request**: *GET /profileview?customer&#x3D;123XX*   {   &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;\&quot;Name\&quot;: \&quot;Test Template 2\&quot;,   &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;\&quot;DatapointCount\&quot;: 7,   &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;\&quot;Attributes\&quot;: [{   &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;\&quot;Version\&quot;: \&quot;0.1\&quot;,   &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;\&quot;Event\&quot;: \&quot;Add to Cart\&quot;,   &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;\&quot;Metadata\&quot;: \&quot;sku\&quot;,   &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;\&quot;Limit\&quot;: 3,   &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;\&quot;DisplayName\&quot;: \&quot;Items added\&quot;,   &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;\&quot;AggregationMode\&quot;: \&quot;Value\&quot;   &amp;nbsp;&amp;nbsp;&amp;nbsp;&amp;nbsp;}]   }
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void profileBuilderTest() throws ApiException {
        ProfileViewBuilderTemplate body = null;
        String authorization = null;
        String personId = null;
        ProfileViewQueryResponse response = api.profileBuilder(body, authorization, personId);

        // TODO: test validations
    }
    /**
     * Real-time streaming enables API consumers to listen for events as it arrives part of the Journey, these may be transformed, value added / enriched and ready to be consumed or forwarded to an another destination
     *
     * Optionally accepts $filter to slice/dice further (ex: type eq &#x27;Add to Cart&#x27;)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void realTimeSSETest() throws ApiException {
        String sig = null;
        String authorization = null;
        String response = api.realTimeSSE(sig, authorization);

        // TODO: test validations
    }
    /**
     * Real-time streaming enables API consumers to listen for events as it arrives part of the Journey, these may be transformed, value added / enriched and ready to be consumed or forwarded to an another destination
     *
     * Optionally accepts $filter to slice/dice further (ex: type eq &#x27;Add to Cart&#x27;)
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void realTimeSSEPersonTest() throws ApiException {
        String person = null;
        String sig = null;
        String authorization = null;
        String response = api.realTimeSSEPerson(person, sig, authorization);

        // TODO: test validations
    }
    /**
     * API consumers can fully manage their Journey/CDP capabilities and settings using the Account Management endpoints
     *
     * Update, get data retention, destinations and more
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void settingsTest() throws ApiException {
        String authorization = null;
        AccountSettings response = api.settings(authorization);

        // TODO: test validations
    }
    /**
     * API consumers can fully manage their Journey/CDP capabilities and settings using the Account Management endpoints
     *
     * Update, get data retention, destinations and more
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void updateSettingsTest() throws ApiException {
        AccountSettings body = null;
        String authorization = null;
        AccountSettings response = api.updateSettings(body, authorization);

        // TODO: test validations
    }
    /**
     * SSE Channel for Webex Walkin Orchestration to Modify Journeys Midway
     *
     * Major browsers offer built-in class EventSource, with the EventSource object API consumers can automatically establishes a persistent connection and transparently allow for automatic reconnects with tunable retry timeout &amp; Message ids to resume events.
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void webexWalkinSSETest() throws ApiException {
        String person = null;
        String sig = null;
        String authorization = null;
        String response = api.webexWalkinSSE(person, sig, authorization);

        // TODO: test validations
    }
}