package sg.edu.rp.c346.todolist;

public class ToDo {
    private String toDoItem;
    private String date;

    public ToDo(String toDoItem, String date) {
        this.toDoItem = toDoItem;
        this.date = date;
    }

    public String getToDoItem() {
        return toDoItem;
    }

    public void setToDoItem(String toDoItem) {
        this.toDoItem = toDoItem;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "ToDo{" +
                "toDoItem='" + toDoItem + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
