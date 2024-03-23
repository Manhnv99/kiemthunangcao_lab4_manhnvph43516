import java.util.ArrayList;
import java.util.List;

public class ItemService {

    private List<Item> items = new ArrayList<>();

    public ItemService(){
        items.add(new Item(1,"hi"));
        items.add(new Item(2,"hi1"));
        items.add(new Item(3,"hi2"));
        items.add(new Item(4,"hi3"));
        items.add(new Item(5,"hi4"));
        items.add(new Item(6,"hi5"));
        items.add(new Item(7,"hi6"));
        items.add(new Item(8,"hi7"));
        items.add(new Item(9,"hi8"));
    }

    public List<Item> getItems(){
        return items;
    }

    public void addItem(Item item){
        if (item.getName().length() > 50){
            throw new IllegalArgumentException("Độ dài phải dưới 50 ký tự!");
        }
        items.add(item);
    }

    public Item updateItem(int id,String newName){
        if (newName.length() > 50){
            throw new IllegalArgumentException("Độ dài phải dưới 50 ký tự!");
        }
        for (Item item : items){
            if(item.getId() == id){
                item.setName(newName);
                return item;
            }
        }
        return null;
    }

    public void deleteItem(int id){
        boolean foundItem = false;
        for (Item itemCheck : items){
            if(itemCheck.getId() == id){
                foundItem = true;
                break;
            }
        }
        if(!foundItem){
            throw new IllegalArgumentException("Không tìm thấy Item nào có id là : " + id);
        }
        items.removeIf(item -> item.getId() == id);
    }


}
