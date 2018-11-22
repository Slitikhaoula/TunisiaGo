package com.example.TunisiaGo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import com.example.TunisiaGo.Entities.Gouvernorat;
import com.example.TunisiaGo.Entities.Site;
import com.example.TunisiaGo.IService.IGouvernoratService;
import com.example.TunisiaGo.IService.ISiteService;

@RunWith(SpringRunner.class)
public class SiteTest {
	
	@MockBean
	private ISiteService service;
	
	
	@MockBean
	private IGouvernoratService serviceGouv;
	
	@Autowired
	private MockMvc mockMvc;

	
	@Test
	public void test() {
		fail("Not yet implemented");
		
		Gouvernorat gouvernorat=(Gouvernorat) serviceGouv.findOne(1);
		
		
		Site site=new Site();
		site.setNom("Parc Ennahli");
		site.setDescription("A la découverte du parc Ennahli, l’un des espaces naturels"
		+ " surplombant la ville de l’Ariana, un spectacle apaisant s’offre aux visiteurs"
		+ " qui n’hésitent pas à se dégourdir les jambes de bonne heure.");
		site.setGouvernorat(gouvernorat);
		site.setLatitude(36.88527219999999);
		site.setLongitude(10.159972400000015);
		site.setUrlVideo("https://www.youtube.com/watch?v=e5VOueIExnQ");
		
		Site s=(Site) service.ajouter(site);
		Site s1=(Site) service.findOne(s.getIdSite());

		assertEquals(s.getIdSite(), s1.getIdSite());

	
		// studentService.addCourse to respond back with mockCourse
/*	Mockito.when(
			serv
			studentService.addCourse(Mockito.anyString(),
					Mockito.any(Course.class))).thenReturn(mockCourse);

	// Send course as body to /students/Student1/courses
	RequestBuilder requestBuilder = MockMvcRequestBuilders
			.post("/students/Student1/courses")
			.accept(MediaType.APPLICATION_JSON).content(exampleCourseJson)
			.contentType(MediaType.APPLICATION_JSON);

	MvcResult result = mockMvc.perform(requestBuilder).andReturn();

	MockHttpServletResponse response = result.getResponse();

	assertEquals(HttpStatus.CREATED.value(), response.getStatus());

	assertEquals("http://localhost/students/Student1/courses/1",
			response.getHeader(HttpHeaders.LOCATION));
*/
}

}
