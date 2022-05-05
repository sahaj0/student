package com.example.demo2.service;

import com.example.demo2.entity.Student;
import com.example.demo2.repo.stdrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
public class stdserviceImpl implements stdservice{
    @Autowired
    private stdrepo repo;

    @Override
    public Student savestudent(Student std) {
        return repo.save(std);
    }

    @Override
    public List<Student> fetch() {
        return repo.findAll();
    }

    @Override
    public Student fetchid(Long id) {
        return repo.findById(id).get();
    }

    @Override
    public String delbyid(Long id)  {
         repo.deleteById(id);


         return "Done......";
    }

    @Override
    public Student updatebyid(Long id, Student std) {
        Student tep=repo.findById(id).get();
        if(Objects.nonNull(std.getStd_name())&& !"".equals(std.getStd_name())){
            tep.setStd_name(std.getStd_name());


        }
        return repo.save(tep);

    }

    @Override
    public List<Student> fetchb(String branch) {
        return repo.findByBranch(branch);
    }

}
