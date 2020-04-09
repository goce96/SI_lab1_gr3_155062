import java.util.ArrayList;
import java.util.List;

public class Receipt {
    private List<Item>lista=null;

    public void init(){
        lista=new ArrayList<Item>();
        Item item= new Item(1,"novItem",23.1,'A');
        lista.add(item);
    }
    public List<Item> addElement(Item item){
        lista.add(item);
        return lista;
    }

}
