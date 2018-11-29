package com.qbtrance.djarray.dao;

import com.qbtrance.djarray.model.Dj;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DjRepository extends CrudRepository<Dj, Integer> {

    List<Dj> findByFname(String fname);
    List<Dj> findByEmailLike (String email);
    List<Dj> findByLnameLike(String lname);

}
