import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class fail_fast {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        for (int i = 0 ; i < 10 ; i++ ) {
            list.add(i + "");
        }
        Iterator<String> iterator = list.iterator();
        int i = 0 ;
        while(iterator.hasNext()) {
            if (i == 3) {
                list.remove(3);
            }
            System.out.println(iterator.next());
            i ++;
        }
    }
    //fail-fast 机制，即快速失败机制，是java集合(Collection)中的一种错误检测机制。
    // 当在迭代集合的过程中该集合在结构上发生改变的时候，就有可能会发生fail-fast，
    // 即抛出 ConcurrentModificationException异常。fail-fast机制并不保证在不同步的修改下一定会抛出异常，
    // 它只是尽最大努力去抛出，所以这种机制一般仅用于检测bug。

}
