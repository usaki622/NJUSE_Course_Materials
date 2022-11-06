import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class TraceBackTest {
    TraceBack tb;
    @Before
    public void setUp() {
        tb = new TraceBack();
    }

    @Test
    public void testOne() {
        HashSet<HashSet<Integer>> actual = tb.traceBack(5,3);
        HashSet<HashSet<Integer>> expected = new HashSet<HashSet<Integer>>() {{
            add(new HashSet<Integer>() {{
                add(5);
                add(4);
                add(3);
            }});
            add(new HashSet<Integer>() {{
                add(5);
                add(4);
                add(2);
            }});
            add(new HashSet<Integer>() {{
                add(5);
                add(4);
                add(1);
            }});
            add(new HashSet<Integer>() {{
                add(5);
                add(3);
                add(2);
            }});
            add(new HashSet<Integer>() {{
                add(5);
                add(3);
                add(1);
            }});
            add(new HashSet<Integer>() {{
                add(5);
                add(2);
                add(1);
            }});
            add(new HashSet<Integer>() {{
                add(4);
                add(3);
                add(2);
            }});
            add(new HashSet<Integer>() {{
                add(4);
                add(3);
                add(1);
            }});
            add(new HashSet<Integer>() {{
                add(4);
                add(2);
                add(1);
            }});
            add(new HashSet<Integer>() {{
                add(3);
                add(2);
                add(1);
            }});
        }};
        assertEquals(actual, expected);
    }


}
