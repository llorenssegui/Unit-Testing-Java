import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.mockito.Spy;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.*;

public class OrderClassTest {

    @Spy
    private OrderClass orderClass;

    @Rule
    public MockitoRule mockitoRule = MockitoJUnit.rule();

    @Test
    public void test() {
        String s = "Hello";
        String s2 = s.concat(" world!");
        assertTrue(s2.equals("Hello world!"));
    }

    @Test
    public void testOrderClass () {
        try {
            final String order = "asc";
            when(orderClass.getData(order))
                    .thenReturn(mockDataList());
            Set<ObjectOrder> set = orderClass.sortWithTreeMap(order);

            List<ObjectOrder> listSet = new ArrayList<>();
            listSet.addAll(set);
            assertTrue("Test order class: ", listSet.get(0).getRange() == 1);
        } catch(Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void testComparableOrderClass () {
        try {
            Comparable<ObjectOrder> c= mock(Comparable.class);
            when(c.compareTo(isA(ObjectOrder.class))).thenReturn(0);
            assertEquals(0, c.compareTo(new ObjectOrder(1, "asc")));
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    @Test
    public void testVerifyOrderClassMethod() {
        try {
            OrderClass oc = mock(OrderClass.class);
            when(oc.sortWithoutTreeMap()).thenReturn(null);
            oc.sortWithoutTreeMap();

            verify(oc, times(1)).sortWithoutTreeMap();
        } catch (Exception e) {
            Assert.fail(e.getMessage());
        }
    }

    private List<ObjectOrder> mockDataList() {
        List<ObjectOrder> list = new ArrayList<>();
        list.add(new ObjectOrder(8, "Hotel 2"));
        list.add(new ObjectOrder(1, "Hotel 3"));
        return list;
    }
}
