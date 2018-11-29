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
		dj.setFname("izzy");
		dj.setLname("M");
		dj.setEmail("a@b.com");
		dj.setAka("cx-1");
		repo.save(dj);
	}

	@Test
    public void testCreateBulkSampleRecords() {

	    for (int x=0; x<=100; x++){
	        Dj dj = new Dj();
	        dj.setFname("Test Dj " + x);
	        dj.setLname("Last Name" + x);
	        dj.setEmail("a@c." + x);
	        dj.setAka("CX-" + x);
            dj.setSc("SoundCloud"+x);
            dj.setMc("MixCloud"+ x);
	        dj.setFb("facebook" + x);
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
	    djList.forEach(p->System.out.println(p.getFname()));
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
	    List<Dj> dj = repo.findByFname("ale");
        System.out.println("Dj found:");
        dj.forEach(p->System.out.print(p.getFname()));
    }

    @Test
    public void testFindByEmailLike(){
	    List<Dj> djList = repo.findByEmailLike("%a%");
	    djList.forEach(p->System.out.println(p.getEmail()));
    }
}
