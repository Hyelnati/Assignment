package todoListApp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TodoListTest {
    TodoList todoList;
    @BeforeEach
    public void startWith(){
        todoList = new TodoList("username","password");
        Task task = new Task();
    }
    @Test public void myTodoListIsLockedByDefaultTest(){
        todoList.islocked();
        assertTrue(todoList.islocked());
    }
    @Test public void todoListCanBeUnlockedWithPasswordTest(){
        todoList.islocked();
        assertTrue(todoList.islocked());
        todoList.unlockWith("password");
        assertFalse(todoList.islocked());
    }
    @Test public void todoListCanNotBeUnlockedWithWrongPasswordTest(){
        todoList.islocked();
        assertTrue(todoList.islocked());
        try{
            todoList.unlockWith("passwords");
        } catch (IllegalArgumentException exception) {
            assertEquals("Wrong password", exception.getMessage());
        }
    }
    @Test public void todoListCanHaveEntryTest(){
        todoList.createEntry("when God speaks","listen");
        assertEquals(1,todoList.size());
    }
    @Test public void todoListCanAddMoreThanOneEntryTest(){
        todoList.createEntry("YOU AND ME", "Together forever");
        todoList.createEntry("YOU AND ME", "Together forever");
        todoList.createEntry("YOU AND ME", "Together forever");
        assertEquals(3,todoList.size());
    }
    @Test public void entryCanBeDeletedTest(){
        todoList.createEntry("YOU AND ", "Together forever");
        todoList.createEntry("YOU ", "Together forever");
        Task one =todoList.createEntry("YOU AND ME", "Together forever");
        try{
            todoList.deleteEntry(1);
        } catch (IllegalArgumentException exception){
            //assertEquals("Wrong ID", exception.getMessage());
            assertEquals(2,todoList.size());
            System.out.println(one.getBody());

        }

    }
    @Test public void WrongIdCanBeDeletedTest(){
        todoList.createEntry("YOU AND ME", "Together forever");
        todoList.createEntry("YOU AND ME", "Together forever");
        todoList.createEntry("YOU AND ME", "Together forever");
        try{
            todoList.deleteEntry(3);
        } catch (IllegalArgumentException exception){
            assertEquals("Wrong ID", exception.getMessage());
        }
    }
    @Test public void entryByIdTest(){
        Task one = todoList.createEntry("YOU AND ME", "Together forever");
        Task two = todoList.createEntry("YOU AND ME", "Together forever");
        Task three = todoList.createEntry("YOU AND ME", "Together forever");
        Task expected = todoList.findEntryById(1);
        assertEquals(two,expected);

    }
    @Test public void taskCanBeUpdatedTest(){
        Task one = todoList.createEntry("YOU AND ME", "Together forever");
        Task two = todoList.createEntry("YOU AND ME", "Together forever");
        Task three = todoList.createEntry("YOU AND ME", "Together forever");
        Task expected = todoList.updateTask(2,"title","what is wrong?");
        assertEquals(three,expected);

    }
}
