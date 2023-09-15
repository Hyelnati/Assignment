package diaryApp;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Entry {

    private int id;
    private String title;
    private String body;
    //String date = DateTimeFormatter.ofPattern("EEEE, dd/MM/yyyy").format(currentDate);
    //private DateTimeFormatter currentDate = DateTimeFormatter.ofPattern(LocalDateTime.now().format(DateTimeFormatter.ofPattern("ddMMyyyy")));
    private LocalDate currentDate = LocalDate.now();
    public Entry(int id, String title, String body){
        this.id = id;
        this.title = title;
        this.body = body;
    }
    public Entry(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

//

   // public DateTimeFormatter getCurrentDate() {
     //   return currentDate;
   // }

   // public void setCurrentDate(DateTimeFormatter currentDate) {
       // this.currentDate = currentDate;
    //}

    @Override
    public String toString(){
        return String.format("""
                *******************
                Entry title: %s
                Entry body: %s
                Date Created: %s
                *******************
                """,title,body,currentDate);
    }

}
