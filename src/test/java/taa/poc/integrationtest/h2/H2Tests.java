package taa.poc.integrationtest.h2;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringJUnit4ClassRunner.class)
public class H2Tests {

	@LocalServerPort
	private int port;

	@Autowired
	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@Test
	@Sql("classpath:sql/data.sql")
	public void shouldVerify_that_initScriptIsLoaded1() throws IOException {
		Assertions.assertTrue(true);
		Map<String, Object> parameters = new HashMap<>();
		Integer count = namedParameterJdbcTemplate.queryForObject("Select count(*) from S_CONTACT", parameters, Integer.class);
		int actualStatusCode = simplePostRequest("http://localhost:" + port + "/synchronization/contacts/pmid/stay-booking");
		Assertions.assertNotNull(count);
		boolean expectedCount = count > 20;
		Assert.assertTrue(expectedCount);
		Assertions.assertEquals(204, actualStatusCode);


	}

	@Test
	@Sql("classpath:sql/data2.sql")
	public void shouldVerify_that_initScriptIsLoaded2() throws IOException {
		Assertions.assertTrue(true);
		Map<String, Object> parameters = new HashMap<>();
		Integer count = namedParameterJdbcTemplate.queryForObject("Select count(*) from S_CONTACT", parameters, Integer.class);
		int actualStatusCode = simplePostRequest("http://localhost:" + port + "/synchronization/contacts/pmid/stay-booking");
		Assertions.assertNotNull(count);
		boolean expectedCount = count > 20;
		Assert.assertTrue(expectedCount);
		Assertions.assertEquals(204, actualStatusCode);


	}

	@Test
	@Sql("classpath:sql/data3.sql")
	public void shouldVerify_that_initScriptIsLoaded3() throws IOException {
		Assertions.assertTrue(true);
		Map<String, Object> parameters = new HashMap<>();
		Integer count = namedParameterJdbcTemplate.queryForObject("Select count(*) from S_CONTACT", parameters, Integer.class);
		int actualStatusCode = simplePostRequest("http://localhost:" + port + "/synchronization/contacts/pmid/stay-booking");
		Assertions.assertNotNull(count);
		boolean expectedCount = count > 20;
		Assert.assertTrue(expectedCount);
		Assertions.assertEquals(204, actualStatusCode);


	}

	@Test
	@Sql("classpath:sql/data4.sql")
	public void shouldVerify_that_initScriptIsLoaded4() throws IOException {
		Assertions.assertTrue(true);
		Map<String, Object> parameters = new HashMap<>();
		Integer count = namedParameterJdbcTemplate.queryForObject("Select count(*) from S_CONTACT", parameters, Integer.class);
		int actualStatusCode = simplePostRequest("http://localhost:" + port + "/synchronization/contacts/pmid/stay-booking");
		Assertions.assertNotNull(count);
		boolean expectedCount = count > 20;
		Assert.assertTrue(expectedCount);
		Assertions.assertEquals(204, actualStatusCode);


	}

	private int simplePostRequest(String address) throws IOException {
		HttpUriRequest request = new HttpPost(address);
		HttpResponse httpResponse = HttpClientBuilder.create().build().execute( request );
		return httpResponse.getStatusLine().getStatusCode();
	}

}
