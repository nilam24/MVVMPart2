package com.definelabs.appmvvmrxrt;

import android.content.Context;
import android.databinding.BaseObservable;

public class UserViewModel extends BaseObservable {

   private User user;
   private Context context;

    public UserViewModel() {
    }

    public UserViewModel(User user, Context context) {
        this.user = user;
        this.context = context;
    }

    public void setUserImg(String img){
        user.setImg(img);

    }
    public String getUserImg(){
        return user.getImg();
    }
    public void setUserName(String userName){
        user.setUserName(userName);
    }
    public String getUserName(){
        return user.getUserName();
    }
    public void setUserPhone(String userPhone){
        user.setPhoneNumber(userPhone);
    }
    public String getUserPhone(){
        return user.getPhoneNumber();
    }
    public void setUserEmail(String userEmail){
        user.setEmailId(userEmail);
    }
    public String getUserEmail(){
        return user.getEmailId();
    }


}
