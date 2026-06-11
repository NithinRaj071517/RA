package learn;


import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;




public class ApiAutomationBearerToken1 {

	@Test
	public void basicAuth () 
	{
		
		RestAssured.baseURI = "https://ws.testsrv.numberportability.ch/inetonp/api/work-order/09520260309000022";		
		

		RequestSpecification givReq = RestAssured.given();
		givReq.header("Authorization","Bearer eyJ4NXQjUzI1NiI6IktXb2Z6Rk9OT2dNemY4aS1vcllycEVJTXFOaDBqOGZqcVp3bG8yRGgyMjQiLCJraWQiOiJpbmV0dWFhIiwiYWxnIjoiUlMyNTYifQ.eyJzdWIiOiJBZkppSyIsInRzcF9pZCI6OTgwOTUsInVzZXJfdHlwZSI6IlciLCJ1c2VyX25hbWUiOiJBZkppSyIsInNjb3BlIjpbIm9wZW5pZCBwcm9maWxlIGVtYWlsIl0sImlzcyI6ImluZXQtdWFhIiwic2Vzc2lvbl9pZCI6IkFmSmlLIiwiZXhwIjoxNzgwNjkwMjc0LCJpYXQiOjE3ODA2NDcwNzQsImp0aSI6ImZhNTU3NTBhLTlhZWYtNDJmZC1iZGQxLWQwYzMzMzZlY2I1YSIsImNsaWVudF9pZCI6IndlYl9hcHAiLCJhdXRob3JpdGllcyI6WyJST0xFX0lfUiIsIlJPTEVfRF9XIiwiUk9MRV9TX1IiLCJST0xFX1BfVyIsIlJPTEVfV0VCX1NFUlZJQ0UiLCJST0xFX09fVyIsIlJPTEVfVF9SIiwiUk9MRV9PX1IiLCJST0xFX0lfVyIsIlJPTEVfUF9SIiwiUk9MRV9XX1ciLCJST0xFX1dfUiIsIlJPTEVfVF9XIiwiUk9MRV9VU0VSIiwiUk9MRV9DX1IiLCJST0xFX0RfUiJdfQ.a0-G0pFEL47b8BPl5Ly0sgTlOMdWEI2O7yDYH5kFPfJil6tCkMs41JVbmPf5inhfEcJxAqw63SEtBdkVqLWDWmYuum7mk9fWgERbFiamWh0jukZig7wg8PuMNf_0SUITWoZ4kOpDDMHyWYuvfWqjMJqfqQBDipC6LPKbsyWCDeSGCK149JmMLxc-NQpmTh_7UQPjfgIRu_iv-dqVsTxnIe99KF3naFKEJr9_6a_UfpIMBqv83Ytyc9o6ZnUIgmzh9koxeJSWCF8k-fLTL5z3vEDlM1XvzglYj7p2oEWhChxZ0yHROx6GySW9NyKu3Zd9cpcQq59N8ES12psyG3WIzQ");		
		
		
		Response response = givReq.get("");
		response.prettyPrint();
		
		JsonPath jsonPath = response.jsonPath();
		String company = jsonPath.getString("subscriber.companyName");
		System.out.println(company);
		
		Assert.assertEquals(response.getStatusCode(), 200);
		Assert.assertEquals(company, "Amazon");
		
	}
}
