import java.util.ArrayList;
import java.util.List;

public class dumb1 {
    private List<String> student = new ArrayList<String>();

    public void remove (String name){
        student.remove(name);

    }
    public void add (String name){
        student.remove(name);
    }
    public void removeAll(){
        student.clear();
    }
    public int sizeOfstudent(){
        return student.size();
    }
}
