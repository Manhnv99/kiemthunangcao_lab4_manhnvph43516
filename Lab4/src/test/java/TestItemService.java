import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestItemService {

    private ItemService itemService;

    @BeforeEach
    public void SetUp() {
        this.itemService = new ItemService();
    }

    @Test
    public void validAdd(){
        Item item = new Item(1,"hihi");
//        Item item = new Item(1,"manh dep trai");
//        Item item = new Item(1,"manh dep trai 123");
//        Item item = new Item(1,"abssdasdfgfffffffffffffff");
//        Item item = new Item(1,"toikhongbietgiaaahahhaa");
//        Item item = new Item(1,"toikhongbietgiaaahahhaasssssssssssssssssssssssssssssssssssssss");
//        Item item = new Item(1,"toichophepemthichtoinhungtoilamotssssssssssssssssssssssssssssssssssssssssssssssss");
//        Item item = new Item(1,"toikhongbietgiaaahahhaasssssssssssssssssssssssss222");
//        Item item = new Item(1,"toikhongbietgiaaahahhaasssssssssssssssssssssssss22");
//        Item item = new Item(1,"toikhongbietgiaaahahhaasssssssssssssssssssssssss22111xxxxxxxxxxxxxxx");
        itemService.addItem(item);
        Assertions.assertEquals(1,itemService.getItems().size());
    }

    @Test
    public void validUpdate(){
        Item item = new Item(1,"hehe");
        itemService.addItem(item);
        String newName = "manhihihiihih";
//        String newName = "m";
//        String newName = "ma";
//        String newName = "man";
//        String newName = "manh";
//        String newName = "manh1";
//        String newName = "manhihihiihihssssssssssssssssssssssssssssssssssss";
//        String newName = "manhihihiihihssssssssssssssssssssssssssssssssssss11";
//        String newName = "manhihihiihihssssssssssssssssssssssssssssssssssss1";
//        String newName = "manhihihiihihsssssssssssssssssssssssssssssssssss";
        Item newItem = itemService.updateItem(1,newName);
        Assertions.assertEquals(newName,newItem.getName());
    }

    @Test
    public void remove(){
        itemService.deleteItem(1);
        Assertions.assertEquals(8,itemService.getItems().size());
    }

}
