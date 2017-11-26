package graph;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class graphTest {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void testCalsShortestPath() {
		
		graph G =new graph();
		G.createDirectedGraph("C:\\Users\\huangxinchi\\Desktop\\lab6\\lab1\\PPAP.txt");
		String result=G.calsShortestPath(G, "to", "good");
		System.out.println(result);
		assertEquals("error",G.calsShortestPath(null, "to", "explore"));
		assertEquals(" No\"a and b\"exist in the graph",G.calsShortestPath(G, "a", "b"));
		assertEquals(" No\"b\" exist in the graph",G.calsShortestPath(G, "to", "b"));
		assertEquals(" No\"a\"exist in the graph",G.calsShortestPath(G, "a", "explore"));
		assertEquals(" Two words are same!",G.calsShortestPath(G, "to", "to"));
		assertEquals(" END",G.calsShortestPath(G, "good", "to"));
		assertEquals(" The length of the path is:6     The  path is: to->new->worlds->seek->out->good->END",G.calsShortestPath(G, "to", "good"));
		
	}

}
