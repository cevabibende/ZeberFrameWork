package org.example.utilities;

import org.example.pages.LoginPage;
import org.example.pages.MainPage;
import org.example.pages.MainPage2;
import org.example.pages.ProfilePage;

public class Pages {

    private MainPage mainPage;
    private MainPage2 mainPage2;
    private LoginPage loginPage;

    private ProfilePage profilePage;



    public Pages() {
        this.mainPage = new MainPage();
        this.loginPage=new LoginPage();
        this.profilePage=new ProfilePage();
        this.mainPage2=new MainPage2();

    }


    public MainPage mainPage() {
        return mainPage;
    }

    public LoginPage loginPage() {
        return loginPage;
    }

    public ProfilePage profilePage(){
        return  profilePage;
    }

    public MainPage2 mainPage2(){
        return mainPage2;
    }



}
