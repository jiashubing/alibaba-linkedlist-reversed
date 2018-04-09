import cn.jiashubing.MyLinkedList;
import org.junit.Before;
import org.junit.Test;

/**
 * @author jiashubing
 * @since 2018/3/30
 */
public class JunitTest {

    private MyLinkedList<Integer> list;

    @Before
    public void setNum() {
        list = new MyLinkedList<Integer>();
        for (int i = 1; i < 4; i++) {
            list.add(i);
        }
        System.out.println("正向打印: ");
        list.print(list.getHead());
    }

    @Test
    public void test1() {
        System.out.println("链表倒置后正向打印 ");
        list.reversed();
        list.print(list.getHead());
    }

    @Test
    public void test2() {
        System.out.println("逆向打印 ");
        list.printRev(list.getCurrent());
    }
}
