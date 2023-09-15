package todoListApp;

import diaryApp.Entry;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private String username;
    private String password;
    private boolean isLock = true;
    private int count;
    private  List<Task> tasks = new ArrayList<>();
    public TodoList(String username, String password) {
        this.username = username;
        this.password = password;

    }

    public boolean islocked() {
        return isLock;
    }
    public void unlock(){
        isLock = false;
    }

    public void unlockWith(String password) {
        if (this.password.equals(password)) unlock();
        else throw new IllegalArgumentException("Wrong password");
    }

    public Task createEntry(String title, String body) {
        Task task = new Task();
        int id = count++;
        task.setBody(title);
        task.setTitle(body);
        task.setId(id);
        tasks.add(task);
        return task;
    }
    public int size(){
        return tasks.size();
    }

    public void deleteEntry(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) tasks.remove(id);
            throw new IllegalArgumentException("Wrong ID");
        }
    }

    public Task findEntryById(int id){
        for (Task task : tasks){
            if (task.getId() == id){
                return task;
            }
        }
        throw new IllegalArgumentException("ID does not match entries: try again");
    }

    public Task updateTask(int id, String title, String body) {
        for (Task task: tasks){
            if (task.getId()==id||task.getBody().equalsIgnoreCase(body)||task.getTitle().equalsIgnoreCase(title)){
                task.setBody(body);
                task.setTitle(title);
                return task;
            }
        }
        return null;
    }
}
