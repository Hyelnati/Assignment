package diaryApp;

import java.util.ArrayList;
import java.util.List;

public class Diaries {
    private List<Diary> diaries = new ArrayList<>();

    public void addDiary(String username, String password){
        Diary diary = new Diary();
        diary.setUserName(username);
        diary.setPassword(password);
        diaries.add(diary);
    }
    public void deleteDiary(String userName, String password){
        Diary findDiary = findByUserName(userName);
        if (findDiary.getPassword().equals(password))
                diaries.remove(findDiary);
    }
    public Diary findByUserName(String userName){
        for (Diary diary: diaries){
            if (diary.getUserName().equals(userName)){
                return diary;
            }
        }
        throw new IllegalArgumentException("User not found");
    }
    public Diary logIn(String userName,String password){
        Diary loggedIn = findByUserName(userName);
        if (loggedIn.getPassword().equalsIgnoreCase(password)){
            return loggedIn;
        }
        throw new IllegalArgumentException("Invalid login credentials");
    }


}
