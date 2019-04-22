package com.definelabs.appmvvmrxrt;

import android.content.Context;
import android.databinding.BaseObservable;
import android.databinding.BindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class UserViewModel extends BaseObservable {

   private User user;
   private Context context;

    public UserViewModel() {
    }

    public UserViewModel(User user, Context context) {
        this.user = user;
        this.context = context;
    }

   @BindingAdapter("imageUrl")
    public static void setUserImg(ImageView imageView,String url){
       Glide.with(imageView.getContext()).load(url).into(imageView);

    }
    public String getUserImg(){
        return user.getImg().toString();
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
