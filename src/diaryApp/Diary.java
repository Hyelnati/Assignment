package diaryApp;

import java.util.ArrayList;
import java.util.List;

public class Diary {
    private String userName;
    private String password;
    private boolean isLocked = true;
    private  int count;
    private int id;
    private String email;
    private List<Entry> entries = new ArrayList<>();
    public Diary(String userName, String password) {
        this. userName = userName;
        this.password = password;
    }
    public Diary(){}
    public boolean locked() {
        return isLocked;
    }
    public void unlockDiary(){
        isLocked = false;
    }
    public void unlockWith(String password) {
        if (this.password.equalsIgnoreCase(password)) unlockDiary();
    }

    public Entry createEntry(String title, String body) {
        int id = count++;
        Entry entry = new Entry();
        entry.setBody(body);
        entry.setTitle(title);
        entry.setId(id);
        entries.add(entry);
        return entry;


//        int id = count++;
//        Entry entry = new Entry(id,title,body);
//        entries.add(entry);
//        return entry;
    }
    public int sizeOfEntries(){
        return entries.size();
    }

    public void deleteEntry(int id) {
        //entries.removeIf(entry -> entry.getId() == id);
        entries.remove(id);
//        entries.remove(findEntryById(id));

    }
    public Entry findEntryById(int id){
        for (Entry entry: entries){
            if (entry.getId()== id){
                return entry;
            }

        }
        throw new IllegalArgumentException("Entry not found");
    }
    public Entry findEntryByUserName(String userName){
        for (Entry entry:entries){
            if (this.userName.equalsIgnoreCase(userName)) return entry;
        }
        throw new IllegalArgumentException("Username not found");
    }
    public Entry updateEntry(int id, String title, String body){
        for (Entry entry: entries){
            if (entry.getId()==id|| entry.getTitle().equalsIgnoreCase(title)|| entry.getBody().equalsIgnoreCase(body)){
                entry.setBody(body);
                entry.setTitle(title);
                return entry;
            }
        }
        throw new IllegalArgumentException("Update declined");
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isLocked() {
        return isLocked;
    }

    public void setLocked(boolean locked) {
        isLocked = locked;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Entry> getEntries() {
        return entries;
    }

    public void setEntries(List<Entry> entries) {
        this.entries = entries;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
