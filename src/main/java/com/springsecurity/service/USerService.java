package com.springsecurity.service;

import com.springsecurity.model.UserModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class USerService {

    List<UserModel> list=new ArrayList<>();

    public USerService() {
        list.add(new UserModel("sadsf","sdfsdf","SDfsdf@dfgd.df"));
        list.add(new UserModel("fgdfh","sdfsdf","SDfsdf@dfgd.df"));
        list.add(new UserModel("ere","sdfsdf","SDfsdf@dfgd.df"));
        list.add(new UserModel("fjgj","sdfsdf","SDfsdf@dfgd.df"));
        list.add(new UserModel("ljkl","sdfsdf","SDfsdf@dfgd.df"));
    }

    public List<UserModel> getAllUser(){return list;}

    public UserModel getUser(String userName){
        return list.stream().filter(userModel -> userModel.userName.equals(userName)).findAny().orElse(null);
    }
    public UserModel addUser(UserModel userModel){
        list.add(userModel);
        return userModel;
    }
}
