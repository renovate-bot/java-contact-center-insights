/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.contactcenterinsights.v1.samples;

// [START contactcenterinsights_v1_generated_contactcenterinsightsclient_deleteissuemodel_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.contactcenterinsights.v1.ContactCenterInsightsClient;
import com.google.cloud.contactcenterinsights.v1.DeleteIssueModelRequest;
import com.google.cloud.contactcenterinsights.v1.IssueModelName;
import com.google.longrunning.Operation;

public class AsyncDeleteIssueModel {

  public static void main(String[] args) throws Exception {
    asyncDeleteIssueModel();
  }

  public static void asyncDeleteIssueModel() throws Exception {
    // This snippet has been automatically generated for illustrative purposes only.
    // It may require modifications to work in your environment.
    try (ContactCenterInsightsClient contactCenterInsightsClient =
        ContactCenterInsightsClient.create()) {
      DeleteIssueModelRequest request =
          DeleteIssueModelRequest.newBuilder()
              .setName(IssueModelName.of("[PROJECT]", "[LOCATION]", "[ISSUE_MODEL]").toString())
              .build();
      ApiFuture<Operation> future =
          contactCenterInsightsClient.deleteIssueModelCallable().futureCall(request);
      // Do something.
      future.get();
    }
  }
}
// [END contactcenterinsights_v1_generated_contactcenterinsightsclient_deleteissuemodel_async]