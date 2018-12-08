package com.qbtrance.djarray;

import com.qbtrance.djarray.dao.DjRepository;
import com.qbtrance.djarray.model.Dj;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.Optional;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DjArrayApplicationTests {

	@Autowired
	DjRepository repo;

	@Test
	public void contextLoads() {

	}

	@Test
	public void testCreateSingleRecord() {
		Dj dj = new Dj();
		//dj.setId();
		dj.setFirstName("izzy");
		dj.setLastName("M");
		dj.setEmail("a@b.com");
		dj.setAlsoKnownAs("cx-1");
		repo.save(dj);
	}

	@Test
    public void testCreateBulkSampleRecords() {

	    for (int x=0; x<=100; x++){
	        Dj dj = new Dj();
	        dj.setFirstName("Test Dj " + x);
	        dj.setLastName("Last Name" + x);
	        dj.setEmail("a@c." + x);
	        dj.setAlsoKnownAs("CX-" + x);
            dj.setSoundcloud("SoundCloud"+x);
            dj.setMixcloud("MixCloud"+ x);
	        dj.setFacebook("facebook" + x);
	        dj.setViewed(1);
	        dj.setPicture("Path to pic"+x);
	        repo.save(dj);
	        dj=null;
        }
    }


    @Test
    public void testDeleteAll(){
	  repo.deleteAll();
    }

	@Test
    public void testRead(){
	    Optional<Dj> dj =  repo.findById(1);
        assertNotNull(dj.get());
        //assertEquals("izzy", dj.get().getFname());
        System.out.println(dj.get().toString());
    }

    @Test
    public void testReadAll(){
	    List<Dj> djList = (List<Dj>) repo.findAll();
	    djList.forEach(p->System.out.println(p.getFirstName()));
    }

    @Test
    public void testUpdate() {
        Optional<Dj> dj = repo.findById(1);
        dj.get().setEmail("newemail@gmail.com");
        repo.save(dj.get());
    }

    @Test
    public void testDelete(){
	    repo.deleteById(1);
    }

    @Test
    public void testFindByName(){
	    List<Dj> dj = repo.findByFirstName("ale");
        System.out.println("Dj found:");
        dj.forEach(p->System.out.print(p.getFirstName()));
    }

    @Test
    public void testFindByEmailLike(){
	    List<Dj> djList = repo.findByEmailLike("%a%");
	    djList.forEach(p->System.out.println(p.getEmail()));
    }
}
