package diaryAppTest;

import diaryApp.Diary;
import diaryApp.Entry;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class DiaryTest {
    Diary myDiary;
    @BeforeEach
    public void startWith(){
        myDiary = new Diary("Ada", "123");
    }
    @Test public void classExistTest(){
        assertNotNull(myDiary);
    }
    @Test public void myDiaryIsLockedByDefaultTest(){
        myDiary.locked();
        assertTrue(myDiary.locked());
    }
    @Test public void myDiaryIsUnlockedWithPassWordTest(){
        myDiary.locked();
        assertTrue(myDiary.locked());
        myDiary.unlockWith("123");
        assertFalse(myDiary.locked());
    }
    @Test public void myDiaryCannotBe_UnlockedWithWrongPassWordTest(){
        myDiary.locked();
        assertTrue(myDiary.locked());
        myDiary.unlockWith("128");
        assertTrue(myDiary.locked());
    }
    @Test public void myDiaryCanCreateEntryTest(){
         myDiary.createEntry("Usman","1234");
         assertEquals(1,myDiary.sizeOfEntries());
    }
    @Test public void myDiaryCanHave_moreThanOneEntriesTest(){
        myDiary.createEntry("Usman","1234");
        myDiary.createEntry("Zee","134");
        myDiary.createEntry("Bee","14");
        assertEquals(3,myDiary.sizeOfEntries());

    }
    @Test public void entriesCanBeDeletedTest(){
        myDiary.createEntry("Usman","1234");
        myDiary.createEntry("Zee","134");
        myDiary.createEntry("Bee","14");
        myDiary.deleteEntry(2);
        assertEquals(2,myDiary.sizeOfEntries());
    }
    @Test public void findEntriesByIdTest(){
        Entry you = myDiary.createEntry("Usman","1234");
        Entry ex = myDiary.createEntry("Zee","134");
        Entry he = myDiary.createEntry("Bee","14");
        Entry actual = myDiary.findEntryById(0);
        assertEquals(you, actual);
    }
    @Test public void updateDiaryTest(){
        Entry you = myDiary.createEntry("Usman","1234");
        Entry ex = myDiary.createEntry("Zee","134");
        Entry he = myDiary.createEntry("Bee","14");
        Entry actual = myDiary.findEntryById(0);
        Entry old = myDiary.createEntry("My journey","it all started like a dream");
        Entry update = myDiary.updateEntry(2,"my journey","i cant believe you");
        System.out.println(he.toString ());
        assertSame(update,he);
    }
}
